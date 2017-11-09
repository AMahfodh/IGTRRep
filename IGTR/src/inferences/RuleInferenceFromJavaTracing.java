package inferences;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.rowset.CachedRowSetImpl;

public class RuleInferenceFromJavaTracing {

	//Logger GTlogger = Logger.getLogger("GTlog"); 

	private String ruleMethodSignatureUniqueID=null;
	private int iLHS=-1, iObservationId=-1;

	private long minTime=System.nanoTime(), maxTime=0, MO=0;


	public RuleInferenceFromJavaTracing(){
		//GTlogger.setLevel(Level.OFF);
	}



	public void generaliseRuleInstance(int iRepeatedMultiObjects){


		// open connection
		DBRecord.openConnection();




		// classifying all rule instances based on minimal rule
		// preparing rule graphs for generalisation --[[ abstract ids , sub-graph ids, distance ]]--	
		System.out.println("Preparing and classifying rule's instances for generalisation process ..");
		//this.GTlogger.info("Preparing and classifying rule's instances for generalisation process ..");
		this.prepareAndSetRuleClassification();

		
		
		


		//define abstract for query rule based on their smallest distinct structure size .. 
		this.ruleMethodSignatureUniqueID="";
		System.out.println("Generalising query rules ..");
		//this.GTlogger.info("Generalising query rules ..");
		this.queryRuleGeneralisation();

		

		//System.out.println("\t ===> current-Time after classification computing max-rule:" + System.nanoTime());		
		//minTime = System.nanoTime()-minTime;		
		//MO=System.nanoTime();


		
		


		// infer multi-objects
		System.out.println("Inferring rules with multi-objects ..");
		//this.GTlogger.info("Inferring rules with multi-objects ..");
		this.ruleMethodSignatureUniqueID="";
		this.inferMultiObjectRules(iRepeatedMultiObjects);
		System.out.println("Inferring rules with multi-objects completed");



		
		
		
		// update unnecessary context specified by domain expert in all rules
		this.updateUnnecessaryContext();

		/*
		System.out.println("\t ===>total minTime=" + (minTime - maxTime));
		System.out.println("\t ===>total maxTime=" + maxTime);
		System.out.println("\t ===>total MO time=" + (System.nanoTime()-MO));
		System.out.println("\t ===>");
		 */





		//System.out.println("\t ===> current-Time after Inferring mo and starting with NAC:" + System.nanoTime());


		// infer NACs
		System.out.println("Inferring NACs ..");
		//this.GTlogger.info("Inferring NACs ..");
		this.inferNACs();
		System.out.println("Inferring NACs completed");





		// close connection		
		DBRecord.closeConnection();

	}












	/**	
	 * Methods used to prepare and classify rule instances based on minimal rule
	 *
	 *	1 - prepareAndSetRuleClassification()
	 *
	 * 	2 - doPreparRules() 
	 *  3 	- generateNodesEdgesAbstractIDs()
	 *  4 	- setSubGraphIDForIsolatedNode()
	 *  5 	- subGraphIDForAllElement()
	 *  6 	- setSubGraphIDForAllElement()
	 *  
	 *  7	- computeDistances()
	 *  8		- setDistanceIn_LRHS_Graphs ()
	 *  9		- setDistanceInSubGraphForAllElement ()
	 *  
	 *	10 - findAndSetGroup ()
	 *	11	- isMinimalRuleMatched()
	 *	12	- setMaximalContextRule()
	 *	13	- setContextIntersection()
	 *	
	 *	14	- updateUnnecessaryContext()  new.. specified by domain expert 
	 *
	 * */


	private void prepareAndSetRuleClassification(){

		// get a single instances that still not being classified in any group ..
		CachedRowSetImpl crsGetSingleRuleInstances= DBRecord.getByQueryStatement(
				"select "
						+ "TblBasicRule.MethodSignatureUniqueID, "
						+ "TblBasicRule.Observation_IDREFF, "
						+ "TblGraph.GraphID "						 
						+ "from TblBasicRule INNER JOIN TblGraph "
						+ "on TblBasicRule.Observation_IDREFF= TblGraph.Observation_IDREFF "
						+ "where TblGraph.graphType=false "
						+ "and TblBasicRule.groupID is null "
						+ "and TblBasicRule.hasEffect=true "
						+ "order by TblBasicRule.MethodSignatureUniqueID limit 1;", true);


		try {

			if (crsGetSingleRuleInstances.next()){


				// Break if the same instance being called again ..
				if (this.iObservationId==crsGetSingleRuleInstances.getInt(2)){
					return;
				}




				this.ruleMethodSignatureUniqueID=crsGetSingleRuleInstances.getString(1);
				this.iObservationId=crsGetSingleRuleInstances.getInt(2);				
				this.iLHS=crsGetSingleRuleInstances.getInt(3);				




				// 1 preparing rules [abstract ids, sub-graphs ids, distances]
				this.doPreparRules();				



				// 2 find and set groupId based on minimal rule matching
				// group id for all empty minimal rule is 0 by default, already defined during tracing
				this.findAndSetGroup();



				// inner loop until classifying all instances
				this.prepareAndSetRuleClassification();
			}


		}
		catch (SQLException e) {		
			e.printStackTrace();
		}

	}



	private void doPreparRules(){


		// generate abstract ids for both sides of the rule
		this.generateNodesEdgesAbstractIDs(this.iLHS, false);
		this.generateNodesEdgesAbstractIDs((this.iLHS+1), true);

		System.out.println("\tpreparing rule " + this.iObservationId + " : generate abstract ids \t ok" );
		//this.GTlogger.info("\tpreparing rule " + this.iObservationId + " : generate abstract ids \t ok" );








		// set sub graph id for isolated node
		this.setSubGraphIDForIsolatedNode(this.iLHS);
		this.setSubGraphIDForIsolatedNode(this.iLHS+1);


		// set sub graph id for all elements
		this.subGraphIDForAllElement(this.iLHS);
		this.subGraphIDForAllElement(this.iLHS+1);

		System.out.println("\tpreparing rule " + this.iObservationId + " : define sub graph ids \t ok");
		//this.GTlogger.info("\tpreparing rule " + this.iObservationId + " : define sub graph ids \t ok");








		// set distances in each sub-graphs
		this.computeDistances();
		System.out.println("\tpreparing rule " + this.iObservationId + " : define distances \t\t ok");
		//this.GTlogger.info("\tpreparing rule " + this.iObservationId + " : define distances \t\t ok");


	}



	private void generateNodesEdgesAbstractIDs(int iGraphID, boolean isRHS){

		String isLorR= "L";
		if (isRHS){
			isLorR= "R";
		}

		String strSQLStatement=""
				+ "select @i:=0; "
				+ "update TblNode "
				+ "set AbstractID = CONCAT('N" + this.iObservationId + "', (select @i:=@i + 1), '" + isLorR + "') "
				+ "where Graph_IDREFF =" + iGraphID
				+ ";"
				+ "update TblEdge "
				+ "set AbstractID = CONCAT('E" + this.iObservationId + "', (select @i:=@i + 1), '" + isLorR + "') "
				+ "where Graph_IDREFF =" + iGraphID
				+ ";";

		DBRecord.executeAnySqlStatement(strSQLStatement, true);

	}



	private void setSubGraphIDForIsolatedNode(int iGraphID){

		// set minSubGraph(0) to all isolated node in this graph at only minimal node=true
		String strSQLStatement=
				"update TblNode "
						+ " set minSubGraphID=0 " 
						+ " where Graph_IDREFF=" + iGraphID
						+ " and isMinimal=true "
						+ " and minSubGraphID is null "
						+ " and nodeID NOT IN ("
						+ "	select sourceID as nodeID from TblEdge "
						+ "	where Graph_IDREFF=" + iGraphID
						+ "	union"
						+ "	select targetID as nodeID from TblEdge "
						+ "	where Graph_IDREFF=" + iGraphID
						+ ");";

		DBRecord.executeAnySqlStatement(strSQLStatement, true);
	}



	private void subGraphIDForAllElement(int iMGraphID){


		DBRecord.executeAnySqlStatement(
				" set @maxSubGroupId=(select max(COALESCE(minSubGraphID, 0)+1) from TblEdge);", true);

		CachedRowSetImpl crsPrepargraphs= DBRecord.getByQueryStatement(
				"select @maxSubGroupId, AbstractID "
						+ "from TblEdge where Graph_IDREFF=" + iMGraphID
						+ " and minSubGraphID is null LIMIT 1;", true);

		try{

			if (crsPrepargraphs.next()){

				// update group in this edge
				String strSQLStatement=
						"update TblEdge "
								+ " set minSubGraphID=" + crsPrepargraphs.getInt(1)
								+ " where AbstractID='" + crsPrepargraphs.getString(2) + "';";
				DBRecord.executeAnySqlStatement(strSQLStatement, true);


				// nested calling to define sub graph IDs
				this.setSubGraphIDForAllElement(
						iMGraphID,
						crsPrepargraphs.getInt(1));


				// loop by calling this method until finishing all edges
				this.subGraphIDForAllElement(iMGraphID);
			}
			else {
				return;
			}
		}
		catch (SQLException e) {		
			e.printStackTrace();
		}



	}



