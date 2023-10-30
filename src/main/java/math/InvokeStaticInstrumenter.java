package math;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class InvokeStaticInstrumenter extends BodyTransformer {

	private static final String REPORTS_DIRECTORY = "reports";
	private static final String STATEMENT_COUNTS_FILE = REPORTS_DIRECTORY + "/methodStatementCounts.txt";
	private static final String BRANCH_COUNTS_FILE = REPORTS_DIRECTORY + "/methodBranchCounts.txt";

	private static boolean initialized = false;
	static SootClass counterClass;
	static SootMethod markExecuted, reportCounter, markBranch;

	static {
		counterClass = Scene.v().loadClassAndSupport("math.StatementCoverageCounter");
		markExecuted = counterClass.getMethod("void markExecuted(java.lang.String,java.lang.String)");
		reportCounter = counterClass.getMethod("void report()");
		markBranch = counterClass.getMethod("void markBranch(java.lang.String,java.lang.String,boolean)");
	}

	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		initialize();
		SootMethod method = body.getMethod();
		String methodName = method.getSignature();

		System.out.println("Instrumenting method: " + methodName);

		Chain<Unit> units = body.getUnits();
		Iterator<Unit> stmtIt = units.snapshotIterator();

		int totalStatements = 0;
		int sequenceNumber = 0;
		int totalBranches = 0;

		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();

			// Skip parameters
			if (stmt instanceof JIdentityStmt && stmt.toString().contains("@parameter")) {
				continue;
			}

			sequenceNumber = instrumentStatement(units, stmt, methodName, sequenceNumber);
			totalStatements++;

			// Instrument branches
			if (stmt instanceof IfStmt) {
				sequenceNumber = instrumentBranch(units, stmt, methodName, sequenceNumber);
				totalBranches += 2;  // Increment the branch count
			}
		}
		writeToFile(STATEMENT_COUNTS_FILE, methodName, totalStatements);
		writeToFile(BRANCH_COUNTS_FILE, methodName, totalBranches);
	}


	private int instrumentStatement(Chain<Unit> units, Stmt stmt, String methodName, int sequenceNumber) {
		String stmtId = stmt.toString() + "_" + sequenceNumber;
		sequenceNumber++;

		InvokeExpr markExecutedExpr = Jimple.v().newStaticInvokeExpr(markExecuted.makeRef(), StringConstant.v(methodName), StringConstant.v(stmtId));
		Stmt markExecutedStmt = Jimple.v().newInvokeStmt(markExecutedExpr);
		units.insertBefore(markExecutedStmt, stmt);

		return sequenceNumber;
	}

	private int instrumentBranch(Chain<Unit> units, Stmt stmt, String methodName, int sequenceNumber) {
		String branchId = "branch_" + sequenceNumber;
		sequenceNumber++;

		// True when the branch is taken
		insertInvokeBefore(units, stmt, methodName, branchId, 1);

		// False when the branch is not taken (else branch)
		insertInvokeAfter(units, stmt, methodName, branchId, 0);

		return sequenceNumber;
	}

	private void insertInvokeBefore(Chain<Unit> units, Stmt stmt, String methodName, String id, int value) {
		InvokeExpr expr = Jimple.v().newStaticInvokeExpr(markBranch.makeRef(), StringConstant.v(methodName), StringConstant.v(id), IntConstant.v(value));
		Stmt invokeStmt = Jimple.v().newInvokeStmt(expr);
		units.insertBefore(invokeStmt, stmt);
	}

	private void insertInvokeAfter(Chain<Unit> units, Stmt stmt, String methodName, String id, int value) {
		InvokeExpr expr = Jimple.v().newStaticInvokeExpr(markBranch.makeRef(), StringConstant.v(methodName), StringConstant.v(id), IntConstant.v(value));
		Stmt invokeStmt = Jimple.v().newInvokeStmt(expr);
		units.insertAfter(invokeStmt, stmt);
	}

	private void writeToFile(String fileName, String methodName, int value) {
		String data = methodName.trim() + ":" + value + "\n";
		try {
			Path path = Paths.get(fileName);
			if (!Files.exists(path.getParent())) {
				Files.createDirectories(path.getParent());
			}
			Files.write(path, data.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private synchronized void initialize() {
		if (!initialized) {
			// Remove the files if they exist
			deleteFile(STATEMENT_COUNTS_FILE);
			deleteFile(BRANCH_COUNTS_FILE);

			initialized = true;
		}
	}

	private void deleteFile(String fileName) {
		Path filePath = Paths.get(fileName);
		try {
			if (Files.exists(filePath)) {
				Files.delete(filePath);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
