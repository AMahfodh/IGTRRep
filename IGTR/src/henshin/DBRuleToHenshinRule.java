package henshin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import emf.util.DataNodeWrapper;
import inferences.DBRecord;
import inferences.GAttribute;
import inferences.GEdge;
import inferences.GNode;
import inferences.GraphT;

/**
 * Transforms a DBRule to a Henshin rule.
 * 
 * @author kehrer
 */
public class DBRuleToHenshinRule {

	// The Henshin factory
	HenshinFactory hFactory = HenshinFactory.eINSTANCE;

	// Domain info
	IDomainConfiguration domainConfig;
	DataNodeWrapper dataNodeWrapper;

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
		this.dbRule = dbRule;
		hRule = hFactory.createRule(dbRule.name);

		domainConfig = DomainConfigurationFactory.createDomainConfiguration();
		if (domainConfig.treatAttributesAsNodes()) {
			dataNodeWrapper = DataNodeWrapper.getComprehensiveDataNodeWrapper();
		}

		// TODO: Print parameters and also generate required ones based on
		// inferred invariants
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

			// Handle/inline value nodes
			if (domainConfig.treatAttributesAsNodes()) {
				valueNodes2Attributes(hRule);
			}

			// Handle NACs
			NACHandler nacHandler = new NACHandler(this);
			nacHandler.exportNACs();

			// "Pretty Printing"
			HenshinUtil.prettyPrinting(hRule);

			// // Retrieve object parameters
			// ObjectParameterRetriever objRetriever = new
			// ObjectParameterRetriever(this);
			// objRetriever.retrieve();
			//
			// // TODO
			// InvariantConstraintHandler invariantHandler = new
			// InvariantConstraintHandler(this);
			// invariantHandler.retrieve();

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

			// Handle/inline value nodes
			if (domainConfig.treatAttributesAsNodes()) {
				valueNodes2Attributes(hRule);
			}

			// Handle NACs
			NACHandler nacHandler = new NACHandler(this);
			nacHandler.exportNACs();

			// "Pretty Printing"
			HenshinUtil.prettyPrinting(hRule);

			// ObjectParameterRetriever objRetriever = new
			// ObjectParameterRetriever(this);
			// objRetriever.retrieve();

			// Construct the multi rule
			Rule m_hRule = hFactory.createRule(dbRule.name + "_multi");
			hRule.getMultiRules().add(m_hRule);
			Graph m_hLhs = transformGraph(lhsWithMo, false, true);
			Graph m_hRhs = transformGraph(rhsWithMo, true, true);
			createLhs2RhsMappings(lhsWithMo, rhsWithMo, true, m_hRule);
			m_hRule.setLhs(m_hLhs);
			m_hRule.setRhs(m_hRhs);

			// Handle/inline value nodes
			if (domainConfig.treatAttributesAsNodes()) {
				valueNodes2Attributes(m_hRule);
			}

			// // Handle NACs
			// NACHandler nacHandler = new NACHandler(this);
			// nacHandler.exportNACs();

			// "Pretty Printing"
			HenshinUtil.prettyPrinting(m_hRule);

			// Kernel-rule to multi-rule mappings
			createKernel2MultiMappings(lhsWithMo, rhsWithMo, m_hRule);

			// // TODO
			// InvariantConstraintHandler invariantHandler = new
			// InvariantConstraintHandler(this);
			// invariantHandler.retrieve();
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
		// graph.printGraph();

		Graph hGraph = hFactory.createGraph(HenshinUtil.getGraphName(isRHS, isMulti));

