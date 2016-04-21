package util.digraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Digraph {

	private Collection<DigraphNode> nodes;
	private Collection<DigraphEdge> edges;

	public Digraph() {
		nodes = new ArrayList<DigraphNode>();
		edges = new ArrayList<DigraphEdge>();
	}

	public Collection<DigraphNode> getNodes() {
		return nodes;
	}

	public Collection<DigraphEdge> getEdges() {
		return edges;
	}

	public void addNode(DigraphNode node) {
		nodes.add(node);
	}

	public void removeNode(DigraphNode node) {
		// remove adjacent/incident edges
		for (Iterator<DigraphEdge> iterator = edges.iterator(); iterator.hasNext();) {
			DigraphEdge digraphEdge = iterator.next();
			if (digraphEdge.src == node || digraphEdge.tgt == node){
				iterator.remove();
			}
		}
		
		// remove node
		nodes.remove(node);
	}
	
	public void addEdge(DigraphEdge edge) {
		edges.add(edge);
	}

	public Collection<DigraphNode> getAdjacent(DigraphNode node) {
		Set<DigraphNode> adj = new HashSet<DigraphNode>();
		for (DigraphEdge edge : edges) {
			if (edge.src == node) {
				adj.add(edge.tgt);
			}
		}

		return adj;
	}
	
	public boolean hasIncomingEdge(DigraphNode node){
		for (DigraphEdge edge : edges) {
			if (edge.tgt == node) {
				return true;
			}
		}
		
		return false;
	}
}
