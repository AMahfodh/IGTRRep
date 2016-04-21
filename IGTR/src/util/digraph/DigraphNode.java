package util.digraph;

public class DigraphNode {
	public Object wrappedData;

	public DigraphNode(Object wrappedData) {
		super();
		this.wrappedData = wrappedData;
	}
	
	@Override
	public String toString() {
		return wrappedData.toString();
	}
}
