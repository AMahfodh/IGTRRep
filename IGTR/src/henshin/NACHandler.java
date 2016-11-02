package henshin;

import henshin.HenshinUtil.FormulaCombineOperator;
import inferences.GEdge;
import inferences.GNACs;
import inferences.GNACs.NACinstance;
import inferences.GNode;
import inferences.GraphT;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Not;

import emf.domain.IDomainConfiguration;
import emf.util.DataNodeWrapper;

public class NACHandler {

	// The Henshin factory
	private HenshinFactory hFactory = HenshinFactory.eINSTANCE;

	// domain config
	private IDomainConfiguration domainConfig;
	private DataNodeWrapper dataNodeWrapper;

	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;

	// NAC instances
	private GNACs nacInstances;

	// NAC counter
	private int nacCounter;

	// Mappings
	private Map<GNode, Node> g2h = new HashMap<GNode, Node>();
	private Map<Node, GNode> h2g = new HashMap<Node, GNode>();

	public NACHandler(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
		this.domainConfig = dbRule2hRule.domainConfig;
		this.dataNodeWrapper = dbRule2hRule.dataNodeWrapper;
		this.nacCounter = 0;
	}

	public void exportNACs() {
		// load NACs from DB
		nacInstances = new GNACs(dbRule2hRule.dbRule.observationId);

		// iteration over list of NACs
		for (NACinstance nacInstance : nacInstances.NACs) {
			nacCounter++;

			// transform the complete NAC graph
			Graph hGraph = transformNACGraph(nacInstance.getPreNAC());

			// now embed the NAC graph into the rule's LHS
			embedNACGraph(hGraph);

			// Handle/inline value nodes
			valueNodes2Attributes(hGraph);

			// // attribute constraints relevant to this NAC
			// ArrayList<String> strListAttributesConstraints=
			// nacInstance.getAttributesConstraints();
			// System.out.println("Attributes constraints (" +
			// strListAttributesConstraints.size() + "): ");
			//
			// for (String strConstraint : strListAttributesConstraints){
			// System.out.println("\t" + strConstraint);
			// }
		}
	}

	private Graph transformNACGraph(GraphT graph) {
		System.out.println("NAC:");
		graph.printGraph(); // print graph elements

		// Graph hGraph = hFactory.createGraph("NAC_" + graph.graphID);
		Graph hGraph = hFactory.createGraph("NAC_" + nacCounter);

		// Create Henshin nodes
		for (GNode node : graph.gNodes) {
			// FIXME: Currently, we ignore attributes of nodes being mapped to
			// the LHS, but we should not do this.
			boolean considerNode = false;
			boolean valueNode = false;
			if (domainConfig.deriveNodeType(node.nodeType) == null) {
				for (GEdge edge : graph.gEdges) {
					if (edge.targetID.equals(node.nodeID)
							&& (dbRule2hRule.getNodeByID(edge.sourceID, false, false, "nodeID") == null)) {
						considerNode = true;
						valueNode = true;
					}
				}
			} else {
				considerNode = true;
			}

			if (considerNode) {
				Node hNode = hFactory.createNode(hGraph, domainConfig.deriveNodeType(node.nodeType), "");
				hNode.setName(node.nodeID);

				if (valueNode) {
					String dummyName = hNode.getName();
					dummyName += "__" + node.nodeType;
					hNode.setName(dummyName);
				}

				g2h.put(node, hNode);
				h2g.put(hNode, node);
			}
			// TODO: Transform attributes
			// transformAttributes(node, isRHS, isMulti);
		}

		// Create Henshin Edges
		for (GEdge edge : graph.gEdges) {
			GNode srcNode = getNodeByID(edge.sourceID);
			GNode tgtNode = getNodeByID(edge.targetID);
			Node hSrcNode = g2h.get(srcNode);
			Node hTgtNode = g2h.get(tgtNode);

			if (hSrcNode != null && hTgtNode != null) {
				Edge hEdge = null;
				EReference edgeType = domainConfig.deriveEdgeType(hSrcNode.getType(), edge.edgeType);
				if (edgeType != null) {
					// A normal edge
					hEdge = hFactory.createEdge(hSrcNode, hTgtNode, edgeType);
				} else {
					// Just a dummy edge representing a pointer to a value node
					hEdge = new ValueEdge();
					hEdge.setSource(hSrcNode);
					hEdge.setTarget(hTgtNode);
					hEdge.setGraph(hSrcNode.getGraph());
					((ValueEdge) hEdge).setAttribute(edge.edgeType);
				}
			}
		}

		return hGraph;
	}

