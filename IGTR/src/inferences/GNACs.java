package inferences;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.rowset.CachedRowSetImpl;

public class GNACs {

	// maximal rule or rule with MO
	private int iRuleID=0; 
	
	// list of NACs
	public ArrayList<NACinstance> NACs=new ArrayList<NACinstance>();

	
	// load ids only with constructor 
	public GNACs(int IRuleID){
		
		this.iRuleID= IRuleID;

		// load list ides ...		
		CachedRowSetImpl crsNACsIDS = DBRecord
				.getByQueryStatement(
						"select TBasicRule.Observation_IDREFF as NACid, GraphID "
								+ "from TblBasicRule TBasicRule INNER join TblGraph "
								+ "on TBasicRule.Observation_IDREFF=TblGraph.Observation_IDREFF "
								+ "where graphType=0 and parentRuleId in "
								+ "		(select Observation_IDREFF from TblBasicRule "
								+ "			where isApplicable=true "
								+ "			and groupID>0 "
								+ "			and concat(MethodSignatureUniqueID, groupID) in "
								+ "			(select concat(MethodSignatureUniqueID, groupID) "
								+ "			from TblBasicRule where Observation_IDREFF=" + this.iRuleID + "));");

		try {

			while (crsNACsIDS.next()) {
				this.NACs.add(
						new NACinstance(
								crsNACsIDS.getInt(1),
								crsNACsIDS.getInt(2)));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	
	
	
	
	public class NACinstance {

		private int iNAC_Observationid=0;
		private int iNAC_Graphid=0;

		
		public NACinstance(int INAC_id, int INAC_Graphid){
			this.iNAC_Observationid=INAC_id;
			this.iNAC_Graphid=INAC_Graphid;
		}
		
		
		public int getNACGraphID(){
			return this.iNAC_Graphid;
		}
		
		
		public int getNACInstanceID(){
			return this.iNAC_Observationid;
		}
		
		
		public GraphT getPreNAC (){

			// load graph			
			return new GraphT(iNAC_Graphid, true, false, true);
		}
		
		
		public ArrayList<String> getAttributesConstraints (){
			
			ArrayList<String> strAttributesConstraints = new ArrayList<String>();
			
			// load constraints ..
			CachedRowSetImpl crsConstants = DBRecord.getByQueryStatement(
					"select RuleAttributeConditions from TblObservationOutput "
					+ "where (RuleAttributeConditions is not null or RuleAttributeConditions='') "
					+ "and Observation_ID=" + this.iNAC_Observationid + ";");

			try {

				if (crsConstants.next()) {

					char chars[] = crsConstants.getString(1).toCharArray();

					String strLineInvariant = "";
					for (int i = 0; i < chars.length; i++) {

						if (chars[i] == '\n') {

							strLineInvariant = strLineInvariant.trim().replace("Pre_", "").replace("Post_", "");
							strAttributesConstraints.add(strLineInvariant);
							strLineInvariant = "";
							continue;
						}

						strLineInvariant += chars[i];
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return strAttributesConstraints;
		}
	}
}
