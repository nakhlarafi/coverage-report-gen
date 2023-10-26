package math;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class InvokeStaticInstrumenter extends BodyTransformer {

	static SootClass counterClass;
	static SootMethod markExecuted, reportCounter;

	static {
		counterClass = Scene.v().loadClassAndSupport("math.StatementCoverageCounter");
		markExecuted = counterClass.getMethod("void markExecuted(java.lang.String,java.lang.String)");
		reportCounter = counterClass.getMethod("void report()");
	}

	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		SootMethod method = body.getMethod();
		String methodName = method.getSignature();

		System.out.println("Instrumenting method: " + methodName);

		Chain<Unit> units = body.getUnits();
		Iterator<Unit> stmtIt = units.snapshotIterator();

		int totalStatements = 0; // Variable to store total number of statements for the method
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();

			// Skip parameter assignments based on string content
//			if (stmt.toString().contains("@parameter")){
//				System.out.println("----------");
//				System.out.println(stmt instanceof AssignStmt);
//				System.out.println(stmt.toString());
//				System.out.println(stmt.getClass().getName());
//				System.out.println("----------");
//			}

			if (stmt instanceof JIdentityStmt && stmt.toString().contains("@parameter")) {
				continue;
			}

			String stmtId = stmt.toString();

			// Mark the statement as executed
			InvokeExpr markExecutedExpr = Jimple.v().newStaticInvokeExpr(markExecuted.makeRef(), StringConstant.v(methodName), StringConstant.v(stmtId));
			Stmt markExecutedStmt = Jimple.v().newInvokeStmt(markExecutedExpr);
			units.insertBefore(markExecutedStmt, stmt);

			totalStatements++;  // Increment the statement count
		}

		// Writing the total statements count to a file
		String data = methodName.trim() + ":" + totalStatements + "\n";

		try {
			Files.write(Paths.get("methodStatementCounts.txt"), data.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Check if it's the main method to insert the report generation code
		String signature = method.getSubSignature();
		boolean isMain = signature.equals("void main(java.lang.String[])");
		if (isMain) {
			stmtIt = units.snapshotIterator();
			while (stmtIt.hasNext()) {
				Stmt stmt = (Stmt) stmtIt.next();
				if (stmt instanceof ReturnStmt || stmt instanceof ReturnVoidStmt) {
					InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(reportCounter.makeRef());
					Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
					units.insertBefore(reportStmt, stmt);
				}
			}
		}
	}
}