		// Create Henshin nodes
		for (GNode node : graph.gNodes) {

			// Skip multi-nodes when creating kernel rule
			if (!isMulti && node.isMulti) {
				continue;
			}

			EClass hNodeType = domainConfig.deriveNodeType(node.nodeType);
			assert (hNodeType != null);
			Node hNode = hFactory.createNode(hGraph, hNodeType, "");

			String nodeID = null;
			if (dbRule.isMulti) {
				nodeID = "AbstractID";
			} else {
				nodeID = "nodeID";
			}
			hNode.setName(getNodeID(node, nodeID));

			if (hNodeType == null) {
				// Just a dummy node for a data node representing an attribute
				// value
				String dummyName = hNode.getName();
				dummyName += "__" + node.nodeType;
				hNode.setName(dummyName);
			}

			// Put to mappings
			putToMappings(node, hNode, getMapPair(ElementKind.NODE, isRHS, isMulti));

			// Transform attributes
			if (!domainConfig.treatAttributesAsNodes()) {
				// transformAttributes(graph, node, isRHS, isMulti);
			}
		}

		// Create Henshin Edges
		for (GEdge edge : graph.gEdges) {
			GNode srcNode = getNodeByID(edge.sourceID, isRHS, isMulti, "nodeID");
			GNode tgtNode = getNodeByID(edge.targetID, isRHS, isMulti, "nodeID");

			// Skip multi-edges when creating kernel rule
			if (!isMulti) {
				if ((srcNode == null) || (tgtNode == null) || srcNode.isMulti || tgtNode.isMulti) {
					continue;
				}
			}

			Node hSrcNode = getHNode(srcNode, isRHS, isMulti);
			Node hTgtNode = getHNode(tgtNode, isRHS, isMulti);

			Edge hEdge = null;
			String strEdgeType = HenshinUtil.getCleanedEdgeType(edge.edgeType);
			EReference edgeType = domainConfig.deriveEdgeType(hSrcNode.getType(), strEdgeType);
			if (edgeType != null) {
				hEdge = hFactory.createEdge(hSrcNode, hTgtNode, edgeType);
			} else {
				assert (domainConfig.treatAttributesAsNodes());
				
				// Just a dummy edge representing a pointer to a value node
				hEdge = new ValueEdge();
				hEdge.setSource(hSrcNode);
				hEdge.setTarget(hTgtNode);
				hEdge.setGraph(hSrcNode.getGraph());
				((ValueEdge) hEdge).setAttribute(edge.edgeType);
			}

			// Put to mappings
			putToMappings(edge, hEdge, getMapPair(ElementKind.EDGE, isRHS, isMulti));
		}

		if (domainConfig.treatAttributesAsNodes()) {

		}

