package henshin;

import inferences.DBRecord;
import inferences.GAttribute;
import inferences.GEdge;
import inferences.GNode;
import inferences.GraphT;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

import com.sun.rowset.CachedRowSetImpl;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;

/**
 * Transforms a DBRule to a Henshin rule.
 * 
 * @author kehrer
 */
public class DBRuleToHenshinRule {

	// The Henshin factory
	private HenshinFactory hFactory = HenshinFactory.eINSTANCE;

	// Domain info
	private String modelType = "ecore";
	private IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration(modelType);

	// HenshinRule
	private Rule hRule;

	// Mappings
	private Map<GraphT, Graph> lhsGraph_2_hLhsGraph = new HashMap<GraphT, Graph>();
	private Map<GraphT, GraphT> hLhsGraph_2_lhsGraph = new HashMap<GraphT, GraphT>();
	private Map<GraphT, Graph> rhsGraph_2_hRhsGraph = new HashMap<GraphT, Graph>();
	private Map<GraphT, GraphT> hRhsGraph_2_rhsGraph = new HashMap<GraphT, GraphT>();

	private Map<GNode, Node> lhsNode_2_hLhsNode = new HashMap<GNode, Node>();
	private Map<Node, GNode> hLhsNode_2_lhsNode = new HashMap<Node, GNode>();
	private Map<GNode, Node> rhsNode_2_hRhsNode = new HashMap<GNode, Node>();
	private Map<Node, GNode> hRhsNode_2_rhsNode = new HashMap<Node, GNode>();

	private Map<GEdge, Edge> lhsEdge_2_hLhsEdge = new HashMap<GEdge, Edge>();
	private Map<Edge, GEdge> hLhsEdge_2_lhsEdge = new HashMap<Edge, GEdge>();
	private Map<GEdge, Edge> rhsEdge_2_hRhsEdge = new HashMap<GEdge, Edge>();
	private Map<Edge, GEdge> hRhsEdge_2_rhsEdge = new HashMap<Edge, GEdge>();

	private Map<GAttribute, Attribute> lhsAttribute_2_hLhsAttribute = new HashMap<GAttribute, Attribute>();
	private Map<Attribute, GAttribute> hLhsAttribute_2_lhsAttribute = new HashMap<Attribute, GAttribute>();
	private Map<GAttribute, Attribute> rhsAttribute_2_hRhsAttribute = new HashMap<GAttribute, Attribute>();
	private Map<Attribute, GAttribute> hRhsAttribute_2_rhsAttribute = new HashMap<Attribute, GAttribute>();

	// ================================================================================

	// private ArrayList<String> listInvariantConstraints = new
	// ArrayList<String>();
	// private Set<String> setInvConstraintsAsParameters = new
	// HashSet<String>();
	// private String charSeparator = String.valueOf(((char) 007));

