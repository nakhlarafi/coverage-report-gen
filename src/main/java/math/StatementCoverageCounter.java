package math;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.json.JSONObject;
import org.json.JSONArray;


public class StatementCoverageCounter {
    private JSONObject reports = new JSONObject();
    private static Map<String, Integer> coverageMap = new HashMap<>();
    private static Map<String, Integer> methodTotalStmts = new HashMap<>();
    private static Map<String, Integer> methodExecutedStmts = new HashMap<>();

    private static Map<String, Boolean> branchCoverageMap = new HashMap<>();
    private static Map<String, Integer> methodTotalBranches = new HashMap<>();
    private static Map<String, Integer> methodTakenBranches = new HashMap<>();

    private static final String REPORTS_DIRECTORY = "reports";
    private static final String STATEMENT_COUNTS_FILE = REPORTS_DIRECTORY + "/methodStatementCounts.txt";
    private static final String BRANCH_COUNTS_FILE = REPORTS_DIRECTORY + "/methodBranchCounts.txt";
    private static final String FINAL_OUTPUT_FILE = REPORTS_DIRECTORY + "/output.json";



    static {
        // Register JVM shutdown hook to report coverage once at the end.
        Runtime.getRuntime().addShutdownHook(new Thread(StatementCoverageCounter::report));
    }
    public static synchronized void markBranch(String methodName, String branchId, boolean taken) {
        String combinedKey = methodName + ":" + branchId + ":" + taken;

        if (!branchCoverageMap.containsKey(combinedKey)) {
            branchCoverageMap.put(combinedKey, taken);
//            System.out.println(combinedKey);
//            System.out.println(methodTakenBranches.getOrDefault(methodName, 0)+1);
            methodTakenBranches.put(methodName, methodTakenBranches.getOrDefault(methodName, 0) + 1);

            // Only update total branches once per branch (since there are two outcomes)
            if (!branchCoverageMap.containsKey(methodName + ":" + branchId + ":true") &&
                    !branchCoverageMap.containsKey(methodName + ":" + branchId + ":false")) {
                System.out.println(combinedKey);
                methodTotalBranches.put(methodName, methodTotalBranches.getOrDefault(methodName, 0) + 1);
            }
        }
    }



    public static synchronized void markExecuted(String methodName, String stmtId) {
        String combinedKey = methodName + ":" + stmtId;

        // Only mark the statement as executed once across all tests
        if (!coverageMap.containsKey(combinedKey)) {
            coverageMap.put(combinedKey, 1);
            methodExecutedStmts.put(methodName, methodExecutedStmts.getOrDefault(methodName, 0) + 1);
        }
    }

    public static synchronized void report() {
        System.err.println("Statement Coverage:");
        printCoverageReport(STATEMENT_COUNTS_FILE, methodTotalStmts, methodExecutedStmts);

        System.err.println("\nBranch Coverage:");
        printCoverageReport(BRANCH_COUNTS_FILE, methodTotalBranches, methodTakenBranches);

        // Write in Json File
        writeCoverageReportToJson("Statement Coverage", STATEMENT_COUNTS_FILE, methodTotalStmts, methodExecutedStmts, FINAL_OUTPUT_FILE);
        writeCoverageReportToJson("Branch Coverage", BRANCH_COUNTS_FILE, methodTotalBranches, methodTakenBranches, FINAL_OUTPUT_FILE);

    }

    private static void printCoverageReport(String fileName, Map<String, Integer> totalMap, Map<String, Integer> executedMap) {
        System.err.println("MethodName\tExecuted/Total\tCoveragePercentage");
        System.err.println("------------------------------------------------------------");

        // Populate the total map from the file
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                line = line.trim();
                int lastColonIndex = line.lastIndexOf(":");
                if (lastColonIndex == -1) continue;

                String methodName = line.substring(0, lastColonIndex).trim();
                int totalCount = Integer.parseInt(line.substring(lastColonIndex + 1).trim());

                totalMap.put(methodName, totalCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to read " + fileName);
            return;
        }

        // Create and sort report rows
        List<String> reportRows = totalMap.keySet().stream().map(method -> {
            float coverage;
            int total = totalMap.get(method);
            int executed = executedMap.getOrDefault(method, 0);
            if (total==0 && executed==0){
                coverage = 0;
            }
            else {
                coverage = ((float) executed / total) * 100;
            }
            return method + "\t" + executed + "/" + total + "\t" + String.format("%.2f", coverage) + "%";
        }).sorted((row1, row2) -> {
            String perc1 = row1.split("\t")[2].replace("%", "");
            String perc2 = row2.split("\t")[2].replace("%", "");
            return Float.compare(Float.parseFloat(perc1), Float.parseFloat(perc2));
        }).collect(Collectors.toList());

        // Print the sorted rows
        reportRows.forEach(System.err::println);
    }

    private static void writeCoverageReportToJson(String type, String fileName, Map<String, Integer> totalMap, Map<String, Integer> executedMap, String outputJsonFile) {
        JSONObject jsonReport = new JSONObject();

        if (Files.exists(Paths.get(outputJsonFile))) {
            try {
                String content = new String(Files.readAllBytes(Paths.get(outputJsonFile)));
                jsonReport = new JSONObject(content);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Failed to read existing " + outputJsonFile);
            }
        }

        JSONObject typeReport = new JSONObject();

        // Populate the total map from the file
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                line = line.trim();
                int lastColonIndex = line.lastIndexOf(":");
                if (lastColonIndex == -1) continue;

                String methodName = line.substring(0, lastColonIndex).trim();
                int totalCount = Integer.parseInt(line.substring(lastColonIndex + 1).trim());

                totalMap.put(methodName, totalCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to read " + fileName);
            return;
        }

        // Create report rows and populate the JSON object
        totalMap.forEach((method, total) -> {
            JSONObject methodReport = new JSONObject();
            int executed = executedMap.getOrDefault(method, 0);
            float coverage;
            if (total == 0 && executed == 0) {
                coverage = 0;
            } else {
                coverage = ((float) executed / total) * 100;
            }
            methodReport.put("executed", Integer.toString(executed));
            methodReport.put("total", Integer.toString(total));
            methodReport.put("coverage", String.format("%.2f", coverage) + "%");
            typeReport.put(method, methodReport);
        });

        jsonReport.put(type, typeReport);

        // Write JSON object to the file
        try (FileWriter file = new FileWriter(outputJsonFile)) {
            file.write(jsonReport.toString(4));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to write to " + outputJsonFile);
        }
    }

}
