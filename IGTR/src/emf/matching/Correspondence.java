package emf.matching;

import org.eclipse.emf.ecore.EObject;

public class Correspondence {

	private EObject objA;
	private EObject objB;

	public Correspondence(EObject objA, EObject objB) {
		super();
		this.objA = objA;
		this.objB = objB;
	}

	public EObject getObjA() {
		return objA;
	}

	public EObject getObjB() {
		return objB;
	}

}
