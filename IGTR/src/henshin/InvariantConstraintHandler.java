package henshin;

import henshin.DBRuleToHenshinRule.MapPair;
import henshin.constraints.DConstraint;
import henshin.constraints.DConstraintFactory;
import henshin.constraints.DOneOf;
import henshin.constraints.DVariable2Variable;
import inferences.DBRecord;
import inferences.GNode;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.henshin.model.Node;

import com.sun.rowset.CachedRowSetImpl;

public class InvariantConstraintHandler {

	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;

	private List<DConstraint> invariantConstraints = new ArrayList<DConstraint>();

	public InvariantConstraintHandler(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
	}

	public void retrieve() {
		System.out.println("Value parameter retrieval...");

		// Load the invariants from DB
		loadInvariantConstraints();

		// Filter irrelevant attribute constraints
		filterConstraints();
		
		System.out.println("Remaining;");
		for (DConstraint c : invariantConstraints) {
			System.out.println("\t" + c);
		}
	}

	private void filterConstraints() {
		System.out.println("Filtering..");
		for (Iterator<DConstraint> iterator = invariantConstraints.iterator(); iterator.hasNext();) {
			DConstraint dConstraint = iterator.next();

			// DOneOf
			if (dConstraint instanceof DOneOf) {
				System.out.println("\t" + dConstraint);
				iterator.remove();
				continue;
			}

			// l.a = r.a with l mapped to r
			if (dConstraint instanceof DVariable2Variable) {
				DVariable2Variable c = (DVariable2Variable) dConstraint;
				if (!c.prefixL.equals(c.prefixR) && c.attributeL.equals(c.attributeR)) {
					GNode gLHS = null;
					GNode gRHS = null;
					if (c.prefixL.equals(DConstraintFactory.PREFIX_PRE)) {
						gLHS = getNodeByID(c.nodeL, false, false);
						gRHS = getNodeByID(c.nodeR, true, false);
					} else {
						gLHS = getNodeByID(c.nodeR, false, false);
						gRHS = getNodeByID(c.nodeL, true, false);
					}
					Node hLHS = dbRule2hRule.getHNode(gLHS, false, false);
					Node hRHS = dbRule2hRule.getHNode(gRHS, true, false);
					assert ((hLHS != null) && (hRHS != null));

					if (HenshinUtil.isMapped(hLHS, hRHS, dbRule2hRule.hRule.getMappings())) {
						System.out.println("\t" + c);
						iterator.remove();
						continue;
					}
				}
			}
		}
	}

	private GNode getNodeByID(String id, boolean isRHS, boolean isMulti){
		MapPair mapPair = dbRule2hRule.getMapPair(ElementKind.NODE, isRHS, isMulti);		
		for (Object o : mapPair.g2h.keySet()) {
			GNode node = (GNode) o;
			if (node.nodeID.equals(id) || node.AbstractID.equals(id)) {
				return node;
			}
		}

		return null;
	}
	
	private void loadInvariantConstraints() {
		int iObservationID = dbRule2hRule.dbRule.observationId;

		// load invariants from DB
		CachedRowSetImpl crsConstants = DBRecord
				.getByQueryStatement("select RuleAttributeConditions from TblObservationOutput "
						+ "where (RuleAttributeConditions is not null or RuleAttributeConditions='') and Observation_ID="
						+ iObservationID + ";");

		try {
			if (crsConstants.next()) {

				char chars[] = crsConstants.getString(1).toCharArray();

				String strLineInvariant = "";
				for (int i = 0; i < chars.length; i++) {

					if (chars[i] == '\n') {

						DConstraint c = DConstraintFactory.createDConstraint(strLineInvariant);
						this.invariantConstraints.add(c);

						strLineInvariant = "";
						continue;
					}

					strLineInvariant += chars[i];
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