		return hGraph;
	}

	/**
	 * 
	 * @param node
	 * @param isRHS
	 * @param isMulti
	 */
	private void transformAttributes(GraphT graph, GNode node, boolean isRHS, boolean isMulti) {
		Node hNode = getHNode(node, isRHS, isMulti);

		if (domainConfig.treatAttributesAsNodes()) {

		} else {
			for (GAttribute attribute : node.gAttribute) {
				// Exclude ref attributes
				if (attribute.attIsObjectRelation) {
					continue;
				}

				// Create attribute
				EAttribute type = domainConfig.deriveAttributeType(hNode.getType(), attribute.attName);
				String value = HenshinUtil.getCleanedAttributeValue(type, attribute.attValue);				
				Attribute hAttribute = hFactory.createAttribute(hNode, type, value);

				// Put to mappings
				putToMappings(attribute, hAttribute, getMapPair(ElementKind.ATTRIBUTE, isRHS, isMulti));
			}
		}
	}

	private void valueNodes2Attributes(Rule rule) {
		for (NodePair nodePair : HenshinUtil.getPreservedNodes(rule)) {
			if (nodePair.getLhsNode().getName().contains("__")) {
				// it's a value node
				String syntheticType = nodePair.getLhsNode().getName().split("__")[1];
				String syntheticId = nodePair.getLhsNode().getName().split("__")[0];

				if (!dataNodeWrapper.getDisctinctRepresentativeDataSortElements().contains(syntheticType)) {
					// (1) represents a literal value, just inline it
					for (Edge edge : nodePair.getLhsNode().getIncoming()) {
						ValueEdge valueEdge = (ValueEdge) edge;
						createAttributeIfNeeded(valueEdge, syntheticType);
					}
					for (Edge edge : nodePair.getRhsNode().getIncoming()) {
						ValueEdge valueEdge = (ValueEdge) edge;
						createAttributeIfNeeded(valueEdge, syntheticType);
					}

				} else {

					// p represents sort element

					// first, we look at the LHS
					if (nodePair.getLhsNode().getIncoming().size() > 1) {

						// (2) p is part of the precondition
						for (Edge edge : nodePair.getLhsNode().getIncoming()) {
							ValueEdge valueEdge = (ValueEdge) edge;
							Node srcNode = valueEdge.getSource();

							createAttributeIfNeeded(valueEdge, syntheticId);
							createParameterIfNedded(rule, syntheticId);
						}
					}

					// then we look at the RHS

					for (Edge edge : nodePair.getRhsNode().getIncoming()) {
						ValueEdge valueEdge = (ValueEdge) edge;

						if (HenshinUtil.isCreationEdge(valueEdge)) {
							// (3) it's an assignment
							List<Node> sourceNodesLhs = new ArrayList<Node>();
							for (Edge lhsEdge : nodePair.getLhsNode().getIncoming()) {
								ValueEdge valueLhsEdge = (ValueEdge) lhsEdge;
								if (valueLhsEdge.getAttribute().equals(valueEdge.getAttribute())) {
									sourceNodesLhs.add(valueLhsEdge.getSource());
								}
							}
							if (!sourceNodesLhs.isEmpty()) {
								// (3a) the assigned value is drawn from another
								// node's attribute value
								createAttributeIfNeeded(valueEdge, syntheticId);

							} else {
								// (3b) the assigned value is drawn from a
								// parameter
								createAttributeIfNeeded(valueEdge, syntheticId);
								createParameterIfNedded(rule, syntheticId);
							}
						}
					}
				}

				// cleanup rule and henshin graphs
				Mapping mapping = HenshinUtil.findMapping(rule.getMappings(), nodePair.getLhsNode(),
						nodePair.getRhsNode());
				rule.getMappings().remove(mapping);
				rule.getLhs().removeNode(nodePair.getLhsNode());
				rule.getRhs().removeNode(nodePair.getRhsNode());
			}
		}
	}

	private void createAttributeIfNeeded(ValueEdge valueEdge, String value) {
		Node srcNode = valueEdge.getSource();
		if (srcNode
				.getAttribute(domainConfig.deriveAttributeType(srcNode.getType(), valueEdge.getAttribute())) == null) {
			Attribute hAttribute = hFactory.createAttribute(srcNode,
					domainConfig.deriveAttributeType(srcNode.getType(), valueEdge.getAttribute()), value);

			// TODO: Put to mappings..??
			// putToMappings(attribute, hAttribute,
			// getMapPair(ElementKind.ATTRIBUTE, isRHS, isMulti));
		}
	}

	private void createParameterIfNedded(Rule rule, String paramName) {
		if (rule.getParameter(paramName) == null) {
			rule.getParameters().add(hFactory.createParameter(paramName));
		}
	}

	private void createLhs2RhsMappings(GraphT lhs, GraphT rhs, boolean isMulti, Rule hRule) {
		// Iterate over LHS nodes and check if we have corresponding RHS
		// node
		for (GNode lhsNode : lhs.gNodes) {
			String nodeID = null;
			if (dbRule.isMulti) {
				nodeID = "AbstractID";
			} else {
				nodeID = "nodeID";
			}
			GNode rhsNode = getNodeByID(getNodeID(lhsNode, nodeID), true, isMulti, nodeID);
			if (rhsNode != null) {
				// Create Mapping
				Node hLhsNode = getHNode(lhsNode, false, isMulti);
				Node hRhsNode = getHNode(rhsNode, true, isMulti);
				Mapping mapping = hFactory.createMapping(hLhsNode, hRhsNode);
				hRule.getMappings().add(mapping);

				// Common super type handling
				if (lhsNode.nodeCommonType != null && rhsNode.nodeCommonType != null
						&& !lhsNode.nodeCommonType.equals("") && !rhsNode.nodeCommonType.equals("")
						&& lhsNode.nodeCommonType.equals(rhsNode.nodeCommonType)) {

					hLhsNode.setType(domainConfig.deriveNodeType(lhsNode.nodeCommonType));
					hRhsNode.setType(domainConfig.deriveNodeType(rhsNode.nodeCommonType));
				}
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
			if (node.isMulti) {
				continue;
			}
			Node hKernel = getHNode(node, false, false);
			Node hMulti = getHNode(node, false, true);

			// Create Mapping
			if ((hKernel.getGraph() != null) && (hKernel.getGraph() != null)) {
				Mapping mapping = hFactory.createMapping(hKernel, hMulti);
				hMultiRule.getMultiMappings().add(mapping);
			}
		}

		// RHS nodes
		for (GNode node : rhs.gNodes) {
			if (node.isMulti) {
				continue;
			}
			Node hKernel = getHNode(node, true, false);
			Node hMulti = getHNode(node, true, true);

			// Create Mapping
			if ((hKernel.getGraph() != null) && (hKernel.getGraph() != null)) {
				Mapping mapping = hFactory.createMapping(hKernel, hMulti);
				hMultiRule.getMultiMappings().add(mapping);
			}
		}
	}

	private String getNodeID(GNode node, String nodeIdField) {
		String res = null;
		try {
			res = (String) GNode.class.getDeclaredField(nodeIdField).get(node);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		return res;

		// if (isIntraGraph) {
		// return node.nodeID;
		// } else {
		// if (dbRule.isMulti) {
		// return node.AbstractID;
		// } else {
		// return node.nodeID;
		// }
		// }
	}

	public GNode getNodeByID(String id, boolean isRHS, boolean isMulti, String nodeIdField) {
		MapPair mapPair = getMapPair(ElementKind.NODE, isRHS, isMulti);
		for (Object o : mapPair.g2h.keySet()) {
			GNode node = (GNode) o;
			if (getNodeID(node, nodeIdField).equals(id)) {
				return node;
			}
		}

		return null;
	}

	public Node getHNode(GNode node, boolean isRHS, boolean isMulti) {
		MapPair mapPair = getMapPair(ElementKind.NODE, isRHS, isMulti);
		return (Node) mapPair.g2h.get(node);
	}

	public GNode getGNode(Node hNode, boolean isRHS, boolean isMulti) {
		MapPair mapPair = getMapPair(ElementKind.NODE, isRHS, isMulti);
		return (GNode) mapPair.h2g.get(hNode);
	}

	@SuppressWarnings("unchecked")
	private void putToMappings(Object gElement, EObject hElement, MapPair mapPair) {
		mapPair.g2h.put(gElement, hElement);
		mapPair.h2g.put(hElement, gElement);
	}

	@SuppressWarnings("rawtypes")
	public MapPair getMapPair(ElementKind kind, boolean isRHS, boolean isMulti) {
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
	// .getByQueryStatement("select RuleParameters from TblObservationOutput "
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
	// this.henshinWriter.write(" <parameters xmi:id=\"_XF7_P" + i + "" +
	// iObservation + "" + this.encryptedXmiId
	// + "\" name=\"" + par[1] + "\"/>" + System.lineSeparator());
	// }
	//
	// // add extra parameters as variables
	// for (String extraParameters : this.setInvConstraintsAsParameters) {
	//
	// this.henshinWriter.write(" <parameters xmi:id=\"_XF7_P" + (++i) + "" +
	// iObservation + ""
	// + this.encryptedXmiId + "\" name=\"" + extraParameters + "\"/>" +
	// System.lineSeparator());
	//
	// // String strEDataType="EString";
	// // if ("EString EInt".contains(strEDataType)){
	// //
	// this.henshinWriter.write(" <type xsi:type=\"ecore:EDataType\"
	// href=\"http://www.eclipse.org/emf/2002/Ecore#//"
	// // + strEDataType + "\"/>" + System.lineSeparator());
	// // }
	// // this.henshinWriter.write(" </parameters>" +
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
	// .getByQueryStatement("select RuleAttributeConditions from
	// TblObservationOutput "
	// +
	// "where (RuleAttributeConditions is not null or
	// RuleAttributeConditions='') and Observation_ID="
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