	private void setSubGraphIDForAllElement(int iMGraphID, int subGraphID){

		String strSQLStatement="";

		// update (minSubGraphID) in Node table from Edge Table
		strSQLStatement=
				"update TblNode "
						+ " set minSubGraphID=" + subGraphID
						+ " where Graph_IDREFF=" + iMGraphID
						+ " and minSubGraphID is null "
						+ " and nodeID in ("

				 + "select sourceID as nodeID from TblEdge "
				 + "	where Graph_IDREFF=" + iMGraphID
				 + "	and minSubGraphID=" + subGraphID
				 + "  union "
				 + "select targetID as nodeID from TblEdge "
				 + "	where Graph_IDREFF=" + iMGraphID
				 + "	and minSubGraphID=" + subGraphID

				 + " );";

		DBRecord.executeAnySqlStatement(strSQLStatement, true);


		// update (minSubGraphID) in Edge Table from Node table

		strSQLStatement=
				"update TblEdge "
						+ " set minSubGraphID=" + subGraphID
						+ " where Graph_IDREFF=" + iMGraphID
						+ " and minSubGraphID is null "
						+ " and "
						+ "  (sourceID in ("
						+ "		select nodeID as sourceID"
						+ "		from TblNode"
						+ " 		where Graph_IDREFF=" + iMGraphID
						+ " 		and minSubGraphID=" + subGraphID
						+ "		) "
						+ "   or "
						+ "   targetID in ("
						+ "		select nodeID as targetID"
						+ "		from TblNode"
						+ " 		where Graph_IDREFF=" + iMGraphID
						+ " 		and minSubGraphID=" + subGraphID				 
						+ "		) "
						+ " );";


		if(DBRecord.executeSqlStatement(strSQLStatement, true)>0){
			this.setSubGraphIDForAllElement(iMGraphID, subGraphID);
		}

	}



	private void computeDistances(){

		// extract all possible entry nodes, 
		// start from thisObject, then passed parameter in order..


		// distance in LHS graph
		this.setDistanceIn_LRHS_Graphs(this.iLHS);


		// distance in RHS graph
		this.setDistanceIn_LRHS_Graphs(this.iLHS+1);

	}



	private void setDistanceIn_LRHS_Graphs(int iLRHS){

		CachedRowSetImpl crsPrepargraphs= DBRecord.getByQueryStatement(
				"select nodeID from TblNode "
						+ " where iDistance is null "
						+ " and (isThis=true or iParameterIndex>=1 or isMinimal=true) "
						+ " and Graph_IDREFF=" + iLRHS
						+ " order by isThis DESC, iParameterIndex, isMinimal DESC, isReturn DESC, isCollection, isInitialized, nodeType ;", true);

		try {

			while (crsPrepargraphs.next()){

				// update distance in this possible entry node to be (0) 
				String strSQLStatement=
						"update TblNode set iDistance=0 where iDistance is null" 
								+ " and Graph_IDREFF=" + iLRHS
								+ " and nodeID='" + crsPrepargraphs.getString(1) + "';";

				if (DBRecord.executeSqlStatement(strSQLStatement, true)>0){

					/* define distance for all nodes/edges 
					   that are connected to this possible enrty node */

					this.setDistanceInSubGraphForAllElement(iLRHS, 0);

				}
			}




			crsPrepargraphs= DBRecord.getByQueryStatement(
					"select nodeID from TblNode "
							+ " where iDistance is null "
							+ " and Graph_IDREFF=" + iLRHS, true);

			// update distance again for all disconnected components
			while (crsPrepargraphs.next()){

				// update distance in this possible entry node to be (100) 
				String strSQLStatement=
						"update TblNode set iDistance=100 where iDistance is null" 
								+ " and Graph_IDREFF=" + iLRHS
								+ " and nodeID='" + crsPrepargraphs.getString(1) + "';";

				if (DBRecord.executeSqlStatement(strSQLStatement, true)>0){

					/* define distance for all nodes/edges 
					   that are connected to this possible enrty node */

					this.setDistanceInSubGraphForAllElement(iLRHS, 100);

				}
			}



		}
		catch (SQLException e) {		
			e.printStackTrace();
		}

	}



	private void setDistanceInSubGraphForAllElement(int iLRHS, int iCurrentDistance){

		boolean goForNextRound=false;

		do {


			// update all connected edges to be (+1) for all sub-graphs			
			String strSQLStatement=
					"update TblEdge "
							+ " set iDistance=" + (iCurrentDistance+1)
							+ " where Graph_IDREFF=" + iLRHS
							+ " and iDistance is null "
							+ " and "
							+ "  (sourceID in ("
							+ "		select nodeID as sourceID"
							+ "		from TblNode"
							+ " 		where Graph_IDREFF=" + iLRHS
							+ "		and iDistance=" + iCurrentDistance
							+ "		) "
							+ "   or "
							+ "   targetID in ("
							+ "		select nodeID as targetID"
							+ "		from TblNode"
							+ " 		where Graph_IDREFF=" + iLRHS		
							+ "		and iDistance=" + iCurrentDistance
							+ "		) "
							+ " );";

			DBRecord.executeAnySqlStatement(strSQLStatement, true);




			// updated distance for all connected node to be (+2)
			strSQLStatement=
					"update TblNode "
							+ " set iDistance=" + (iCurrentDistance+2)
							+ " where Graph_IDREFF=" + iLRHS
							+ " and iDistance is null "
							+ " and nodeID in ("

					 + "select sourceID as nodeID from TblEdge "
					 + "	where Graph_IDREFF=" + iLRHS
					 + "	and iDistance=" + (iCurrentDistance+1)
					 + "  union "
					 + "select targetID as nodeID from TblEdge "
					 + "	where Graph_IDREFF=" + iLRHS
					 + "	and iDistance=" + (iCurrentDistance+1)

					 + " );";




			// initial for the next round must be false before executing this statement 
			goForNextRound=false;

			if(DBRecord.executeSqlStatement(strSQLStatement, true)>0){
				goForNextRound=true;
				iCurrentDistance+=2;
			}


		} 
		while (goForNextRound);



	}



	private void findAndSetGroup(){


		// group id must start from <<1>>, as <0> specified for query rules
		int groupID=0;   // to be increased

		CachedRowSetImpl crsGetGroups= DBRecord.getByQueryStatement(
				"select groupID, Observation_IDREFF "
						+ "from TblBasicRule "
						+ "where isAbstract=true "
						+ "  and isApplicable=true "
						+ "  and groupID>0 "
						+ "  and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "' "
						+ " order by groupID; ", true);

		try {

			while (crsGetGroups.next()){

				groupID =crsGetGroups.getInt(1);				

				if (this.isMinimalRuleMatched(crsGetGroups.getInt(2))){

					if (DBRecord.executeSqlStatement(
							"Update TblBasicRule set groupID=" + groupID
							+ " where Observation_IDREFF=" 
							+ this.iObservationId
							, true)==1){



						// set exist group id
						System.out.println("\tpreparing rule " + this.iObservationId + " : group classification [" + groupID + "]\t ok");
						//this.GTlogger.info("\tpreparing rule " + this.iObservationId + " : group classification [" + groupID + "]\t ok");


						// ***************************************************************
						// set smallest rule to be abstract		
						// contexts intersection (maximal rule)
						// attributes generalisation 
						MO= System.nanoTime();
						this.setMaximalContextRule(crsGetGroups.getInt(2));
						maxTime += (System.nanoTime()-MO);

						return;

					}
					else {
						//this.GTlogger.info("Error: group id can't be saved ..");
					}
				}

			}

		} catch (SQLException e) {		
			e.printStackTrace();
		}



		// No group has been found, so we need to define new group
		groupID++;



		if (DBRecord.executeSqlStatement(
				"Update TblBasicRule set isAbstract=true, groupID=" + groupID
				+ " where Observation_IDREFF=" + this.iObservationId
				+ "; "
				+ "update TblGraph inner join TblNode "
				+ "ON TblGraph.GraphID = TblNode.Graph_IDREFF "
				+ "set MappedAbstractID =AbstractID "
				+ "where Observation_IDREFF=" + this.iObservationId
				+ ";", true)!=1){

		//	this.GTlogger.info("Error: group id can't be generated ..");
		}


		// set new group id
		System.out.println("\tpreparing rule " + this.iObservationId + " : group classification [" + groupID + "]\t ok");
	//	this.GTlogger.info("\tpreparing rule " + this.iObservationId + " : group classification [" + groupID + "]\t ok");

	}



