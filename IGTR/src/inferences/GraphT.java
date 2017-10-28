package inferences;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.rowset.CachedRowSetImpl;

public class GraphT {

	
	protected int observation_ID=-2;
	public int graphID=-1;
	public int graphType=-1;

	
    // nodes
	public ArrayList<GNode> gNodes = null;
	public ArrayList<String> nodesIndexs = null;
	
	
	// edges
	public ArrayList<GEdge> gEdges = null;    
	public ArrayList<String> edgesIndexs = null;
    
    
    
    
    
    public GraphT (){
    	this.iniNodeList();
    	this.gEdges = new ArrayList<GEdge>();
    }
    
    
    
    public GraphT (int O_ID, int GraphType){
    	
    	this.observation_ID= O_ID;
    	this.graphType = GraphType;
    	this.iniNodeList();
    }
       
    


    
    public GraphT (int GraphID, boolean loading, boolean loadOnlyMinimalElements, boolean isMaximalRule){
    	
    	this(GraphID, loading, loadOnlyMinimalElements, isMaximalRule, false);
    }

    
    public GraphT (int GraphID, boolean loading, boolean loadOnlyMinimalElements, boolean isMaximalRule, boolean isConnectionOpen){
    	
    	
    	this.graphID = GraphID;
    	this.iniNodeList();
    	
    	if (loading){
    		this.gEdges = new ArrayList<GEdge>();
    		
    		if (isConnectionOpen){
    			this.LoadWithOpenConnection(loadOnlyMinimalElements, isMaximalRule);	
    		}
    		else {
    			this.Load(loadOnlyMinimalElements, isMaximalRule);
    		}
    		
    	}
    }
    
    
    
    
    private void iniNodeList(){
    	
    	this.gNodes = new ArrayList<GNode>();
    	this.nodesIndexs = new ArrayList<String>();
    }
    
    public int getGraphType(){
    	return this.graphType;
    }
    
    
    

