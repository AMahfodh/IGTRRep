package henshin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.henshin.model.Node;

import com.sun.rowset.CachedRowSetImpl;

import emf.util.EMFMetaUtil;
import henshin.constraints.DConstraint;
import henshin.constraints.DConstraintFactory;
import henshin.constraints.DConstraintKind;
import henshin.constraints.DOneOf;
import henshin.constraints.DVariable2Literal;
import henshin.constraints.DVariable2Variable;
import inferences.DBRecord;
import inferences.GAttribute;
import inferences.GNode;

public class InvariantConstraintHandler {

	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;

	// invariant constraints
	private List<DConstraint> invariantConstraints = new ArrayList<DConstraint>();

	private List<DConstraint> preLiteralConstraints = new ArrayList<DConstraint>();
	private List<DConstraint> setLiteralConstraints = new ArrayList<DConstraint>();
	private List<DConstraint> setDeriveConstraints = new ArrayList<DConstraint>();

	//
	private Map<Node, List<EAttribute>> unchangedAttributeCandidates = new HashMap<Node, List<EAttribute>>();
	private Map<Node, List<EAttribute>> changedAttributeCandidates = new HashMap<Node, List<EAttribute>>();
	private Map<Node, List<EAttribute>> setAttributeCandidates = new HashMap<Node, List<EAttribute>>();

	public InvariantConstraintHandler(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
	}

	public void retrieve() {
		System.out.println("Value parameter retrieval...");

		// Load the invariants from DB
		loadInvariantConstraints();

		System.out.println("== allInvariants");
		for (DConstraint c : invariantConstraints) {
			System.out.println("\t" + c);
		}

		// Filter irrelevant attribute constraints
		filterConstraints();

		// Collect attribute candidates
		collectAttributeCandidates();

		// Process unchanged candidates
		processUnchangedCandidates();

		// Process changed candidates
		processSetCandidates(changedAttributeCandidates);

		// Process set candidates
		processSetCandidates(setAttributeCandidates);

		System.out.println("== preLiteralConstraints");
		for (DConstraint c : preLiteralConstraints) {
			System.out.println("\t" + c);
		}
		System.out.println("== setLiteralConstraints");
		for (DConstraint c : setLiteralConstraints) {
			System.out.println("\t" + c);
		}
		System.out.println("== setDeriveConstraints");
		for (DConstraint c : setDeriveConstraints) {
			System.out.println("\t" + c);
		}
	}

	private void processSetCandidates(Map<Node, List<EAttribute>> setCandidates) {
		for (Node node : setCandidates.keySet()) {
			for (EAttribute attribute : setCandidates.get(node)) {
				// Literal?
				DVariable2Literal c = isLiteral(node, attribute);
				if (c != null) {
					invariantConstraints.remove(c);
					if (HenshinUtil.isDefaultValue(node, attribute.getName(), c.literal)) {
						// ignore
						System.out.println("Ignore setting default literal: " + node + " " + attribute);
					} else {
						setLiteralConstraints.add(c);
					}

					continue;
				}

				// Any other expressions?
				List<DConstraint> constraints = getExpressionsOver(node, attribute);
				if (!constraints.isEmpty()) {
					setDeriveConstraints.addAll(constraints);
					continue;
				}

				// Nothing, so its a parameter
				System.out.println("Parameter: " + node + " " + attribute);
				System.out.println("");
			}
		}
	}

	private void processUnchangedCandidates() {
		for (Node node : unchangedAttributeCandidates.keySet()) {
			for (EAttribute attribute : unchangedAttributeCandidates.get(node)) {
				DVariable2Literal c = isLiteral(node, attribute);
				if (c != null) {
					invariantConstraints.remove(c);
					if (HenshinUtil.isDefaultValue(node, attribute.getName(), c.literal)) {
						// ignore
					} else {
						preLiteralConstraints.add(c);
					}
				}
			}
		}
	}

