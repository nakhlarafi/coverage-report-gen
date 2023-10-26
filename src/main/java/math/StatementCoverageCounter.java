package math;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatementCoverageCounter {
    private static Map<String, Integer> coverageMap = new HashMap<>();
    private static Map<String, Integer> methodTotalStmts = new HashMap<>();
    private static Map<String, Integer> methodExecutedStmts = new HashMap<>();

    public static synchronized void markExecuted(String methodName, String stmtId) {
        String combinedKey = methodName + ":" + stmtId;

        // Only mark the statement as executed once across all tests
        if (!coverageMap.containsKey(combinedKey)) {
            coverageMap.put(combinedKey, 1);
            methodExecutedStmts.put(methodName, methodExecutedStmts.getOrDefault(methodName, 0) + 1);
        }
    }

    public static synchronized void report() {
        System.err.println("MethodName\tExecuted/Total\tCoveragePercentage");
        System.err.println("------------------------------------------------------------");

        // Read methodStatementCounts.txt and populate methodTotalStmts map
        try {
            List<String> lines = Files.readAllLines(Paths.get("methodStatementCounts.txt"));
            for (String line : lines) {
                line = line.trim();

                int lastColonIndex = line.lastIndexOf(":"); // Find the position of the last colon
                if (lastColonIndex == -1) continue; // Skip if no colon is found

                String methodName = line.substring(0, lastColonIndex).trim(); // Extract method name/signature
                int totalStatements = Integer.parseInt(line.substring(lastColonIndex + 1).trim()); // Extract and parse the count

                methodTotalStmts.put(methodName, totalStatements);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to read methodStatementCounts.txt");
            return;
        }

        List<String> reportRows = new ArrayList<>();

        // Iterate over methodTotalStmts to gather rows without printing them immediately
        for (String method : methodTotalStmts.keySet()) {
            int total = methodTotalStmts.get(method);
            int executed = methodExecutedStmts.getOrDefault(method, 0);
            float coverage = ((float) executed / total) * 100;
            String row = method + "\t" + executed + "/" + total + "\t" + String.format("%.2f", coverage) + "%";
            reportRows.add(row);
        }

        // Sort the rows based on coverage percentage
        reportRows.sort((row1, row2) -> {
            String perc1 = row1.split("\t")[2].replace("%", "");
            String perc2 = row2.split("\t")[2].replace("%", "");
            return Float.compare(Float.parseFloat(perc1), Float.parseFloat(perc2));
        });

        // Print the sorted rows
        for (String row : reportRows) {
            System.err.println(row);
        }
    }
}