	private boolean isMinimalRuleMatched(int iTargetObservationID){


		try {

			// get target Observation graphs
			int sourceRHS_id, targetLHS_id, targetRHS_id;

			CachedRowSetImpl checkMinimalRule= DBRecord.getByQueryStatement(
					" (select GraphID from TblGraph where graphType=true and Observation_IDREFF=" + this.iObservationId + ") "
							+ "UNION ALL "
							+ "(select GraphID from TblGraph where Observation_IDREFF=" + iTargetObservationID + " order by graphType)", true);

			if (checkMinimalRule.size()!=3){
				return false;
			}
			else {

				checkMinimalRule.next();
				sourceRHS_id = checkMinimalRule.getInt(1);

				checkMinimalRule.next();
				targetLHS_id = checkMinimalRule.getInt(1);

				checkMinimalRule.next();
				targetRHS_id = checkMinimalRule.getInt(1);				
			}





			// [1] ============================================================ 
			// check matching all nodes with only (isMinimal=true) in both rules ..
			// ----------------------------------------------------------------		

			if (DBRecord.getByQueryStatement(					
					"select * from "
							+ "(	(select CONCAT("
							+ "TN1.nodeType,"
							+ "TN1.isThis,"
							+ "TN1.isReturn,"
							+ "TN1.isInitialized,"
							+ "TN1.isCollection,"
							+ "TGraph1.graphType) as collectedColumns, count(TN1.AbstractID) as abstractCount"
							+ " from TblNode AS TN1 inner join TblGraph AS TGraph1"
							+ " ON TN1.Graph_IDREFF = TGraph1.GraphID"
							+ " where TN1.isMinimal=true"
							+ " and TN1.Graph_IDREFF in (" + this.iLHS + "," + sourceRHS_id + ")"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TN2.nodeType,"
							+ "TN2.isThis,"
							+ "TN2.isReturn,"
							+ "TN2.isInitialized,"
							+ "TN2.isCollection,"
							+ "TGraph2.graphType) as collectedColumns, count(TN2.AbstractID) as abstractCount"
							+ " from TblNode AS TN2 inner join TblGraph AS TGraph2"
							+ " ON TN2.Graph_IDREFF = TGraph2.GraphID"
							+ " where TN2.isMinimal=true"
							+ " and TN2.Graph_IDREFF in (" + targetLHS_id + "," + targetRHS_id + ")"
							+ " group by collectedColumns) "
							+ ") as T_MatchedStructure "
							+ "group by "
							+ "T_MatchedStructure.collectedColumns,"
							+ "T_MatchedStructure.abstractCount "
							+ "HAVING COUNT(*)=1 limit 1;"

					, true).next()){



				return false;
			}







			// [2] ============================================================ 
			// check matching all edges in both rules with only (isMinimal=true) in both rules ..
			// ----------------------------------------------------------------		

			if (DBRecord.getByQueryStatement(					
					"select * from"
							+ "(	(select CONCAT("
							+ "TE1.sourceTargetType,"
							+ "TGraph1.graphType) as collectedColumns, count(TE1.AbstractID) as abstractCount"
							+ " from TblEdge AS TE1 inner join TblGraph AS TGraph1"
							+ " ON TE1.Graph_IDREFF = TGraph1.GraphID"
							+ " where TE1.isMinimal=true"
							+ " and TE1.Graph_IDREFF in (" + this.iLHS + "," + sourceRHS_id + ")"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TE2.sourceTargetType,"
							+ "TGraph2.graphType) as collectedColumns, count(TE2.AbstractID) as abstractCount"
							+ " from TblEdge AS TE2 inner join TblGraph AS TGraph2"
							+ " ON TE2.Graph_IDREFF = TGraph2.GraphID"
							+ " where TE2.isMinimal=true"
							+ " and TE2.Graph_IDREFF in (" + targetLHS_id + "," + targetRHS_id + ")"
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


		// 100% matched
		return true;
	}



	private void setMaximalContextRule(int existsRuleObservation_ID){


		// set intersection contexts first
		boolean isThereAChange=this.setContextIntersection(existsRuleObservation_ID);


		// set smallest rule to be abstract		
		DBRecord.executeSqlStatement(

				"set @Oid=(select TblBasicRule.Observation_IDREFF from TblBasicRule "
						+ "inner join ("
						+ "select TblGraph.Observation_IDREFF, count(nodeId) as contextCount "
						+ "from TblGraph "
						+ "inner join TblNode "
						+ "ON TblGraph.GraphID = TblNode.Graph_IDREFF "
						+ "where TblGraph.Observation_IDREFF=" + existsRuleObservation_ID
						+ " and TblGraph.graphType=false "
						+ " and isMinimal=false "
						+ " and (isToBeDeleted is null or isToBeDeleted=false) "
						+ "union "
						+ "select TblGraph.Observation_IDREFF, count(nodeId) as contextCount "
						+ "from TblGraph "
						+ "inner join TblNode "
						+ "ON TblGraph.GraphID=TblNode.Graph_IDREFF "
						+ "where TblGraph.Observation_IDREFF=" + this.iObservationId
						+ " and TblGraph.graphType=false "
						+ " and isMinimal=false "
						+ " and (isToBeDeleted is null or isToBeDeleted=false)) tblAbstract "
						+ "on TblBasicRule.Observation_IDREFF=tblAbstract.Observation_IDREFF "
						+ "where TblBasicRule.Observation_IDREFF in ("
						+ existsRuleObservation_ID 
						+ "," 
						+ this.iObservationId + ") "
						+ "order by contextCount, isAbstract Desc, objectsCount, internalStateCount limit 1);"


				+ "Update TblBasicRule set isAbstract=null "
				+ "where Observation_IDREFF in (" 
				+ existsRuleObservation_ID 
				+ ", " 
				+ this.iObservationId + "); "

				+ "Update TblBasicRule set isAbstract=true "
				+ " where Observation_IDREFF=@Oid;", true);


		boolean isThisiObservationIdBecomeAbstract=false;
		CachedRowSetImpl crsIsThisRuleBecomeAbstract= DBRecord.getByQueryStatement("select @Oid;", true);

		try {

			if (crsIsThisRuleBecomeAbstract.next() 
					&& crsIsThisRuleBecomeAbstract.getInt(1)==this.iObservationId){

				isThisiObservationIdBecomeAbstract=true;				
			}

		} catch (SQLException e) {		
			e.printStackTrace();
		}




		if (isThereAChange || isThisiObservationIdBecomeAbstract){
			// re-compute multiobjects and NACs for this range ..

			DBRecord.executeSqlStatement(
					"update TblBasicRule "
							+ "set hasMultiObject=null, isAbstractMO=null "
							+ "where Observation_IDREFF in (" + this.iObservationId	+ "," +	existsRuleObservation_ID + ");"

					+ "delete from TblRuleMoNodes "
					+ "where ruleMo_IDREFF in (" + this.iObservationId	+ "," +	existsRuleObservation_ID + ");"

					+ "delete from TblRuleMoEdge "
					+ "where ruleMo_IDREFF in (" + this.iObservationId	+ "," +	existsRuleObservation_ID + ");"

					, true);			
		}




		// finally set attribute mapping
		if (isThisiObservationIdBecomeAbstract){
			this.setMaxRuleNodeMapping(this.iObservationId, existsRuleObservation_ID);
		}
		else { 
			this.setMaxRuleNodeMapping(existsRuleObservation_ID, this.iObservationId);
		}

	}



	private boolean setContextIntersection(int existsRuleObservation_ID){

		boolean isThereAChange=false;

		// find disjoint context nodes and then update them to be deleted=true 
		DBRecord.executeSqlStatement(
				"set @gid1=(select GraphID from TblGraph where graphType=false and Observation_IDREFF=" + this.iObservationId+ ");"
						+ "set @gid2=(select GraphID from TblGraph where graphType=false and Observation_IDREFF=" + existsRuleObservation_ID + ");"
						+ "DROP TABLE IF EXISTS QueryTempTbl; "

				+ "CREATE TABLE QueryTempTbl "
				+ "select Tabstract.AbstractID as tAbs, Tcontexts.AbstractID as tCon "
				+ "from TblNode as Tabstract "
				+ "inner join TblNode as Tcontexts "
				+ "on Tabstract.nodeType=Tcontexts.nodeType "
				+ "and Tabstract.isThis=Tcontexts.isThis "
				+ "and Tabstract.isReturn=Tcontexts.isReturn "
				+ "and Tabstract.isCollection=Tcontexts.isCollection "
				+ "and Tabstract.iDistance=Tcontexts.iDistance " // Temporary
				+ "where "
				+ "Tabstract.Graph_IDREFF=@gid1  "
				+ "and Tcontexts.Graph_IDREFF=@gid2  "
				+ "and Tabstract.isMinimal=false "
				+ "and Tcontexts.isMinimal=false "
				+ "and (Tabstract.isToBeDeleted=false or Tabstract.isToBeDeleted is null) "
				+ "and (Tcontexts.isToBeDeleted=false or Tcontexts.isToBeDeleted is null); "


				+ "update TblNode set isToBeDeleted=true "
				+ "where Graph_IDREFF in (@gid1, @gid2) "
				+ "and isMinimal=false "
				+ "and AbstractID not in (select tAbs from QueryTempTbl union select tCon from QueryTempTbl); "


				+ "DROP TABLE IF EXISTS QueryTempTbl; set @gid1=null; set @gid2=null; ", true);


		// update RHS based on the change in LHS
		isThereAChange = (DBRecord.executeSqlStatement("update TblNode tLHS "
				+ "inner join TblNode tRHS on tLHS.nodeID=tRHS.nodeID "
				+ "inner join TblGraph on (TblGraph.GraphID=tLHS.Graph_IDREFF or TblGraph.GraphID=tRHS.Graph_IDREFF) "
				+ "set tRHS.isToBeDeleted=true "
				+ "where Observation_IDREFF in (" + this.iObservationId + "," + existsRuleObservation_ID + ") "
				+ "and tLHS.Graph_IDREFF=tRHS.Graph_IDREFF-1 "
				+ "and tLHS.isMinimal=false "
				+ "and tRHS.isMinimal=false "
				+ "and tLHS.isToBeDeleted=true;", true))>0;


				// A update relevant edges to be also isToBeDeleted=true for the first rule
				DBRecord.executeSqlStatement("update TblEdge set isToBeDeleted=true "
						+ "where Graph_IDREFF in (select GraphID from TblGraph where Observation_IDREFF=" + this.iObservationId + ") "
						+ "and "
						+ "(sourceID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
						+ "or "
						+ "targetID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
						+ ");", true);


				// B update relevant edges to be also isToBeDeleted=true for the second rule
				DBRecord.executeSqlStatement("update TblEdge set isToBeDeleted=true "
						+ "where Graph_IDREFF in (select GraphID from TblGraph where Observation_IDREFF=" + existsRuleObservation_ID + ") "
						+ "and "
						+ "(sourceID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
						+ "or "
						+ "targetID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
						+ ");", true);



				return isThereAChange;		
	}



	private void setMaxRuleNodeMapping(int iAbstractRule, int iRuleInstance){

		// clear MappedAbstractID in instance rule for matching 
		DBRecord.executeSqlStatement(
				"update TblNode INNER JOIN TblGraph "
						+ "on TblNode.Graph_IDREFF=TblGraph.GraphID "
						+ " set TblNode.MappedAbstractID=''"
						+ " where TblGraph.Observation_IDREFF=" + iRuleInstance, true);


		CachedRowSetImpl crsGetAbstractNodes= DBRecord.getByQueryStatement(
				"select graphType, nodeID, AbstractID, "
						+ "nodeType, isThis, isReturn, isParameters, iParameterIndex, "
						+ "isMinimal, isRequiredContext, isInitialized, isCollection, TblNode.Graph_IDREFF, iDistance "
						+ "from TblNode INNER JOIN TblGraph "
						+ "on TblNode.Graph_IDREFF=TblGraph.GraphID "
						+ "where TblGraph.Observation_IDREFF=" + iAbstractRule
						+ " and isToBeDeleted is null "
						+ " order by graphType; ", true);

		try {

			while (crsGetAbstractNodes.next()){

				GNode abstractNode= new GNode(crsGetAbstractNodes.getString(2));				
				abstractNode.AbstractID=crsGetAbstractNodes.getString(3);
				abstractNode.nodeType=crsGetAbstractNodes.getString(4);
				abstractNode.isThis=crsGetAbstractNodes.getBoolean(5);
				abstractNode.isReturn=crsGetAbstractNodes.getBoolean(6);
				abstractNode.isParameters=crsGetAbstractNodes.getBoolean(7);
				abstractNode.iParameterIndex=crsGetAbstractNodes.getInt(8);				
				abstractNode.isMinimal=crsGetAbstractNodes.getBoolean(9);
				abstractNode.isRequiredContext=crsGetAbstractNodes.getBoolean(10);
				abstractNode.isInitialized=crsGetAbstractNodes.getBoolean(11);
				abstractNode.isCollection=crsGetAbstractNodes.getBoolean(12);
				abstractNode.iSubGraphID=crsGetAbstractNodes.getInt(13);	/* temporary to store graph ID */
				abstractNode.distance=crsGetAbstractNodes.getInt(14);

				String nodeInsIsMappedWith= this.findMappedInsNode(
						crsGetAbstractNodes.getBoolean(1),  
						iRuleInstance, 
						abstractNode);

				DBRecord.executeSqlStatement(
						"update TblNode "
								+ "set MappedAbstractID='" + abstractNode.AbstractID + "'"
								+ " where AbstractID in ('" + abstractNode.AbstractID + "','" + nodeInsIsMappedWith + "');"
								, true);
			}

		} catch (SQLException e) {		
			e.printStackTrace();
		}

	}



	private String findMappedInsNode(boolean isLHSGraphType, int iRuleInstance, GNode abstractNode){

		/* 
		 * get all possible matched instance-nodes in
		 * 1  - graph type : LHS or RHS
		 * 2  - nodeType
		 * 3  - isThis
		 * 4  - isReturn
		 * 5  - isParameters
		 * 6  - iParameterIndex
		 * 7  - isMinimal
		 * 8  - isRequiredContext
		 * 9  - isInitialized
		 * 10 - isCollection	
		 */  

		CachedRowSetImpl crsGetPossibleMatchedAbstractNodes= DBRecord.getByQueryStatement(
				"select AbstractID, Graph_IDREFF, nodeID "
						+ "from TblNode INNER JOIN TblGraph "
						+ "on TblNode.Graph_IDREFF=TblGraph.GraphID "
						+ "where TblGraph.Observation_IDREFF=" + iRuleInstance

						+ " and nodeType='" + abstractNode.nodeType + "'"
						+ " and isThis=" + abstractNode.isThis
						+ " and isReturn=" + abstractNode.isReturn
						//+ " and isParameters=" + abstractNode.isParameters
						//+ " and iParameterIndex=" + abstractNode.iParameterIndex
						+ " and isMinimal=" + abstractNode.isMinimal
						+ " and isRequiredContext=" + abstractNode.isRequiredContext
						+ " and isInitialized=" + abstractNode.isInitialized
						+ " and isCollection=" + abstractNode.isCollection

						+ " and iDistance=" + abstractNode.distance

						+ " and graphType=" + isLHSGraphType
						+ " and MappedAbstractID='' and isToBeDeleted is null; ", true);




		String randomChoise="";
		try {


			// only a single possible match

			if (crsGetPossibleMatchedAbstractNodes.size()<1){

				// delete node from abstract max rule as there is no possible match
				this.deleteUnMappedNodeInAbstractMaxRule(
						abstractNode.iSubGraphID, 
						abstractNode.AbstractID, 
						abstractNode.nodeID);
			}

			else if (crsGetPossibleMatchedAbstractNodes.size()==1){			
				crsGetPossibleMatchedAbstractNodes.next(); 
				return crsGetPossibleMatchedAbstractNodes.getString(1);				
			}



			// more than one possible matches
			while (crsGetPossibleMatchedAbstractNodes.next()){

				// check incoming and outgoing edges and take the first possible matches
				if (this.isIncomingAndOutgoingEdgesMatched(
						abstractNode, 
						crsGetPossibleMatchedAbstractNodes.getString(2), 
						crsGetPossibleMatchedAbstractNodes.getString(3))){

					return crsGetPossibleMatchedAbstractNodes.getString(1);
				}

				// take the last check one in case no match found
				randomChoise=crsGetPossibleMatchedAbstractNodes.getString(1);
			}


		} catch (SQLException e) {		
			e.printStackTrace();
		}


		System.out.println("Maximal rule- Warning no mapping :" + abstractNode.AbstractID + " with: " + randomChoise);		

		return randomChoise;
	}


	private boolean isIncomingAndOutgoingEdgesMatched(GNode abstractNode, String instanceGraph_id, String instanceNode_id){


		// ============================================================ 
		// check matching all edges (incoming/outgoing) in both sides 
		// ------------------------------------------------------------
		// Node.iSubGraphID=crsGetAbstractNodes.getInt(13);	/* temporary to store graph ID 
		try {
			if (DBRecord.getByQueryStatement(					
					"select * from"
							+ "(	(select CONCAT("
							+ "TE1.sourceTargetType,"
							+ "TE1.isMinimal) as collectedColumns, count(TE1.AbstractID) as abstractCount"
							+ " from TblEdge AS TE1 "
							+ " where TE1.Graph_IDREFF=" + abstractNode.iSubGraphID
							+ " and (TE1.sourceID='" + abstractNode.nodeID + "' or TE1.targetID='" + abstractNode.nodeID + "')"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TE2.sourceTargetType,"
							+ "TE2.isMinimal) as collectedColumns, count(TE2.AbstractID) as abstractCount"
							+ " from TblEdge AS TE2 "								
							+ " where TE2.Graph_IDREFF=" + instanceGraph_id
							+ " and (TE2.sourceID='" + instanceNode_id + "' or TE2.targetID='" + instanceNode_id + "')"																																				
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



	private void deleteUnMappedNodeInAbstractMaxRule(int iGraphI, String abstractNodeAbstractID, String abstractNodeNodeID){

		// delete node from abstract max rule as there is no possible match
		DBRecord.executeSqlStatement(
				"update TblNode "
						+ "set isToBeDeleted=true where AbstractID='" + abstractNodeAbstractID + "'"
						, true);

		// A update relevant edges to be also isToBeDeleted=true 
		DBRecord.executeSqlStatement("update TblEdge set isToBeDeleted=true "
				+ "where Graph_IDREFF=" + iGraphI
				+ " and "
				+ "(sourceID='" + abstractNodeNodeID + "'"
				+ "or "
				+ "targetID='" + abstractNodeNodeID + "');", true);
	}





	private void updateUnnecessaryContext(){
		
		// updating unnecessary context specified by domain expert in all rules
		
		System.out.println("updateing unnecessary context as spefified by domain expert ..");
		
		DBRecord.executeSqlStatement(
				 "DROP TABLE IF EXISTS QueryTempTbl2; "
				
				+ "CREATE TABLE QueryTempTbl2 "
				+ "select AbstractID as aID from TblNode "
				+ "where isMinimal=false "
				+ "and isRequiredContext=true "
				+ "and isUnnecessaryContext=true; "

				+ "update TblNode set isToBeDeleted=true "
				+ "where Graph_IDREFF>0 and AbstractID in (select aID from QueryTempTbl2); "

				+"update TblEdge set isToBeDeleted=true "
				+ "where Graph_IDREFF>0 and "
				+ "(sourceID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
				+ "or "
				+ "targetID in (select nodeID from TblNode where isToBeDeleted=true and TblNode.Graph_IDREFF=TblEdge.Graph_IDREFF)"
				+ ");", true);	
				
	}
	
	
	
	
	
	




	/**	
	 * Methods used to generalise query rules instances based on their smallest distinct structure size
	 *
	 *	1 - queryRuleGeneralisation()
	 * 	2 - setAbstractToQueryRule() 
	 * 
	 * */

	private void queryRuleGeneralisation(){


		// get a single query rule instances
		CachedRowSetImpl crsGetSingleRuleInstances= DBRecord.getByQueryStatement(
				"select "
						+ "TblBasicRule.MethodSignatureUniqueID, "
						+ "TblBasicRule.Observation_IDREFF " 
						+ "from TblBasicRule INNER JOIN TblGraph "
						+ "on TblBasicRule.Observation_IDREFF= TblGraph.Observation_IDREFF "
						+ "where TblGraph.graphType=false "
						+ "and TblBasicRule.groupID is null "
						+ "and TblBasicRule.hasEffect=false "
						+ "order by TblBasicRule.MethodSignatureUniqueID limit 1;", true);


		try {

			if (crsGetSingleRuleInstances.next()){


				// Break if the same instance being called again ..
				if (this.ruleMethodSignatureUniqueID==crsGetSingleRuleInstances.getString(1)){
					return;
				}




				this.ruleMethodSignatureUniqueID=crsGetSingleRuleInstances.getString(1);
				this.iObservationId=crsGetSingleRuleInstances.getInt(2);
				this.setAbstractToQueryRule();



				// inner loop until classifying all query rule instances
				this.queryRuleGeneralisation();
			}


		}
		catch (SQLException e) {		
			e.printStackTrace();
		}

	}



	private void setAbstractToQueryRule(){


		DBRecord.executeSqlStatement(
				"Update TblBasicRule set isAbstract=false, groupID=0 "
						+ " where hasEffect=false and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "'"
						+ " and Observation_IDREFF >= 0; "


				+ "DROP TEMPORARY TABLE IF EXISTS QueryTempTbl; "

				+ "CREATE TEMPORARY TABLE QueryTempTbl "
				+ " select Observation_IDREFF from TblBasicRule "
				+ " where (userDecision is null or userDecision=false)"
				+ " and hasEffect=false"
				+ " and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "'"
				+ " and groupID=0 group by objectsCount; "


				+ "Update TblBasicRule set isAbstract=true "
				+ " where Observation_IDREFF in (select Observation_IDREFF from QueryTempTbl) "
				+ " and Observation_IDREFF >= 0;"
				+ " DROP TEMPORARY TABLE IF EXISTS QueryTempTbl;", true);


		System.out.println("\tgeneralising query rule " + this.iObservationId + " :\tok");
	//	this.GTlogger.info("\tgeneralising query rule " + this.iObservationId + " :\tok");

	}











































	/** Methods/classes used to infer multi-objects rules
	 * 
	 * 	1 - inferMultiObjectRules()
	 *  2 - generateMultiObject()
	 *  3 - class MORule
	 *  	A - hasMultiObject()
	 *  	B - load()
	 *  	C - save()
	 *  	D - addNode()
	 *  	E - isMatchedObject()
	 *  	F - replaceSourceTargetEdges()
	 *  	G - getNodeIndex()
	 *  
	 *  4 - setRuleMOClassificationAndAbstract()
	 *  5 - findAndSetGroupID_MO()
	 *  6 - isRuleMoStructureMatched()
	 *  7 - setisAbstractMOForMaximalMultiObjectInRule()
	 *  
	 * */		

	private void inferMultiObjectRules(int iRepeatedMO){


		// set hasMultiObject=(true/false) before looping process

		DBRecord.executeSqlStatement(
				" DROP TABLE IF EXISTS IMOTempTbl; "

				+ "CREATE TABLE IMOTempTbl "
				+ " select distinctrow TblBasicRule.Observation_IDREFF, TblNode.nodeType as TblNodeType "
				+ " from TblBasicRule inner join TblGraph "
				+ " on TblBasicRule.Observation_IDREFF=TblGraph.Observation_IDREFF "
				+ " inner join TblNode "
				+ " on TblGraph.GraphID = TblNode.Graph_IDREFF"
				+ " where TblBasicRule.hasMultiObject is null "
				+ " and TblBasicRule.isAbstract=true "
				+ " and TblBasicRule.isApplicable=true "
				+ " and TblNode.isMinimal=true "				
				+ " group by TblNode.Graph_IDREFF, TblNode.minSubGraphID, TblNode.nodeType"
				+ " having count(TblNode.nodeType)>" + iRepeatedMO + ";"

				+ "Update TblBasicRule set hasMultiObject=false "
				+ " where hasMultiObject is null "
				+ " and Observation_IDREFF >= 0;"

				+ "Update TblBasicRule set hasMultiObject=true "
				+ " where Observation_IDREFF in (select distinct Observation_IDREFF from IMOTempTbl) "
				+ " and Observation_IDREFF >= 0;", true);



		// get all rules that seem have multi-objects, i.e., currently [hasMultiObject=true] ...		
		CachedRowSetImpl crsAllRuleMO= DBRecord.getByQueryStatement(
				"select pre.GraphID, post.GraphID, TblBasicRule.Observation_IDREFF"
						+ " from TblBasicRule"
						+ " inner join TblGraph pre"
						+ " on TblBasicRule.Observation_IDREFF=pre.Observation_IDREFF"
						+ " inner join TblGraph post"
						+ " on pre.Observation_IDREFF=post.Observation_IDREFF"
						+ " where TblBasicRule.hasMultiObject=true"
						+ " and pre.GraphID<post.GraphID "
						+ " and TblBasicRule.Observation_IDREFF not in "
						+ " (select ruleMo_IDREFF from TblRuleMoNodes); ", true);

		try {

			while (crsAllRuleMO.next()){

				// check inferring multi-object rules
				if (!this.generateMultiObject(
						crsAllRuleMO.getInt(3),
						crsAllRuleMO.getInt(1),
						crsAllRuleMO.getInt(2))){

					DBRecord.executeSqlStatement(
							"delete from TblRuleMoNodes where ruleMo_IDREFF=" + crsAllRuleMO.getInt(3)
							+ ";"
							+ "delete from TblRuleMoEdge where ruleMo_IDREFF=" + crsAllRuleMO.getInt(3)
							+ "; Update TblBasicRule set hasMultiObject=false "
							+ " where Observation_IDREFF=" + crsAllRuleMO.getInt(3), true);
				}
			}

		}
		catch (SQLException e) {		
			e.printStackTrace();
		}








		// classifying all rules with multi-objects i.e., define [groupID_MO and isAbstractMO]
		this.iObservationId=-1;
		this.setRuleMOClassificationAndAbstract();




	}



	private boolean generateMultiObject(int iObservationID, int iLHS, int iRHS){


		// check MO in LHS
		MORule checkMORule = new MORule(iObservationID, iLHS, false);
		boolean isMOexist = checkMORule.hasMultiObject();


		// check MO in RHS		
		checkMORule = new MORule(iObservationID, iRHS, true);


		if (!isMOexist){
			isMOexist = checkMORule.hasMultiObject();
		}
		else {
			checkMORule.hasMultiObject();
		}

		System.out.println("\tmulti-object in maximal rule id: " + iObservationID + " - " + isMOexist);
	//	this.GTlogger.info("\tmulti-object in maximal rule id: " + iObservationID + " - " + isMOexist);
		
		return isMOexist;
	}



	
	
	private class MORule {

		private int iGraphSideId;	
		private int iObservationID;
		private boolean isRHS;

		// Nodes .. 
		private ArrayList<GNode> gNodes = null;
		private ArrayList<String> nodesIndexs = new ArrayList<String>();


		// Edges .. 
		private ArrayList<String> edgesAbstractIDs = new ArrayList<String>();   
		private ArrayList<Integer> edgesSourceIndexes = new ArrayList<Integer>();
		private ArrayList<Integer> edgesTargetIndexes = new ArrayList<Integer>();        
		private ArrayList<Integer> edgesSubGraphID = new ArrayList<Integer>();
		private ArrayList<Integer> edgesiDistance = new ArrayList<Integer>();

		//Logger GTlogger = Logger.getLogger("GTlog");


		public MORule (int IObservationID, int IGraphSideId, boolean IsRHS){
			this.iObservationID=IObservationID;
			this.iGraphSideId=IGraphSideId;
			this.isRHS=IsRHS;
		}


		protected boolean hasMultiObject(){

			// load graph
			this.load();        	        	
			boolean hasMO=false;

			for (int i=0; i<this.gNodes.size()-1; i++){

				GNode node_i = this.gNodes.get(i);        		
				if (!this.isConsiderableNode(node_i)){
					continue;
				}


				// inner loop
				for (int j=i+1; j<this.gNodes.size(); j++){        			
					GNode node_j = this.gNodes.get(j);

					if (!this.isConsiderableNode(node_j)){
						continue;
					}

					if (this.isMatchedObject(node_i, node_j)){
						node_i.isMulti=true;
						node_j.AbstractID="";

						this.replaceSourceTargetEdges(this.edgesSourceIndexes, j, i);
						this.replaceSourceTargetEdges(this.edgesTargetIndexes, j, i);

						hasMO=true;
					}
				}
			}        	
      	
			this.save();

			return hasMO;
		}

		
		private String strSQLtoLoadNodes(){

			if (!this.isRHS){
				return 	"select "
						+ "nodeID,"
						+ "nodeType,"
						+ "minSubGraphID,"
						+ "isMinimal,"
						+ "isInitialized,"
						+ "iDistance,"
						+ "AbstractID,"
						+ "isParameters,"
						+ "isCollection "
						+ "from TblNode "
						+ "where Graph_IDREFF=" + this.iGraphSideId;
			}


			// sql for rhs including first multi nodes from lhs and then other remaining nodes
			return 	"select "
					+ "nodeID,"
					+ "nodeType,"
					+ "minSubGraphID,"
					+ "isMinimal,"
					+ "isInitialized,"
					+ "iDistance,"
					+ "AbstractID,"
					+ "isParameters,"
					+ "isCollection "
					+ "from TblNode "
					+ "where Graph_IDREFF=" + this.iGraphSideId
					+ " and nodeID in ("
					
					+ "		select nodeID from TblNode where AbstractID in ("
					+ "			select TblRuleMoNodes.AbstractID from TblRuleMoNodes "
					+ "			where ruleMo_IDREFF=" + this.iObservationID + 
					" 			and graphType=0 and isMulti=1)) "

					+ "UNION ALL "
		
					+ "select "
					+ "nodeID,"
					+ "nodeType,"
					+ "minSubGraphID,"
					+ "isMinimal,"
					+ "isInitialized,"
					+ "iDistance,"
					+ "AbstractID,"
					+ "isParameters,"
					+ "isCollection "
					+ "from TblNode "
					+ "where Graph_IDREFF=" + this.iGraphSideId
					+ " and nodeID not in ("
					+ "		select nodeID from TblNode where AbstractID in ("
					+ "			select TblRuleMoNodes.AbstractID from TblRuleMoNodes "
					+ "			where ruleMo_IDREFF=" + this.iObservationID 
					+ " 		and graphType=0 and isMulti=1))";
		}

		private void load(){


			this.gNodes = new ArrayList<GNode>();
			this.nodesIndexs = new ArrayList<String>();        	

			// loading by graph id
			CachedRowSetImpl crsNodesEdges= DBRecord.getByQueryStatement(
					this.strSQLtoLoadNodes(), true);


			//**	load nodes 
			try {

				while (crsNodesEdges.next()){    				

					GNode loadNode= new GNode(
							crsNodesEdges.getString(1), 
							crsNodesEdges.getString(2));

					loadNode.iSubGraphID=crsNodesEdges.getInt(3);    				
					loadNode.isMinimal=crsNodesEdges.getBoolean(4);
					loadNode.isInitialized=crsNodesEdges.getBoolean(5);
					loadNode.distance=crsNodesEdges.getInt(6);
					loadNode.AbstractID=crsNodesEdges.getString(7);
					loadNode.isParameters=crsNodesEdges.getBoolean(8);
					loadNode.isCollection=crsNodesEdges.getBoolean(9);


					//** load attributes 				
					CachedRowSetImpl crsNodesAttributes= DBRecord.getByQueryStatement(
							"select AttributeName, AttributeType, generalisedValue "
									+ "from TblNodeAttributes "
									+ "where isObjectRelation=false "
									+ " and isAssignedToParameter=true "
									+ " and Graph_IDREFF=" + this.iGraphSideId
									+ " and node_IDREFF='" + crsNodesEdges.getString(1) + "'"
									+ " order by AttributeName, AttributeType, generalisedValue;", true);

					while (crsNodesAttributes.next()){

						GAttribute loadAttribute = new GAttribute(
								crsNodesAttributes.getString(1),
								crsNodesAttributes.getString(2), "");

						loadAttribute.attGeneralisedValue=crsNodesAttributes.getString(3);
						loadNode.addAttribute(loadAttribute);
					}



					// add node 
					this.addNode(loadNode);		

				}

			} catch (SQLException e) {		
				e.printStackTrace();
			}



			if (this.gNodes.size()<1){
				// no nodes in the loaded graph
				return;
			}





			//**	load edges 
			crsNodesEdges= DBRecord.getByQueryStatement(
					"select "
							+ "AbstractID,"      					
							+ "sourceID,"
							+ "targetID,"
							+ "minSubGraphID,"
							+ "iDistance "
							+ "from TblEdge where Graph_IDREFF=" + this.iGraphSideId, true);

			try {

				while (crsNodesEdges.next()){

					this.addEdge(
							crsNodesEdges.getString(1),   						
							this.getNodeIndex(crsNodesEdges.getString(2)),
							this.getNodeIndex(crsNodesEdges.getString(3)),    						
							crsNodesEdges.getInt(4),
							crsNodesEdges.getInt(5));					
				}

			} catch (SQLException e) {		
				e.printStackTrace();
			}

		}


		private void save(){

			// save nodes in multi-object tables
			for (int iNodeIndex=0; iNodeIndex < this.gNodes.size(); iNodeIndex++){

				GNode saveNode = this.gNodes.get(iNodeIndex);  


				if (saveNode.AbstractID.length()==0){
					continue;
				}


				DBRecord.executeAnySqlStatement(
						"Insert into TblRuleMoNodes "
								+ "(`ruleMo_IDREFF`,`AbstractID`,`graphType`,`isMulti`) "
								+ "VALUES "
								+ "(" + this.iObservationID
								+ " ,'" + saveNode.AbstractID + "'"
								+ " ," + this.isRHS
								+ " ," + saveNode.isMulti + ")", true);        		
			}


			// loop to save edges
			for (int iEdgeIndex=0; iEdgeIndex < this.edgesAbstractIDs.size(); iEdgeIndex++){

				DBRecord.executeAnySqlStatement(
						"Insert IGNORE into TblRuleMoEdge "
								+ "(ruleMo_IDREFF,"
								+ "`graphType`,"       				 
								+ "`abstractID`,"
								+ "`sourceAbstractID`,"
								+ "`targetAbstractID`) "
								+ "VALUES "
								+ "(" + this.iObservationID
								+ " ," + this.isRHS
								+ " ,'" + this.edgesAbstractIDs.get(iEdgeIndex) + "'"			 
								+ " ,'" + this.gNodes.get(this.edgesSourceIndexes.get(iEdgeIndex)).AbstractID + "'"
								+ " ,'" + this.gNodes.get(this.edgesTargetIndexes.get(iEdgeIndex)).AbstractID + "')" 
								, true);        		
			}


		}


		private void addNode(GNode gn){

			this.nodesIndexs.add(gn.nodeID);
			this.gNodes.add(gn);
		}


		private int getNodeIndex(String strNodeID){

			int iNodeIndex = this.nodesIndexs.indexOf(strNodeID);
			if (iNodeIndex<0){
				//this.GTlogger.info("Error: in bulding graph strucutre (getNodeIndex:=-1 for ID: " + strNodeID);
			}        	
			return iNodeIndex;
		}


		private void addEdge(
				String AbstractID,
				int iSourceIndex,
				int iTargetIndex,
				int iSubGraphID,
				int iDistance){

			this.edgesAbstractIDs.add(AbstractID);
			this.edgesSourceIndexes.add(iSourceIndex);
			this.edgesTargetIndexes.add(iTargetIndex);        	                   
			this.edgesSubGraphID.add(iSubGraphID);  
			this.edgesiDistance.add(iDistance);
		}


		private boolean isMatchedObject(GNode node_i, GNode node_j){



			// [1] Check sub-group id
			if (node_i.iSubGraphID != node_j.iSubGraphID){
				return false;
			}




			// [2] Check minimal effect, distance and isInitialized
			if (node_i.isMinimal != node_j.isMinimal ||
				node_i.distance != node_j.distance ||
				node_i.isInitialized != node_j.isInitialized){
				return false;
			}




			// [3] Check type 
			try {
				if (!node_i.nodeType.equals(node_j.nodeType)
						&& DBRecord.getByQueryStatement(
								"select TblNodeType from IMOTempTbl "
										+ "where Observation_IDREFF=" + this.iObservationID 
										+ " and "
										+ "TblNodeType='" + node_i.nodeType + "';", true).next()){

					return false;
				}
			} catch (SQLException e) {
				return false;
			}





			// [4] if nodes have been assigned by any passed parameters
			if (node_i.isParameters && node_j.isParameters){

				if (node_i.gAttribute.size()!=node_j.gAttribute.size()){
					return false;
				}


				for (int iAtt=0; iAtt<node_i.gAttribute.size(); iAtt++){
					if (!node_i.gAttribute.get(iAtt).attGeneralisedValue.equals(
							node_j.gAttribute.get(iAtt).attGeneralisedValue)){
						return false;
					}
				}        		
			}




			// [5]	incoming and outgoing edges
			// 		in both sides, i.e., including share effect in the RHS        	
			if (!this.hasSharedElemetns(node_i, node_j)){        		
				return false;
			}





			return true;
		}


		private boolean isConsiderableNode(GNode checkNode){

			if (!checkNode.isMinimal || 
					checkNode.isCollection ||
					checkNode.isThis ||
					checkNode.isReturn ||    			
					checkNode.AbstractID.length()==0){

				// AbstractID.lenght=0 means the object being deleted 
				return false;
			}

			return true;
		}



		private void replaceSourceTargetEdges(ArrayList<Integer> sourceTargetIndexe, int jOld, int iNew){

			for (int iIndex=0; iIndex<sourceTargetIndexe.size(); iIndex++){

				if (sourceTargetIndexe.get(iIndex)!=jOld){
					continue;
				}        		
				sourceTargetIndexe.set(iIndex, iNew);
			}

		}




		private boolean hasSharedElemetns(GNode node_i, GNode node_j){

	
			try {
				
			// ============================================================ 
			// check matching all edges (incoming/outgoing) in both sides 
			// this would also include checking effect in the opposite graph
			// ----------------------------------------------------------------	
				if (DBRecord.getByQueryStatement(					
						"select * from"
								+ "(	(select CONCAT("
								+ "TE1.sourceTargetType,"
								+ "TE1.isMinimal,"
								+ "TGraph1.graphType) as collectedColumns, count(TE1.AbstractID) as abstractCount"
								+ " from TblEdge AS TE1 inner join TblGraph AS TGraph1"
								+ " ON TE1.Graph_IDREFF = TGraph1.GraphID"
								+ " where TGraph1.Observation_IDREFF=" + this.iObservationID
								+ " and (TE1.sourceID='" + node_i.nodeID + "' or TE1.targetID='" + node_i.nodeID + "')"
								+ " group by collectedColumns) "
								+ "UNION ALL "
								+ "(select CONCAT("
								+ "TE2.sourceTargetType,"
								+ "TE2.isMinimal,"
								+ "TGraph2.graphType) as collectedColumns, count(TE2.AbstractID) as abstractCount"
								+ " from TblEdge AS TE2 inner join TblGraph AS TGraph2"
								+ " ON TE2.Graph_IDREFF = TGraph2.GraphID"									
								+ " where TGraph2.Observation_IDREFF=" + this.iObservationID
								+ " and (TE2.sourceID='" + node_j.nodeID + "' or TE2.targetID='" + node_j.nodeID + "')"																																				
								+ " group by collectedColumns) "
								+ ") as T_MatchedStructure "
								+ "group by "
								+ "T_MatchedStructure.collectedColumns, "							
								+ "T_MatchedStructure.abstractCount "
								+ "HAVING COUNT(*)=1 limit 1;"

						, true).next()){

					return false;
				}
				
				
				
				
				
				
				// check the match of neighbor nodes as a source connection in the same graph
				if (DBRecord.getByQueryStatement(					
						"select * from ("

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE1.nodeID) as abstractCount "
								+ "		from TblNode TE1 "
								+ "		where TE1.Graph_IDREFF =" + this.iGraphSideId
								+ "		and TE1.nodeID in (select TEdge1.targetID from"
								+ "			TblEdge TEdge1 where TEdge1.Graph_IDREFF =" + this.iGraphSideId
								+ "			and TEdge1.sourceID = '" + node_i.nodeID + "')"
								+ "	group by collectedColumns	"
								
								+ "UNION ALL "
																
								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE2.nodeID) as abstractCount "
								+ "		from TblNode TE2 "
								+ "		where TE2.Graph_IDREFF =" + this.iGraphSideId
								+ "		and TE2.nodeID in (select TEdge2.targetID from"
								+ "			TblEdge TEdge2 where TEdge2.Graph_IDREFF =" + this.iGraphSideId
								+ "			and TEdge2.sourceID = '" + node_j.nodeID + "')"
								+ "	group by collectedColumns	"
								
								+ ") as T_NeighborMatchedStructure group by "
								+ "T_NeighborMatchedStructure.collectedColumns, "							
								+ "T_NeighborMatchedStructure.abstractCount "
								+ "HAVING COUNT(*)=1 limit 1;"
						
						, true).next()){

					return false;
				}
				
				
				
				
				
				
				
				
				
				// and then check the match of neighbor nodes as a target connection  in the same graph
				if (DBRecord.getByQueryStatement(					
						"select * from ("

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE1.nodeID) as abstractCount "
								+ "		from TblNode TE1 "
								+ "		where TE1.Graph_IDREFF =" + this.iGraphSideId
								+ "		and TE1.nodeID in (select TEdge1.sourceID from"
								+ "			TblEdge TEdge1 where TEdge1.Graph_IDREFF =" + this.iGraphSideId
								+ "			and TEdge1.targetID = '" + node_i.nodeID + "')"
								+ "	group by collectedColumns	"
								
								+ "UNION ALL "
																
								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE2.nodeID) as abstractCount "
								+ "		from TblNode TE2 "
								+ "		where TE2.Graph_IDREFF =" + this.iGraphSideId
								+ "		and TE2.nodeID in (select TEdge2.sourceID from"
								+ "			TblEdge TEdge2 where TEdge2.Graph_IDREFF =" + this.iGraphSideId
								+ "			and TEdge2.targetID = '" + node_j.nodeID + "')"
								+ "	group by collectedColumns	"
								
								+ ") as T_NeighborMatchedStructure group by "
								+ "T_NeighborMatchedStructure.collectedColumns,"							
								+ "T_NeighborMatchedStructure.abstractCount "
								+ "HAVING COUNT(*)=1 limit 1;"
						
						, true).next()){

					return false;
				}
				
				

				
				// check the neighbor nodes in the other graph
				if (!node_i.isInitialized){

					int iOtherGraphId=this.iGraphSideId;
					if (this.isRHS){
						iOtherGraphId--;
					}
					else {
						iOtherGraphId++;
					}
					




					// check the match of neighbor nodes as a source connection in the other graph
					if (DBRecord.getByQueryStatement(					
							"select * from ("

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE1.nodeID) as abstractCount "
								+ "		from TblNode TE1 "
								+ "		where TE1.Graph_IDREFF =" + iOtherGraphId
								+ "		and TE1.nodeID in (select TEdge1.targetID from"
								+ "			TblEdge TEdge1 where TEdge1.Graph_IDREFF =" + iOtherGraphId
								+ "			and TEdge1.sourceID = '" + node_i.nodeID + "')"
								+ "	group by collectedColumns	"

								+ "UNION ALL "

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE2.nodeID) as abstractCount "
								+ "		from TblNode TE2 "
								+ "		where TE2.Graph_IDREFF =" + iOtherGraphId
								+ "		and TE2.nodeID in (select TEdge2.targetID from"
								+ "			TblEdge TEdge2 where TEdge2.Graph_IDREFF =" + iOtherGraphId
								+ "			and TEdge2.sourceID = '" + node_j.nodeID + "')"
								+ "	group by collectedColumns	"

								+ ") as T_NeighborMatchedStructure group by "
								+ "T_NeighborMatchedStructure.collectedColumns, "							
								+ "T_NeighborMatchedStructure.abstractCount "
								+ "HAVING COUNT(*)=1 limit 1;"

						, true).next()){

						return false;
					}




					// and then check the match of neighbor nodes as a target connection  in the other graph
					if (DBRecord.getByQueryStatement(					
							"select * from ("

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE1.nodeID) as abstractCount "
								+ "		from TblNode TE1 "
								+ "		where TE1.Graph_IDREFF =" + iOtherGraphId
								+ "		and TE1.nodeID in (select TEdge1.sourceID from"
								+ "			TblEdge TEdge1 where TEdge1.Graph_IDREFF =" + iOtherGraphId
								+ "			and TEdge1.targetID = '" + node_i.nodeID + "')"
								+ "	group by collectedColumns	"

								+ "UNION ALL "

								+ " select	CONCAT(nodeType, "
								+ "				isThis, isMinimal, "
								+ "				isRequiredContext, "
								+ "				isInitialized, minSubGraphID, "
								+ "				iDistance) as collectedColumns, "
								+ "			count(TE2.nodeID) as abstractCount "
								+ "		from TblNode TE2 "
								+ "		where TE2.Graph_IDREFF =" + iOtherGraphId
								+ "		and TE2.nodeID in (select TEdge2.sourceID from"
								+ "			TblEdge TEdge2 where TEdge2.Graph_IDREFF =" + iOtherGraphId
								+ "			and TEdge2.targetID = '" + node_j.nodeID + "')"
								+ "	group by collectedColumns	"

								+ ") as T_NeighborMatchedStructure group by "
								+ "T_NeighborMatchedStructure.collectedColumns,"							
								+ "T_NeighborMatchedStructure.abstractCount "
								+ "HAVING COUNT(*)=1 limit 1;"

						, true).next()){

						return false;
					}

				}
				
			}

			catch (SQLException e) {		
				e.printStackTrace();
				return false;
			}

			return true;
		}

	}
	//******************************/
	/* end class MORule*/





