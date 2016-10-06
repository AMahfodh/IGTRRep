package henshin;

import inferences.GEdge;
import inferences.GNACs;
import inferences.GNode;
import inferences.GraphT;
import inferences.GNACs.NACinstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Node;

import emf.domain.IDomainConfiguration;

public class NACHandler {
	
	// The Henshin factory
	private HenshinFactory hFactory = HenshinFactory.eINSTANCE;
	
	// domain config
	private IDomainConfiguration domainConfig;
	
	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;
	
	// NAC instances
	private GNACs nacInstances;
	
	// Mappings
	private Map<GNode, Node> g2h = new HashMap<GNode, Node>();
	private Map<Node, GNode> h2g = new HashMap<Node, GNode>();

	public NACHandler(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
		this.domainConfig = dbRule2hRule.domainConfig;
	}

	public void exportNACs(){
		// load NACs from DB
		nacInstances = new GNACs(dbRule2hRule.dbRule.observationId);
				
		// iteration over list of NACs
		for (NACinstance nacInstance: nacInstances.NACs){
			
			// transform the complete NAC graph
			Graph hGraph = transformNACGraph(nacInstance.getPreNAC());			
			
			// now embed the NAC graph into the rule's LHS
			embedNACGraph(hGraph);
			
			// attribute constraints relevant to this NAC
			ArrayList<String> strListAttributesConstraints= nacInstance.getAttributesConstraints();			
			System.out.println("Attributes constraints (" + strListAttributesConstraints.size() + "): ");
			
			for (String strConstraint : strListAttributesConstraints){
				System.out.println("\t" + strConstraint);
			}
			
		}
	}
	
	private Graph transformNACGraph(GraphT graph) {
		System.out.println("NAC:");
		graph.printGraph();	// print graph elements

		Graph hGraph = hFactory.createGraph("NAC_" + graph.graphID);

		// Create Henshin nodes
		for (GNode node : graph.gNodes) {
			Node hNode = hFactory.createNode(hGraph, domainConfig.deriveNodeType(node.nodeType), "");
			hNode.setName(node.nodeID);
			g2h.put(node, hNode);
			h2g.put(hNode, node);
			
			// TODO: Transform attributes
			// transformAttributes(node, isRHS, isMulti);
		}

		// Create Henshin Edges
		for (GEdge edge : graph.gEdges) {						
			GNode srcNode = getNodeByID(edge.sourceID);
			GNode tgtNode = getNodeByID(edge.targetID);
			Node hSrcNode = g2h.get(srcNode);
			Node hTgtNode = g2h.get(tgtNode);

			Edge hEdge = hFactory.createEdge(hSrcNode, hTgtNode,
					domainConfig.deriveEdgeType(hSrcNode.getType(), edge.edgeType));
			
			//hGraph.getEdges().add(hEdge);
		}

		return hGraph;
	}
	
	private void embedNACGraph(Graph hGraph){
		for (Node hNacNode : hGraph.getNodes()) {
			GNode gNACNode = h2g.get(hNacNode);
			
			// Check whether there is a corresponding node in the rule's LHS
			GNode gLHSNode = dbRule2hRule.getNodeByID(gNACNode.nodeID, false, false, "nodeID");
			System.out.println(gLHSNode);
		}
	}
	
	private GNode getNodeByID(String id){
		for (GNode node : g2h.keySet()) {
			if (node.nodeID.equals(id)){
				return node;
			}
		}
		
		assert(false);
		return null;
	}
	

}
