package inferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NodeMorphism implements Comparable<NodeMorphism>{

	GNode gNode = null;
	Set<GNode> mappingNodes = null;
	GNode finalMappedNode = null;
	
	
	public NodeMorphism(GNode gnode){
		this.gNode=gnode;
		this.mappingNodes = new HashSet<GNode>();
	}
	
	public void addMappingNode(GNode mNode){
		
			
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
		 * TODO check connected incoming and outgoing edges 
		 * 
		 */
		
		
		
		
		
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
