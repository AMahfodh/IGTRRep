package inferences;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;

import com.sun.rowset.CachedRowSetImpl;



public class RuleInstance  {

	protected int ruleInsID=-1;
	private int iObjectsCount=0;
	private boolean hasEffect=false;
	private String charSeparator = String.valueOf(((char)007));
	
	
	private String ruleName=null;
	private ArrayList<GParameter> ruleParameters= new ArrayList<GParameter>();
	private GraphT gLHS=null;
	private GraphT gRHS=null;
	
	private boolean isNAC=false;
	private int iNacReferenceID=-1;
	
	
	public RuleInstance(
			String strRruleName,
			ArrayList<GParameter> strRuleParameters,
			GraphT insLHS,
			GraphT insRHS){

		this(strRruleName, strRuleParameters, insLHS, insRHS, false, 0);
	}
	
	
	public RuleInstance(
			String strRruleName,
			ArrayList<GParameter> strRuleParameters,
			GraphT insLHS,
			GraphT insRHS,
			boolean IsNac,
			int INacReferenceID){
				
		this.ruleName=strRruleName.trim();
		this.ruleParameters=strRuleParameters;
		this.gLHS=insLHS;
		this.gRHS=insRHS;
		this.isNAC=IsNac;
		this.iNacReferenceID=INacReferenceID;
	}
	
	
	
	
	
	

	protected boolean save(){


		this.adjustGraphElements();


		// open DB connection
		DBRecord.openConnection();


		this.ruleInsID = DBRecord.setNewObservation(this.ruleName);		
		if (this.ruleInsID<1 ||
				!DBRecord.endCurrentObservation(
						this.ruleInsID, 
						this.ruleName,
						this.strGetRuleParameters(), "")){

			System.out.println("fault: unable to save rule (or NAC) instance!");
			return false;		
		}




		// save meta
		if (!DBRecord.initialSavingBasicRule(
				this.ruleInsID, 
				this.ruleName,
				!this.isNAC,
				0, 							// iTotalExecutedObjects
				0, 							// iScopeObjectsCount
				this.iObjectsCount,			
				0,							//internalStateStep
				this.hasEffect, 			
				this.iNacReferenceID,		//parentRuleId
				DigestUtils.sha1Hex(this.ruleName))){

			System.out.println("fault: unable to save rule/NAC meta!");
			return false;	
		}


		// save rule elements (nodes, attributes and edges)
		this.saveRuleElements();


		// close DB connection 
		DBRecord.closeConnection(); 




		if (this.isNAC){
			System.out.println("NAC instance saved: id= " + this.ruleInsID + " (rule reference id:" + this.iNacReferenceID + ")");
		}
		else {
			System.out.println("rule instance saved: id= " + this.ruleInsID);
		}

		
		return true;
	}


	
	

	
	
	
	private void adjustGraphElements(){
		
		
		boolean setThisObject=false;
		this.iObjectsCount= this.gLHS.gNodes.size();
		this.hasEffect=false;
				
		
		
		// loop over pre-graph
    	for (int iNode=0; iNode<this.gLHS.gNodes.size(); iNode++){
    		
			GNode preNode = this.gLHS.gNodes.get(iNode);			
			GNode postNode = this.gRHS.getNode(preNode.nodeID);
			
			preNode.isRequiredContext=true;
			
			if (postNode==null){
				preNode.isMinimal=true;
				preNode.isInitialized=true; // this just to style deleted object
			}
			
			else {
				
				
				// set (this) node
				if (!setThisObject){
					preNode.isThis=true;
					postNode.isThis=true;
					setThisObject=true;
				}
				
				
				postNode.isRequiredContext=true;
				
				// check for update-attribute to set (minimal) element..
				if (this.isThereChange(preNode, postNode)){
					preNode.isMinimal=true;
					postNode.isMinimal=true;
					this.hasEffect=true;
				}
				
			}
    	}
		
    	
		// loop over post graph for remaining nodes
    	for (int iNode=0; iNode<this.gRHS.gNodes.size(); iNode++){
    		
    		GNode gNode = this.gRHS.gNodes.get(iNode);
    		
    		if (!gNode.isRequiredContext){
    			
    			gNode.isRequiredContext=true;
				gNode.isMinimal=true;
				gNode.isInitialized=true;	// created node				
				this.iObjectsCount++;
				this.hasEffect=true;
    		}
    	}
    		
		
		
    	
    	// adjust edges ..
		this.adjustEdgeMinimal(gLHS, gRHS);

	}
	
	
	