	private void setRuleMOClassificationAndAbstract(){

		// get a single rule with multi that still not being classfied in any groupMO ..
		CachedRowSetImpl crsGetSingleRuleInstances= DBRecord.getByQueryStatement(
				"select "
						+ "TblBasicRule.MethodSignatureUniqueID, "
						+ "TblBasicRule.Observation_IDREFF, "
						+ "TblGraph.GraphID "						 
						+ "from TblBasicRule INNER JOIN TblGraph "
						+ "on TblBasicRule.Observation_IDREFF= TblGraph.Observation_IDREFF "
						+ "where TblGraph.graphType=false "
						+ "and TblBasicRule.groupID_MO is null "
						+ "and TblBasicRule.hasMultiObject=true "
						+ "order by TblBasicRule.MethodSignatureUniqueID limit 1;", true);


		try {

			if (crsGetSingleRuleInstances.next()){


				// Break if the same instance being called again ..
				if (this.iObservationId==crsGetSingleRuleInstances.getInt(2)){
					return;
				}




				this.ruleMethodSignatureUniqueID=crsGetSingleRuleInstances.getString(1);
				this.iObservationId=crsGetSingleRuleInstances.getInt(2);				
				this.iLHS=crsGetSingleRuleInstances.getInt(3);				



				// find and set groupID_MO based on structure matching
				// Set single abstract in each group based on maximal number of nodes that (isMulti=true)
				this.findAndSetGroupID_MO();



				// inner loop until classifying all rules with multi
				this.setRuleMOClassificationAndAbstract();
			}


		}
		catch (SQLException e) {		
			e.printStackTrace();
		}

	}