	private void embedNACGraph(Graph hGraph) {
		// Create NAC
		Not not = HenshinFactory.eINSTANCE.createNot();
		NestedCondition cond = HenshinFactory.eINSTANCE.createNestedCondition();
		cond.setConclusion(hGraph);
		not.setChild(cond);

		// Embed NAC nodes into LHS
		for (Node hNacNode : hGraph.getNodes()) {
			// Check whether there is a corresponding node in the rule's LHS
			Node hLHSNode = getLHSNode(hNacNode);
			if (hLHSNode != null) {
				// Add mapping
				Mapping mapping = HenshinFactory.eINSTANCE.createMapping(hLHSNode, hNacNode);
				cond.getMappings().add(mapping);
			}
		}

		// Add NAC to existing rule NACs
		HenshinUtil.addFormula(not, dbRule2hRule.hRule.getLhs(), FormulaCombineOperator.AND);
	}

	private void valueNodes2Attributes(Graph hGraph) {
		for (Node node : hGraph.getNodes()) {
			if (node.getName().contains("__")) {
				// it's a value node
				String nodeName = node.getName().replace("n_", "");
				String syntheticType = nodeName.split("__")[1];
				String syntheticId = nodeName.split("__")[0];

				if (!dataNodeWrapper.getDisctinctRepresentativeDataSortElements().contains(syntheticType)) {
					// (1) represents a literal value, just inline it
					for (Edge edge : node.getIncoming()) {
						ValueEdge valueEdge = (ValueEdge) edge;
						Node srcNode = valueEdge.getSource();

						hFactory.createAttribute(srcNode,
								domainConfig.deriveAttributeType(srcNode.getType(), valueEdge.getAttribute()),
								syntheticId);
					}

				} else {
					// (2) introduce a variable
					for (Edge edge : node.getIncoming()) {
						ValueEdge valueEdge = (ValueEdge) edge;
						Node srcNode = valueEdge.getSource();

						hFactory.createAttribute(srcNode,
								domainConfig.deriveAttributeType(srcNode.getType(), valueEdge.getAttribute()),
								syntheticId);

					}
				}
				
				// cleanup NAC graph 				
				hGraph.removeNode(node);				
			}
		}
	}

	private GNode getLHSNode(GNode nacNode) {
		return dbRule2hRule.getNodeByID(nacNode.nodeID, false, false, "nodeID");
	}

	private Node getLHSNode(Node nacNode) {
		GNode gNACNode = h2g.get(nacNode);
		GNode gLHSNode = getLHSNode(gNACNode);

		System.out.print(gNACNode.nodeID + "/" + gNACNode.AbstractID + "/" + gNACNode.nodeType + " => ");
		if (gLHSNode != null) {
			System.out.println(gLHSNode.nodeID + "/" + gLHSNode.AbstractID + "/" + gLHSNode.nodeType);
			Node hLHSNode = dbRule2hRule.getHNode(gLHSNode, false, false);
			System.out.println(hLHSNode);
			assert (hLHSNode != null);

			return hLHSNode;
		} else {
			System.out.println("null");

			return null;
		}
	}

	private GNode getNodeByID(String id) {
		for (GNode node : g2h.keySet()) {
			if (node.nodeID.equals(id)) {
				return node;
			}
		}

		assert (false);
		return null;
	}

}
