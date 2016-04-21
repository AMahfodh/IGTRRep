package util.digraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class CycleChecker {

	private Digraph digraph;

	private Collection<DigraphNode> finished = new ArrayList<DigraphNode>();
	private List<DigraphNode> visited = new ArrayList<DigraphNode>();
	private List<DigraphNode> path = new ArrayList<DigraphNode>();

	public CycleChecker(Digraph digraph) {
		this.digraph = digraph;

		finished = new ArrayList<DigraphNode>();
		visited = new ArrayList<DigraphNode>();
		path = new ArrayList<DigraphNode>();
	}

	/**
	 * returns an empty list if no cycle is found. Otherwise, the cycle is
	 * returned as a list of nodes contained by the cycle.
	 */
	public List<DigraphNode> check() {
		for (DigraphNode v : digraph.getNodes()) {
			if (checkNode(v)) {
				Collections.reverse(path);
				path.add(0, v);
				// close the cycle
				//cycle.add(v);
				
				break;
			}
		}

		return path;
	}

	private boolean checkNode(DigraphNode node) {
		if (finished.contains(node)) {
			return false;
		}
		if (visited.contains(node)) {
			return true;
		}
		visited.add(node);
		for (DigraphNode v : digraph.getAdjacent(node)) {
			if (checkNode(v)) {
				path.add(v);
				return true;
			}
		}
		finished.add(node);
		return false;
	}

	/**
	 * Unit tests this cycle checker
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Digraph g1 = new Digraph();
		Digraph g2 = new Digraph();
		Digraph g3 = new Digraph();

		DigraphNode n1;
		DigraphNode n2;
		DigraphNode n3;
		DigraphNode n4;
		DigraphNode n5;
		DigraphNode n6;

		// g1: no cycle
		n1 = new DigraphNode("1");
		n2 = new DigraphNode("2");
		n3 = new DigraphNode("3");
		DigraphEdge g1_n1_n2 = new DigraphEdge(n1, n2);
		DigraphEdge g1_n1_n3 = new DigraphEdge(n1, n3);
		DigraphEdge g1_n2_n3 = new DigraphEdge(n2, n3);
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addEdge(g1_n1_n2);
		g1.addEdge(g1_n1_n3);
		g1.addEdge(g1_n2_n3);

		System.out.println("g1:");
		CycleChecker checker = new CycleChecker(g1);
		List<DigraphNode> cycle = checker.check();
		for (DigraphNode digraphNode : cycle) {
			System.out.println(digraphNode);
		}

		// g2: simple cycle
		n1 = new DigraphNode("1");
		n2 = new DigraphNode("2");
		DigraphEdge g2_n1_n2 = new DigraphEdge(n1, n2);
		DigraphEdge g2_n2_n1 = new DigraphEdge(n2, n1);
		g2.addNode(n1);
		g2.addNode(n2);
		g2.addEdge(g2_n1_n2);
		g2.addEdge(g2_n2_n1);

		System.out.println("g2:");
		checker = new CycleChecker(g2);
		cycle = checker.check();
		for (DigraphNode digraphNode : cycle) {
			System.out.println(digraphNode);
		}

		// g3: more complex cycle
		n1 = new DigraphNode("1");
		n2 = new DigraphNode("2");
		n3 = new DigraphNode("3");
		n4 = new DigraphNode("4");
		n5 = new DigraphNode("5");
		n6 = new DigraphNode("6");
		DigraphEdge e1 = new DigraphEdge(n1, n5);
		DigraphEdge e2 = new DigraphEdge(n1, n2);
		DigraphEdge e3 = new DigraphEdge(n2, n3);
		DigraphEdge e4 = new DigraphEdge(n3, n6);
		DigraphEdge e5 = new DigraphEdge(n4, n1);
		DigraphEdge e6 = new DigraphEdge(n3, n4);
		
		g3.addNode(n1);
		g3.addNode(n2);
		g3.addNode(n3);
		g3.addNode(n4);
		g3.addNode(n5);
		g3.addNode(n6);
		g3.addEdge(e1);
		g3.addEdge(e2);
		g3.addEdge(e3);
		g3.addEdge(e4);
		g3.addEdge(e5);
		g3.addEdge(e6);
		
		System.out.println("g3:");
		checker = new CycleChecker(g3);
		cycle = checker.check();
		for (DigraphNode digraphNode : cycle) {
			System.out.println(digraphNode);
		}
	}
}