    private boolean Load(boolean isOnlyMinimalElements, boolean isMaximalRule){

    	if (this.gNodes.size()>0){
    		// graph loaded already
    		return false;
    	}

    	this.gEdges = new ArrayList<GEdge>();




    	String strSQLOnlyMinimalElements="";
    	if (isOnlyMinimalElements){
    		strSQLOnlyMinimalElements=" isMinimal=true and ";
    	}
    	if (isMaximalRule){
    		strSQLOnlyMinimalElements+=" (isToBeDeleted is null or isToBeDeleted=false) and ";
    	}




    	// open connection ..
    	DBRecord.openConnection();

    	CachedRowSetImpl crsNodesEdges=null;
    	if (this.graphID!=-1){

    		// loading by graph id
    		crsNodesEdges= DBRecord.getByQueryStatement(
    				"select nodeID, nodeType, isMinimal, isRequiredContext, isInitialized, "
    				+ "isCollection, GraphID, Observation_IDREFF, graphType, isThis, isParameters, "
    				+ "isReturn, iParameterIndex, AbstractID, nodeCommonType, isUniversalContext "
    						+ "from TblGraph INNER JOIN TblNode on GraphID=Graph_IDREFF "
    						+ "where " + strSQLOnlyMinimalElements + " GraphID=" + this.graphID, true);
    	}
    	else {

    		// loading by Observation id and graphType
    		crsNodesEdges= DBRecord.getByQueryStatement(
    				"select nodeID, nodeType, isMinimal, isRequiredContext, isInitialized, "
    				+ "isCollection, GraphID, Observation_IDREFF, graphType, isThis, isParameters, "
    				+ "isReturn, iParameterIndex, AbstractID, nodeCommonType, isUniversalContext "
    						+ "from TblGraph INNER JOIN TblNode on GraphID=Graph_IDREFF "
    						+ "where " + strSQLOnlyMinimalElements + " Observation_IDREFF=" + this.observation_ID
    						+ " and graphType=" + this.graphType, true);
    	}


    	//**	load nodes 
    	try {
    		while (crsNodesEdges.next()){


    			if (crsNodesEdges.isFirst()){
    				this.graphID=crsNodesEdges.getInt(7);
    				this.observation_ID=crsNodesEdges.getInt(8);
    				if (crsNodesEdges.getBoolean(9)){
    					this.graphType=1;
    				}
    				else {
    					this.graphType=0;
    				}
    			}


    			GNode loadNode= new GNode(crsNodesEdges.getString(1), crsNodesEdges.getString(2));
    			loadNode.isMinimal=crsNodesEdges.getBoolean(3);
    			loadNode.isRequiredContext=crsNodesEdges.getBoolean(4);
    			loadNode.isInitialized=crsNodesEdges.getBoolean(5);
    			loadNode.isCollection=crsNodesEdges.getBoolean(6);
    			loadNode.isThis=crsNodesEdges.getBoolean(10);
    			loadNode.isParameters=crsNodesEdges.getBoolean(11);
    			loadNode.isReturn=crsNodesEdges.getBoolean(12);
    			loadNode.iParameterIndex=crsNodesEdges.getInt(13);
    			loadNode.AbstractID=crsNodesEdges.getString(14);
    			loadNode.nodeCommonType=crsNodesEdges.getString(15);
    			loadNode.isUniversalContext=crsNodesEdges.getBoolean(16);

    			//** load attributes 

    			CachedRowSetImpl crsNodesAttributes= DBRecord.getByQueryStatement(
    					"select AttributeName, AttributeType, AttributeValue, generalisedValue, isAssignedToParameter "
    							+ "from TblNodeAttributes "
    							+ "where isObjectRelation=false and "
    							+ "Graph_IDREFF=" + this.graphID
    							+ " and node_IDREFF='" + crsNodesEdges.getString(1) + "';", true);

    			while (crsNodesAttributes.next()){

    				GAttribute loadAttribute = new GAttribute(
    						crsNodesAttributes.getString(1),
    						crsNodesAttributes.getString(2),
    						crsNodesAttributes.getString(3));

    				loadAttribute.attGeneralisedValue=crsNodesAttributes.getString(4);
    				loadAttribute.attIsAssignedToParameter=crsNodesAttributes.getBoolean(5);

    				loadNode.addAttribute(loadAttribute);
    			}


    			// add node with its belong attributes 
    			this.addNode(loadNode);		


    		}

    	} catch (SQLException e) {		
    		e.printStackTrace();
    	}



    	if (this.gNodes.size()<1){
    		// no nodes in the loaded graph
    		return false;
    	}



    	crsNodesEdges= DBRecord.getByQueryStatement(
    			"select sourceID, targetID, edgeType, isMinimal, sourceTargetType "
    					+ "from TblEdge where " + strSQLOnlyMinimalElements + " Graph_IDREFF=" + this.graphID, true);

    	//**	load edges 
    	try {
    		while (crsNodesEdges.next()){

    			this.gEdges.add(
    					new GEdge(
    							crsNodesEdges.getString(1),
    							crsNodesEdges.getString(2),
    							crsNodesEdges.getString(3),
    							crsNodesEdges.getBoolean(4),
    							crsNodesEdges.getString(5)));					
    		}

    	} catch (SQLException e) {		
    		e.printStackTrace();
    	}


    	// close connection ..
    	DBRecord.closeConnection();

  
    	return true;
    }

    
    
    
    
    
    public boolean LoadWithOpenConnection(boolean isOnlyMinimalElements, boolean isMaximalRule){

    	if (this.gNodes.size()>0){
    		// graph loaded already
    		return false;
    	}

    	this.gEdges = new ArrayList<GEdge>();




    	String strSQLOnlyMinimalElements="";
    	if (isOnlyMinimalElements){
    		strSQLOnlyMinimalElements=" isMinimal=true and ";
    	}
    	if (isMaximalRule){
    		strSQLOnlyMinimalElements+=" (isToBeDeleted is null or isToBeDeleted=false) and ";
    	}




    	CachedRowSetImpl crsNodesEdges=null;
    	if (this.graphID!=-1){

    		// loading by graph id
    		crsNodesEdges= DBRecord.getByQueryStatement(
    				"select nodeID, nodeType, isMinimal, isRequiredContext, isInitialized, "
    				+ "isCollection, GraphID, Observation_IDREFF, graphType, isThis, isParameters, "
    				+ "isReturn, iParameterIndex, AbstractID, nodeCommonType, isUniversalContext "
    						+ "from TblGraph INNER JOIN TblNode on GraphID=Graph_IDREFF "
    						+ "where " + strSQLOnlyMinimalElements + " GraphID=" + this.graphID, true);
    	}
    	else {

    		// loading by Observation id and graphType
    		crsNodesEdges= DBRecord.getByQueryStatement(
    				"select nodeID, nodeType, isMinimal, isRequiredContext, isInitialized, "
    				+ "isCollection, GraphID, Observation_IDREFF, graphType, isThis, isParameters, "
    				+ "isReturn, iParameterIndex, AbstractID, nodeCommonType, isUniversalContext "
    						+ "from TblGraph INNER JOIN TblNode on GraphID=Graph_IDREFF "
    						+ "where " + strSQLOnlyMinimalElements + " Observation_IDREFF=" + this.observation_ID
    						+ " and graphType=" + this.graphType, true);
    	}


    	//**	load nodes 
    	try {
    		while (crsNodesEdges.next()){


    			if (crsNodesEdges.isFirst()){
    				this.graphID=crsNodesEdges.getInt(7);
    				this.observation_ID=crsNodesEdges.getInt(8);
    				if (crsNodesEdges.getBoolean(9)){
    					this.graphType=1;
    				}
    				else {
    					this.graphType=0;
    				}
    			}


    			GNode loadNode= new GNode(crsNodesEdges.getString(1), crsNodesEdges.getString(2));
    			loadNode.isMinimal=crsNodesEdges.getBoolean(3);
    			loadNode.isRequiredContext=crsNodesEdges.getBoolean(4);
    			loadNode.isInitialized=crsNodesEdges.getBoolean(5);
    			loadNode.isCollection=crsNodesEdges.getBoolean(6);
    			loadNode.isThis=crsNodesEdges.getBoolean(10);
    			loadNode.isParameters=crsNodesEdges.getBoolean(11);
    			loadNode.isReturn=crsNodesEdges.getBoolean(12);
    			loadNode.iParameterIndex=crsNodesEdges.getInt(13);
    			loadNode.AbstractID=crsNodesEdges.getString(14);
    			loadNode.nodeCommonType=crsNodesEdges.getString(15);
    			loadNode.isUniversalContext=crsNodesEdges.getBoolean(16);

    			//** load attributes 

    			CachedRowSetImpl crsNodesAttributes= DBRecord.getByQueryStatement(
    					"select AttributeName, AttributeType, AttributeValue, generalisedValue, isAssignedToParameter "
    							+ "from TblNodeAttributes "
    							+ "where isObjectRelation=false and "
    							+ "Graph_IDREFF=" + this.graphID
    							+ " and node_IDREFF='" + crsNodesEdges.getString(1) + "';", true);

    			while (crsNodesAttributes.next()){

    				GAttribute loadAttribute = new GAttribute(
    						crsNodesAttributes.getString(1),
    						crsNodesAttributes.getString(2),
    						crsNodesAttributes.getString(3));

    				loadAttribute.attGeneralisedValue=crsNodesAttributes.getString(4);
    				loadAttribute.attIsAssignedToParameter=crsNodesAttributes.getBoolean(5);

    				loadNode.addAttribute(loadAttribute);
    			}


    			// add node with its belong attributes 
    			this.addNode(loadNode);		


    		}

    	} catch (SQLException e) {		
    		e.printStackTrace();
    	}



    	if (this.gNodes.size()<1){
    		// no nodes in the loaded graph
    		return false;
    	}



    	crsNodesEdges= DBRecord.getByQueryStatement(
    			"select sourceID, targetID, edgeType, isMinimal, sourceTargetType "
    					+ "from TblEdge where " + strSQLOnlyMinimalElements + " Graph_IDREFF=" + this.graphID, true);

    	//**	load edges 
    	try {
    		while (crsNodesEdges.next()){

    			this.gEdges.add(
    					new GEdge(
    							crsNodesEdges.getString(1),
    							crsNodesEdges.getString(2),
    							crsNodesEdges.getString(3),
    							crsNodesEdges.getBoolean(4),
    							crsNodesEdges.getString(5)));					
    		}

    	} catch (SQLException e) {		
    		e.printStackTrace();
    	}


  
    	return true;
    }
    
    
    
    
    
    
    public boolean LoadMultiObjects (boolean isOnlyMinimalElements, boolean isMaximalRule){

    	
    	// open connection ..
    	DBRecord.openConnection();

    	 
    	String strSQLOnlyMinimalElements="";
    	if (isOnlyMinimalElements){
    		strSQLOnlyMinimalElements=" isMinimal=true and ";
    	}
    	if (isMaximalRule){
    		strSQLOnlyMinimalElements+=" (isToBeDeleted is null or isToBeDeleted=false) and ";
    	}
    	
    	
    	
        	// loading by graph id
    	CachedRowSetImpl crsNodesEdges= DBRecord.getByQueryStatement(
        			"select "
        			+ "TblNode.AbstractID, "
        			+ "nodeType, "
        			+ "isMinimal, "
        			+ "isRequiredContext, "
        			+ "isInitialized, "
        			+ "isCollection, "
        			+ "isThis, "
        			+ "isParameters, "
        			+ "isReturn,"
        			+ "isMulti,"
        			+ "iParameterIndex,"
        			+ "nodeID,"
        			+ "nodeCommonType "
        			+ "from TblNode INNER JOIN TblRuleMoNodes "
        			+ "on TblNode.AbstractID=TblRuleMoNodes.AbstractID "
        			+ "where " + strSQLOnlyMinimalElements 
        			+ " Graph_IDREFF=" + this.graphID, true);

    	//**	load nodes 
		try {
			while (crsNodesEdges.next()){
				
				
				GNode loadNode= new GNode(
						crsNodesEdges.getString(1), 
						crsNodesEdges.getString(2));
				
				loadNode.isMinimal=crsNodesEdges.getBoolean(3);
				loadNode.isRequiredContext=crsNodesEdges.getBoolean(4);
				loadNode.isInitialized=crsNodesEdges.getBoolean(5);
				loadNode.isCollection=crsNodesEdges.getBoolean(6);
				loadNode.isThis=crsNodesEdges.getBoolean(7);
				loadNode.isParameters=crsNodesEdges.getBoolean(8);
				loadNode.isReturn=crsNodesEdges.getBoolean(9);
				loadNode.isMulti=crsNodesEdges.getBoolean(10);
				loadNode.iParameterIndex=crsNodesEdges.getShort(11);
				loadNode.AbstractID=crsNodesEdges.getString(12);
				loadNode.nodeCommonType=crsNodesEdges.getString(13);
				
				//** load attributes 				
				CachedRowSetImpl crsNodesAttributes= DBRecord.getByQueryStatement(
		    			"select AttributeName, generalisedValue, isAssignedToParameter "
		    			+ "from TblNodeAttributes "
		    			+ "where isObjectRelation=false "
		    			+ " and generalisedValue<>'' "
		    			+ " and Graph_IDREFF=" + this.graphID
		    			+ " and node_IDREFF='" + crsNodesEdges.getString(12) + "';", true);
				
				while (crsNodesAttributes.next()){
					
					GAttribute loadAttribute = new GAttribute(
							crsNodesAttributes.getString(1), "", "");
					
					loadAttribute.attGeneralisedValue=crsNodesAttributes.getString(2);
					loadAttribute.attIsAssignedToParameter=crsNodesAttributes.getBoolean(3);
					
					loadNode.addAttribute(loadAttribute);
				}
				
				
				// add node with its belong attributes 
				this.addNode(loadNode);		
				
										
			}
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
    	
		
    	if (this.gNodes.size()<1){
    		// no nodes in the loaded graph
    		return false;
    	}
    	
    	    
    	
    	
    	crsNodesEdges= DBRecord.getByQueryStatement(
    			"select "
    			+ "sourceAbstractID, "
    			+ "targetAbstractID, "
    			+ "edgeType, "
    			+ "isMinimal, "
    			+ "sourceTargetType "
    			+ "from TblEdge INNER JOIN TblRuleMoEdge "
    			+ "on TblEdge.AbstractID=TblRuleMoEdge.AbstractID "
    			+ "where " + strSQLOnlyMinimalElements + "Graph_IDREFF=" + this.graphID, true);

    	
    	//**	load edges 
    	try {
    		while (crsNodesEdges.next()){

    			this.gEdges.add(
    					new GEdge(
    							crsNodesEdges.getString(1),
    							crsNodesEdges.getString(2),
    							crsNodesEdges.getString(3),
    							crsNodesEdges.getBoolean(4),
    							crsNodesEdges.getString(5)));					
    		}

    	} catch (SQLException e) {		
    		e.printStackTrace();
    	}

    	
    	
		
		// close connection ..
		DBRecord.closeConnection();
    	
		
		
    	
    	return true;
    }
    
    
    
    
    public boolean saveNodes (){
    	
    	this.graphID = DBRecord.saveGraphT(this.observation_ID, this.graphType);
    	
    	if (this.graphID<1){
    		return false;
    	}
    	
    	
    	// save nodes
		for (int iNodeIndex=0; iNodeIndex<this.gNodes.size(); iNodeIndex++){
			
			
			GNode sNode=this.gNodes.get(iNodeIndex);
			
			//if (sNode.isInitialized && this.graphType==0){
			//	continue;
			//}
			
			if (!DBRecord.saveGraphNodes(this.graphType, this.graphID, sNode)){
				return false;
			}
		}
    	
		
    	// true after all saving
    	return true;
    }
    
    
    public boolean saveEdges (){
    	
    	// save Edges
	   for (int iEdge=0; iEdge<this.gEdges.size(); iEdge++){
					
			if (!DBRecord.saveGraphEdges(this.graphID, this.gEdges.get(iEdge))){
				return false;
			}			
		}
    			
    	// true after all saving
    	return true;
    }
    
    
    
    
    public int getNodeIndex (String nodeID){
    	return this.nodesIndexs.indexOf(nodeID);    	
    }
    
    public GNode getNode(String nodeID){
    	
    	int iNode= this.getNodeIndex(nodeID);    
    	
    	if (iNode!=-1){
    		return this.gNodes.get(iNode);
    	}
    	else {
    		return null;
    	}    	
    }
        
    public void addNode(GNode gn){
    	
    	this.nodesIndexs.add(gn.nodeID);
    	this.gNodes.add(gn);
    }
        
    public void removeNode(int iIndex){
    	
    	this.nodesIndexs.remove(iIndex);
    	this.gNodes.remove(iIndex);
    }
    
    
    public void removeEdge(int iIndex){
    	
    	this.gEdges.remove(iIndex);
    	
    	if (this.edgesIndexs!=null){
    		this.edgesIndexs.remove(iIndex);
    	}
    }

    
    
    
    
    
    
    
    
    
    public void generateEdges(){
    	
    	// initialise edge ArrayLists
    	this.gEdges = new ArrayList<GEdge>();
    	this.edgesIndexs = new ArrayList<String>();
    	
    	for (int iNode=0; iNode<this.gNodes.size(); iNode++){
    		
			GNode sourceNode = this.gNodes.get(iNode);
			
			if (sourceNode.isInitialized && this.graphType==0){
				continue;
			}
			
			
			// sourceNodeAtt.isCollection
			if (sourceNode.isCollection){
								
				// collection source
				String collectionAttValue= this.getEdgeAttValue(sourceNode.getAttribute("items"));
				this.setCollectionEdges(
						collectionAttValue.split(","), 
						sourceNode.nodeID,
						sourceNode.nodeType);
				
			}
			else {
				
				// set and check the relation as [objectAttributeID==>objectID]
				this.setEdgeRelation(
						sourceNode.gAttribute, 
						sourceNode.nodeID,
						sourceNode.nodeType,
						sourceNode.isMinimal);
			}
					
		}
	
    }
    
    
    private void setEdgeRelation(
    		ArrayList<GAttribute> itrAtt, 
    		String sourceId, 
    		String sourceType, 
    		boolean isNodeMinimal){
    			
    	
    	for (int iAtt=0; iAtt<itrAtt.size(); iAtt++){
    	
			GAttribute sourceAtt = itrAtt.get(iAtt);
			
			if (sourceAtt.attIsObjectRelation){
				
				// target id
				String target_Id= this.getEdgeAttValue(sourceAtt);

				// check the existence of target object
				GNode targetNode=  this.getNode(target_Id);
				if (targetNode!=null && !(this.graphType==0 && targetNode.isInitialized)){
					
					String edgeType = sourceAtt.attName + ":" + sourceAtt.attType;
					boolean isEdgeMinimal = sourceAtt.attIsMinimal;
					
					this.addEdge(
							new GEdge (
									sourceId, 
									target_Id, 
									edgeType, 
									isEdgeMinimal,
									sourceType + "_" + targetNode.nodeType));					
				}				
			}			
		}
    	
    }
 
    
    
    private String getEdgeAttValue(GAttribute nodeAtt){
    	    	
    	if (this.graphType==0){
    		return nodeAtt.attValue;    		
    	}
    	else 
    	{
    		return nodeAtt.attLastUpdatedValue;
    		
    	}

    }
    
    
    
    private void setCollectionEdges(String[] targetCollections, String sourceId, String sourceType){

    	for (int iEdge=0; iEdge <targetCollections.length; iEdge++){
    		
    		// target id
			String Target_Id= targetCollections[iEdge];
			
			
			// check the existence of target object
			GNode targetNode = this.getNode(Target_Id);
			if (targetNode==null || (this.graphType==0 && targetNode.isInitialized)){
				continue;
			}
			
			
			String edgeType = iEdge + " :" + " index - " +  sourceType;
			
			this.addEdge(
					new GEdge (
							sourceId, 
							Target_Id, 
							edgeType, 
							false,
							sourceType + "_" + targetNode.nodeType));	
						
    	}
    	
    }

       

    

    
    
    public int getEdgeIndex (String edgeID){    	
    	if (this.edgesIndexs == null){
    		return -1;
    	} else {
    		return this.edgesIndexs.indexOf(edgeID);
    	}
    }
    
    
    public void addEdge(GEdge ge){

    	if (this.gEdges== null || this.edgesIndexs ==null){
    		this.gEdges = new ArrayList<GEdge>();
    		this.edgesIndexs = new ArrayList<String>();
    	}


    	this.edgesIndexs.add(ge.edgeID);
    	this.gEdges.add(ge);
    }
    
  
    
    
    
    /*
	protected void setDistanceOfPreGraphElements(){
		
    	// check if this is a pre-graph type
    	if (this.graphType!=0){
    		return;   		
    	}
    	
    	
    	// graph must be already saved in DB
    	// no need for loading ..
    	
    	// starting from 0 elements of the minimal rules (nodes/edges) ..	
		this.setNodeAndEdgeDistances(0);
	}
    
    
    

    private void setNodeAndEdgeDistances(int distance) {

        String sqlStatmentNodeEdgeLevels = "";
       
        // update Edge Table from Node Table 
        sqlStatmentNodeEdgeLevels = "update TblEdge set TblEdge.distance=" + (distance + 1);
        sqlStatmentNodeEdgeLevels += " where TblEdge.Graph_IDREFF=" + this.graphID;
        sqlStatmentNodeEdgeLevels += " and TblEdge.distance=-1 and (";
        sqlStatmentNodeEdgeLevels += " TblEdge.sourceID in (select nodeID as 'sourceID' from TblNode where TblNode.distance=" + distance + " and TblNode.Graph_IDREFF=" + this.graphID + ") ";
        sqlStatmentNodeEdgeLevels += " or ";
        sqlStatmentNodeEdgeLevels += " TblEdge.targetID in (select nodeID as 'targetID' from TblNode where TblNode.distance=" + distance + " and TblNode.Graph_IDREFF=" + this.graphID + ") ";
        sqlStatmentNodeEdgeLevels += ");";

        int countEdgeLevels = DBRecord.executeSqlStatement(sqlStatmentNodeEdgeLevels, true);
        
        if (countEdgeLevels<0){
        	return;
        }
        

        // update Node Table from Edge Table
        sqlStatmentNodeEdgeLevels = "update TblNode set TblNode.distance=" + (distance + 2);
        sqlStatmentNodeEdgeLevels += " where TblNode.Graph_IDREFF=" + this.graphID;
        sqlStatmentNodeEdgeLevels += " and TblNode.distance =-1 and (";
        sqlStatmentNodeEdgeLevels += " nodeID  in (select sourceID as 'nodeID' from TblEdge where TblEdge.distance=" + (distance + 1) + " and TblEdge.Graph_IDREFF=" + this.graphID + ")";
        sqlStatmentNodeEdgeLevels += " or ";
        sqlStatmentNodeEdgeLevels += " nodeID  in (select targetID as 'nodeID' from TblEdge where TblEdge.distance=" + (distance + 1) + " and TblEdge.Graph_IDREFF=" + this.graphID + ")";
        sqlStatmentNodeEdgeLevels += ");";

        int countNodeLevels = DBRecord.executeSqlStatement(sqlStatmentNodeEdgeLevels, true);
        
        if (countNodeLevels<0){
        	return;
        }

        if ((countNodeLevels + countEdgeLevels) > 0){
            this.setNodeAndEdgeDistances(distance + 2);
        }
    }
    
    */
    
    public void printGraph(){
    	this.printGraph(false);
    }
    
    
    
    
    protected void printGraph(boolean withoutAttribute){
    	
    	System.out.println("\n\nGraph : observation_ID=" + this.observation_ID + " 	Type : " + this.graphType);
    	
    	System.out.println("\n\t node =====================================");
    	
    	for (int i =0; i<this.gNodes.size(); i++){
    		GNode gn = this.gNodes.get(i);
    		System.out.print("\n\n\t nodeID: " + gn.nodeID);
    		System.out.print("\t nodeType: " + gn.nodeType);
    		System.out.print("\t isMinimal: " + gn.isMinimal);    		
    		System.out.print("\t isRequiredContext: " + gn.isRequiredContext);
    		System.out.print("\t isInitialized: " + gn.isInitialized);
    		System.out.print("\t isCollection: " + gn.isCollection);
    		
    		if (withoutAttribute){
    			continue;
    		}
    		
    		for (int j=0; j < gn.gAttribute.size(); j++){
    			GAttribute gAtt= gn.gAttribute.get(j);
    			System.out.print("\n\t\t\t Name[" + gAtt.attName + "]");
    			System.out.print("\t Type[" + gAtt.attType+ "]");    			
    			//System.out.print("\t isMin["  + gAtt.attIsMinimal+ "]");
    			//System.out.print("\t isRequired["  + gAtt.attIsRequiredContext+ "]");
    			//System.out.print("\t isRelation["  + gAtt.attIsObjectRelation+ "]");    			
    			//System.out.print("\t attValue["  + gAtt.attValue+ "]");
    			//System.out.print("\t attGeneralisedValue["  + gAtt.attGeneralisedValue+ "]");
    			//System.out.print("\t attHashValue["  + gAtt.attHashValue+ "]");
    			//System.out.print("\t attIsAssignedToParameter["  + gAtt.attIsAssignedToParameter+ "]");
    			//System.out.print("\t attLastUpdatedValue["  + gAtt.attLastUpdatedValue+ "]");
    		}
    	}
    	
    	if (this.gEdges !=null){
    		System.out.println("\n\t Edges =====================================");
    		for (int i=0; i < this.gEdges.size(); i++){
    			GEdge eg= this.gEdges.get(i);
    			System.out.print("\n\t\t\t EdgeID[" + eg.edgeID + "]");
    			System.out.print("\t sourceID[" + eg.sourceID+ "]");    			
    			System.out.print("\t targetID["  + eg.targetID+ "]");
    			System.out.print("\t edgeType["  + eg.edgeType+ "]");
    			System.out.print("\t isMinimal["  + eg.isMinimal+ "]"); 
    		}
    		
    	}
    	
    	
    	System.out.println("\n\n -------------------------------------------------");
    }
    
    
}
