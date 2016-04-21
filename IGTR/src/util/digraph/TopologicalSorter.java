package util.digraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TopologicalSorter {
	
	private Digraph digraph;
	
	private Collection<DigraphNode> vertices;	
	private List<DigraphNode> sorted;
	
	public TopologicalSorter(Digraph digraph, Collection<DigraphNode> vertices) {
		this.digraph = digraph;
		this.vertices = new ArrayList<DigraphNode>(vertices.size());
		for (DigraphNode digraphNode : vertices) {
			this.vertices.add(digraphNode);
		}
		
		this.sorted = new ArrayList<DigraphNode>(vertices.size());
	}
	
	public List<DigraphNode> sort(){
		while (!vertices.isEmpty()){				
			for (Iterator<DigraphNode> iterator = vertices.iterator(); iterator.hasNext();) {
				DigraphNode vertex = iterator.next();
				if (!hasOutgoingEdges(vertex)){
					sorted.add(vertex);
					iterator.remove();
				}
			}
		}
		
		return sorted;
	}
	
	private boolean hasOutgoingEdges(DigraphNode vertex) {
		for (DigraphNode adj : digraph.getAdjacent(vertex)) {
			if (vertices.contains(adj)){
				return true;
			}
		}
		
		return false;
	}
}