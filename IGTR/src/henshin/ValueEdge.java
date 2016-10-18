package henshin;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.impl.EdgeImpl;

public class ValueEdge extends EdgeImpl {

	private String attribute;
	
	public ValueEdge() {
		super();
	}

	public ValueEdge(Node source, Node target, EReference type) {
		super(source, target, type);
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
}
