package inferences;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;
import emf.util.EMFMetaUtil;

public class ParseClassTypes {

	// Ecore type (EClass) -> node type (ClassType)
	private Map<EClass, ClassType> eClass2NodeType = null;

	public ParseClassTypes() {

		this.parsingMetaModelFile();
		this.save();
	}

	/**
	 * TODO parsing meta model file
	 */
	private void parsingMetaModelFile() {
		System.out.println("Parsing meta model and import type graph");

		eClass2NodeType = new HashMap<EClass, ClassType>();

		// Domain info
		String modelType = "ecore";
		IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration(modelType);

		// Collect relevant eClasses
		EList<EClassifier> eClassifiers = EMFMetaUtil.getAllMetaClassesForPackage(domainConfig.getEPackage());
		Set<EClass> unconsideredEClasses = domainConfig.getUnconsideredNodeTypes();
		for (EClass eClass : unconsideredEClasses) {
			// System.out.println("ignore: " + eClass.getName());
		}

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
				nodeType.addReferenceType(superNodeType, true);
			}
		}

		/*
		 * Example initialising set of types
		 */

		// ClassType EPackageCType = new ClassType("EPackage", false);
		// ClassType EClassCType = new ClassType("EClass", false);
		// ClassType EAttributeCType = new ClassType("EAttribute", false);
		// ClassType EDataTypeCType = new ClassType("EDataType", false);
		// ClassType EReferenceCType = new ClassType("EReference", false);
		// ClassType EAssociationCType = new ClassType("EAssociation", true); //
		// just
		// // an
		// // example
		// // and
		// // assume
		// // this
		// // an
		// // aggregation
		// // association
		//
		// /*
		// * and here an example of adding their relations
		// */
		// EPackageCType.addReferenceType(EClassCType, false);
		// EClassCType.addReferenceType(EAttributeCType, false);
		// EAttributeCType.addReferenceType(EDataTypeCType, false);
		// EReferenceCType.addReferenceType(EAssociationCType, false);
		//
		// this.listClassTypes = new ArrayList<ClassType>();
		// this.listClassTypes.add(EPackageCType);
		// this.listClassTypes.add(EClassCType);
		// this.listClassTypes.add(EAttributeCType);
		// this.listClassTypes.add(EDataTypeCType);
		// this.listClassTypes.add(EReferenceCType);
		// this.listClassTypes.add(EAssociationCType);

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

		/*
		 * close DB connection
		 */
		DBRecord.closeConnection();

		System.out.print("done\n");
	}

	public static void main(String[] args) {
		new ParseClassTypes();
	}

}
