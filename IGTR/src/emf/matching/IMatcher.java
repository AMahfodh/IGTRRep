package emf.matching;

import org.eclipse.emf.ecore.resource.Resource;

public interface IMatcher {
	
	/**
	 * Creates a matching, i.e. determines corresponding elements in modelA and modelB.
	 * 
	 * @param modelA
	 * @param modelB
	 * @return
	 */
	public Matching createMatching(Resource modelA, Resource modelB);
	
	/**
	 * Returns whether the matcher can handle the given models.
	 * 
	 * @param modelA
	 * @param modelB
	 * @return
	 */
	public boolean canHandle(Resource modelA, Resource modelB);
}
