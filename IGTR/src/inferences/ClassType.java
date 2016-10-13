package inferences;

import java.util.HashMap;

public class ClassType {
	

	private String strClassName=null;
	
	private boolean isCollection=false;	
	
	private HashMap<ClassType, Boolean> mapSuperAndSubClassTypes=null;
	
	
	public ClassType(String StrClassName, boolean IsCollection){
		this.strClassName=StrClassName;
		this.isCollection=IsCollection;
		this.mapSuperAndSubClassTypes = new HashMap<ClassType, Boolean>();
	}
	
	
	
	public String getClassName() {
		return strClassName;
	}

	public boolean isClassCollection() {
		return isCollection;
	}

	public HashMap<ClassType, Boolean> getMapSuperAndSubClassTypes() {
		return mapSuperAndSubClassTypes;
	}
	
	
	
	public void addReferenceType(ClassType cType, boolean isSuper){
		
		if (!this.mapSuperAndSubClassTypes.containsKey(cType)){			
			this.mapSuperAndSubClassTypes.put(cType, isSuper);
		}
		
		// add opposite relation 
		if (!cType.getMapSuperAndSubClassTypes().containsKey(this)){
			cType.addReferenceType(this, !isSuper);
		}		
	}
	
	
	public Boolean removeReferenceType(ClassType cType){
		/*
		 * return can be also null
		 */
		return this.mapSuperAndSubClassTypes.remove(cType);
	}

	
}
