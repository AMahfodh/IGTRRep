package emf.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import emf.util.EMFResourceUtil;

public class Matching {
	
	/**
	 * The original and the modified model.
	 */
	private Resource modelA; 
	private Resource modelB;
	
	/**
	 * Indexed access to correspondences.
	 */
	private Map<EObject, EObject> correspondencesA2B;
	private Map<EObject, EObject> correspondencesB2A;
	
	/**
	 * Set of correspondences
	 */
	private List<Correspondence> correspondences;
	
	/**
	 * Constructor.
	 * 
	 * @param modelA
	 * @param modelB
	 */
	public Matching(Resource modelA, Resource modelB) {
		super();
		this.modelA = modelA;
		this.modelB = modelB;
		
		this.correspondencesA2B = new HashMap<EObject, EObject>();
		this.correspondencesB2A = new HashMap<EObject, EObject>();
		
		this.correspondences = new ArrayList<Correspondence>();
	}

	/**
	 * Add a correspondence between elementA and elementB.
	 * 
	 * @param elementA
	 * @param elementB
	 */
	public void addCorrespondence(EObject elementA, EObject elementB) {
		assert(EMFResourceUtil.contains(modelA, elementA));
		assert(EMFResourceUtil.contains(modelB, elementB));
		assert(!correspondencesA2B.containsKey(elementA));
		assert(!correspondencesB2A.containsKey(elementB));
		
		correspondencesA2B.put(elementA, elementB);
		correspondencesB2A.put(elementB, elementA);
		
		correspondences.add(new Correspondence(elementA, elementB));
	}
	
	public List<Correspondence> getCorrespondences() {
		return correspondences;
	}

	public boolean isMatched(EObject obj){
		return correspondencesA2B.containsKey(obj) || correspondencesB2A.containsKey(obj);
	}
	
	@Override
	public String toString() {
		String res = super.toString() + "\n";
		for (EObject objA : correspondencesA2B.keySet()) {
			EObject objB = correspondencesA2B.get(objA);
			res += " " + objA + " <-> " + objB + "\n";
		}
		return res;
	}
	
	
}
