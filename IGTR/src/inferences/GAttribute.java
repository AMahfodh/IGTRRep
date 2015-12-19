package inferences;

public class GAttribute {

	
	public String attName = null;
	public String attType = null;
	public String attValue = null;
	public String attLastUpdatedValue = null;
	public String attHashValue = "";
	public boolean attIsMinimal = false;
	public boolean attIsRequiredContext = false;    
	public boolean attIsObjectRelation = false;
	public String attGeneralisedValue = "";
	public boolean attIsAssignedToParameter = false;
	
	
    public GAttribute (String attName) {
    	this.attName= attName;
    }
    
    public GAttribute (String attName, String AttType, String AttValue){
    	this(attName, AttType, AttValue, "");
    }
    
    
    public GAttribute (String attName, String AttType, String AttValue, String AttHashValue){
    	this.attName= attName;
    	this.attType= AttType;
    	this.attValue= AttValue;
    	this.attHashValue=AttHashValue;
    	this.attLastUpdatedValue=AttValue;
    }
    
    
    public GAttribute (
    		String attName, 
    		String AttType, 
    		String AttValue,
    		String AttHashValue,
    		boolean isMinimal, 
    		boolean isRequired,
    		boolean isRelation) {
    	
    	
    	this.attName= attName;
    	this.attType= AttType;
    	this.attValue= AttValue;
    	this.attHashValue=AttHashValue;
    	
        this.attIsMinimal = isMinimal;
        this.attIsRequiredContext = isRequired;    
        this.attIsObjectRelation = isRelation;
        this.attLastUpdatedValue=AttValue;
    }
    
}
