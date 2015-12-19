package visualisation;

import inferences.DBRecord;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import com.sun.rowset.CachedRowSetImpl;

public class LhsRhs extends JPanel {

	protected jGraphRule LHS= null;
	protected jGraphRule RHS= null;


	public LhsRhs(){

		JSplitPane splitPanelPairGraphs = new JSplitPane();

		splitPanelPairGraphs.setResizeWeight(0.5); 
		splitPanelPairGraphs.setOneTouchExpandable(true);
		splitPanelPairGraphs.setContinuousLayout(true);		

		this.LHS= new jGraphRule("LHS");
		this.RHS= new jGraphRule("RHS");

		splitPanelPairGraphs.setLeftComponent(LHS);
		splitPanelPairGraphs.setRightComponent(RHS);

		setLayout(new BorderLayout(0, 0));
		add(splitPanelPairGraphs, BorderLayout.CENTER);
	}


	protected void visualiseGraphs(
			int iObservationID,
			boolean isInstance,
			boolean isViewingMinimalRule,
			int ilevelOption,
			boolean isMultiObject){



		int iPreGraphID=-1;
		int iPostGraphID=-1;


		if (iObservationID>0){

			CachedRowSetImpl crsGraphsIDAndRuleName = DBRecord.getByQueryStatement(
					"select graphType, GraphID  "
							+ "from TblGraph  "
							+ "where Observation_IDREFF=" + iObservationID + ";");

			try {

				while (crsGraphsIDAndRuleName.next()){

					if (!crsGraphsIDAndRuleName.getBoolean(1)){						
						iPreGraphID = crsGraphsIDAndRuleName.getInt(2);						
					}
					else{	

						iPostGraphID = crsGraphsIDAndRuleName.getInt(2);
					}
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}




		// check graphs ids
		if (iPreGraphID==-1 || iPostGraphID==-1){
			this.LHS.clearGraph();
			this.RHS.clearGraph();
			return;
		}



		// visualise graphs 
		this.LHS.visualiseGraph(
				iPreGraphID, 
				isInstance, 
				isMultiObject,
				false,
				isViewingMinimalRule, 
				ilevelOption);

		this.RHS.visualiseGraph(
				iPostGraphID, 
				isInstance, 
				isMultiObject,
				true,
				isViewingMinimalRule, 
				ilevelOption);

	}


	protected String getRuleNameWithParameters(int iObservationID){

		if (iObservationID<1){
			return "";
		}

		CachedRowSetImpl crsGraphsIDAndRuleName = DBRecord.getByQueryStatement(
				"select MethodName, RuleParameters "
						+ "from TblObservationOutput "
						+ "where Observation_ID=" + iObservationID + ";");

		try {

			if (crsGraphsIDAndRuleName.next()){

				return crsGraphsIDAndRuleName.getString(1) + " ( "+ crsGraphsIDAndRuleName.getString(2) + " )";						
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		return "";
	}
}
