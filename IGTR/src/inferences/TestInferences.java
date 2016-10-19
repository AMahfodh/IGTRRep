package inferences;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import emf.domain.DomainConfigurationFactory;

public class TestInferences {

	public void commitLearning() throws Exception {

		// commit generalisation
		int iMinRepeatedMultiObjects = 1;
		new RuleInference().generaliseRuleInstance(iMinRepeatedMultiObjects);

		// learning invariant constraints on rule attributes and parameters
		if (!DomainConfigurationFactory.createDomainConfiguration().treatAttributesAsNodes()) {
			new AttributeInference().commit();
		}
	}

	public static void main(String[] args) throws Exception {

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

		new TestInferences().commitLearning();

	}

}