	private void collectAttributeCandidates() {
		// delete nodes
		for (Node node : HenshinUtil.getLHSMinusRHSNodes(dbRule2hRule.hRule)) {
			unchangedAttributeCandidates.put(node, new ArrayList<EAttribute>());
			for (EAttribute a : node.getType().getEAllAttributes()) {
				if (!doConsider(node, a, false)) {
					continue;
				}
				unchangedAttributeCandidates.get(node).add(a);
			}
		}

		// create nodes
		for (Node node : HenshinUtil.getRHSMinusLHSNodes(dbRule2hRule.hRule)) {
			setAttributeCandidates.put(node, new ArrayList<EAttribute>());
			for (EAttribute a : node.getType().getEAllAttributes()) {
				if (!doConsider(node, a, true)) {
					continue;
				}
				setAttributeCandidates.get(node).add(a);
			}
		}

		// preserve nodes
		for (Node node : HenshinUtil.getLHSIntersectRHSNodes(dbRule2hRule.hRule)) {
			for (EAttribute a : node.getType().getEAllAttributes()) {
				if (!doConsider(node, a, false)) {
					continue;
				}

				// L.a = R.a?
				DVariable2Variable c = isLEqualR(node, a);
				if (c != null) {
					if (!unchangedAttributeCandidates.containsKey(node)) {
						unchangedAttributeCandidates.put(node, new ArrayList<EAttribute>());
					}
					unchangedAttributeCandidates.get(node).add(a);
					invariantConstraints.remove(c);
				} else {
					if (!changedAttributeCandidates.containsKey(node)) {
						changedAttributeCandidates.put(node, new ArrayList<EAttribute>());
					}
					changedAttributeCandidates.get(node).add(a);
				}
			}
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

			// // Variable2Literal
			// if (dConstraint instanceof DVariable2Literal) {
			// DVariable2Literal c = (DVariable2Literal) dConstraint;
			//
			// switch (c.getKind()) {
			// case PRE:
			// if (HenshinUtil.isDefaultValue(c.getNode(), c.attribute,
			// c.literal)) {
			// System.out.println("\tPRE::DEFAULT " + c);
			// iterator.remove();
			// continue;
			// }
			//
			// break;
			//
			// case POST:
			// Node hRHS = c.getNode();
			// if (HenshinUtil.isCreationNode(hRHS) &&
			// HenshinUtil.isDefaultValue(hRHS, c.attribute, c.literal)) {
			// System.out.println("\tPOST::CREATE::DEFAULT " + c);
			// iterator.remove();
			// continue;
			// }
			//
			// break;
			// }
			// }

			// Variable2Variable
			if (dConstraint instanceof DVariable2Variable) {
				DVariable2Variable c = (DVariable2Variable) dConstraint;

				switch (c.getKind()) {
				case PRE_PRE:
					break;

				case POST_POST:
					System.out.println("\t" + c);
					iterator.remove();
					continue;

				case PRE_POST:
					// // l.a = r.a with l mapped to r
					// if (!c.prefixL.equals(c.prefixR) &&
					// c.attributeL.equals(c.attributeR)) {
					// if (HenshinUtil.isMapped(c.getLNode(), c.getRNode(),
					// dbRule2hRule.hRule.getMappings())) {
					// System.out.println("\t" + c);
					// iterator.remove();
					// continue;
					// }
					// }

					break;
				}
			}
		}
	}

	private List<DConstraint> getExpressionsOver(Node node, EAttribute attribute) {
		List<DConstraint> res = new ArrayList<DConstraint>();
		for (Iterator<DConstraint> iterator = invariantConstraints.iterator(); iterator.hasNext();) {
			DConstraint dConstraint = iterator.next();

			if (dConstraint instanceof DVariable2Literal) {
				DVariable2Literal c = (DVariable2Literal) dConstraint;
				if ((c.getNode() == node) && (c.getAttributeDeclaration() == attribute)) {
					res.add(c);
				}
			}
		}

		return res;
	}

