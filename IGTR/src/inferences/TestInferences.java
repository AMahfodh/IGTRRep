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

		// generate instances
		new ParseRuleInstances().importExamples();
		
		
		// commit generalisation
		int iMinRepeatedMultiObjects = 1;
		new RuleInference().generaliseRuleInstance(iMinRepeatedMultiObjects);

		// learning invariant constraints on rule attributes and parameters
		if (!DomainConfigurationFactory.createDomainConfiguration().treatAttributesAsNodes()) {
			new AttributeInference().commit();
		}
	}

	public static void main(String[] args) throws Exception {


		new TestInferences().commitLearning();

	}

}