	public Rule transform(DBRule dbRule) {
		System.out.println("Transforming: " + dbRule);

		this.hRule = hFactory.createRule(dbRule.name);

		// Print parameters and also generate required ones based on
		// inferred
		// invariants
		// TODO
		// this.printRuleParameters(dbRule.observationId);

		int iLHSGraphID = -1;
		int iRHSGraphID = -1;
		CachedRowSetImpl crsGraphsIDAndRuleName = DBRecord
				.getByQueryStatement("select graphType, GraphID  from TblGraph  " + "where Observation_IDREFF="
						+ dbRule.observationId + ";");

		try {
			while (crsGraphsIDAndRuleName.next()) {
				if (!crsGraphsIDAndRuleName.getBoolean(1)) {
					iLHSGraphID = crsGraphsIDAndRuleName.getInt(2);
				} else {
					iRHSGraphID = crsGraphsIDAndRuleName.getInt(2);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (!dbRule.isMulti) {
			// LHS graph
			GraphT lhs = new GraphT(iLHSGraphID, true, false, true);
			Graph hLhs = transformGraph(lhs, false);
			putToMappings(lhs, hLhs, lhsGraph_2_hLhsGraph, hLhsGraph_2_lhsGraph);

			// RHS graph
			GraphT rhs = new GraphT(iRHSGraphID, true, false, true);
			Graph hRhs = transformGraph(rhs, true);
			putToMappings(rhs, hRhs, rhsGraph_2_hRhsGraph, hRhsGraph_2_rhsGraph);

			// Mappings LHS -> RHS
			transformLhs2RhsMappings(lhs, rhs);
			
			// Construct rule
			hRule.setLhs(hLhs);
			hRule.setRhs(hRhs);

		} else {
			// for node with MO
			GraphT graphWithMo = new GraphT();

			// loading lhs graph
			graphWithMo.graphID = iLHSGraphID;
			graphWithMo.graphType = 0;
			graphWithMo.LoadMultiObjects(false, true);
			this.transformGraph(graphWithMo, false);

			// loading rhs graph
			graphWithMo = new GraphT();
			graphWithMo.graphID = iRHSGraphID;
			graphWithMo.graphType = 1;
			graphWithMo.LoadMultiObjects(false, true);
			this.transformGraph(graphWithMo, true);
		}

		return this.hRule;
	}

	private Graph transformGraph(GraphT graph, boolean isRHS) {
		System.out.println("Transform Graph: " + HenshinUtil.getGraphName(isRHS));
		graph.printGraph();

		Graph hGraph = hFactory.createGraph(HenshinUtil.getGraphName(isRHS));

		// Create Henshin nodes
		for (GNode node : graph.gNodes) {
			Node hNode = hFactory.createNode(hGraph, domainConfig.deriveNodeType(node.nodeType), node.nodeID);
			hNode.setName(node.nodeID);
			
			// Put to mappings
			if (isRHS) {
				putToMappings(node, hNode, rhsNode_2_hRhsNode, hRhsNode_2_rhsNode);
			} else {
				putToMappings(node, hNode, lhsNode_2_hLhsNode, hLhsNode_2_lhsNode);
			}

			// Transform attributes
			transformAttributes(node, isRHS);
		}

		// Create Henshin Edges
		for (GEdge edge : graph.gEdges) {
			GNode srcNode = getNodeByID(edge.sourceID, isRHS);
			GNode tgtNode = getNodeByID(edge.targetID, isRHS);
			Node hSrcNode = getHNode(srcNode);
			Node hTgtNode = getHNode(tgtNode);

			Edge hEdge = hFactory.createEdge(hSrcNode, hTgtNode,
					domainConfig.deriveEdgeType(hSrcNode.getType(), edge.edgeType));

			// Put to mappings
			if (isRHS) {
				putToMappings(edge, hEdge, rhsEdge_2_hRhsEdge, hRhsEdge_2_rhsEdge);
			} else {
				putToMappings(edge, hEdge, lhsEdge_2_hLhsEdge, hLhsEdge_2_lhsEdge);
			}
		}

		return hGraph;
	}

	private void transformAttributes(GNode node, boolean isRHS) {
		Node hNode = getHNode(node);

		for (GAttribute attribute : node.gAttribute) {
			// Exclude ref attributes
			if (attribute.attIsObjectRelation) {
				continue;
			}

			// Create attribute
			Attribute hAttribute = hFactory.createAttribute(hNode,
					domainConfig.deriveAttributeType(hNode.getType(), attribute.attName), attribute.attName);

			// Put to mappings
			if (isRHS) {
				putToMappings(attribute, hAttribute, rhsAttribute_2_hRhsAttribute, hRhsAttribute_2_rhsAttribute);
			} else {
				putToMappings(attribute, hAttribute, lhsAttribute_2_hLhsAttribute, hLhsAttribute_2_lhsAttribute);
			}
		}
	}

	private void transformLhs2RhsMappings(GraphT lhs, GraphT rhs) {
		// Iterate over LHS nodes and checker whether we have corresponding RHS
		// node
		for (GNode lhsNode : lhs.gNodes) {
			GNode rhsNode = getNodeByID(lhsNode.nodeID, true);
			if (rhsNode != null) {
				// Create Mapping
				Node hLhsNode = getHNode(lhsNode);
				Node hRhsNode = getHNode(rhsNode);
				Mapping mapping = hFactory.createMapping(hLhsNode, hRhsNode);
				hRule.getMappings().add(mapping);
			}
		}
	}

	private void putToMappings(Object gElement, EObject hElement, Map g2h, Map h2g) {
		g2h.put(gElement, hElement);
		h2g.put(hElement, gElement);
	}

	private GNode getNodeByID(String id, boolean isRHS) {
		if (isRHS) {
			for (GNode node : rhsNode_2_hRhsNode.keySet()) {
				if (node.nodeID.equals(id)) {
					return node;
				}
			}
		} else {
			for (GNode node : lhsNode_2_hLhsNode.keySet()) {
				if (node.nodeID.equals(id)) {
					return node;
				}
			}
		}

		return null;
	}

	private Node getHNode(GNode node) {
		if (lhsNode_2_hLhsNode.containsKey(node)) {
			return lhsNode_2_hLhsNode.get(node);
		} else {
			return rhsNode_2_hRhsNode.get(node);
		}
	}

	// private void printRuleParameters(int iObservation) {
	//
	// // currently I didn't consider data (parameters/attributes) conditions
	// // on rule with multi objects
	// if (this.printingRuleWithMultiObjects) {
	// return;
	// }
	//
	// System.out.println("\t printing rule parameters ..");
	//
	// this.loadInvariantConstraints(iObservation);
	//
	// String[] listOfParameters = null;
	// CachedRowSetImpl crsRuleParameters = DBRecord
	// .getByQueryStatement("select RuleParameters from TblObservationOutput  "
	// + "where Observation_ID="
	// + iObservation + " and RuleParameters <>'';");
	//
	// try {
	// if (crsRuleParameters.next()) {
	// listOfParameters =
	// crsRuleParameters.getString(1).split(this.charSeparator);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	//
	// if (listOfParameters == null) {
	// return;
	// }
	//
	// int i = 0;
	// for (i = 0; i < listOfParameters.length; i++) {
	//
	// int iEqualIndex = listOfParameters[i].indexOf("=");
	//
	// if (iEqualIndex == -1 ||
	// listOfParameters[i].toLowerCase().contains("return")) {
	// continue;
	// }
	//
	// String[] par = listOfParameters[i].substring(0,
	// iEqualIndex).trim().split(" ");
	//
	// if (par.length != 2) {
	// System.out.println("\t\tSkipping parameter " + listOfParameters[i]);
	// continue;
	// }
	//
	// // par[0] type, par[1] name and par[2] is value
	// this.henshinWriter.write("	<parameters xmi:id=\"_XF7_P" + i + "" +
	// iObservation + "" + this.encryptedXmiId
	// + "\" name=\"" + par[1] + "\"/>" + System.lineSeparator());
	// }
	//
	// // add extra parameters as variables
	// for (String extraParameters : this.setInvConstraintsAsParameters) {
	//
	// this.henshinWriter.write("	<parameters xmi:id=\"_XF7_P" + (++i) + "" +
	// iObservation + ""
	// + this.encryptedXmiId + "\" name=\"" + extraParameters + "\"/>" +
	// System.lineSeparator());
	//
	// // String strEDataType="EString";
	// // if ("EString EInt".contains(strEDataType)){
	// //
	// this.henshinWriter.write("		<type xsi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//"
	// // + strEDataType + "\"/>" + System.lineSeparator());
	// // }
	// // this.henshinWriter.write("	</parameters>" +
	// // System.lineSeparator());
	// }
	// }

	// private void loadInvariantConstraints(int iObservationID) {
	//
	// // clear current set/list of invariants
	// this.setInvConstraintsAsParameters.clear();
	// this.listInvariantConstraints.clear();
	//
	// // load invariants from DB
	// System.out.println("\t load constraints for [" + iObservationID + "]..");
	// CachedRowSetImpl crsConstants = DBRecord
	// .getByQueryStatement("select RuleAttributeConditions from TblObservationOutput "
	// +
	// "where (RuleAttributeConditions is not null or RuleAttributeConditions='') and Observation_ID="
	// + iObservationID + ";");
	//
	// try {
	// if (crsConstants.next()) {
	//
	// char chars[] = crsConstants.getString(1).toCharArray();
	//
	// String strLineInvariant = "";
	// for (int i = 0; i < chars.length; i++) {
	//
	// if (chars[i] == '\n') {
	//
	// this.addInvariantToCurrentSet(strLineInvariant);
	// strLineInvariant = "";
	// continue;
	// }
	//
	// strLineInvariant += chars[i];
	// }
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }

	// private void addInvariantToCurrentSet(String strLineInvariant) {
	//
	// strLineInvariant = strLineInvariant.trim().replace("Pre_",
	// "").replace("Post_", "");
	// this.listInvariantConstraints.add(strLineInvariant);
	//
	// // extracting left variable
	// int iSpaceIndex = strLineInvariant.indexOf(" ");
	//
	// if (iSpaceIndex == -1) {
	// return;
	// }
	//
	// String leftVar = strLineInvariant.substring(0, iSpaceIndex);
	// if (leftVar.startsWith("N") && (leftVar.contains("L_") ||
	// leftVar.contains("R_"))) {
	//
	// this.setInvConstraintsAsParameters.add(leftVar);
	// }
	//
	// // and here for the right variable
	// iSpaceIndex = strLineInvariant.lastIndexOf(" ") + 1;
	// if (iSpaceIndex > 4 && iSpaceIndex < strLineInvariant.length()) {
	//
	// strLineInvariant = strLineInvariant.substring(iSpaceIndex);
	//
	// if (strLineInvariant.startsWith("N")
	// && (strLineInvariant.contains("L_") || strLineInvariant.contains("R_")))
	// {
	// this.setInvConstraintsAsParameters.add(strLineInvariant);
	// }
	// }
	// }

	// private void printInvariantConstants() {
	//
	// // no data conditions on rule with multi objects
	// if (this.printingRuleWithMultiObjects) {
	// return;
	// }
	//
	// int iInv = 0;
	// for (String strInv : listInvariantConstraints) {
	// this.henshinWriter.write("<attributeConditions xmi:id=\"_inv" + (iInv++)
	// + this.encryptedXmiId + "\""
	// + " name=\"InvCondition" + iInv + "\" conditionText=\"" +
	// strInv.replace("\"", "&quot;") + "\"/>"
	// + System.lineSeparator());
	// }
	// }

}