	private DVariable2Literal isLiteral(Node node, EAttribute attribute) {
		for (Iterator<DConstraint> iterator = invariantConstraints.iterator(); iterator.hasNext();) {
			DConstraint dConstraint = iterator.next();
			if (dConstraint instanceof DVariable2Literal) {
				DVariable2Literal c = (DVariable2Literal) dConstraint;
				if ((c.getNode() == node) && (c.getAttributeDeclaration() == attribute)) {
					return c;
				}
			}
		}

		return null;
	}

	private DVariable2Variable isLEqualR(Node lhsNode, EAttribute attribute) {
		for (Iterator<DConstraint> iterator = invariantConstraints.iterator(); iterator.hasNext();) {
			DConstraint dConstraint = iterator.next();
			if (dConstraint instanceof DVariable2Variable) {
				DVariable2Variable c = (DVariable2Variable) dConstraint;
				if (c.getKind().equals(DConstraintKind.PRE_POST)) {
					if (c.attributeL.equals(c.attributeR)
							&& HenshinUtil.isMapped(c.getLNode(), c.getRNode(), dbRule2hRule.hRule.getMappings())) {

						if ((c.getLNode() == lhsNode) && (c.getAttributeDeclarationL() == attribute)) {
							return c;
						}
						if ((c.getRNode() == lhsNode) && (c.getAttributeDeclarationR() == attribute)) {
							return c;
						}
					}
				}
			}
		}

		return null;
	}

	private boolean doConsider(Node hNode, EAttribute attribute, boolean isRHS) {
		if (EMFMetaUtil.isUnconsideredStructualFeature(attribute)) {
			return false;
		}

		GNode gNode = dbRule2hRule.getGNode(hNode, isRHS, false);
		for (GAttribute gAttribute : gNode.gAttribute) {
			if (gAttribute.attName.equals(attribute.getName())) {
				return true;
			}
		}

		return false;
	}

	private void loadInvariantConstraints() {

		int iObservationID = dbRule2hRule.dbRule.observationId;

		// to collect all removed nodes when constructing multi objects
		ArrayList<String> droppedNodes = null;
		if (this.dbRule2hRule.dbRule.isMulti) {
			droppedNodes = this.getDroppedNodes();
		}

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

						strLineInvariant = strFirstFilter(strLineInvariant, droppedNodes);

						if (strLineInvariant.length() != 0) {
							DConstraint c = DConstraintFactory.createDConstraint(strLineInvariant, dbRule2hRule);
							this.invariantConstraints.add(c);
						}

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

	private String strFirstFilter(String strConstraint, ArrayList<String> droppedNodes) {

		if (!this.dbRule2hRule.dbRule.isMulti) {

			// TODO strConstraint = strConstraint.trim().replace("Pre_",
			// "").replace("Post_", "");
			return strConstraint;
		}

		/*
		 * for rules with multi object, we need to check that the dropped nodes
		 * do not exists in the derived constraints ..
		 */
		for (String droppedNodeID : droppedNodes) {
			if (strConstraint.contains(droppedNodeID)) {
				return "";
			}
		}
		return strConstraint;
	}

	private ArrayList<String> getDroppedNodes() {

		ArrayList<String> droppedNodes = new ArrayList<String>();

		// load list of dropped (abstract ids) nodes...
		CachedRowSetImpl crsDroppedNodeIds = DBRecord.getByQueryStatement("select AbstractID from TblGraph "
				+ "inner join TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF "
				+ "where AbstractID not in (select AbstractID from TblRuleMoNodes where " + "ruleMo_IDREFF="
				+ this.dbRule2hRule.dbRule.observationId + ") and " + "Observation_IDREFF="
				+ this.dbRule2hRule.dbRule.observationId + ";");

		try {

			while (crsDroppedNodeIds.next()) {
				droppedNodes.add(crsDroppedNodeIds.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return droppedNodes;
	}
}
