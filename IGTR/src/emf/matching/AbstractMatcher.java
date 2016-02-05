package emf.matching;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * An abstract implementation of the IMatcher interface. A subclass has to
 * implement the methods
 *
 */
public abstract class AbstractMatcher implements IMatcher {

	/**
	 * The matching.
	 */
	protected Matching matching;

	/**
	 * The A version of the model.
	 */
	protected Resource modelA;

	/**
	 * The B version of the model.
	 */
	protected Resource modelB;

	@Override
	public Matching createMatching(Resource modelA, Resource modelB) {
		matching = new Matching(modelA, modelB);

		EObject elementA = null;
		TreeIterator<EObject> iterA = modelA.getAllContents();

		// very simple "quadratic matching algorithm"
		while (iterA.hasNext()) {
			elementA = iterA.next();

			EObject elementB = null;
			TreeIterator<EObject> iterB = modelB.getAllContents();
			while (iterB.hasNext()) {
				elementB = iterB.next();

				if (isCorresponding(elementA, elementB)) {
					matching.addCorrespondence(elementA, elementB);
					break;
				}
			}
		} 

		return matching;
	}

	/**
	 * Calculates matching between to objects. Subclasses have to implement this
	 * method!
	 * 
	 * @param elementA
	 *            the model A version of the object.
	 * @param elementB
	 *            the model B version of the object.
	 * @return true if the objects are corresponding to each other; false
	 *         otherwise.
	 */
	protected abstract boolean isCorresponding(EObject elementA, EObject elementB);
}
