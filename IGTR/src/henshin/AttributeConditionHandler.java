package henshin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterKind;

import com.sun.rowset.CachedRowSetImpl;

import henshin.constraints.DConstraint;
import henshin.constraints.DConstraintFactory;
import henshin.constraints.DConstraintKind;
import henshin.constraints.DOneOf;
import henshin.constraints.DParameter2Parameter;
import henshin.constraints.DReturn;
import henshin.constraints.DVariable2Literal;
import henshin.constraints.DVariable2Parameter;
import henshin.constraints.DVariable2Variable;
import inferences.DBRecord;

public class AttributeConditionHandler {

	private static boolean DEBUG = false;

	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;

	// constraints
	private List<DConstraint> invariantConstraints = new ArrayList<DConstraint>();

	// we count the conditions to give them a generic name
	private int conditionCounter = 1;

	public AttributeConditionHandler(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
	}

	public void createAttributeConditions() {
		System.out.println("Create Attribute Conditions...");

		// Load the constraints from DB
		loadConstraints();

		if (DEBUG) {
			System.out.println("== all constraints");
			for (DConstraint c : invariantConstraints) {
				System.out.println("\t" + c);
			}
		}

		// Filter irrelevant constraints
		filterConstraints();

		if (DEBUG) {
			System.out.println("== filtered constraints");
			for (DConstraint c : invariantConstraints) {
				System.out.println("\t" + c);
			}
		}

		// Handle the remaining constraints
		for (DConstraint c : invariantConstraints) {
			if (c instanceof DVariable2Variable) {
				handleDVariable2Variable((DVariable2Variable) c);
			} else if (c instanceof DVariable2Literal) {
				handleDVariable2Literal((DVariable2Literal) c);
			} else if (c instanceof DVariable2Parameter) {
				handleDVariable2Parameter((DVariable2Parameter) c);
			} else if (c instanceof DParameter2Parameter) {
				handleDParameter2Parameter((DParameter2Parameter) c);
			} else {
				assert (false);
			}
		}

		// sort parameter list (by kind and name)
		sortParameters();
	}

	private void handleDVariable2Variable(DVariable2Variable c) {
		System.out.println("handle: " + c);
		String expr = getStringFromNumeric(c.getLNode().getName()) + "_" + c.attributeL + " == "
				+ getStringFromNumeric(c.getRNode().getName()) + "_" + c.attributeR;

		if (DEBUG) {
			System.out.println(expr);
		}

		lazyCreateAttribute(c.getLNode(), c.getAttributeDeclarationL(),
				getStringFromNumeric(c.getLNode().getName()) + "_" + c.attributeL);
		lazyCreateAttribute(c.getRNode(), c.getAttributeDeclarationR(),
				getStringFromNumeric(c.getRNode().getName()) + "_" + c.attributeR);

		createCondition(expr);
	}

	private void handleDVariable2Literal(DVariable2Literal c) {
		System.out.println("handle: " + c);
		String literalStr = c.literal;
		if (c.getAttributeDeclaration().getEType().equals(EcorePackage.eINSTANCE.getEString())) {
			literalStr = "'" + literalStr + "'";
		}
		String expr = getStringFromNumeric(c.getNode().getName()) + "_" + c.attribute + " == " + literalStr;

		if (DEBUG) {
			System.out.println(expr);
		}

		lazyCreateAttribute(c.getNode(), c.getAttributeDeclaration(),
				getStringFromNumeric(c.getNode().getName()) + "_" + c.attribute);

		createCondition(expr);
	}

	private void handleDVariable2Parameter(DVariable2Parameter c) {
		System.out.println("handle: " + c);
		String expr = getStringFromNumeric(c.getNode().getName()) + "_" + c.attribute + " == " + c.parameter;

		if (DEBUG) {
			System.out.println(expr);
		}

		lazyCreateAttribute(c.getNode(), c.getAttributeDeclaration(),
				getStringFromNumeric(c.getNode().getName()) + "_" + c.attribute);
		lazyCreateParameter(c.parameter);

		createCondition(expr);
	}

	private void handleDParameter2Parameter(DParameter2Parameter c) {
		System.out.println("handle: " + c);
		String expr = c.parameter1 + " == " + c.parameter2;

		if (DEBUG) {
			System.out.println(expr);
		}

		lazyCreateParameter(c.parameter1);
		lazyCreateParameter(c.parameter2);

		createCondition(expr);
	}

