package inferences;

import java.util.ArrayList;

public class GNode {

	public String nodeID=null;
	public String nodeType=null;
	public boolean isThis=false;
	public boolean isReturn=false;
	public boolean isParameters=false;
	public int iParameterIndex=-1;
	public boolean isMulti=false;
	public boolean isMinimal=false;
	public boolean isRequiredContext=false;
	public boolean isInitialized=false;		// it means deletion in the pre-graph and creation in the post graph
	public boolean isCollection=false;
	public int distance=-1;
	public String strAccessedInfo="";
    
	// used just for multi-objects
	public String AbstractID=null;
	public int iSubGraphID=-1;
	
	
	// to be specified by domain expert 
	public boolean isUnnecessaryContext=false;
	protected String nodeCommonType="";
	public boolean isUniversalContext=false;
	
	
	
	
	
	
    // arraylist(s) attributes, to improve this, we could use hash-table
    protected ArrayList<String> attributeName = null;	// for searching
    public ArrayList<GAttribute> gAttribute = null;
    
    
    
    public GNode(String NodeID){
    	this.nodeID = NodeID;
    	this.iniAttribues();
    }
    
    public GNode(String NodeID, String NodeType){
    	this.nodeID = NodeID;
    	this.nodeType = NodeType;
    	this.iniAttribues();
    }
    
    
    private void iniAttribues(){
    	
        this.attributeName = new ArrayList<String>();
        this.gAttribute = new ArrayList<GAttribute>();
    }
    
    
    protected int getAttributeIndex(String AttributeName){
    	return this.attributeName.indexOf(AttributeName);
    }
    
        
    protected GAttribute getAttribute(String AttributeName){
    	    	
    	int iAtt= this.attributeName.indexOf(AttributeName);    
    	
    	if (iAtt!=-1){
    		return this.gAttribute.get(iAtt);
    	}
    	else {
    		return null;
    	}    	
    }
    
    
    protected GAttribute getAttributeByValue(String AttributeValue){
    	
    	GAttribute checkAtt=null;
    	
    	for (int iAtt=0; iAtt < this.gAttribute.size(); iAtt++){
    		
    		if (this.gAttribute.get(iAtt).attValue.equals(AttributeValue)){    			
    			checkAtt = this.gAttribute.get(iAtt);
    			break;
    		}
    		
    	}
    	
    	return checkAtt;
    }
        
    
    protected void addAttribute(    		
    		GAttribute GAtt){
    	
    	this.attributeName.add(GAtt.attName);
    	this.gAttribute.add(GAtt);
    }
    
    protected void removeAttribute(    		
    		int iAttributeIndex){
    	
    	this.attributeName.remove(iAttributeIndex);
    	this.gAttribute.remove(iAttributeIndex);    	
    }
    
    
    protected void addAttribute(    		
    		String AttributeName,
    		String AttributeType,
    		String AttributeValue,
    		String AttHashValue,
    		boolean isAttributeMinimal,
    		boolean isAttributeRequiredContext,
    		boolean isAttributeObjectRelation){
    	
    	this.attributeName.add(AttributeName);
    	this.gAttribute.add(new GAttribute(
    			AttributeName,
    			AttributeType,
    			AttributeValue,
    			AttHashValue,
    			isAttributeMinimal,
    			isAttributeRequiredContext,
    			isAttributeObjectRelation));    	
    }
    
    
    protected void clearAllAttributes(){
    	this.iniAttribues();
    }
    
    
    
//    private void setNodeCommonType(){
//    	
//    	ArrayList<ClassType> listOfSuperTypes = RuleInference.getSuperTypes(this.nodeType);
//    	    	
//    	if (listOfSuperTypes.isEmpty()){
//    		this.nodeCommonType=this.nodeType;
//    	}
//    	else {
//    		
//    		/*
//    		 * the default super type is the first one in the list  
//    		 */
//    		this.nodeCommonType=listOfSuperTypes.get(0).getClassName();
//    	}
//    }
    
    
	public String getCommonSuperType(){
		
		if (this.nodeType.equalsIgnoreCase(this.nodeCommonType) || this.nodeCommonType.length()<1){
			return this.nodeType;
		}
		else {
			return this.nodeCommonType;
		}
	}
    
    
    public void print(){
    	
		System.out.print("\n\n\t nodeID: " + this.nodeID);
		System.out.print("\t nodeType: " + this.nodeType);
		System.out.print("\t isMinimal: " + this.isMinimal);    		
		System.out.print("\t isRequiredContext: " + this.isRequiredContext);
		System.out.print("\t isInitialized: " + this.isInitialized);
		System.out.print("\t isCollection: " + this.isCollection);		
		System.out.print("\t isThis: " + this.isThis);
		System.out.print("\t isReturn: " + this.isReturn);
		System.out.print("\t isParameters: " + this.isParameters);
		System.out.print("\t iParameterIndex: " + this.iParameterIndex);
		System.out.print("\t isCollection: " + this.isCollection);
		
    }
    
}


