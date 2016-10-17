package inferences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ClassType {
	

	private String strClassName=null;
	
	private boolean isCollection=false;	
	
	private HashMap<ClassType, Boolean> mapSuperAndSubClassTypes=null;
	
	private Set<ClassType> ListOfAllowedTypeToBeGeneralised = new HashSet<ClassType>();
	
	
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
	
	
	
	public void addReferenceType(ClassType cType, boolean isSuper, boolean allowGeneralisation){
		
		if (!this.mapSuperAndSubClassTypes.containsKey(cType)){			
			
			this.mapSuperAndSubClassTypes.put(cType, isSuper);
			if (allowGeneralisation){
				this.ListOfAllowedTypeToBeGeneralised.add(cType);
			}
		}
		
		// add opposite relation 
		if (!cType.getMapSuperAndSubClassTypes().containsKey(this)){
			cType.addReferenceType(this, !isSuper, allowGeneralisation);
		}		
	}
	
	
	public Boolean removeReferenceType(ClassType cType){
		/*
		 * return can be also null
		 */
		return this.mapSuperAndSubClassTypes.remove(cType);
	}

	
	public boolean isAllowedTypeToBeGeneralised(ClassType cType){
		return this.ListOfAllowedTypeToBeGeneralised.contains(cType);
	}
	
}
