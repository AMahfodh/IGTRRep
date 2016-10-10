package inferences;

import java.util.ArrayList;

public class ParseClassTypes {

	
	private ArrayList<ClassType> listClassTypes = null; 
	
	

	public ParseClassTypes(){

		this.parsingMetaModelFile();
		this.save();
	}
	
	
	
	/**
	 * TODO parsing meta model file
	 */
	private void parsingMetaModelFile(){
		

		System.out.println("parsing meta model file ..");
		
		/*
		 * Example initialising set of types 
		 */
		
		ClassType EPackageCType = new ClassType("EPackage", false);
		ClassType EClassCType = new ClassType("EClass", false);		
		ClassType EAttributeCType = new ClassType("EAttribute", false);
		ClassType EDataTypeCType = new ClassType("EDataType", false);
		ClassType EReferenceCType = new ClassType("EReference", false);
		ClassType EAssociationCType = new ClassType("EAssociation", true);	// just an example and assume this an aggregation association
		
		
		
		
		/* 
		 * and here an example of adding their relations 
		 */		
		EPackageCType.addReferenceType(EClassCType, false);		
		EClassCType.addReferenceType(EAttributeCType, false);						
		EAttributeCType.addReferenceType(EDataTypeCType, false);				
		EReferenceCType.addReferenceType(EAssociationCType, false);
		
		
		
		
		
		this.listClassTypes= new ArrayList<ClassType>();		
		this.listClassTypes.add(EPackageCType);
		this.listClassTypes.add(EClassCType);		
		this.listClassTypes.add(EAttributeCType);
		this.listClassTypes.add(EDataTypeCType);		
		this.listClassTypes.add(EReferenceCType);
		this.listClassTypes.add(EAssociationCType);
		
	}
	
	
	private void save(){
		
		System.out.print("\nsaving class types .. ");
		
		if (this.listClassTypes==null){
			
			System.err.println("The list of class types (listClassTypes) is null! ");
			return;
		}
		
		
		
		/*
		 * open DB connection
		 */
		DBRecord.openConnection();
		
		/* save types first */
		for (ClassType cType: this.listClassTypes){
			DBRecord.saveClassTypes(cType);
		}
		
		/* and then save their associations */
		for (ClassType cType: this.listClassTypes){
			DBRecord.saveClassAssociations(cType);
		}
		
		/*
		 *  close DB connection 
		 */
		DBRecord.closeConnection(); 
		
		System.out.print("done\n");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new ParseClassTypes();

	}

	
	
	

}
