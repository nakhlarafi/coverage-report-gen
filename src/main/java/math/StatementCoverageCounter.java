package math;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatementCoverageCounter {
    private static Map<String, Integer> coverageMap = new HashMap<>();
    private static Map<String, Integer> methodTotalStmts = new HashMap<>();
    private static Map<String, Integer> methodExecutedStmts = new HashMap<>();

    private static Map<String, Boolean> branchCoverageMap = new HashMap<>();
    private static Map<String, Integer> methodTotalBranches = new HashMap<>();
    private static Map<String, Integer> methodTakenBranches = new HashMap<>();


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
        printCoverageReport("methodStatementCounts.txt", methodTotalStmts, methodExecutedStmts);

        System.err.println("\nBranch Coverage:");
//        System.out.println(methodTakenBranches);
        printCoverageReport("methodBranchCounts.txt", methodTotalBranches, methodTakenBranches);
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

}