	private void findAndSetGroupID_MO(){



		// group id starts from <<1>> and to be increased
		int groupMO_ID=0; 

		CachedRowSetImpl crsGetGroups= DBRecord.getByQueryStatement(
				"select groupID_MO, Observation_IDREFF "
						+ "from TblBasicRule "
						+ "where isAbstractMO=true "
						+ " and groupID_MO>0 "
						+ " and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "' "
						+ " order by groupID_MO; ", true);

		try {

			while (crsGetGroups.next()){

				groupMO_ID =crsGetGroups.getInt(1);				

				if (this.isRuleMoStructureMatched(crsGetGroups.getInt(2))){

					if (DBRecord.executeSqlStatement(
							"Update TblBasicRule set groupID_MO=" + groupMO_ID
							+ " where Observation_IDREFF=" 
							+ this.iObservationId
							, true)==1){


						// matched with existed group
						System.out.println("\tmulti-object in maximal rule id: " + this.iObservationId + " - defined group_mo id : " + groupMO_ID + "\t ok");
						//this.GTlogger.info("\tmulti-object in maximal rule id: " + this.iObservationId + " - defined group_mo id : " + groupMO_ID + "\t ok");



						// ***************************************************************
						// set [isAbstractMO=true] for rules that contains higher number of nodes [isMulti=true]						
						this.setisAbstractMOForMaximalMultiObjectInRule(crsGetGroups.getInt(2));

						return;

					}
					else {
						//this.GTlogger.info("Error: group_MO id can't be saved ..");
					}
				}

			}

		} catch (SQLException e) {		
			e.printStackTrace();
		}





		//-------------------------------------------------------
		// No group has been found, so we need to define new group
		groupMO_ID++;

		if (DBRecord.executeSqlStatement(
				"Update TblBasicRule set isAbstractMO=true, groupID_MO=" + groupMO_ID
				+ " where Observation_IDREFF=" + this.iObservationId, true)!=1){

			//this.GTlogger.info("Error: group_Mo id can't be generated ..");
		}



		System.out.println("\tmulti-object in maximal rule id: " + this.iObservationId + " - defined group_mo id : " + groupMO_ID + "\t ok");
		//this.GTlogger.info("\tmulti-object in maximal rule id: " + this.iObservationId + " - defined group_mo id : " + groupMO_ID + "\t ok");
	}



