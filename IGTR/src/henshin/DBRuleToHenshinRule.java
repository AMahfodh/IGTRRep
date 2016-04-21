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
	HenshinFactory hFactory = HenshinFactory.eINSTANCE;

	// Domain info
	String modelType = "ecore";
	IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration(modelType);

	// The rules
	DBRule dbRule;
	Rule hRule;

	// Mappings
	@SuppressWarnings("unused")
	private Map<GraphT, Graph> lhsGraph_2_hLhsGraph = new HashMap<GraphT, Graph>();
	@SuppressWarnings("unused")
	private Map<GraphT, GraphT> hLhsGraph_2_lhsGraph = new HashMap<GraphT, GraphT>();
	@SuppressWarnings("unused")
	private Map<GraphT, Graph> rhsGraph_2_hRhsGraph = new HashMap<GraphT, Graph>();
	@SuppressWarnings("unused")
	private Map<GraphT, GraphT> hRhsGraph_2_rhsGraph = new HashMap<GraphT, GraphT>();

	@SuppressWarnings("unused")
	private Map<GraphT, Graph> m_lhsGraph_2_hLhsGraph = new HashMap<GraphT, Graph>();
	@SuppressWarnings("unused")
	private Map<GraphT, GraphT> m_hLhsGraph_2_lhsGraph = new HashMap<GraphT, GraphT>();
	@SuppressWarnings("unused")
	private Map<GraphT, Graph> m_rhsGraph_2_hRhsGraph = new HashMap<GraphT, Graph>();
	@SuppressWarnings("unused")
	private Map<GraphT, GraphT> m_hRhsGraph_2_rhsGraph = new HashMap<GraphT, GraphT>();

	@SuppressWarnings("unused")
	private Map<GNode, Node> lhsNode_2_hLhsNode = new HashMap<GNode, Node>();
	@SuppressWarnings("unused")
	private Map<Node, GNode> hLhsNode_2_lhsNode = new HashMap<Node, GNode>();
	@SuppressWarnings("unused")
	private Map<GNode, Node> rhsNode_2_hRhsNode = new HashMap<GNode, Node>();
	@SuppressWarnings("unused")
	private Map<Node, GNode> hRhsNode_2_rhsNode = new HashMap<Node, GNode>();

	@SuppressWarnings("unused")
	private Map<GNode, Node> m_lhsNode_2_hLhsNode = new HashMap<GNode, Node>();
	@SuppressWarnings("unused")
	private Map<Node, GNode> m_hLhsNode_2_lhsNode = new HashMap<Node, GNode>();
	@SuppressWarnings("unused")
	private Map<GNode, Node> m_rhsNode_2_hRhsNode = new HashMap<GNode, Node>();
	@SuppressWarnings("unused")
	private Map<Node, GNode> m_hRhsNode_2_rhsNode = new HashMap<Node, GNode>();

	@SuppressWarnings("unused")
	private Map<GEdge, Edge> lhsEdge_2_hLhsEdge = new HashMap<GEdge, Edge>();
	@SuppressWarnings("unused")
	private Map<Edge, GEdge> hLhsEdge_2_lhsEdge = new HashMap<Edge, GEdge>();
	@SuppressWarnings("unused")
	private Map<GEdge, Edge> rhsEdge_2_hRhsEdge = new HashMap<GEdge, Edge>();
	@SuppressWarnings("unused")
	private Map<Edge, GEdge> hRhsEdge_2_rhsEdge = new HashMap<Edge, GEdge>();

	@SuppressWarnings("unused")
	private Map<GEdge, Edge> m_lhsEdge_2_hLhsEdge = new HashMap<GEdge, Edge>();
	@SuppressWarnings("unused")
	private Map<Edge, GEdge> m_hLhsEdge_2_lhsEdge = new HashMap<Edge, GEdge>();
	@SuppressWarnings("unused")
	private Map<GEdge, Edge> m_rhsEdge_2_hRhsEdge = new HashMap<GEdge, Edge>();
	@SuppressWarnings("unused")
	private Map<Edge, GEdge> m_hRhsEdge_2_rhsEdge = new HashMap<Edge, GEdge>();

	@SuppressWarnings("unused")
	private Map<GAttribute, Attribute> lhsAttribute_2_hLhsAttribute = new HashMap<GAttribute, Attribute>();
	@SuppressWarnings("unused")
	private Map<Attribute, GAttribute> hLhsAttribute_2_lhsAttribute = new HashMap<Attribute, GAttribute>();
	@SuppressWarnings("unused")
	private Map<GAttribute, Attribute> rhsAttribute_2_hRhsAttribute = new HashMap<GAttribute, Attribute>();
	@SuppressWarnings("unused")
	private Map<Attribute, GAttribute> hRhsAttribute_2_rhsAttribute = new HashMap<Attribute, GAttribute>();

	@SuppressWarnings("unused")
	private Map<GAttribute, Attribute> m_lhsAttribute_2_hLhsAttribute = new HashMap<GAttribute, Attribute>();
	@SuppressWarnings("unused")
	private Map<Attribute, GAttribute> m_hLhsAttribute_2_lhsAttribute = new HashMap<Attribute, GAttribute>();
	@SuppressWarnings("unused")
	private Map<GAttribute, Attribute> m_rhsAttribute_2_hRhsAttribute = new HashMap<GAttribute, Attribute>();
	@SuppressWarnings("unused")
	private Map<Attribute, GAttribute> m_hRhsAttribute_2_rhsAttribute = new HashMap<Attribute, GAttribute>();

	// ================================================================================

	// private ArrayList<String> listInvariantConstraints = new
	// ArrayList<String>();
	// private Set<String> setInvConstraintsAsParameters = new
	// HashSet<String>();
	// private String charSeparator = String.valueOf(((char) 007));

	public Rule transform(DBRule dbRule) {
		System.out.println("Transforming: " + dbRule);

		this.dbRule = dbRule;
		hRule = hFactory.createRule(dbRule.name);

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
			Graph hLhs = transformGraph(lhs, false, false);
			putToMappings(lhs, hLhs, getMapPair(ElementKind.GRAPH, false, false));

			// RHS graph
			GraphT rhs = new GraphT(iRHSGraphID, true, false, true);
			Graph hRhs = transformGraph(rhs, true, false);
			putToMappings(rhs, hRhs, getMapPair(ElementKind.GRAPH, true, false));

			// Mappings LHS -> RHS
			createLhs2RhsMappings(lhs, rhs, false, hRule);

			// Construct rule
			hRule.setLhs(hLhs);
			hRule.setRhs(hRhs);
			
			// Retrieve object parameters
			ObjectParameterRetriever objRetriever = new ObjectParameterRetriever(this);
			objRetriever.retrieve();

		} else {
			// loading lhs graph (with MO)
			GraphT lhsWithMo = new GraphT();
			lhsWithMo.graphID = iLHSGraphID;
			lhsWithMo.graphType = 0;
			lhsWithMo.LoadMultiObjects(false, true);

			// loading rhs graph (with MO)
			GraphT rhsWithMo = new GraphT();
			rhsWithMo = new GraphT();
			rhsWithMo.graphID = iRHSGraphID;
			rhsWithMo.graphType = 1;
			rhsWithMo.LoadMultiObjects(false, true);

			// Construct the kernel rule
			Graph hLhs = transformGraph(lhsWithMo, false, false);
			Graph hRhs = transformGraph(rhsWithMo, true, false);
			createLhs2RhsMappings(lhsWithMo, rhsWithMo, false, hRule);
			hRule.setLhs(hLhs);
			hRule.setRhs(hRhs);

			ObjectParameterRetriever objRetriever = new ObjectParameterRetriever(this);
			objRetriever.retrieve();
			
			// Construct the multi rule
			Rule m_hRule = hFactory.createRule(dbRule.name + "_multi");
			hRule.getMultiRules().add(m_hRule);
			Graph m_hLhs = transformGraph(lhsWithMo, false, true);
			Graph m_hRhs = transformGraph(rhsWithMo, true, true);
			createLhs2RhsMappings(lhsWithMo, rhsWithMo, true, m_hRule);
			m_hRule.setLhs(m_hLhs);
			m_hRule.setRhs(m_hRhs);

			// Kernel-rule to multi-rule mappings
			createKernel2MultiMappings(lhsWithMo, rhsWithMo, m_hRule);
		}

		return hRule;
	}

	/**
	 * 
	 * @param graph
	 * @param isRHS
	 * @param isMulti
	 * @return
	 */
	private Graph transformGraph(GraphT graph, boolean isRHS, boolean isMulti) {
		System.out.println("Transform Graph: " + HenshinUtil.getGraphName(isRHS, isMulti));
		//graph.printGraph();

		Graph hGraph = hFactory.createGraph(HenshinUtil.getGraphName(isRHS, isMulti));

		// Create Henshin nodes
		for (GNode node : graph.gNodes) {
			
			// Skip multi-nodes when creating kernel rule
			if (!isMulti && node.isMulti) {				
				continue;
			}

			Node hNode = hFactory.createNode(hGraph, domainConfig.deriveNodeType(node.nodeType), "");
			hNode.setName(getNodeID(node, false));

			// Put to mappings
			putToMappings(node, hNode, getMapPair(ElementKind.NODE, isRHS, isMulti));

			// Transform attributes
			transformAttributes(node, isRHS, isMulti);
		}

		// Create Henshin Edges
		for (GEdge edge : graph.gEdges) {						
			GNode srcNode = getNodeByID(edge.sourceID, isRHS, isMulti, true);
			GNode tgtNode = getNodeByID(edge.targetID, isRHS, isMulti, true);
			
			// Skip multi-edges when creating kernel rule
			if (!isMulti) {
				if ((srcNode == null) || (tgtNode == null) || srcNode.isMulti || tgtNode.isMulti) {					
					continue;
				}
			}

			Node hSrcNode = getHNode(srcNode, isRHS, isMulti);
			Node hTgtNode = getHNode(tgtNode, isRHS, isMulti);

			Edge hEdge = hFactory.createEdge(hSrcNode, hTgtNode,
					domainConfig.deriveEdgeType(hSrcNode.getType(), edge.edgeType));

			// Put to mappings
			putToMappings(edge, hEdge, getMapPair(ElementKind.EDGE, isRHS, isMulti));
		}

		return hGraph;
	}

	/**
	 * 
	 * @param node
	 * @param isRHS
	 * @param isMulti
	 */
	private void transformAttributes(GNode node, boolean isRHS, boolean isMulti) {
		Node hNode = getHNode(node, isRHS, isMulti);

		for (GAttribute attribute : node.gAttribute) {
			// Exclude ref attributes
			if (attribute.attIsObjectRelation) {
				continue;
			}

			// Create attribute
			Attribute hAttribute = hFactory.createAttribute(hNode,
					domainConfig.deriveAttributeType(hNode.getType(), attribute.attName), attribute.attName);

			// Put to mappings
			putToMappings(attribute, hAttribute, getMapPair(ElementKind.ATTRIBUTE, isRHS, isMulti));
		}
	}

	private void createLhs2RhsMappings(GraphT lhs, GraphT rhs, boolean isMulti, Rule hRule) {
		// Iterate over LHS nodes and check if we have corresponding RHS
		// node
		for (GNode lhsNode : lhs.gNodes) {
			GNode rhsNode = getNodeByID(getNodeID(lhsNode, false), true, isMulti, false);
			if (rhsNode != null) {
				// Create Mapping
				Node hLhsNode = getHNode(lhsNode, false, isMulti);
				Node hRhsNode = getHNode(rhsNode, true, isMulti);
				Mapping mapping = hFactory.createMapping(hLhsNode, hRhsNode);
				hRule.getMappings().add(mapping);
			}
		}
	}

	/**
	 * Iterate over Kernel and map all nodes (Kernel rule has to be embedded
	 * completely into multi).
	 * 
	 * @param lhs
	 * @param rhs
	 * @param hMultiRule
	 */
	private void createKernel2MultiMappings(GraphT lhs, GraphT rhs, Rule hMultiRule) {
		// LHS nodes
		for (GNode node : lhs.gNodes) {
			if (node.isMulti){
				continue;
			}
			Node hKernel = getHNode(node, false, false);
			Node hMulti = getHNode(node, false, true);

			// Create Mapping
			Mapping mapping = hFactory.createMapping(hKernel, hMulti);
			hMultiRule.getMultiMappings().add(mapping);
		}

		// RHS nodes
		for (GNode node : rhs.gNodes) {
			if (node.isMulti){
				continue;
			}
			Node hKernel = getHNode(node, true, false);
			Node hMulti = getHNode(node, true, true);

			// Create Mapping
			Mapping mapping = hFactory.createMapping(hKernel, hMulti);
			hMultiRule.getMultiMappings().add(mapping);
		}
	}

	private String getNodeID(GNode node, boolean isIntraGraph) {
		if (isIntraGraph) {
			return node.nodeID;
		} else {
			if (dbRule.isMulti) {
				return node.AbstractID;
			} else {
				return node.nodeID;
			}
		}
	}

	private GNode getNodeByID(String id, boolean isRHS, boolean isMulti, boolean isIntraGraph) {		
		MapPair mapPair = getMapPair(ElementKind.NODE, isRHS, isMulti);
		for (Object o : mapPair.g2h.keySet()) {
			GNode node = (GNode) o;
			if (getNodeID(node, isIntraGraph).equals(id)) {
				return node;
			}
		}

		return null;
	}

	private Node getHNode(GNode node, boolean isRHS, boolean isMulti) {
		MapPair mapPair = getMapPair(ElementKind.NODE, isRHS, isMulti);
		return (Node) mapPair.g2h.get(node);
	}

	@SuppressWarnings("unchecked")
	private void putToMappings(Object gElement, EObject hElement, MapPair mapPair) {
		mapPair.g2h.put(gElement, hElement);
		mapPair.h2g.put(hElement, gElement);
	}

	@SuppressWarnings("rawtypes")
	private MapPair getMapPair(ElementKind kind, boolean isRHS, boolean isMulti) {
		// Kind
		String kind_name = "";
		if (kind.equals(ElementKind.GRAPH)) {
			kind_name = "Graph";
		}
		if (kind.equals(ElementKind.NODE)) {
			kind_name = "Node";
		}
		if (kind.equals(ElementKind.EDGE)) {
			kind_name = "Edge";
		}
		if (kind.equals(ElementKind.ATTRIBUTE)) {
			kind_name = "Attribute";
		}

		// LHS vs. RHS
		String g_name = "";
		String h_name = "";
		if (isRHS) {
			g_name = "rhs";
			h_name = "hRhs";
		} else {
			g_name = "lhs";
			h_name = "hLhs";
		}

		// Construct field names
		String g2h_name = "";
		String h2g_name = "";
		if (isMulti) {
			g2h_name = "m_";
			h2g_name = "m_";
		}
		g2h_name += g_name + kind_name + "_2_" + h_name + kind_name;
		h2g_name += h_name + kind_name + "_2_" + g_name + kind_name;

		// Get fields using Java reflection
		Map g2h = null;
		Map h2g = null;
		try {
			g2h = (Map) this.getClass().getDeclaredField(g2h_name).get(this);
			h2g = (Map) this.getClass().getDeclaredField(h2g_name).get(this);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		return new MapPair(g2h, h2g);
	}

	@SuppressWarnings("rawtypes")
	class MapPair {
		Map g2h;
		Map h2g;

		MapPair(Map g2h, Map h2g) {
			super();
			this.g2h = g2h;
			this.h2g = h2g;
		}
	}

	enum ElementKind {
		GRAPH, NODE, EDGE, ATTRIBUTE
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
