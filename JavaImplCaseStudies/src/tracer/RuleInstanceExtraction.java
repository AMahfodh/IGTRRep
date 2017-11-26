package tracer;


import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.commons.codec.digest.DigestUtils;
import org.aspectj.lang.JoinPoint;

import com.sun.rowset.CachedRowSetImpl;

import inferences.DBRecord;
import inferences.GAttribute;
import inferences.GEdge;
import inferences.GNode;
import inferences.GraphT;



public class RuleInstanceExtraction {
	
	protected int methdoCallJoinPointHashCode=0; // to catch scope of methods at return
	protected int Observation_ID=-1;
	private int parentRuleId=-1;				// not implemented now
	protected boolean isApplicable=true;
	
	protected String strMethodName="";
	protected String strMethodSignature="";
	private String methodSignatureUniqueID="";
	
	protected ArrayList<String> ruleParameters= new ArrayList<String>();
	public String strExecuatedPath ="";
	private Logger GTlogger= Logger.getLogger("GTlog"); 
	
	private final Set<Class<?>> WRAPPER_TYPES = DBRecord.getWrapperTypes();
	private final Set<String> collectionAffectedMethds= DBRecord.getCollectionAffectedMethds();
	public String strSeparator = String.valueOf(((char)007));	
	private GraphT scopeGraph = null;
	protected JoinPoint currentJoinPoint=null;
		
	protected int iObjectsCount=0;
	private int iTotalExecutedObjects=0;
	private int iScopeObjectsCount=0;
	private int internalStateStep=0;
	private boolean hasEffect=false;
	protected String strReturnObjectId="";
	
	
	
	
	
	
	private int waitingForThreads=1000;
	private int iMinNumberOfThreads=3;
	
	
	
	
	
	
	
	
	
	//***************************
	// rule instance setup
	public RuleInstanceExtraction (String methodName){
		
		this.strMethodName=methodName;
		this.Observation_ID = DBRecord.setNewObservation(this.strMethodName);
		this.scopeGraph = new GraphT(this.Observation_ID, 0);
		this.methdoCallJoinPointHashCode=0;
		GTlogger.setUseParentHandlers(false);
	}
	
	
	protected void setRuleMethodSignature(String methodSignature){
	
		this.strMethodSignature = methodSignature.trim();
		this.methodSignatureUniqueID = DigestUtils.sha1Hex(this.strMethodSignature);
	}
	
	
    protected void closeLoggingCurrentObservation(){
    	
		DBRecord.endCurrentObservation(
				this.Observation_ID, 
				this.strMethodSignature, 				
				this.strGetRuleParameters(),
				this.strExecuatedPath);
    }
	
    
    
    
    
    
    
    
    
    
	// 1 Scope of objects and this should hold all objects with their initial values
	
	// 2 Accessed object and this should always be found in the scope as the last value would be always overwritten ..
	
