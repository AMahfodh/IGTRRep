package inferences;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

import emf.domain.IDomainConfiguration;

public class ParseRuleInstances {

	private static final String PREFIX_POSITIVE = "example";
	private static final String PREFIX_NEGATIVE = "negative";
	private static final String PREFIX_REFERENCE = "reference";

	private HashMap<String, Integer> mapExampleID_to_StoredRuleID = new HashMap<String, Integer>();

	public void importExamples() {

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";

		String modelsPath = examplesPath + File.separator + IDomainConfiguration.MODEL_TYPE;
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		Arrays.sort(operations);
		for (File operation : operations) {
			System.out.println("\n\n=== Importing examples for operation " + operation.getName());

			File[] examples = operation.listFiles();

			// to ensure exporting positive example first, then negative ..
			Arrays.sort(examples);
			this.mapExampleID_to_StoredRuleID.clear();

			for (File example : examples) {

				if (example.getName().startsWith(PREFIX_POSITIVE)) {
					System.out.println("\n= Positive example " + example.getName());

					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					ParseRuleInstance parser = new ParseRuleInstance();
					parser.parse(operation.getName(), pathOriginal, pathChanged);

					this.mapExampleID_to_StoredRuleID.put(example.getName().replace(PREFIX_POSITIVE, ""),
							parser.iRuleInstanceID);

				}

				if (example.getName().startsWith(PREFIX_NEGATIVE)) {

					System.out.println("\n= Negative example " + example.getName());

					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					Integer iRuleID = this.mapExampleID_to_StoredRuleID.get(example.getName().replace(PREFIX_NEGATIVE,
							""));

					if (iRuleID == null) {
						iRuleID = -1;
					} else {
						this.mapExampleID_to_StoredRuleID.remove(example.getName().replace(PREFIX_NEGATIVE, ""));
					}

					ParseRuleInstance parser = new ParseRuleInstance();
					parser.parse(operation.getName(), pathOriginal, pathChanged, iRuleID);

				}

				if (example.getName().startsWith(PREFIX_REFERENCE)) {
					// We can simply ignore the reference rules here
				}
			}
		}
	}

	public static void main(String[] args) {
		new ParseRuleInstances().importExamples();
	}

}
