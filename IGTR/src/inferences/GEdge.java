package inferences;

public class GEdge {

	public String edgeID=null;
	public String edgeType="";
	public String sourceID=null;
	public String targetID=null;
	public boolean isMinimal=false;
	public int distance=-1;
	public String sourceTargetType=null;
	
    
    public GEdge(String eSourceID, String eTargetID){
    	this.edgeID = eSourceID + "_" + eTargetID;
    	this.sourceID = eSourceID;
    	this.targetID = eTargetID;
    }
    
    public GEdge(String eSourceID, String eTargetID, String EdgeType){
    	
    	this.edgeID = eSourceID + "_" + eTargetID;
    	this.sourceID = eSourceID;
    	this.targetID = eTargetID;
    	this.edgeType = EdgeType;
    }
    
    public GEdge(String eSourceID, String eTargetID, String EdgeType, boolean IsMinimal, String strSourceTargetType){
    	
    	this.edgeID = eSourceID + "_" + eTargetID;
    	this.sourceID = eSourceID;
    	this.targetID = eTargetID;
    	this.edgeType = EdgeType;
    	this.isMinimal = IsMinimal;
    	this.sourceTargetType=strSourceTargetType;
    }
}