	// 3 Analysis process to extract pre-and post graphs just after the execution
	
	
	
	
	// Scope extraction and initial (pre objects) values	
	/**
	 *	Defining the scope of all objects access
	 *
	 *	 1	- isObjectInScope ()
	 *	 2	- addCollectionObjectInScope ()
	 *	 3	- addNormalObjectInScope()
	 *	 4	- isReference ()
	 *	 5  - isRelevantType ()
	 */
	
	
	protected boolean isObjectInScope(Object getObject){
		
		// Calculate all executed objects
		this.iTotalExecutedObjects++;
		
		
		// check to avoid null
		if (getObject==null){
			return false;
		}		
		
		
		
		
		// Check object type:
		// (-1) Not defined
		// (-2) primitive 
		// (0) Normal Object
		// (1) Composition/collection Object 
			
		int iObjectType= this.iGetObjectType(getObject);
		
		
		
		if (iObjectType == 0){
			
			// Normal (and valid) class type
			this.addNormalObjectInScope(getObject);
			
			return true;			
		}
		
		
		else if (iObjectType==1 && (getObject instanceof Collection || getObject instanceof Object[])){
			
			// Collection (or array) object type
			this.addCollectionObjectInScope(getObject);
	
			
			return true;
		}
		
		
		else if (iObjectType!=-2){			
			this.GTlogger.info("Unknown type : " + getObject.getClass().getSimpleName());			
		}
		
		
		return false;
	}
	
	
	private void addCollectionObjectInScope(Object getObject){
		
		String objectIdentity =  String.valueOf(System.identityHashCode(getObject));
		
		if (this.scopeGraph.getNodeIndex(objectIdentity)==-1){			
			
			GNode newCollectionNode = new GNode(objectIdentity, getObject.getClass().getSimpleName());
			newCollectionNode.isCollection=true;
			
			//  Collection attributes
			int iSize = 0;			
			String items = "";  //  items value is a string value of all object identities

			
			if (getObject instanceof Collection){
				
				Collection<?> collectionObject = (Collection<?>) getObject;				
				iSize=collectionObject.size();
				
				for(Iterator<?> iter = collectionObject.iterator(); iter.hasNext(); ) {
					items +="," + System.identityHashCode(iter.next());
				}
			}
			else {
				
				Object[] objectArray = (Object[]) getObject;	
				iSize = objectArray.length;
				
				for (Object getItem: objectArray){
					items +="," + System.identityHashCode(getItem);
				}
			}
			
			if (items.length()>0){
				items=items.substring(1);
			}
			
			newCollectionNode.addAttribute(new GAttribute("items", "String", items));
			newCollectionNode.addAttribute(new GAttribute("size", "String", ""+iSize));
			
			// set to be read
			newCollectionNode.strAccessedInfo +="r" + this.getCurrentAccessedInfo();
			this.strExecuatedPath +="/readNode(" + objectIdentity + ")";				
			
			this.scopeGraph.addNode(newCollectionNode);
		}
	}
		
		
	private void addNormalObjectInScope(Object getObject){
		
		String objectIdentity =  String.valueOf(System.identityHashCode(getObject));
		
		GNode normalObject = this.scopeGraph.getNode(objectIdentity);
		
		if (normalObject!=null){
			return;
		}
		
		// add new normal object
			
		normalObject = new GNode(objectIdentity, getObject.getClass().getSimpleName());
		normalObject.isCollection=false;
			
		
		// set to be read but not required contexts
		normalObject.strAccessedInfo +="r" + this.getCurrentAccessedInfo();
		this.strExecuatedPath +="/readNode(" + objectIdentity + ")";	
			
		
		//get field names with their initial values
		Field[] fields = getObject.getClass().getDeclaredFields();
			
		String fieldName="";
		Object objectfield=null;
			
		for (Field field : fields) {
							
				
			// continue if this field is not part of our scope, i.e. JoinPoint$StaticPart that would provide information (line number/etc)
			fieldName = field.getName();
							
			if (fieldName.startsWith("ajc$tjp")){
				continue;
			}
				
								
				
			// set the right permission
			field.setAccessible(true);
			try {		
				objectfield = field.get(getObject);
			} catch (IllegalArgumentException e) {				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
				

			String objectFieldValue ="";

			// check if the object is a reference type
			boolean isReferenceAttribute= this.isValidRefType(field.getType().getSimpleName());
			
			if (isReferenceAttribute && objectfield!=null){
				objectFieldValue=String.valueOf(System.identityHashCode(objectfield));
			}
			else if (objectfield!=null){
				objectFieldValue = String.valueOf(objectfield);
			}
					
					
					
			normalObject.addAttribute(
					fieldName,
					field.getType().getSimpleName(), 
					objectFieldValue, 
					String.valueOf(System.identityHashCode(objectfield)),
					false, false, isReferenceAttribute);
					
			}
			
			this.scopeGraph.addNode(normalObject);
		
	}
	
	
	private boolean isValidRefType (String attributeType){
		
		// check if this type is reference (normal/collection type) based on the class diagram	
		return (DBRecord.objectTypes.get(attributeType)!=null);
	}
	
	
	private int iGetObjectType(Object checkObjet) {
		
		if (WRAPPER_TYPES.contains(checkObjet.getClass())){
			return -2;
		}
		
		
		
		Boolean iObjectType = DBRecord.objectTypes.get(checkObjet.getClass().getSimpleName());
		
		if (iObjectType==null){
			return -1;		
		}
		else {
			
			if (iObjectType.booleanValue()){
				return 1;
			}
			else {
				return 0;
			}
		}
		
    }
	
	

    
    
    
    
    
    
    
    
    
    
    
	// access extraction and effect (last updated values) 	
	/**
	 *	 1	- setInitiallingObject ()
	 *	 2	- setReadAccessFromField ()
	 *	 3	- setReadAccess()
	 *	 4	- setWriteAccessFromField ()
	 *	 5  - setReadWriteAccessFromCall()
	 *	 6  - getAccessLocation()
	 *	 7  - setAttributeParIndex()
	 */
    
    protected void setInitiallingObject(Object getObject){
    	
		String objectIdentity =  String.valueOf(System.identityHashCode(getObject));
		
		GNode initializingObject = this.scopeGraph.getNode(objectIdentity);
		
		if (initializingObject!=null){
			initializingObject.isInitialized=true;
			initializingObject.isMinimal=true;
			initializingObject.isRequiredContext=true;
			initializingObject.strAccessedInfo +="i" + this.getCurrentAccessedInfo();
			this.strExecuatedPath +="/createNode(" + objectIdentity + ")";
		}
		else {
			this.GTlogger.info("Warning can't find ini object in the scope : " 
					+ getObject.getClass().getSimpleName() 
					+ "  idintinty=" + System.identityHashCode(getObject));
		}
    	
    }
    
    
    
    protected void setReadAccessFromField(Object thisObject, Object returnObject, String fieldName){
    	
    	
    	// set read to this object
    	GNode readAccessObject = this.setReadAccess(thisObject);
    	boolean isRelation = false;
    	
    	
		if (readAccessObject !=null){
			
			// set attribute to required contexts
			GAttribute attReadAccess = readAccessObject.getAttribute(fieldName);
			if (attReadAccess!=null){
				
				attReadAccess.attIsRequiredContext=true;
				isRelation =attReadAccess.attIsObjectRelation;
				
				
	    		// set attribute parameter index if list passed parameters 
	    		this.setAttributeParIndex(attReadAccess, false, readAccessObject);
				
				
				
				// set path
				this.strExecuatedPath +="/readAttribute("+ fieldName +")";
				readAccessObject.strAccessedInfo +="r (" + fieldName + ")" +  this.getCurrentAccessedInfo();
			}
			
			else if (returnObject!=null){
				
				// **********************************************************************************
				// add missing accessed attribute as it wasn't been found by navigating object fields 
				// **********************************************************************************				
				

				// check if the objectFieldValue is a reference type
				String attributeSimpleName= returnObject.getClass().getSimpleName();
				boolean isReferenceAttribute= this.isValidRefType(attributeSimpleName);
				
				
				// set field identity 
				String objectFieldIdentity =String.valueOf(System.identityHashCode(returnObject));
				
				
				// set field value
				String objectFieldValue ="";
				if (isReferenceAttribute){
					objectFieldValue=objectFieldIdentity;
				}
				else{
					objectFieldValue = String.valueOf(returnObject);
				}
					
				
										
				readAccessObject.addAttribute(
						fieldName,
						attributeSimpleName, 
						objectFieldValue, 
						objectFieldIdentity,
						false, true, isReferenceAttribute);
				
				
				// set path
				this.strExecuatedPath +="/readAttribute("+ fieldName +")";
				readAccessObject.strAccessedInfo +="r (" + fieldName + ")" +  this.getCurrentAccessedInfo();
				
				
				
				this.GTlogger.info("ReadAccess Attribute in the scope being added by access " 
						+ thisObject.getClass().getSimpleName() 
						+ "  Attribute name =" + fieldName
						+ "  idintinty=" + System.identityHashCode(thisObject));
				
				
			}
			else {
				
				this.GTlogger.info("High warning can't find ReadAccess Attribute in the scope and its value is null: " 
						+ thisObject.getClass().getSimpleName() 
						+ "  Attribute name =" + fieldName
						+ "  idintinty=" + System.identityHashCode(thisObject));	
			}
			
			
		}
    	
    	
    	// check if the return is object/collection, if so set it to be required context
    	if (returnObject!=null && isRelation){
    		readAccessObject =this.setReadAccess(returnObject);    		
    	}
    	
    }
    
    
    
    private GNode setReadAccess(Object getObject){
    	
    	if (getObject==null){
    		return null;
    	}
    	
    	
		String objectIdentity =  String.valueOf(System.identityHashCode(getObject));
		
		GNode readAccessObject = this.scopeGraph.getNode(objectIdentity);
		
		if (readAccessObject!=null){
			
			readAccessObject.isRequiredContext=true;
			readAccessObject.strAccessedInfo +="r" + this.getCurrentAccessedInfo();
			this.strExecuatedPath +="/readNode(" + objectIdentity + ")";
			
			
			
			return readAccessObject;
		}
		else {
			
			this.GTlogger.info("Warning can't find ReadAccess object in the scope : " 
					+ getObject.getClass().getSimpleName() 
					+ "  idintinty=" + System.identityHashCode(getObject));			
			
			return null;
		}
    }
           
    
    
    protected void setWriteAccessFromField(Object targetObject, String fieldName, Object fieldValue){
    	
    	if (targetObject == null){
    		this.GTlogger.info("Warning Unexpected behaviour from AspectJ in write field access ! : target object mustn't be null. Field name: " + fieldName);
    		return;
    	}
    	
    	
    	String objectIdentity =  String.valueOf(System.identityHashCode(targetObject));
    	
    	// check if (object, field) exist in the scope    	
    	GNode objectNode = this.scopeGraph.getNode(objectIdentity);
    	
    	if (objectNode==null){
    		this.GTlogger.info("Warning Unexpected behaviour in write field access ! : object not being found in the scope: id " + objectIdentity + " , field name:"+ fieldName);
    		return;
    	}
    	
    	
		GAttribute attWriteAccess = objectNode.getAttribute(fieldName);
		if (attWriteAccess==null){
			this.GTlogger.info("Warning Unexpected behaviour in write field access ! : Field not being found in the object: id " + objectIdentity + " , field name:"+ fieldName);
    		return;
		}
    	
		
		
		// set object to be minimal in the scope!
		objectNode.isMinimal=true;
		objectNode.isRequiredContext=true;
		objectNode.strAccessedInfo +="w (" + attWriteAccess.attName + ")" + this.getCurrentAccessedInfo();
		
		
		// Belong attribute to be minimal and being updated with last assign value
		attWriteAccess.attIsMinimal=true;
		attWriteAccess.attIsRequiredContext=true;
		attWriteAccess.attHashValue= String.valueOf(System.identityHashCode(fieldValue));
		
		
		// set attribute parameter index if exist in scope
		this.setAttributeParIndex(attWriteAccess, false, objectNode);
		
				
		// overwrite the last effect in the specific attribute [attLastUpdatedValue]
		String strLastUpdatedValue =null;
		if (fieldValue==null){
			strLastUpdatedValue="";
		}
		else if (attWriteAccess.attIsObjectRelation){
			
			strLastUpdatedValue=String.valueOf(System.identityHashCode(fieldValue));
			
			// set target object of this relation to be minimal and required as well
			GNode targetObjectNode = this.scopeGraph.getNode(strLastUpdatedValue);
			if (targetObjectNode!=null){
				targetObjectNode.isMinimal=true;
				targetObjectNode.isRequiredContext=true;
			}
			else {
				this.GTlogger.info("Warning Unexpected behaviour in write field access ! : target object for edge not being found in the object: id " + strLastUpdatedValue + " , field name:"+ fieldName);
			}
			
		}
		else {
			strLastUpdatedValue = String.valueOf(fieldValue);
		}
		
		
		
		// overwrite the last update value
		attWriteAccess.attLastUpdatedValue=strLastUpdatedValue;
		

		// set object executed path
		this.strExecuatedPath +="/writeNode(" + objectIdentity + "." + fieldName + ")";
		
    	
    }
    
    
    protected void setReadWriteAccessFromCall(Object targetObject, String collectionMethodName, Object returnObject){
    	   	
    	// check if collection exists in the scope    	
    	String objectIdentity =  String.valueOf(System.identityHashCode(targetObject));    	
    	GNode objectNode = this.scopeGraph.getNode(objectIdentity);
    	
    	
    	if (objectNode==null){
    		this.GTlogger.info("Warning Unexpected behaviour in read/write access by call for collection objects ! : scope: id " + objectIdentity + " ,  method name :"+ collectionMethodName);
    		return;
    	}

    	
    	
    	// set to be required context in the scope
    	objectNode.isRequiredContext=true;
    	
    	
    	
    	// Decision if the access is read or write based on return and invoked methods
    	// check if it's write access    	

    	if (this.collectionAffectedMethds.contains(collectionMethodName.toLowerCase()) &&
    			!"false null -1".contains(String.valueOf(returnObject).toLowerCase())){

    		// set to be minimal in the scope
    		objectNode.isMinimal=true;



    		// Collection attributes: size and value 
    		int iSize = 0;			
    		String items = "";  //  items value is a string value of all object identities

    		// get size
    		Collection<?> collectionObject = (Collection<?>) targetObject;				
    		iSize=collectionObject.size();

    		// get items
    		for(Iterator<?> iter = collectionObject.iterator(); iter.hasNext(); ) {
    			items +="," + System.identityHashCode(iter.next());
    		}

    		if (items.length()>0){
    			items=items.substring(1);
    		}


    		GAttribute attItems=null, attSize=null;

    		if (objectNode.gAttribute.size()<1){				

    			attItems = new GAttribute("items", "String", items);
    			attSize = new GAttribute("size", "String", ""+iSize);

    			objectNode.addAttribute(attItems);
    			objectNode.addAttribute(attSize);
    		}
    		else {

    			attItems = objectNode.getAttribute("items"); 
    			attSize = objectNode.getAttribute("size"); 
    		}

    		attItems.attLastUpdatedValue=items;
    		attSize.attLastUpdatedValue= ""+iSize;

    		
    		
    		this.strExecuatedPath +="/writeNode(" + objectIdentity + ")";
    		objectNode.strAccessedInfo +="w (" + collectionMethodName + ")" + this.getCurrentAccessedInfo();
    	}
    	
    	else {
    		this.strExecuatedPath +="/readNode(" + objectIdentity + ")";
    		objectNode.strAccessedInfo +="r (" + collectionMethodName + ")" + this.getCurrentAccessedInfo();
    	}
    	
    	
    	
    	
    }
    
    
    
    private String getCurrentAccessedInfo(){
    	
    	// Structure is : [ini/read/write access], [internal step 15], [code line 70]
    	String accessInfo="," + (++this.internalStateStep);
    	
    	if (this.currentJoinPoint==null){
    		accessInfo+= ",0";
    	}
    	else {
    		accessInfo+= ", " + this.currentJoinPoint.getSourceLocation().getFileName() + " - line " + this.currentJoinPoint.getSourceLocation().getLine();
    	}         	
    	
    	return accessInfo + "/";
    }
    
    
    private void setAttributeParIndex(GAttribute attParIndex, boolean isPre, GNode nodePar){
    	
    	
    	if (attParIndex.attIsObjectRelation){
    		return;
    	}
    	
    	
    	if (!isPre && attParIndex.attIsAssignedToParameter){
    		return;
    	}
    	
    	
    	// starting from 1 as (0) refers to thisObjectId
    	for (int iPar=1; iPar<this.ruleParameters.size(); iPar++){
    		
    		String getPar=this.ruleParameters.get(iPar);
    		
    		if (getPar.startsWith(attParIndex.attHashValue)){
    			    			
    			attParIndex.attIsAssignedToParameter=true;
    			attParIndex.attGeneralisedValue="par" + iPar;
    			
    			nodePar.isParameters=true;
    			
    			return;
    		}
    		
    	}
    	
    	 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	/**
	 *	Analysis process to extract pre-and post graphs just after the execution
	 *
	 *	1 - generateRuleInstance ()
	 *  2 - scopeReductionAndAdjustment()	 
	 *  3 - strGetThisObjectId()
	 *  4 - strGetRuleParameters()
	 *  5 - isParameterInThisNode()
	 *  6 - adjustEdgeMinimal ()
	 *  7 - updateMinimalNodeFromEdgeMinimal ()
	 *  8 - setDifferenceNumericAttributeInRule()
	 *  9 - isIntegerParseInt ()
	 */

  
    
    protected void generateRuleInstance(){

    	
    	/* 
    	 * - Reduce scope by removing irrelevant object and attributes (not accessed)
    	 * - compute statistical info
    	 * - set [this object] , passed parameters and return object 
    	 */    	 
    	this.scopeReductionAndAdjustment();
    	


    	
    	
    	// save rule meta
    	if (!DBRecord.initialSavingBasicRule(
    			this.Observation_ID, 
				this.strMethodName,
				this.isApplicable,
				this.iTotalExecutedObjects,
				this.iScopeObjectsCount,
				this.iObjectsCount,
				this.internalStateStep,
				this.hasEffect,
				this.parentRuleId,
				this.methodSignatureUniqueID)){
    		this.GTlogger.info("Error in SQL - can't save (initialSavingBasicRule) ");
    		return;
    	}
    	

    	
    	
    	// generate L graph
    	GraphT gLHS = new GraphT(this.Observation_ID, 0);
    	gLHS.gNodes= this.scopeGraph.gNodes;
    	gLHS.nodesIndexs= this.scopeGraph.nodesIndexs;
    	
    	
    	
    	// generate R graph    	
    	GraphT gRHS = new GraphT(this.Observation_ID, 1);
    	gRHS.gNodes= this.scopeGraph.gNodes;
    	gRHS.nodesIndexs= this.scopeGraph.nodesIndexs;
   
    	    	
    	
    	// save nodes for both graphs    	
    	if (!gLHS.saveNodes() || !gRHS.saveNodes()){
    		this.GTlogger.info("Error- SQL- can't saveNodes: preGraph ");
    	}
    	
    	    	    
    	
    	// generate edges for both graphs
    	gLHS.generateEdges();
    	gRHS.generateEdges();
    	
    	
    
    	// save edges in both graphs
    	this.adjustEdgeMinimal(gLHS, gRHS);
    	if (!gLHS.saveEdges() || !gRHS.saveEdges()){
    		this.GTlogger.info("Error - SQL - can't saveEdges: pre/postGraphs");
    	}
    	
    	
    	
    	
    	// update minimal node defined by minimal edges
    	this.updateMinimalNodeFromEdgeMinimal(gLHS.graphID, gRHS.graphID);
    	
    	
    	
    	
		// generate numeric attribute by computing the difference values
		this.setDifferenceNumericAttributeInRule(gLHS.graphID, gRHS.graphID);
		
		
		
		
		// Validate extracted rule
		if (this.scopeGraph.gNodes.size()!=this.iObjectsCount){
			this.GTlogger.info("Testing extracted rule failed! some objects were executed in different threads ");
			System.out.println("Testing extracted rule failed! some objects were executed in different threads ");			
			DBRecord.executeSqlStatement("delete from TraceOutput_DB.TblObservationOutput where Observation_ID =" + this.Observation_ID, true);
		}
    }
    
    

    
    private void scopeReductionAndAdjustment(){
    	
    	    	
    	/*
    	while (java.lang.Thread.activeCount()>this.iMinNumberOfThreads 
    		  && --this.waitingForThreads>237){
    		try {
				Thread.currentThread().sleep(33);
			} catch (InterruptedException e) {				
				this.GTlogger.info(e.getStackTrace().toString());
			}
    		System.out.println(this.waitingForThreads + "- some threads still active");
    	}*/

    
    	
    	
    	
    	
    	/* calculate statistical info with reduction and adjustments: 
    	 * 	1 - objects in scope
    	 *  2 - objects in the rule
    	 *  3 - number of internal states 
    	 *  4 - hasEffect value    	
    	 */
    	
    	
    	
    	this.iScopeObjectsCount=this.scopeGraph.gNodes.size();
    	this.hasEffect=false;
    	

    	    	
    	// get this object id to be marked in the rule (isThis=true)
    	String strGetThisObjectId = this.strGetThisObjectId();
    	


    	
    	
    	// main loop over scope graph
		for (int iNode = this.scopeGraph.gNodes.size()-1 ; iNode >=0; iNode--){    			
			
			GNode checkNode = this.scopeGraph.gNodes.get(iNode);
			
			
			// [1] delete not accessed objects(nodes)
			if (!checkNode.isRequiredContext){				
				this.scopeGraph.removeNode(iNode);
				continue;
			}
			
			
			
			
			
			// [2] effect 
			if (checkNode.isMinimal){				
				this.hasEffect=true;
			}
			
			
			
			// [3] delete irrelevant attributes			
			if (!checkNode.isCollection){				

				for (int iAtt = checkNode.gAttribute.size()-1 ; iAtt >=0; iAtt--){   

					GAttribute checkAttribute = checkNode.gAttribute.get(iAtt);				
					if (!checkAttribute.attIsRequiredContext){
						checkNode.removeAttribute(iAtt);					
					}

				}
			}
			
			
			
			// [4] set if this node is [this object] 
			if (checkNode.nodeID.equals(strGetThisObjectId)){
				checkNode.isThis=true;
			}
			
			
			
			// [5] set if this node is this return object i.e, return from method
			if (checkNode.nodeID.equals(this.strReturnObjectId)){
				checkNode.isReturn=true;
				checkNode.isParameters=true;
			}
			
			
			
			// [6] set if this node has a return parameter in the rule
			this.isReturnRuleParameterOrParIndexInThisNode(checkNode);
	
		} 

		   
		
		// [7] for statistical info, this is required object 
		this.iObjectsCount=this.scopeGraph.gNodes.size();
    }
    
    
    
    private String strGetThisObjectId(){
    	
    	if (this.ruleParameters.size()<1){
    		return "";
    	}
    	
    	String thisObjectId = this.ruleParameters.get(0);
    	
    	if (!thisObjectId.startsWith("thisOid,") || thisObjectId.length()<8){
    		return "";
    	}
    	
    	
    	return thisObjectId.substring(8);
    }
    
    
    
    private String strGetRuleParameters(){
    	
    	String strParameters="";

    	// starting from 1 as (0) refers to thisObjectId
    	for (int iPar=1; iPar<this.ruleParameters.size(); iPar++){
    		
    		String[] getPar=this.ruleParameters.get(iPar).split("\\" + this.strSeparator);
    		
    		strParameters +=getPar[1] + " " + getPar[2] + " = " + getPar[3];    		
    		
    		if (iPar<this.ruleParameters.size()-1){
    			strParameters+=this.strSeparator + " ";
    		}
    		
    		
    		// updated item to contain only parameter hash id 
    		if (getPar[0].trim().length()>0){
    			this.ruleParameters.set(iPar, getPar[0]);
    		}
    		
    	}
    	
    	return strParameters;
    }
    
        
    
    private void isReturnRuleParameterOrParIndexInThisNode(GNode getNode){
    	

    	// find out parameter index
    	if (!getNode.isReturn && !getNode.isThis && getNode.iParameterIndex==-1){
    		
	    	for (int iPar=1; iPar<this.ruleParameters.size(); iPar++){	    		
	    		
	    		String getPar=this.ruleParameters.get(iPar);			    		
	    		if (getPar.equals(getNode.nodeID)){	    			
	    			getNode.isParameters=true;
	    			getNode.iParameterIndex=iPar;		    			
	    			break;
	    		}			    		
	    	}
    	}
    	
    	
    	
    	if (!getNode.isParameters){
    		getNode.isParameters=(ruleParameters.indexOf(getNode.nodeID)!=-1);
    	}
    	
    	
    	
    	if (this.strReturnObjectId.length()==0){
    		return;
    	}
    	
    	
    	
		for (int iAtt = 0;  iAtt <getNode.gAttribute.size(); iAtt++){   
			
			GAttribute checkGAttribute = getNode.gAttribute.get(iAtt);
			
			
			// check the return rule if exist in any of the current attributes
			if (checkGAttribute.attHashValue.equals(this.strReturnObjectId)){
				checkGAttribute.attIsAssignedToParameter=true;
				checkGAttribute.attGeneralisedValue="rePar";
				getNode.isParameters=true;
			}
			
			
			// duplicated but to be sure 
			if (!getNode.isParameters){
				if (checkGAttribute.attIsAssignedToParameter || 
					this.ruleParameters.indexOf(checkGAttribute.attHashValue)!=-1){
					getNode.isParameters=true;			
				}				
			}
			
		}
    	
    	
    }
    
    
	
	private void adjustEdgeMinimal (GraphT preGraph, GraphT postGraph){
		
		// set edge in the pre-graph 
		for (int iEdge=0; iEdge<preGraph.gEdges.size(); iEdge++){
					
			GEdge checkPreMinimalEdge = preGraph.gEdges.get(iEdge);
			
			if (checkPreMinimalEdge.isMinimal){				
				continue;
			}
			
			// check if this edge not exist in the post graph
			if (postGraph.getEdgeIndex(checkPreMinimalEdge.edgeID)==-1){
				checkPreMinimalEdge.isMinimal=true;
			}
		}
		
		
		
		// set edge in the post-graph 
		for (int iEdge=0; iEdge<postGraph.gEdges.size(); iEdge++){
					
			GEdge checkPostMinimalEdge = postGraph.gEdges.get(iEdge);
			
			if (checkPostMinimalEdge.isMinimal){
				continue;
			}
			
			// check if this edge not exist in the post graph
			if (preGraph.getEdgeIndex(checkPostMinimalEdge.edgeID)==-1){
				checkPostMinimalEdge.isMinimal=true;
			}
		}
		
		
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
	
		
	private void setDifferenceNumericAttributeInRule(int iPreGraphID, int iPostGraphID){
		
		CachedRowSetImpl crsGetNumbericAttributes= DBRecord.getByQueryStatement(
				 "select "
				 + "preAtt.node_IDREFF, "
				 + "preAtt.AttributeName, "
				 + "cast((postAtt.AttributeValue-preAtt.AttributeValue) as char) "
				 
				 + "from TblNodeAttributes preAtt inner join TblNodeAttributes postAtt "
				 + "on  preAtt.node_IDREFF=postAtt.node_IDREFF "
				 + "and preAtt.AttributeName=postAtt.AttributeName "				 
				 + "and preAtt.isObjectRelation=postAtt.isObjectRelation "
				 + "and preAtt.isAssignedToParameter=postAtt.isAssignedToParameter "				 
				 
				 + "where preAtt.Graph_IDREFF=" + iPreGraphID
				 + " and postAtt.Graph_IDREFF=" + iPostGraphID
				 + " and preAtt.isObjectRelation=false"
				 + " and preAtt.isAssignedToParameter=false"
				 + " and (preAtt.generalisedValue is null or preAtt.generalisedValue='')"
				 + " and (postAtt.generalisedValue is null or postAtt.generalisedValue='')"				 
				 + " and IsNumeric(preAtt.AttributeValue)"
				 + " and IsNumeric(postAtt.AttributeValue);", true);				
		try {
			
			while (crsGetNumbericAttributes.next()){
				
				String iDifference = crsGetNumbericAttributes.getString(3).trim();
				
				if (this.isIntegerParseInt(iDifference)){
					
					if (iDifference.equals("0")){
						
						DBRecord.executeSqlStatement(
								"Update TblNodeAttributes set generalisedValue='n' "
								+ "where "
								+ "(Graph_IDREFF=" + iPreGraphID
								+ " or Graph_IDREFF=" + iPostGraphID
								+ ") "
								+ " and node_IDREFF='" + crsGetNumbericAttributes.getString(1) + "'"
								+ " and AttributeName='" + crsGetNumbericAttributes.getString(2) + "'"
								, true);
						
					}
					else if (iDifference.startsWith("-")){
						
						DBRecord.executeSqlStatement(
								"Update TblNodeAttributes set generalisedValue='n' "
								+ "where "
								+ " Graph_IDREFF=" + iPreGraphID
								+ " and node_IDREFF='" + crsGetNumbericAttributes.getString(1) + "'"
								+ " and AttributeName='" + crsGetNumbericAttributes.getString(2) + "'; "
								
								+ " Update TblNodeAttributes set generalisedValue='n" + iDifference + "' "
								+ "where "
								+ " Graph_IDREFF=" + iPostGraphID
								+ " and node_IDREFF='" + crsGetNumbericAttributes.getString(1) + "'"
								+ " and AttributeName='" + crsGetNumbericAttributes.getString(2) + "'; "
								, true);				
					}
					else {
						
						DBRecord.executeSqlStatement(
								"Update TblNodeAttributes set generalisedValue='n' "
								+ "where "
								+ " Graph_IDREFF=" + iPreGraphID
								+ " and node_IDREFF='" + crsGetNumbericAttributes.getString(1) + "'"
								+ " and AttributeName='" + crsGetNumbericAttributes.getString(2) + "'; "
								
								+ " Update TblNodeAttributes set generalisedValue='n+" + iDifference + "' "
								+ "where "
								+ " Graph_IDREFF=" + iPostGraphID
								+ " and node_IDREFF='" + crsGetNumbericAttributes.getString(1) + "'"
								+ " and AttributeName='" + crsGetNumbericAttributes.getString(2) + "'; "
								, true);
						
					}
				
				}
				
			}
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
	}
		
	
    private boolean isIntegerParseInt(String str) {
       
    	try {
            Integer.parseInt(str);
            return true;
        }
        
        catch (NumberFormatException nfe) {}
        return false;
    }
	
	
	
}
