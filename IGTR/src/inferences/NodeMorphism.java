package inferences;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NodeMorphism implements Comparable<NodeMorphism>{

	private int Graph_IDREFF=0;
	GNode gNode = null;
	Set<GNode> mappingNodes = null;
	GNode finalMappedNode = null;
	
	
	public NodeMorphism(int graphID, GNode gnode){
		this.Graph_IDREFF = graphID;
		this.gNode=gnode;
		this.mappingNodes = new HashSet<GNode>();
	}
	
	public void addMappingNode(int mGraphID, GNode mNode){
		
			
		if (this.gNode.isMinimal != mNode.isMinimal ||
			this.gNode.distance != mNode.distance ||
			this.gNode.isInitialized !=mNode.isInitialized ||
			this.gNode.isThis !=mNode.isThis){
			return;
		}
		
		
		/*
		 *	check their current types and also their common super type 
		 */
		if (!this.gNode.nodeType.equalsIgnoreCase(mNode.nodeCommonType) && 
			!this.hasACommonSuperType(mNode)){
			return;
		}
		
		
		/** 
		 * check connected incoming and outgoing edges 
		 * 
		 */
		if (!this.isIncomingAndOutgoingEdgesMatched(mGraphID, mNode)){
			return;
		}
		
		
		
		
		this.mappingNodes.add(mNode);
		
	}
		
	
	
	private boolean hasACommonSuperType(GNode mNode){
		
		
		ArrayList<ClassType> superClassTypeForNode1 = RuleInference.getSuperTypes(this.gNode.nodeType);
		ArrayList<ClassType> superClassTypeForNode2 = RuleInference.getSuperTypes(mNode.nodeType);
		
		for (int i=0; i<superClassTypeForNode1.size(); i++){
			
			ClassType cType1 = superClassTypeForNode1.get(i);
			
			if (superClassTypeForNode2.contains(cType1)){
								
				this.gNode.nodeCommonType=cType1.getClassName();
				mNode.nodeCommonType=cType1.getClassName();
								
				return true;
			}			
		}
				
		
		return false;
	}
	
	
	
	
	private boolean isIncomingAndOutgoingEdgesMatched(int mGraphID, GNode mNode){


		// ============================================================ 
		// check matching all edges (incoming/outgoing)  
		// ------------------------------------------------------------
		try {
			if (DBRecord.getByQueryStatement(					
					"select * from"
							+ "(	(select CONCAT("
							+ "TE1.sourceTargetType,"
							+ "TE1.isMinimal) as collectedColumns, count(TE1.AbstractID) as abstractCount"
							+ " from TblEdge AS TE1 "
							+ " where TE1.Graph_IDREFF=" + this.Graph_IDREFF
							+ " and (TE1.sourceID='" + this.gNode.nodeID + "' or TE1.targetID='" + this.gNode.nodeID + "')"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TE2.sourceTargetType,"
							+ "TE2.isMinimal) as collectedColumns, count(TE2.AbstractID) as abstractCount"
							+ " from TblEdge AS TE2 "								
							+ " where TE2.Graph_IDREFF=" + mGraphID
							+ " and (TE2.sourceID='" + mNode.nodeID + "' or TE2.targetID='" + mNode.nodeID + "')"																																				
							+ " group by collectedColumns) "
							+ ") as T_MatchedStructure "
							+ "group by "
							+ "T_MatchedStructure.collectedColumns,"							
							+ "T_MatchedStructure.abstractCount "
							+ "HAVING COUNT(*)=1 limit 1;"

					, true).next()){

				return false;
			}
		}

		catch (SQLException e) {		
			e.printStackTrace();
			return false;
		}

		return true;
	}

	
	
	
	
	
	
	
	
	public void setFinalMappedNode(GNode mNode){
		this.finalMappedNode = mNode;
		this.mappingNodes=null;
	}
	
	public GNode getFinalMappedNode(){
		return this.finalMappedNode;
	}
	
	
	
	public boolean isMatchFound(){
		return mappingNodes.size()>0;
	}
	
	
	public void modifyDatabase(){
				
		DBRecord.executeSqlStatement(
				"update TblNode "
						+ "set nodeCommonType='" + this.gNode.nodeCommonType + "' "
						+ "where AbstractID in ('" + 
								this.gNode.AbstractID + "', '" + 
								this.finalMappedNode.AbstractID + "');"
						, true);		
	}
	
	
	
	public int compareTo(NodeMorphism compareNodeMorphism) {
		return this.mappingNodes.size() - 
				compareNodeMorphism.mappingNodes.size();
	}

	
}
