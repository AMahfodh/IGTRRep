package inferences;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;
import emf.util.EMFMetaUtil;
import emf.util.EMFModelUtil;
import emf.util.EMFResourceUtil;

public class ParseClassTypes {

	private IDomainConfiguration domainConfig;

	// Ecore type (EClass) -> node type (ClassType)
	private Map<EClass, ClassType> eClass2NodeType = null;

	public ParseClassTypes() {
		domainConfig = DomainConfigurationFactory.createDomainConfiguration();

		if (IDomainConfiguration.MODEL_TYPE.equals("uml")) {
			// UML-specific simplification to just get the relevant subset of
			// the UML meta-model
			parseUMLMetamodel();
		} else {
			// Generic method
			parseMetamodel();
		}

		save();
	}

	/**
	 * Generic method for parsing an Ecore-based meta-model
	 */
	private void parseMetamodel() {
		System.out.println("Parsing meta model and import type graph");

		eClass2NodeType = new HashMap<EClass, ClassType>();

		// Collect relevant eClasses
		EList<EClassifier> eClassifiers = EMFMetaUtil.getAllMetaClassesForPackage(domainConfig.getEPackage());
		Set<EClass> unconsideredEClasses = domainConfig.getUnconsideredNodeTypes();
		// for (EClass eClass : unconsideredEClasses) {
		// System.out.println("ignore: " + eClass.getName());
		// }

		eClassifiers.removeAll(unconsideredEClasses);

		// Create a node type for each eClass
		for (EClassifier eClassifier : eClassifiers) {
			if (!(eClassifier instanceof EClass)) {
				// System.out.println("ignore: " + eClassifier.getName());
				continue;
			}

			System.out.println(eClassifier.getName());
			EClass eClass = (EClass) eClassifier;
			ClassType nodeType = new ClassType(eClass.getName(), false);

			eClass2NodeType.put(eClass, nodeType);
		}

		// Create inheritance relationships
		for (EClass eClass : eClass2NodeType.keySet()) {
			ClassType nodeType = eClass2NodeType.get(eClass);
			for (EClass superEClass : eClass.getESuperTypes()) {
				System.out.println(eClass.getName() + " <- " + superEClass.getName());
				ClassType superNodeType = eClass2NodeType.get(superEClass);

				nodeType.addReferenceType(superNodeType, true, this.hasIdenticalAttributes(eClass, superEClass));
			}
		}
	}

	/**
	 * UML-specific simplification to just get the relevant subset of the UML
	 * meta-model
	 */
	private void parseUMLMetamodel() {
		System.out.println("Import type graph for subset of the UML meta-model");

		// Create a node type for each relevant eClass
		eClass2NodeType = new HashMap<EClass, ClassType>();
		eClass2NodeType.put(UMLPackage.eINSTANCE.getModel(), new ClassType("Model", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getPackage(), new ClassType("Package", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getClass_(), new ClassType("Class", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getInterface(), new ClassType("Interface", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getGeneralization(), new ClassType("Generalization", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getProperty(), new ClassType("Property", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getPrimitiveType(), new ClassType("PrimitiveType", false));

		eClass2NodeType.put(UMLPackage.eINSTANCE.getNamedElement(), new ClassType("NamedElement", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getType(), new ClassType("Type", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getPackageableElement(), new ClassType("PackageableElement", false));
		eClass2NodeType.put(UMLPackage.eINSTANCE.getClassifier(), new ClassType("Classifier", false));

		// Create inheritance relationships
		eClass2NodeType.get(UMLPackage.eINSTANCE.getModel()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getPackage()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getPackage()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getNamedElement()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getProperty()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getNamedElement()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getType()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getNamedElement()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getPrimitiveType()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getType()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getClassifier()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getPackageableElement()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getClassifier()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getType()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getClass_()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getClassifier()), true, true);
		eClass2NodeType.get(UMLPackage.eINSTANCE.getInterface()).addReferenceType(
				eClass2NodeType.get(UMLPackage.eINSTANCE.getClassifier()), true, true);
	}

	private boolean hasIdenticalAttributes(EClass eClass, EClass superEClass) {

		/*
		 * return false if eClass has attribute(s) that are not exists in
		 * superEClass, return true otherwise
		 */

		if (eClass.getEAllAttributes().size() > superEClass.getEAllAttributes().size()) {
			return false;
		}

		Set<EAttribute> alreadyMatchedEAttributes = new HashSet<EAttribute>();

		for (EAttribute eAttribute : eClass.getEAllAttributes()) {

			boolean isMatched = false;

			for (EAttribute eSuperAttribute : superEClass.getEAllAttributes()) {

				if (alreadyMatchedEAttributes.contains(eSuperAttribute)) {
					continue;
				}

				if (eAttribute.getEAttributeType().equals(eSuperAttribute.getEAttributeType())
						&& eAttribute.getName().equals(eSuperAttribute.getName())) {

					alreadyMatchedEAttributes.add(eSuperAttribute);
					isMatched = true;
					break;
				}
			}

			if (!isMatched) {
				return false;
			}
		}

		return true;
	}

	private void save() {
		System.out.println("Saving class types .. ");

		if (eClass2NodeType == null) {
			System.err.println("The list of class types (listClassTypes) is null! ");
			return;
		}

		/*
		 * open DB connection
		 */
		DBRecord.openConnection();

		/* save types first */
		for (EClass eClass : eClass2NodeType.keySet()) {
			ClassType nodeType = eClass2NodeType.get(eClass);
			DBRecord.saveClassTypes(nodeType);
		}

		/* and then save their associations */
		for (EClass eClass : eClass2NodeType.keySet()) {
			ClassType nodeType = eClass2NodeType.get(eClass);
			DBRecord.saveClassAssociations(nodeType);
		}

		// Add special node types for signifying attribute nodes
		if (domainConfig.treatAttributesAsNodes()) {
			Set values = getDistinctAttributeValues();
			for (Object v : values) {
				ClassType specialType = new ClassType(v.toString(), false);
				DBRecord.saveClassTypes(specialType);
			}
		}

		/*
		 * close DB connection
		 */
		DBRecord.closeConnection();

		System.out.print("done\n");
	}

	private Set getDistinctAttributeValues() {
		Set res = new HashSet();

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";

		String modelsPath = examplesPath + File.separator + IDomainConfiguration.MODEL_TYPE;
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		for (File operation : operations) {
			File[] examples = operation.listFiles();
			for (File example : examples) {

				if (example.getName().startsWith(ParseRuleInstances.PREFIX_POSITIVE)
						|| example.getName().startsWith(ParseRuleInstances.PREFIX_POSITIVE)) {
					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					Resource modelOriginal = EMFResourceUtil.loadModel(pathOriginal);
					Resource modelChanged = EMFResourceUtil.loadModel(pathChanged);

					EMFModelUtil.addDisctinctAttributevalues(modelOriginal, res);
					EMFModelUtil.addDisctinctAttributevalues(modelChanged, res);
				}
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		new ParseClassTypes();
	}

}
