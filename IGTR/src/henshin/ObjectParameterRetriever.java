package henshin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;

import util.digraph.CycleChecker;
import util.digraph.Digraph;
import util.digraph.DigraphEdge;
import util.digraph.DigraphNode;

public class ObjectParameterRetriever {

	// DBRule to Henshin Rule
	private DBRuleToHenshinRule dbRule2hRule;

	// The "dominated by" graph
	private Digraph dominatedByGraph;

	public ObjectParameterRetriever(DBRuleToHenshinRule dbRule2hRule) {
		super();
		this.dbRule2hRule = dbRule2hRule;
	}

	public void retrieve() {
		System.out.println("Object parameter retrieval...");
		
		// create "dominated by" graph
		createDominatedByGraph();

		// deal with cycles
		handleCycles();

		// is "dominated by" graph now a DAG, i.e. contains no cycles?
		List<DigraphNode> cycle = getCycle();
		if (!cycle.isEmpty()) {
			throw new DominatedByCycleException(cycle);
		}

		// recursively drop all nodes dominated by others
		dropDominatedDodes();

		// now we are ready to create the Henshin params
		for (DigraphNode digraphNode : dominatedByGraph.getNodes()) {
			Node hNode = (Node) digraphNode.wrappedData;
			Parameter hParam = dbRule2hRule.hFactory.createParameter(hNode.getName());
			hParam.setType(hNode.getType());
			dbRule2hRule.hRule.getParameters().add(hParam);
		}
	}

	private void createDominatedByGraph() {
		dominatedByGraph = new Digraph();
		Map<Node, DigraphNode> h2di = new HashMap<Node, DigraphNode>();

		// All nodes
		for (Node hNode : dbRule2hRule.hRule.getLhs().getNodes()) {
			DigraphNode diNode = new DigraphNode(hNode);
			dominatedByGraph.addNode(diNode);
			h2di.put(hNode, diNode);
		}

		// Scan for "dominated by" edges
		Collection<DominatedBy> dominatedRelations = new ArrayList<DominatedBy>();
		for (Edge hEdge : dbRule2hRule.hRule.getLhs().getEdges()) {
			if (hEdge.getType().isContainment()) {
				// We assume that containers are unique
				// TODO: true for case studies, but not in general. So check
				// meta-model!
				DominatedBy dominatedBy = new DominatedBy(hEdge.getType(), hEdge.getTarget(), hEdge.getSource());
				if (!dominatedRelations.contains(dominatedBy)) {
					dominatedRelations.add(dominatedBy);
				}
			}
			if (hEdge.getType().getUpperBound() == 1) {
				DominatedBy dominatedBy = new DominatedBy(hEdge.getType(), hEdge.getSource(), hEdge.getTarget());
				if (!dominatedRelations.contains(dominatedBy)) {
					dominatedRelations.add(dominatedBy);
				}
			}
		}

		// Create "dominated by" edges
		for (DominatedBy dominatedBy : dominatedRelations) {
			DigraphNode diSrc = h2di.get(dominatedBy.dominated);
			DigraphNode diTgt = h2di.get(dominatedBy.dominator);
			DigraphEdge diEdge = new DigraphEdge(diSrc, diTgt);
			dominatedByGraph.addEdge(diEdge);
		}
	}

	private List<DigraphNode> getCycle() {
		CycleChecker checker = new CycleChecker(dominatedByGraph);
		return checker.check();
	}

	private void handleCycles() {
		// try to remove all cycles
		while (true) {
			List<DigraphNode> cycle = getCycle();
			if (cycle.isEmpty()) {
				return;
			}

			boolean res = handleCycle(cycle);
			if (!res) {
				return;
			}
		}
	}

	private boolean handleCycle(List<DigraphNode> cycle) {
		// Apply heuristics to resolve cycles
		if (cycle.size() == 3) {
			DigraphNode v1 = cycle.get(0);
			DigraphNode v2 = cycle.get(1);
			Node h1 = (Node) v1.wrappedData;
			Node h2 = (Node) v1.wrappedData;

			// Prefer nodes higher up the containment tree
			DigraphNode unPreferredNode = null;
			for (Edge out : h1.getOutgoing()) {
				if (out.getType().isContainment() && out.getSource() == h1 && out.getTarget() == h2) {
					unPreferredNode = v2;
					break;
				}
				if (out.getType().isContainment() && out.getSource() == h2 && out.getTarget() == h1) {
					unPreferredNode = v1;
					break;
				}
			}
			if (unPreferredNode != null) {
				dominatedByGraph.removeNode(unPreferredNode);
				return true;
			}

			// Prefer nodes which are visible in the concrete syntax to those
			// which are not
			// TODO
		}

		return false;
	}

	private void dropDominatedDodes() {
		// at this point, we can assume that digraph has no cycles
		Collection<DigraphNode> toBeRemoved;
		do {
			// Find nodes which have outgoing but no incoming ...					
			toBeRemoved = new ArrayList<DigraphNode>();
			for (Iterator<DigraphNode> iter = dominatedByGraph.getNodes().iterator(); iter.hasNext();) {
				DigraphNode node = iter.next();
				if (!dominatedByGraph.getAdjacent(node).isEmpty() && !dominatedByGraph.hasIncomingEdge(node)) {
					if (!toBeRemoved.contains(node)){
						toBeRemoved.add(node);
					}					
				}
			}
			// ... and delete those nodes
			for (DigraphNode digraphNode : toBeRemoved) {
				dominatedByGraph.removeNode(digraphNode);
			}
		} while (!toBeRemoved.isEmpty());
	}

	class DominatedBy {
		EReference edgeType;
		Node dominator;
		Node dominated;

		public DominatedBy(EReference edgeType, Node dominator, Node dominated) {
			super();
			this.edgeType = edgeType;
			this.dominator = dominator;
			this.dominated = dominated;
		}

		@Override
		public boolean equals(Object obj) {
			DominatedBy other = (DominatedBy) obj;
			return edgeType.equals(other.edgeType) && dominator.equals(other.dominator)
					&& dominated.equals(other.dominated);
		}
	}

	class DominatedByCycleException extends RuntimeException {

		DominatedByCycleException(List<DigraphNode> cycle) {
			super("The \"dominated by\" graph contains an unresolvable cycle: " + cycle);
		}
	}
}
