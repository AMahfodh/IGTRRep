package inferences;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emf.domain.IDomainConfiguration;

public class ParseRuleInstances {

	private List<String> operationWhiteList = new ArrayList<String>();

	public static final String PREFIX_POSITIVE = "example";
	public static final String PREFIX_NEGATIVE = "negative";
	public static final String PREFIX_REFERENCE = "reference";

	private Map<String, ParseRuleInstance> example2RuleInstance = new HashMap<String, ParseRuleInstance>();

	public void importExamples() {

		operationWhiteList.add("pullUpAttribute_5");

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";

		String modelsPath = examplesPath + File.separator + IDomainConfiguration.MODEL_TYPE;
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		Arrays.sort(operations);
		for (File operation : operations) {
			if (!operationWhiteList.isEmpty()) {
				if (!operationWhiteList.contains(operation.getName())) {
					continue;
				}
			}

			System.out.println("\n\n=== Importing examples for operation " + operation.getName());

			File[] examples = operation.listFiles();

			// to ensure exporting positive example first, then negative ..
			Arrays.sort(examples);

			for (File example : examples) {

				if (example.getName().startsWith(PREFIX_POSITIVE)) {
					System.out.println("\n= Positive example " + example.getName());

					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					ParseRuleInstance parser = new ParseRuleInstance();
					parser.parseRuleInstance(operation.getName(), pathOriginal, pathChanged);
					this.example2RuleInstance.put(example.getName().replace(PREFIX_POSITIVE, ""), parser);
				}

				if (example.getName().startsWith(PREFIX_NEGATIVE)) {

					System.out.println("\n= Negative example " + example.getName());

					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					ParseRuleInstance positive = example2RuleInstance.get(example.getName().replace(PREFIX_NEGATIVE, ""));
					assert (positive != null);

					ParseRuleInstance parser = new ParseRuleInstance();
					parser.parseNacExample(operation.getName(), pathOriginal, pathChanged, positive);
				}

				if (example.getName().startsWith(PREFIX_REFERENCE)) {
					// We can simply ignore the reference rules here
				}
			}

			// Cleanup
			example2RuleInstance.clear();
		}

		// Cleanup
		operationWhiteList.clear();
	}

	public static void main(String[] args) {
		new ParseRuleInstances().importExamples();
	}

}