	private void createCondition(String expr) {
		AttributeCondition condition = HenshinFactory.eINSTANCE.createAttributeCondition();
		condition.setName("condition_" + ++conditionCounter);
		condition.setConditionText(expr);
		dbRule2hRule.hRule.getAttributeConditions().add(condition);
	}

	private void lazyCreateAttribute(Node node, EAttribute type, String value) {
		// lazy create the attribute
		if (node.getAttribute(type) == null) {
			HenshinFactory.eINSTANCE.createAttribute(node, type, value);

			Node oppositeNode = HenshinUtil.getOppositeNode(node);
			if (oppositeNode != null && oppositeNode.getAttribute(type) == null) {
				HenshinFactory.eINSTANCE.createAttribute(oppositeNode, type, value);
			}
		}

		// and also a paramter serving as internal variable (if needed)
		if (dbRule2hRule.hRule.getParameter(value) == null) {
			Parameter hParam = HenshinFactory.eINSTANCE.createParameter(value);
			hParam.setKind(ParameterKind.VAR);
			dbRule2hRule.hRule.getParameters().add(hParam);
		}
	}

	private void lazyCreateParameter(String p) {
		if (dbRule2hRule.hRule.getParameter(p) == null) {
			Parameter hParam = HenshinFactory.eINSTANCE.createParameter(p);
			hParam.setKind(ParameterKind.IN);
			dbRule2hRule.hRule.getParameters().add(hParam);
		}
	}

	private void sortParameters() {
		ArrayList<Parameter> params = new ArrayList<Parameter>();
		params.addAll(dbRule2hRule.hRule.getParameters());

		Collections.sort(params, new ParameterComparator());

		dbRule2hRule.hRule.getParameters().clear();
		dbRule2hRule.hRule.getParameters().addAll(params);
	}

	private void filterConstraints() {
		// System.out.println("Filtering..");
		for (Iterator<DConstraint> iterator = invariantConstraints.iterator(); iterator.hasNext();) {
			DConstraint dConstraint = iterator.next();

			// DReturn
			if (dConstraint instanceof DReturn) {
				// System.out.println("\t" + dConstraint);
				iterator.remove();
				continue;
			}

			// DOneOf
			if (dConstraint instanceof DOneOf) {
				// System.out.println("\t" + dConstraint);
				iterator.remove();
				continue;
			}

			// Variable2Literal
			if (dConstraint instanceof DVariable2Literal) {
				DVariable2Literal c = (DVariable2Literal) dConstraint;
				if (c.getKind() != DConstraintKind.PRE) {
					// System.out.println("\t" + dConstraint);
					iterator.remove();
					continue;
				}
			}

			// Variable2Variable
			if (dConstraint instanceof DVariable2Variable) {
				DVariable2Variable c = (DVariable2Variable) dConstraint;
				if (c.getKind() != DConstraintKind.PRE_PRE) {
					// System.out.println("\t" + c);
					iterator.remove();
					continue;
				}
			}

			// DVariable2Parameter
			if (dConstraint instanceof DVariable2Parameter) {
				DVariable2Parameter c = (DVariable2Parameter) dConstraint;
				if (c.getKind() != DConstraintKind.PRE) {
					// System.out.println("\t" + c);
					iterator.remove();
					continue;
				}
			}
		}
	}

	private void loadConstraints() {

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
		CachedRowSetImpl crsDroppedNodeIds = DBRecord.getByQueryStatement(
				"select AbstractID from TblGraph " + "inner join TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF "
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

	/**
	 * Seems that Henshin has a problem with parameter names which contain
	 * numbers... (actually JavaScript Engine has the problem)
	 */
	private static String getStringFromNumeric(String s) {
		String res = s;
		res = res.replace("0", "a");
		res = res.replace("1", "b");
		res = res.replace("2", "c");
		res = res.replace("3", "d");
		res = res.replace("4", "e");
		res = res.replace("5", "f");
		res = res.replace("6", "g");
		res = res.replace("7", "h");
		res = res.replace("8", "i");
		res = res.replace("9", "j");

		return res;
	}
}
