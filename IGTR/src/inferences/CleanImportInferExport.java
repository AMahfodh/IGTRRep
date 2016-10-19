package inferences;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CleanImportInferExport {

	public void doCleanImportInferExport() throws Exception {
		System.out.println("=== Setup Logging..");
		setupLogging();
		
		System.out.println("=== Clean Database..");
		cleanDatabase();

		System.out.println("=== Import Type Graph..");
		new ParseClassTypes();

		System.out.println("=== \nImport Examples..");
		new ParseRuleInstances().importExamples();

		System.out.println("=== \nInferring General Rules..");
		new TestInferences().commitLearning();

		System.out.println("=== \nExport to Henshin..");
		new ExportAllToHenshin().exportHenshinModel(new File("").getAbsolutePath() + File.separator + "HenshinOutput");
	}

	private void setupLogging() {
		Logger GTlogger = Logger.getLogger("GTlog");
		try {

			boolean isAppend = false;
			FileHandler fh = new FileHandler("GT.log", isAppend);

			GTlogger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter() {
				public String format(LogRecord record) {
					return record.getMessage() + System.lineSeparator();
				}
			};
			GTlogger.setLevel(Level.ALL);
			fh.setFormatter(formatter);
			// GTlogger.addHandler(new ConsoleHandler());
			GTlogger.setUseParentHandlers(false);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void cleanDatabase() {
		DBRecord.openConnection();

		StringBuffer stmt = new StringBuffer();
		stmt.append("\tDELETE FROM TblBasicRule;\n");
		stmt.append("\tDELETE FROM TblClassTypes;\n");
		stmt.append("\tDELETE FROM TblEdge;\n");
		stmt.append("\tDELETE FROM TblGraph;\n");
		stmt.append("\tDELETE FROM TblInherentedClassTypes;\n");
		stmt.append("\tDELETE FROM TblNode;\n");
		stmt.append("\tDELETE FROM TblNodeAttributes;\n");
		stmt.append("\tDELETE FROM TblObservationOutput;\n");
		stmt.append("\tDELETE FROM TblRuleMoEdge;\n");
		stmt.append("\tDELETE FROM TblRuleMoNodes;\n");
		stmt.append("\tDELETE FROM IMOTempTbl;\n");
		stmt.append("\tDELETE FROM QueryTempTbl2;\n");
		stmt.append("\tDELETE FROM TblCommonUniversalContexts;\n");

		System.out.println(stmt.toString());

		DBRecord.executeSqlStatement(stmt.toString(), true);

		DBRecord.closeConnection();
	}

	public static void main(String[] args) throws Exception {
		new CleanImportInferExport().doCleanImportInferExport();
	}
}