	private boolean isRuleMoStructureMatched(int iTargetObservationID){



		try {


			// get target Observation graphs
			int sourceRHS_id, targetLHS_id, targetRHS_id;

			CachedRowSetImpl checkMinimalRule= DBRecord.getByQueryStatement(
					"(select GraphID from TblGraph where graphType=true and Observation_IDREFF=" + this.iObservationId + ") "
							+ "UNION ALL "
							+ "(select GraphID from TblGraph where Observation_IDREFF=" + iTargetObservationID + " order by graphType)"
							, true);

			if (checkMinimalRule.size()!=3){
				return false;
			}
			else {

				checkMinimalRule.next();
				sourceRHS_id = checkMinimalRule.getInt(1);

				checkMinimalRule.next();
				targetLHS_id = checkMinimalRule.getInt(1);

				checkMinimalRule.next();
				targetRHS_id = checkMinimalRule.getInt(1);				
			}




			// [1] ============================================================ 
			// check matching all nodes without (isMulti) in both rules ..
			// ----------------------------------------------------------------		

			if (DBRecord.getByQueryStatement(					
					"select * from "
							+ "(	(select CONCAT("
							+ "TN1.nodeType,"
							+ "TN1.isThis,"
							+ "TN1.isReturn,"
							+ "TN1.isMinimal,"
							+ "TN1.isRequiredContext,"
							+ "TN1.isInitialized,"
							+ "TN1.isCollection,"
							+ "TMO1.graphType) as collectedColumns, count(TN1.AbstractID) as abstractCount"
							+ " from TblNode AS TN1 inner join TblRuleMoNodes AS TMO1"
							+ " ON TN1.AbstractID = TMO1.AbstractID"
							+ " where TN1.Graph_IDREFF in (" + this.iLHS + "," + sourceRHS_id + ")"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TN2.nodeType,"
							+ "TN2.isThis,"
							+ "TN2.isReturn,"
							+ "TN2.isMinimal,"
							+ "TN2.isRequiredContext,"
							+ "TN2.isInitialized,"
							+ "TN2.isCollection,"
							+ "TMO2.graphType) as collectedColumns, count(TN2.AbstractID) as abstractCount"
							+ " from TblNode AS TN2 inner join TblRuleMoNodes AS TMO2"
							+ " ON TN2.AbstractID = TMO2.AbstractID"
							+ " where TN2.Graph_IDREFF in (" + targetLHS_id + "," + targetRHS_id + ")"
							+ " group by collectedColumns) "
							+ ") as T_MatchedStructure "
							+ "group by "
							+ "T_MatchedStructure.collectedColumns,"
							+ "T_MatchedStructure.abstractCount "
							+ "HAVING COUNT(*)=1 limit 1;"

					, true).next()){

				return false;
			}







			// [2] ============================================================ 
			// check matching all edges in both rules ..
			// ----------------------------------------------------------------		

			if (DBRecord.getByQueryStatement(					
					"select * from"
							+ "(	(select CONCAT("
							+ "TE1.sourceTargetType,"
							+ "TE1.isMinimal,"
							+ "TMO1.graphType) as collectedColumns, count(TE1.AbstractID) as abstractCount"
							+ " from TblEdge AS TE1 inner join TblRuleMoEdge AS TMO1"
							+ " ON TE1.AbstractID = TMO1.AbstractID"
							+ " where TE1.Graph_IDREFF in (" + this.iLHS + "," + sourceRHS_id + ")"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TE2.sourceTargetType,"
							+ "TE2.isMinimal,"
							+ "TMO2.graphType) as collectedColumns, count(TE2.AbstractID) as abstractCount"
							+ " from TblEdge AS TE2 inner join TblRuleMoEdge AS TMO2"
							+ " ON TE2.AbstractID = TMO2.AbstractID"
							+ " where TE2.Graph_IDREFF in (" + targetLHS_id + "," + targetRHS_id + ")"
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


		// 100% matched
		return true;
	}



	private void setisAbstractMOForMaximalMultiObjectInRule(int existsRuleObservation_ID){


		// set isAbstractMO for the rule than contains more nodes with [isMulti=true]		
		DBRecord.executeSqlStatement(

				"set @Oid=(select Observation_IDREFF from TblBasicRule inner join TblRuleMoNodes "
						+ "on TblBasicRule.Observation_IDREFF=TblRuleMoNodes.ruleMo_IDREFF "
						+ "where Observation_IDREFF in (" 
						+ existsRuleObservation_ID 
						+ "," 
						+ this.iObservationId + ") "
						+ "and isMulti=true "
						+ "group by Observation_IDREFF "
						+ "order by count(TblRuleMoNodes.AbstractID) DESC, isAbstractMO DESC LIMIT 1);"


				+ "Update TblBasicRule set isAbstractMO=null "
				+ "where Observation_IDREFF in (" 
				+ existsRuleObservation_ID 
				+ ", " 
				+ this.iObservationId + "); "

				+ "Update TblBasicRule set isAbstractMO=true "
				+ " where Observation_IDREFF=@Oid;", true);

	}



















	/**
	 * remove redundant NACs, specified already with the examples
	 * [isApplicable=false, hasEffect=false]
	 * 
	 * TODO ..
	 * 
	 */	

	private void inferNACs(){

				
		DBRecord.executeSqlStatement(
				"DROP TEMPORARY TABLE IF EXISTS NACTempTbl; "

				+ "CREATE TEMPORARY TABLE NACTempTbl "
				+ " select distinct TblBasicRule.Observation_IDREFF "
				+ " from TblBasicRule, TblGraph, TblNode, TblEdge "
				+ " where "
				+ " 	TblBasicRule.Observation_IDREFF = TblGraph.Observation_IDREFF"
				+ "		and TblGraph.GraphID = TblNode.Graph_IDREFF"
				+ "		and TblNode.Graph_IDREFF = TblEdge.Graph_IDREFF"
				+ "		and (userDecision is null or userDecision = false)"
				+ "		and isApplicable = false"
				+ "		and parentRuleId > 0"
				+ "		and hasEffect = false"
				+ "		and graphType=0"
				+ "		group by MethodSignatureUniqueID, nodeType, edgeType"
				+ "		order by objectsCount;"

				+ "Update TblBasicRule set isAbstract=true "
				+ " where Observation_IDREFF in (select Observation_IDREFF from NACTempTbl) "
				+ " and Observation_IDREFF >= 0;"

				+ " DROP TEMPORARY TABLE IF EXISTS NACTempTbl;", true);
		
		/*
		DBRecord.executeSqlStatement(
				"Update TblBasicRule set isAbstract=false, groupID=0 "
						+ " where hasEffect=false and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "'"
						+ " and Observation_IDREFF >= 0; "


				+ "DROP TEMPORARY TABLE IF EXISTS QueryTempTbl; "

				+ "CREATE TEMPORARY TABLE QueryTempTbl "
				+ " select Observation_IDREFF from TblBasicRule "
				+ " where (userDecision is null or userDecision=false)"
				+ " and hasEffect=false"
				+ " and MethodSignatureUniqueID='" + this.ruleMethodSignatureUniqueID + "'"
				+ " and groupID=0 group by objectsCount; "


				+ "Update TblBasicRule set isAbstract=true "
				+ " where Observation_IDREFF in (select Observation_IDREFF from QueryTempTbl) "
				+ " and Observation_IDREFF >= 0;"
				+ " DROP TEMPORARY TABLE IF EXISTS QueryTempTbl;", true);
		
		
		DBRecord.executeAnySqlStatement(
				"DROP TEMPORARY TABLE IF EXISTS QueryTempTbl; "

		+ "CREATE TEMPORARY TABLE QueryTempTbl "


		// this compute all operations that have multiobjects
		+ "select distinct MethodSignatureUniqueID from TblBasicRule"
		+ " where hasMultiObject=true"
		+ " union "


		// and here to compute all operations that have only one kind of effects
		+ "select distinct MethodSignatureUniqueID from TblBasicRule"
		+ " where isAbstract=true"
		+ " group by MethodSignatureUniqueID"
		+ " having count(distinct hasEffect)<2; "


		// setting all empty rule to be not applicable i.e. NAC to the others
		+ "update TblBasicRule "
		+ " set isApplicable=false"
		+ " where (userDecision is null or userDecision=false)"
		+ " and isAbstract=true"
		+ " and hasEffect=false"
		+ " and MethodSignatureUniqueID NOT in "
		+ " (select MethodSignatureUniqueID from QueryTempTbl); "



		// setting all other empty rules to be applicable again
		+ "update TblBasicRule "
		+ " set isApplicable=true"
		+ " where (userDecision is null or userDecision=false)"
		+ " and isAbstract=true"
		+ " and hasEffect=false"
		+ " and MethodSignatureUniqueID in "
		+ " (select MethodSignatureUniqueID from QueryTempTbl);", true);
		 */
	}




}
