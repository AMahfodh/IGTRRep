package util.digraph;

public class DigraphEdge {

	DigraphNode src;
	DigraphNode tgt;
	
	public DigraphEdge(DigraphNode src, DigraphNode tgt) {
		super();
		this.src = src;
		this.tgt = tgt;
	}
	
	@Override
	public String toString() {
		return src.toString() + " -> " + tgt.toString();
	}

}