	private boolean isThereChange(GNode preNode, GNode postNode){
		
		// both nodes must have the same type as well as attribute types..
		
		for (int iAtt=0; iAtt<preNode.gAttribute.size(); iAtt++){
			
			GAttribute preAtt= preNode.gAttribute.get(iAtt);
			GAttribute postAtt= postNode.gAttribute.get(iAtt);
			
			if (!preAtt.attValue.equals(postAtt.attValue)){
				return true;
			}
			
		}
		return false;
	}
	
	
	private void adjustEdgeMinimal (GraphT preGraph, GraphT postGraph){
		
		// set (minimal) edge in the pre-graph 
		for (int iEdge=0; iEdge<preGraph.gEdges.size(); iEdge++){
					
			GEdge checkPreMinimalEdge = preGraph.gEdges.get(iEdge);
			
			this.setEdgeSourceTargetType(checkPreMinimalEdge, preGraph);
			
			
			if (checkPreMinimalEdge.isMinimal){	
				this.hasEffect=true;
				continue;
			}
			
			// check if this edge not exist in the post graph
			if (postGraph.getEdgeIndex(checkPreMinimalEdge.edgeID)==-1){
				checkPreMinimalEdge.isMinimal=true;
				this.hasEffect=true;
			}
		}
		
		
		
		// set minimal edge in the post-graph 
		for (int iEdge=0; iEdge<postGraph.gEdges.size(); iEdge++){
					
			GEdge checkPostMinimalEdge = postGraph.gEdges.get(iEdge);
			
			this.setEdgeSourceTargetType(checkPostMinimalEdge, postGraph);
			
			
			if (checkPostMinimalEdge.isMinimal){
				this.hasEffect=true;
				continue;
			}
			
			// check if this edge not exist in the post graph
			if (preGraph.getEdgeIndex(checkPostMinimalEdge.edgeID)==-1){
				checkPostMinimalEdge.isMinimal=true;
				this.hasEffect=true;
			}
		}
		
		
	}
	
	
	private void setEdgeSourceTargetType(GEdge eEdg, GraphT gT){
				
		// get source type
		GNode nSrouceAndTargetType = gT.getNode(eEdg.sourceID);
		if (nSrouceAndTargetType==null){
			return;
		}
		eEdg.sourceTargetType = nSrouceAndTargetType.nodeType + "/" + eEdg.edgeType;
		
		
		// get target type
		//nSrouceAndTargetType = gT.getNode(eEdg.targetID);
		//if (nSrouceAndTargetType==null){
		//	return;
		//}
		//eEdg.sourceTargetType += "/" + nSrouceAndTargetType.nodeType;
	}
	

	private void updateMinimalNodeFromEdgeMinimal(int iPreGraphID, int iPostGraphID){
		
		String strSQLStatement=
				  "update TblNode "
				 + " set isMinimal=true " 
				 + " where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + " and isMinimal=false "
				 + " and nodeID IN ("
				 + "	select sourceID as nodeID from TblEdge "
				 + "	where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "	and isMinimal=true "
				 + "	union"
				 + "	select targetID as nodeID from TblEdge "
				 + "	where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "	and isMinimal=true "
				 + ");"
				 + ""
				 + "DROP TEMPORARY TABLE IF EXISTS tblTemp3;"
				 + "CREATE TEMPORARY TABLE IF NOT EXISTS tblTemp3 AS ("
				 + "	select sourceID as nodeID from TblEdge "
				 + "	where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "	and isMinimal=false "
				 + "	and targetID in ("
				 + "		select nodeID as targetID from TblNode"
				 + "		where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "		and isMinimal=true"
				 + "		and isCollection=true));"
				 + ""
				 + "update TblNode "
				 + " set isMinimal=true " 
				 + " where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + " and isMinimal=false "
				 + " and isCollection=false "
				 + " and nodeID IN (select nodeID from tblTemp3);"
				 + ""
				 + "update TblEdge "
				 + " set isMinimal=true "
				 + " where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"				 
				 + " and isMinimal=false "
				 + " and sourceID in ("
				 + "		select nodeID as targetID from TblNode"
				 + "		where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "		and isMinimal=true)"
				 + " and targetID in ("
				 + "		select nodeID as targetID from TblNode"
				 + "		where (Graph_IDREFF=" + iPreGraphID + " or Graph_IDREFF=" + iPostGraphID + ")"
				 + "		and isMinimal=true"
				 + "		and isCollection=true);" 
				 + "";
				
		DBRecord.executeAnySqlStatement(strSQLStatement, true);
	}
	

	
	
    
    private void saveRuleElements(){
    	

		// Override graphTypes for gLhs and gRhs
    	this.gLHS.observation_ID=this.ruleInsID;
    	this.gLHS.graphType=0;
    	
    	this.gRHS.observation_ID=this.ruleInsID;
    	this.gRHS.graphType=1;
    	
    	
    	// save nodes and edges for both graphs    	
    	if (!gLHS.saveNodes()){    		
    		System.out.println("fault: unable to save rule elements (nodes) in LHS!");
			return;
    	}
    	if (!gRHS.saveNodes()){
    		
    		System.out.println("fault: unable to save rule elements (nodes) in RHS!");
			return;
    	}  	
    	if (!gLHS.saveEdges()){
    		
    		System.out.println("fault: unable to save rule elements (edges) in LHS!");
			return;
    	}
    	if (!gRHS.saveEdges()){
    		
    		System.out.println("fault: unable to save rule elements (edges) in RHS!");
			return;
    	}

    	
    	
    	// update minimal node defined by minimal edges
    	this.updateMinimalNodeFromEdgeMinimal(gLHS.graphID, gRHS.graphID);
    	
    }
    
    
    
    
    
    

    private String strGetRuleParameters(){
    	
    	String strParameters="";

    	for (int iPar=0; iPar<this.ruleParameters.size(); iPar++){
    		
    		GParameter getPar=this.ruleParameters.get(iPar);
    		
    		strParameters 	+=getPar.ParType + " " 
    						+ getPar.ParName + " = " 
    						+ getPar.ParValue;    		
    		
    		
    		if (iPar<this.ruleParameters.size()-1){
    			strParameters+= charSeparator + " ";
    		}
    	}

    	return strParameters;
    }
    
    
    
    
    
    
    
    
    
}
