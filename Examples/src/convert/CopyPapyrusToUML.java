package convert;

import inferences.ParseRuleInstances;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class CopyPapyrusToUML {

	public static final String PAPYRUS_ORIGINAL = "PapyrusOriginal";
	public static final String PAPYRUS_CHANGED = "PapyrusChanged";
	public static final String PAPYRUS_MODEL = "model.uml";

	private void copyExamples() throws IOException {

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath();

		String modelsPath = examplesPath + File.separator + "uml";
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		Arrays.sort(operations);
		for (File operation : operations) {
			System.out.println("\n\n=== Copy examples for operation " + operation.getName());

			File[] examples = operation.listFiles();

			for (File example : examples) {

				if (example.getName().startsWith(ParseRuleInstances.PREFIX_POSITIVE)
						|| example.getName().startsWith(ParseRuleInstances.PREFIX_NEGATIVE)) {
					System.out.println("\n= Example " + example.getName());

					String pathOriginalPapyrus = example.getAbsoluteFile() + File.separator + PAPYRUS_ORIGINAL
							+ File.separator + PAPYRUS_MODEL;
					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original.uml";
					String pathChangedPapyrus = example.getAbsoluteFile() + File.separator + PAPYRUS_CHANGED
							+ File.separator + PAPYRUS_MODEL;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed.uml";

					System.out.println("\t" + pathOriginalPapyrus + " -> " + pathOriginal);
					System.out.println("\t" + pathChangedPapyrus + " -> " + pathChanged);

					Files.copy(Paths.get(pathOriginalPapyrus), Paths.get(pathOriginal),
							StandardCopyOption.REPLACE_EXISTING);
					Files.copy(Paths.get(pathChangedPapyrus), Paths.get(pathChanged),
							StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new CopyPapyrusToUML().copyExamples();
	}

}
