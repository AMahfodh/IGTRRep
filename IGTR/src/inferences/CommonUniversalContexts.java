package inferences;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.sun.rowset.CachedRowSetImpl;

public class CommonUniversalContexts {

	
	HashMap<String, ArrayList<Integer>> mapOperationAndMaximalRules =null;
	
	
	public CommonUniversalContexts(){
		
		/*
		 * fill list of operations and their maximal rules 
		 */
		this.fillOperationsListAndTheirMaximalRules();
		
		
		
		
		
		/*
		 * looking for common contexts over a set of maximal rules that belong to a particular operation 
		 */
		for (String strOperation: this.mapOperationAndMaximalRules.keySet()){
			
			ArrayList<Integer> maxRulesIds = this.mapOperationAndMaximalRules.get(strOperation);
			
			if (maxRulesIds.size()<2){
				continue;
			}
			
			this.findCommonContexts(maxRulesIds);
		}
	
		
		
		System.out.println("Inferring common universal contexts elements completed");
	}
	
	
	private void fillOperationsListAndTheirMaximalRules() {
		
		this.mapOperationAndMaximalRules = new HashMap<String, ArrayList<Integer>>();
		
		
		CachedRowSetImpl crsOperationList = DBRecord.getByQueryStatement(
				  "Select MethodSignatureUniqueID, Observation_IDREFF from TblBasicRule "
				+ "where isApplicable=true and hasEffect=true and isAbstract=true and groupID>0 "
				+ "order by MethodSignatureUniqueID, objectsCount;", true);
			

		try {

			while (crsOperationList.next()){

				ArrayList<Integer> maxRulesIDs =null;

				if (this.mapOperationAndMaximalRules.containsKey(crsOperationList.getString(1))){
					maxRulesIDs = this.mapOperationAndMaximalRules.get(crsOperationList.getString(1));
				}
				else {
					maxRulesIDs = new ArrayList<Integer>();
					this.mapOperationAndMaximalRules.put(crsOperationList.getString(1), maxRulesIDs);
				}

				maxRulesIDs.add(crsOperationList.getInt(2));				
			}


		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	

		
	}
	
	
	
	
	private void findCommonContexts(ArrayList<Integer> maxRulesIds){
		
		/*
		 * 
		 * The smallest maximal rule is at index [0] which will be treated as the main
		 * against all the other maximal rules from indexes (i>0)
		 * 
		 */
		
		ArrayList<String> smallestMaxRules = this.getContextElements(maxRulesIds.get(0), false);
		
		if (smallestMaxRules.isEmpty()){
			return;
		}
		
		
		for (String contextElementId: smallestMaxRules){
			
			boolean isElementUniversal=true;
			
			
			for (int i=1; i<maxRulesIds.size(); i++){
				
				if (!this.isIdenticalElementExistInNextMaxRule(contextElementId, maxRulesIds.get(i))){
					isElementUniversal=false;
					break;
				}
			}
						
			
			if (!isElementUniversal){
				this.rollBackAndDeletePreviousMatches(contextElementId);
			}
		}
				
	}
	
	
	private ArrayList<String> getContextElements(int iMaxRuleID, boolean ExcludeCommonContexts){
		
		
		String sqlToExcludeCommonContexts ="";
		if (ExcludeCommonContexts){
			sqlToExcludeCommonContexts=
					"and AbstractID not in (select AbstractIDREFFb as AbstractID"
					+ " from TblCommonUniversalContexts)";
		}
		
		
		CachedRowSetImpl crsContextElements = DBRecord.getByQueryStatement(
				  "Select AbstractID "
				  + " from TblGraph INNER JOIN TblNode ON GraphID=Graph_IDREFF "
				  + " where graphType=false and Observation_IDREFF=" + iMaxRuleID
				  + " and isMinimal=false "
				  + " and (isToBeDeleted is null or isToBeDeleted=false)"
				  + " and (isUnnecessaryContext is null or isUnnecessaryContext=false)"
				  + " " + sqlToExcludeCommonContexts+ ";", true);
			

		ArrayList<String> contextElements = new ArrayList<String> ();
		
		try {

			while (crsContextElements.next()){
				contextElements.add(crsContextElements.getString(1));
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return contextElements;
	}
	
	
	private void rollBackAndDeletePreviousMatches(String contextElementId){
		
		DBRecord.executeSqlStatement(
				"delete from TblCommonUniversalContexts where AbstractIDREFFa ='" + 
				contextElementId + "';", true);
	}
	
	
	
	private boolean isIdenticalElementExistInNextMaxRule(String contextElementId, int iMaxRule){
				
		ArrayList<String> currentMaxRuleElements = this.getContextElements(iMaxRule, true);
				
		for (String currentElement: currentMaxRuleElements){
						
			if (this.isElementIdentical(contextElementId, currentElement)){			
				return true;
			}
		}
				
		return false;
	}
	
	
	
	private boolean isElementIdentical(String strContextElementA, String strContextElementB){
		
		int iGraphA=0, iGraphB=0;
		
		String 
			strElementIDa="-", 
			sTypeA="a", 
			sSuperTypeA="a", 
			strElementIDb="-", 
			sTypeB="b", 
			sSuperTypeB="b";
						
		CachedRowSetImpl crsElementDetails = DBRecord.getByQueryStatement(
				  " Select Graph_IDREFF, nodeID, nodeType, nodeCommonType "
				  + "from TblNode where AbstractID='" + strContextElementA + "' "
				  + "UNION ALL "
				  + "Select Graph_IDREFF, nodeID, nodeType, nodeCommonType "
				  + "from TblNode where AbstractID='" + strContextElementB + "'; ", true);
		
		try {

			
			if (crsElementDetails.next()){
				
				iGraphA=crsElementDetails.getInt(1);
				strElementIDa=crsElementDetails.getString(2);
				sTypeA=crsElementDetails.getString(3); 
				sSuperTypeA=crsElementDetails.getString(4);
			}
			else {
				return false;
			}


			if (crsElementDetails.next()){
				iGraphB=crsElementDetails.getInt(1);
				strElementIDb=crsElementDetails.getString(2);
				sTypeB=crsElementDetails.getString(3); 
				sSuperTypeB=crsElementDetails.getString(4);
			}
			else {
				return false;
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		 * check type first
		 */
		if (!sTypeA.equals(sTypeB) && !sSuperTypeA.equals(sSuperTypeB)){
			return false;
		}
		
		
		/*
		 * and then check all connected edges
		 */
		if (!this.isIncomingAndOutgoingEdgesMatched(
				iGraphA, 
				strElementIDa, 
				iGraphB, 
				strElementIDb)){
			return false;
		}
		
		
		
		DBRecord.executeSqlStatement(
				"update TblNode set isUniversalContext=true "
				+ "where Graph_IDREFF in (" + iGraphA + ", " + (iGraphA+1) + "," + iGraphB + "," + (iGraphB+1) + ") "
				+ "and (nodeID='" + strElementIDa + "' or nodeID='" + strElementIDb + "'); "
				+ "insert into TblCommonUniversalContexts (AbstractIDREFFa, AbstractIDREFFb) values "
				+ "('" + strContextElementA + "', '" + strContextElementB + "');", true);	
		
		
		return true;
	}
	
	
	
	
	private boolean isIncomingAndOutgoingEdgesMatched(
			int iGraphA, 
			String strElementIDa, 
			int iGraphB, 
			String strElementIDb){


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
							+ " where TE1.Graph_IDREFF=" + iGraphA
							+ " and (TE1.sourceID='" + strElementIDa + "' or TE1.targetID='" + strElementIDa + "')"
							+ " group by collectedColumns) "
							+ "UNION ALL "
							+ "(select CONCAT("
							+ "TE2.sourceTargetType,"
							+ "TE2.isMinimal) as collectedColumns, count(TE2.AbstractID) as abstractCount"
							+ " from TblEdge AS TE2 "								
							+ " where TE2.Graph_IDREFF=" + iGraphB
							+ " and (TE2.sourceID='" + strElementIDb + "' or TE2.targetID='" + strElementIDb + "')"																																				
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

	
}
