package convert;

import java.io.File;
import java.util.Arrays;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Model;

import emf.util.EMFResourceUtil;

public class PapyrusUML2SimpleUML {

	private static final String PREFIX_POSITIVE = "example";
	private static final String PREFIX_NEGATIVE = "negative";
	private static final String PAPYRUS_ORIGINAL = "PapyrusOriginal";
	private static final String PAPYRUS_CHANGED = "PapyrusChanged";
	private static final String PAPYRUS_MODEL = "model.uml";

	private void convertExamples() {
		// Model types to be considered
		String[] modelTypes = new String[] { "uml" };

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath();

		for (String modelType : modelTypes) {
			String modelsPath = examplesPath + File.separator + modelType;
			File modelsFolder = new File(modelsPath);

			File[] operations = modelsFolder.listFiles();
			Arrays.sort(operations);
			for (File operation : operations) {
				System.out.println("\n\n=== Converting examples for operation " + operation.getName());

				File[] examples = operation.listFiles();

				for (File example : examples) {

					if (example.getName().startsWith(PREFIX_POSITIVE) || example.getName().startsWith(PREFIX_NEGATIVE)) {
						System.out.println("\n= Example " + example.getName());

						String pathOriginal = example.getAbsoluteFile() + File.separator + PAPYRUS_ORIGINAL
								+ File.separator + PAPYRUS_MODEL;
						String pathChanged = example.getAbsoluteFile() + File.separator + PAPYRUS_CHANGED
								+ File.separator + PAPYRUS_MODEL;

						System.out.println("\t" + pathOriginal);
						System.out.println("\t" + pathChanged);
						
						Resource resourceOriginal = EMFResourceUtil.loadModel(pathOriginal);
						Resource resourceChanged = EMFResourceUtil.loadModel(pathChanged);
						
						papyrusUML2SimpleUML((Model) resourceOriginal.getContents().get(0));
						papyrusUML2SimpleUML((Model) resourceChanged.getContents().get(0));
						
						
						// parser.parse(modelType, operation.getName(),
						// pathOriginal, pathChanged);

						// this.mapExampleID_to_StoredRuleID.put(
						// example.getName().replace(PREFIX_POSITIVE,""),
						// parser.iRuleInstanceID);

					}
				}
			}
		}
	}

	private void papyrusUML2SimpleUML(Model papyrusModel){
		
	}
	
	public static void main(String[] args) {
		new PapyrusUML2SimpleUML().convertExamples();
	}

}
