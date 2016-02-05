package inferences;

import java.io.File;

public class ParseRuleInstances {

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
			for (File operation : operations) {
				File[] examples = operation.listFiles();
				for (File example : examples) {
					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original." + modelType;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed." + modelType;
				
					ParseRuleInstance parser = new ParseRuleInstance();
					parser.parse(modelType, operation.getName(), pathOriginal, pathChanged);
				}
			}
		}
	}

	public static void main(String[] args) {
		new ParseRuleInstances().importExamples();
	}

}
