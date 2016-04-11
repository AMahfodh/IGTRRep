package inferences;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class ParseRuleInstances {

	private static final String PREFIX_POSITIVE = "example"; 
	private static final String PREFIX_NEGATIVE = "negative";
	private static final String PREFIX_REFERENCE = "reference";
	
	public void importExamples() {
		// Model types to be considered
		String[] modelTypes = new String[] { "ecore" };

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";

		for (String modelType : modelTypes) {
			String modelsPath = examplesPath + File.separator + modelType;
			File modelsFolder = new File(modelsPath);

			File[] operations = modelsFolder.listFiles();
			Arrays.sort(operations);
			for (File operation : operations) {
				System.out.println("\n\n=== Importing examples for operation " + operation.getName());
				
				File[] examples = operation.listFiles();				
				for (File example : examples) {
					if (example.getName().startsWith(PREFIX_POSITIVE)){
						System.out.println("\n= Positive example " + example.getName());
						
						String pathOriginal = example.getAbsoluteFile() + File.separator + "Original." + modelType;
						String pathChanged = example.getAbsoluteFile() + File.separator + "Changed." + modelType;
					
						ParseRuleInstance parser = new ParseRuleInstance();
						parser.parse(modelType, operation.getName(), pathOriginal, pathChanged);
					}
					if (example.getName().startsWith(PREFIX_NEGATIVE)){
						//TODO
					}
					if (example.getName().startsWith(PREFIX_POSITIVE)){
						//We can simply ignore the reference rules here
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new ParseRuleInstances().importExamples();
	}

}
