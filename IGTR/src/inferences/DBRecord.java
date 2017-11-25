package inferences;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sun.rowset.CachedRowSetImpl;


public class DBRecord {

	
	private static Connection conn=null;
	private static Statement DBStatement=null;
	private static PreparedStatement pStatement=null;
	private static ResultSet queryResult=null;
	
		
    private static Connection getConnection() throws SQLException {

        String drivers = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/TraceOutput_DB?allowMultiQueries=true&useSSL=false";
        String username = "loly";
        String password = "541541";
        
        System.setProperty(drivers,"");
        return DriverManager.getConnection(url,username,password);
    }
	
   
	
    
    // open 'conn' object and initialising statements
    public static void openConnection(){
		
		try
		{
			conn = getConnection();
			DBStatement = conn.createStatement();
		}		
        catch(Exception ex)
        {
        	System.err.println("Connection Failure");
            ex.printStackTrace();
        }
		
	}
	
    
    
    // close connection for both conn and statements
    public static void closeConnection(){
		
		try {
			DBRecord.DBStatement.close();
			DBRecord.conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		DBRecord.conn=null;
		DBRecord.DBStatement=null;
		DBRecord.pStatement=null;
		
	}
	
    
    
	// recording a new observation
    public static int setNewObservation(String methodName){
		
		/* rule name is the main method name which is passed as par with 
		 	endStartSeparation (..)
		*/
		
		int Observation_ID=0;
		String sqlStatement="Insert into TblObservationOutput "
				+ "(MethodName) values ('" + methodName + "') ;";
			
		try {
			
			if (DBStatement.executeUpdate(sqlStatement)==1){
				
				sqlStatement="select max(Observation_ID) from TblObservationOutput;";
				queryResult= DBStatement.executeQuery(sqlStatement);
				
				if (queryResult.next()){
					Observation_ID =queryResult.getInt(1);
				}
				
			}
			else {
				Observation_ID=-1;				
			}
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
			Observation_ID=-2;
		}
		
		
		// generated id from database
		return Observation_ID;		
	}
    
    
   
	// end recording current observation 
    public static boolean endCurrentObservation (
    		int Observation_ID, 
    		String MethodSignature,
    		String RuleParameters,
    		String PartialPath){
		
		boolean isRecorded = false;
		
		try {
		
		// update observation just after execution !

			pStatement = conn.prepareStatement(
					"Update TblObservationOutput "
					+ "set "
					+ "MethodSignature=?, "					
					+ "RuleParameters=?, "
					+ "PartialPath=?, "
					+ "ExecutionTimeTo=CURRENT_TIMESTAMP(6) "
					+ "where Observation_ID=? ;");
			pStatement.clearParameters();
			pStatement.setString(1, MethodSignature);
			pStatement.setString(2, RuleParameters);
			pStatement.setString(3, PartialPath);
			pStatement.setInt(4, Observation_ID);
			
			isRecorded = (pStatement.executeUpdate()==1);
			
			
		} catch (SQLException e) 
		{			
			e.printStackTrace();
		}	
		
		
		// true if the recording is performed
		return isRecorded;
				
	}
	
	
	
    
    public static int removeObservation(String strObservationIDs){
    	
    	int iAffectedRecords=-1;
    	
		try {
			
			openConnection();
			if (strObservationIDs.length()==0){
				pStatement = conn.prepareStatement("delete from TraceOutput_DB.TblObservationOutput where Observation_ID>=0;");				
			}
			else {
				pStatement = conn.prepareStatement("delete from TraceOutput_DB.TblObservationOutput where Observation_ID in (" + strObservationIDs + ");");
			}
			
			//conn.prepareStatement("delete from TblRuleWithMultiObject where ruleID>=0;").execute();
		
		iAffectedRecords = pStatement.executeUpdate();
			
			
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			iAffectedRecords=-2;
		} finally 
		{
		closeConnection();
		}
    	
    	return iAffectedRecords;
    }
    

		
	
		
    // initial Saving Basic Rule
    public static boolean initialSavingBasicRule (
			int Observation_ID, 
			String ruleName,
			boolean isApplicable,
			int iTotalExecutedObjects,
			int iScopeObjectsCount,
			int objectsCount,
			int internalStateCount,
			boolean hasEffect,
			int parentRuleId,
			String MethodSignatureUniqueID){
	
		
		try {
		
			// add to basic rule table !
			String sqlStatement="Insert into TblBasicRule "
					+ "(Observation_IDREFF, "
					+ "RuleName,"
					+ "isApplicable,"
					+ "iTotalExecutedObject,"
					+ "iScopeObjectsCount,"					
					+ "objectsCount,"
					+ "internalStateCount,"
					+ "hasEffect,"
					+ "parentRuleId,"
					+ "MethodSignatureUniqueID) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ;";
			
			
			pStatement = conn.prepareStatement(sqlStatement);
			pStatement.clearParameters();
			pStatement.setInt(1, Observation_ID);
			pStatement.setString(2, ruleName);
			pStatement.setBoolean(3, isApplicable);
			pStatement.setInt(4, iTotalExecutedObjects);
			pStatement.setInt(5, iScopeObjectsCount);
			pStatement.setInt(6, objectsCount);
			pStatement.setInt(7, internalStateCount);
			pStatement.setBoolean(8, hasEffect);
			pStatement.setInt(9, parentRuleId);		//  public static final int INTEGER 	4
			pStatement.setString(10, MethodSignatureUniqueID);
			
			isApplicable = (pStatement.executeUpdate()==1);
						
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			System.err.println("initialSavingBasicRule: Observation_ID=" + Observation_ID);
			isApplicable=false;
		}	
		
		return isApplicable;
	}
	
	
	
	// methods to save graphs
    public static int saveGraphT (int Observation_ID, int graphType){
		
		/**
		 *	Graph types :
		 *	 0 - pre-graph
		 *	 1 - post-graph
		 */
		
		int generateGraphID=-1;
						
		try {
		
			// add to TblGraph !
			String sqlStatement="Insert into TblGraph (Observation_IDREFF, graphType) "
					+ "values (" + Observation_ID + ", " + graphType + ") ;";
							
			
			pStatement = conn.prepareStatement(sqlStatement);
			
			if (pStatement.executeUpdate()==1){
				
				sqlStatement="select max(GraphID) from TblGraph; ";
				queryResult= DBStatement.executeQuery(sqlStatement);
				
				if (queryResult.next()){
					generateGraphID =queryResult.getInt(1);
				}
			}
						
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			System.err.println("saveGraphT: Observation_ID=" + Observation_ID);
			generateGraphID=-2;
		}
		
		return generateGraphID;
	}
		
	
    public static boolean saveGraphNodes (int graphType, int iGraphID, GNode saveGNode){
		
		boolean isRecoreded= true;
		
		try {
			
			// add to TblNode !
			String sqlStatement="Insert into TblNode ("
					+ "Graph_IDREFF, "
					+ "nodeID, "
					+ "nodeType, "
					+ "isMinimal, "
					+ "isRequiredContext, "
					+ "isInitialized, "
					+ "isCollection,"
					+ "isThis,"
					+ "isReturn,"
					+ "isParameters,"
					+ "accessedInfo,"
					+ "iParameterIndex,"
					+ "isUnnecessaryContext,"
					+ "nodeCommonType) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
							
			
			
			pStatement = conn.prepareStatement(sqlStatement);
			pStatement.clearParameters();
			pStatement.setInt(1, iGraphID);
			pStatement.setString(2, saveGNode.nodeID);
			pStatement.setString(3, saveGNode.nodeType);
			pStatement.setBoolean(4, saveGNode.isMinimal);
			pStatement.setBoolean(5, saveGNode.isRequiredContext);
			pStatement.setBoolean(6, saveGNode.isInitialized);
			pStatement.setBoolean(7, saveGNode.isCollection);
			pStatement.setBoolean(8, saveGNode.isThis);
			pStatement.setBoolean(9, saveGNode.isReturn);
			pStatement.setBoolean(10, saveGNode.isParameters);
			pStatement.setString(11, saveGNode.strAccessedInfo);
			pStatement.setInt(12, saveGNode.iParameterIndex);
			pStatement.setBoolean(13, saveGNode.isUnnecessaryContext);
			pStatement.setString(14, saveGNode.nodeCommonType);
			
			if (pStatement.executeUpdate()==1){
				
				if (saveGNode.isCollection){
					
					/*
					GAttribute collectionItems = saveGNode.getAttribute("items");
					if (collectionItems!=null){
						
						collectionItems.attIsMinimal=false;
						saveGraphNodeAttributes(iGraphID, saveGNode.nodeID, collectionType);
						if (pStatement.executeUpdate()!=1){
							isRecoreded=false;						
						}
					}
					*/
					
					
					GAttribute collectionSize = saveGNode.getAttribute("size");	
					if (collectionSize!=null){
						
						collectionSize.attIsRequiredContext=true;
						saveGraphNodeAttributes(iGraphID, saveGNode.nodeID, collectionSize, graphType);					
						if (pStatement.executeUpdate()!=1){
							isRecoreded=false;
						}
					}

					
				}
				else {
					
					for (int iNodeAtt=0; iNodeAtt<saveGNode.gAttribute.size(); iNodeAtt++){
						
						saveGraphNodeAttributes(iGraphID, saveGNode.nodeID, saveGNode.gAttribute.get(iNodeAtt), graphType);					
						if (pStatement.executeUpdate()!=1){
							isRecoreded=false;
							break;
						}		
						
					}					
				}				
			}
			
			else {
				isRecoreded=false;				
			}
			
						
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			System.err.println("saveGraphNodes: graphid =" + iGraphID);
			isRecoreded=false;
		}
		
		
		return isRecoreded;
	}
	
	
    public static void saveGraphNodeAttributes (int iGraphID, String nodeID, GAttribute saveGAttribute, int graphType) throws SQLException{
				
		String sqlStatement="Insert into TblNodeAttributes "
				+ "(Graph_IDREFF, "
				+ "node_IDREFF, "
				+ "AttributeName, "
				+ "AttributeType, "
				+ "AttributeValue, "
				+ "isMinimal, "
				+ "isRequiredContext, "
				+ "isObjectRelation, "
				+ "generalisedValue, "
				+ "isAssignedToParameter) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ;";
						
		
		pStatement = conn.prepareStatement(sqlStatement);
		pStatement.clearParameters();
		pStatement.setInt(1, iGraphID);
		pStatement.setString(2, nodeID);
		pStatement.setString(3, saveGAttribute.attName);
		pStatement.setString(4, saveGAttribute.attType);
		
		if (graphType==0){
			pStatement.setString(5, saveGAttribute.attValue);
		}
		else {
			pStatement.setString(5, saveGAttribute.attLastUpdatedValue);
		}		
		pStatement.setBoolean(6, saveGAttribute.attIsMinimal);
		pStatement.setBoolean(7, saveGAttribute.attIsRequiredContext);
		pStatement.setBoolean(8, saveGAttribute.attIsObjectRelation);
		pStatement.setString(9, saveGAttribute.attGeneralisedValue);
		pStatement.setBoolean(10, saveGAttribute.attIsAssignedToParameter);
	}
	
	
    public static boolean saveGraphEdges (int iGraphID, GEdge saveGEdges){
		
		boolean isRecored= true;
		
		try {
			
			// add to TblEdge !
			String sqlStatement="Insert into TblEdge (Graph_IDREFF, edgeID, edgeType, sourceID, targetID, isMinimal, sourceTargetType) "
					+ "values (?, ?, ?, ?, ?, ?, ?) ;";
							
			
			pStatement = conn.prepareStatement(sqlStatement);
			pStatement.clearParameters();
			pStatement.setInt(1, iGraphID);
			pStatement.setString(2, saveGEdges.edgeID);
			pStatement.setString(3, saveGEdges.edgeType);
			pStatement.setString(4, saveGEdges.sourceID);
			pStatement.setString(5, saveGEdges.targetID);
			pStatement.setBoolean(6, saveGEdges.isMinimal);
			pStatement.setString(7, saveGEdges.sourceTargetType);
			
			
			
			if (pStatement.executeUpdate()!=1){
				isRecored=false;				
			}

						
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			System.err.println("saveGraphEdges: graphid =" + iGraphID + " saveGEdges.sourceID =" + saveGEdges.sourceID);
			isRecored=false;
		}
		
		
		return isRecored;
	}
	



	public static CachedRowSetImpl getByQueryStatement(String sqlString){

		CachedRowSetImpl crs=null;
		openConnection();
		
		try {
			DBStatement = conn.createStatement();
			DBStatement.execute(sqlString);
			
			crs = new CachedRowSetImpl();
			crs.populate(DBStatement.getResultSet());
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			closeConnection();
		}
				
		return crs;		
	}


	public static CachedRowSetImpl getByQueryStatement(String sqlString, boolean isConnected){

		
		if (!isConnected){
			return getByQueryStatement(sqlString);
		}
		
		
		CachedRowSetImpl crs=null;
		
		try {
			DBStatement = conn.createStatement();
			DBStatement.execute(sqlString);
			
			crs = new CachedRowSetImpl();
			crs.populate(DBStatement.getResultSet());
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
				
		return crs;		
	}




    public static int executeSqlStatement(String strSQLStatement){
    		
    	int iRecords=-1;
    	
		try {
			
			openConnection();
			
			iRecords = conn.prepareStatement(strSQLStatement).executeUpdate();
			
		} 
		
		catch (SQLException e) {	
			iRecords=-2;
			e.printStackTrace();			
		} 
		
		finally {
			closeConnection();
		}
    	
		
    	return iRecords;
    }


    public static int executeSqlStatement(String strSQLStatement, boolean isConnected){
    	
    	
		if (!isConnected){
			return executeSqlStatement(strSQLStatement);
		}
    	
		
    	int iRecords=-1;
    	
		try {
			
			iRecords = conn.prepareStatement(strSQLStatement).executeUpdate();
		} 
		
		catch (SQLException e) {
			iRecords=-2;
			e.printStackTrace();			
		} 
		
    	
    	return iRecords;
    }


    
    
    
    public static void executeAnySqlStatement(String strSQLStatement){

    	
		try {
			
			openConnection();

			conn.prepareStatement(strSQLStatement).execute();

		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();			
		} 
		
		finally {
			closeConnection();
		}
    	
		
    }


    public static void executeAnySqlStatement(String strSQLStatement, boolean isConnected){
    	
    	
		if (!isConnected){
			 executeAnySqlStatement(strSQLStatement);
		}
    	
		
    	
		try {
			
			conn.prepareStatement(strSQLStatement).execute();
		} 
		
		catch (SQLException e) {

			e.printStackTrace();			
		} 
		
    	
    }
    
    
    
    public static boolean updateLearnedRuleAttributes (
    		int Observation_ID, 
    		String strLearnedAttributes){

    	boolean isRecorded = false;

    	try {

    		openConnection();
    		// update rule attribute conditions learned by daikon

    		pStatement = conn.prepareStatement(
    				"Update TblObservationOutput "
    						+ "set "
    						+ "RuleAttributeConditions=? "
    						+ "where Observation_ID=? ;"); 			
    		pStatement.clearParameters();
    		pStatement.setString(1, strLearnedAttributes);
    		pStatement.setInt(2, Observation_ID);

    		isRecorded = (pStatement.executeUpdate()==1);

    	} 
    	
    	catch (SQLException e) 
    	{			
    		e.printStackTrace();
    	}	

    	finally {
    		closeConnection();
    	}


    	// true if the recording is performed
    	return isRecorded;
    }
    


    public static boolean updateLearnedRuleAttributes (
    		int Observation_ID, 
    		String strLearnedAttributes, 
    		boolean isConnected){


    	if (!isConnected){
    		return updateLearnedRuleAttributes(Observation_ID, strLearnedAttributes);
    	}


    	boolean isRecorded = false;

    	try {

    		// update rule attribute conditions learned by daikon

    		pStatement = conn.prepareStatement(
    				"Update TblObservationOutput "
    						+ "set "
    						+ "RuleAttributeConditions=? "
    						+ "where Observation_ID=? ;"); 			
    		pStatement.clearParameters();
    		pStatement.setString(1, strLearnedAttributes);
    		pStatement.setInt(2, Observation_ID);

    		isRecorded = (pStatement.executeUpdate()==1);


    	} 

    	catch (SQLException e) 
    	{			
    		e.printStackTrace();
    	}	

    	// true if the recording is performed
    	return isRecorded;
    }


    
    
    
    
    
    
    protected static boolean saveClassTypes (ClassType cType){
		
		boolean isSaved= true;
		
		try {
			
			String sqlStatement=""
					+ "Insert IGNORE into TblClassTypes (ClassName, isCollectionType)"
					+ " values (?, ?);";
							
			
			pStatement = conn.prepareStatement(sqlStatement);
			pStatement.clearParameters();
			pStatement.setString(1, cType.getClassName());
			pStatement.setBoolean(2, cType.isClassCollection());
			
						
			if (pStatement.executeUpdate()!=1){
				isSaved=false;				
			}

						
		} catch (SQLException e) 
		{			
			e.printStackTrace();
			isSaved=false;
		}
		
		
		return isSaved;
	}
    
    

    protected static boolean saveClassAssociations (ClassType cType){

    	try {

    		String sqlStatement=""
    				+ "Insert into TblInherentedClassTypes (ClassNameREFF, InherentedWith, isSuperType, allowGeneralisation)"
    				+ " values (?, ?, ?, ?);";


    		pStatement = conn.prepareStatement(sqlStatement);
    		pStatement.clearParameters();
    		pStatement.setString(1, cType.getClassName());

    		for (Map.Entry<ClassType, Boolean> refType : cType.getMapSuperAndSubClassTypes().entrySet()) {

    			pStatement.setString(2, refType.getKey().getClassName());
    			pStatement.setBoolean(3, refType.getValue());
    			pStatement.setBoolean(4, cType.isAllowedTypeToBeGeneralised(refType.getKey()));

    			if (pStatement.executeUpdate()!=1){
    				return false;				
    			}
    		}

    	} catch (SQLException e) 
    	{			
    		e.printStackTrace();
    		return false;
    	}


    	return true;
    } 

    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    // general methods
    public final static HashMap<String, Boolean> objectTypes= setObjectTypes();
    

    
    private static HashMap<String, Boolean> setObjectTypes(){
    	    	
    	HashMap<String, Boolean> oTypes = new HashMap<String, Boolean>();
    	
    	CachedRowSetImpl loadValidClassTypes= getByQueryStatement(
    			"select ClassName, isCollectionType from TblClassTypes; ");
    	
    	
		try {
			while (loadValidClassTypes.next()){					
				oTypes.put(
						loadValidClassTypes.getString(1), 
						loadValidClassTypes.getBoolean(2));		
			}
			
		} 
		catch (SQLException e) {		
			e.printStackTrace();
		}
    	
    	
    	return oTypes;
    }
    
    
    public static Set<Class<?>> getWrapperTypes() {  
    	
        Set<Class<?>> ret = new HashSet<Class<?>>();
        ret.add(Boolean.class);
        ret.add(Character.class);
        ret.add(Byte.class);
        ret.add(Short.class);
        ret.add(Integer.class);
        ret.add(Long.class);
        ret.add(Float.class);
        ret.add(Double.class);
        ret.add(Void.class);
        ret.add(String.class);
        ret.add(StringBuilder.class);
        ret.add(PrintStream.class);
 //       ret.add(testRentalService.class);
        ret.add(Random.class);
        return ret;
    }

    
    public static Set<String> getCollectionAffectedMethds() {  
    	
    	// all values must be added at lower cases
    	
        Set<String> collectionMethods = new HashSet<String>();
       
        
        /** Interface Collection<E> */
        collectionMethods.add("add");			// add(E e)
        collectionMethods.add("addall");		// addAll(Collection<? extends E> c)
        collectionMethods.add("clear");			// clear()
        collectionMethods.add("remove");		// remove(Object o)
        collectionMethods.add("removeall");		// removeAll(Collection<?> c)
        
        
        
        
        /** Interface List<E> 
         * 
         * add(E e)
         * add(int index, E element)
         * addAll(Collection<? extends E> c)
         * addAll(int index, Collection<? extends E> c)
         * clear()
         * remove(int index)
         * remove(Object o)
         * removeAll(Collection<?> c)
         * */
        collectionMethods.add("set");		// set(int index, E element)
        
        
        
        
        /** Class LinkedList<E> 
         * 
         * add(E e)
         * add(int index, E element)
         * addAll(Collection<? extends E> c)
         * addAll(int index, Collection<? extends E> c)
         * clear() 
         * remove()
         * remove(int index)
         * remove(Object o)
         * set(int index, E element)
         * */
        collectionMethods.add("addfirst");	 	//addFirst(E e)
        collectionMethods.add("addlast");	 	//addLast(E e)
        collectionMethods.add("offer");		 	//offer(E e) Adds the specified element as the tail (last element) of this list.
        collectionMethods.add("offerfirst"); 	//offerFirst(E e) Inserts the specified element at the front of this list.
        collectionMethods.add("offerlast");	 	//offerLast(E e) Inserts the specified element at the end of this list.
        collectionMethods.add("poll"); 		 	//poll() Retrieves and removes the head (first element) of this list.
        collectionMethods.add("pollfirst");	 	//pollFirst()
        collectionMethods.add("polllast");		//pollLast()
        collectionMethods.add("pop");			//pop()
        collectionMethods.add("push");			//push(E e)
        collectionMethods.add("removefirst");	//removeFirst()
        collectionMethods.add("removefirstoccurrence");	//removeFirstOccurrence(Object o)
        collectionMethods.add("removelast");	//removeLast()
        collectionMethods.add("removelastoccurrence");	//removeLastOccurrence(Object o)
        
        
        
        /** Class ArrayList<E> 
         * 
         * add(E e)
         * add(int index, E element)
         * addAll(Collection<? extends E> c)
         * addAll(int index, Collection<? extends E> c)
         * clear()
         * remove(int index)
         * remove(Object o)
         * removeAll(Collection<?> c) 
         * set(int index, E element) 
         * */           
        collectionMethods.add("removerange");	//removeRange(int fromIndex, int toIndex)
        
        
        
        
        /** Interface Map<K,V> 
         * 
         * clear()
         * remove(Object key)
         * */
        collectionMethods.add("put");	 //put(K key, V value)
        collectionMethods.add("putall"); //putAll(Map<? extends K,? extends V> m)
        
        
        
        
        
        /** Class LinkedHashMap<K,V> 
         * 
         * 	clear()
         * */
        collectionMethods.add("removeeldestentry"); // removeEldestEntry(Map.Entry<K,V> eldest)
        
        
        
        
        
        /** Class Vector<E> 
         * 
         * 	add(E e)
         *	add(int index, E element)
         *	addAll(Collection<? extends E> c)
         *	addAll(int index, Collection<? extends E> c) 
         *	clear()  
         *	remove(int index)
         *	remove(Object o)
         *	removeAll(Collection<?> c)
         *	removeRange(int fromIndex, int toIndex)
         *	set(int index, E element)
         * */
        collectionMethods.add("addelement");		//addElement(E obj)                
        collectionMethods.add("insertelementat");	//insertElementAt(E obj, int index)      
        collectionMethods.add("removeallelements");	//removeAllElements()
        collectionMethods.add("removeelement");		//removeElement(Object obj)
        collectionMethods.add("removeelementat");	//removeElementAt(int index)
        collectionMethods.add("ensurecapacity");		//ensureCapacity(int minCapacity)
        collectionMethods.add("setelementat");		//setElementAt(E obj, int index)
        collectionMethods.add("setsize");			//setSize(int newSize)	
        collectionMethods.add("trimtosize");		//trimToSize()
        
        
        
        
        
        /** Class Stack<E> 
         * 	pop()
         * 	push(E item)
         * 
         * Class Properties
         * */                
        collectionMethods.add("setproperty");	//setProperty(String key, String value)
        collectionMethods.add("save");			// save(OutputStream out, String comments)
        collectionMethods.add("store");	 		//store(OutputStream out, String comments)
        collectionMethods.add("storetoxml");	//storeToXML(OutputStream os, String comment)
        
        
        return collectionMethods;
    }
    
    
    
}
