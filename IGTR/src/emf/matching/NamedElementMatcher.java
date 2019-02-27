package emf.matching;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import emf.domain.IDomainConfiguration;

/**
 * Concrete matcher that checks whether two elements have a name attribute and,
 * if so, checks if the names are equal Strings.
 * 
 * @author kehrer
 */
public class NamedElementMatcher extends AbstractMatcher {

	protected boolean useQualifiedNames = true;

	public NamedElementMatcher(IDomainConfiguration domainConfiguration) {
		super(domainConfiguration);		
	}

	@Override
	protected boolean isCorresponding(EObject elementA, EObject elementB) {
		assert (elementA != null && elementB != null) : "One of the elements to check for correspondence is null!";

		// type should be identical in order to correspond
		if (elementA.eClass() != elementB.eClass()) {
			return false;
		}

		// Check for attribute "name" and its values equality
		EStructuralFeature attrName = elementA.eClass().getEStructuralFeature("name");
		if (attrName != null && attrName instanceof EAttribute) {
			Object nameA;
			Object nameB;

			if (useQualifiedNames) {
				nameA = deriveQualifiedName(elementA);
				nameB = deriveQualifiedName(elementB);
			} else {
				nameA = elementA.eGet(attrName);
				nameB = elementB.eGet(attrName);
			}

			if (nameA != null && nameB != null) {
				return nameA.equals(nameB);
			}
		}

		return false;
	}

	private String deriveQualifiedName(EObject eObject) {
		String featureName = "";
		if (eObject instanceof ENamedElement) {
			featureName = eObject.eGet(eObject.eClass().getEStructuralFeature("name")).toString();

			assert (featureName != "") : eObject + "has no name";

			while (eObject.eContainer() != null) {
				eObject = eObject.eContainer();
				featureName = eObject.eGet(eObject.eClass().getEStructuralFeature("name")) + "." + featureName;
			}
		}

		return featureName;
	}

	@Override
	public boolean canHandle(Resource modelA, Resource modelB) {
		return checkHasNames(modelA) && checkHasNames(modelB);
	}

	private boolean checkHasNames(Resource r) {
		// Does every element have a name attribute?

		TreeIterator<EObject> iter = r.getAllContents();
		while (iter.hasNext()) {
			EObject element = iter.next();
			if (domainConfiguration.getUnconsideredNodeTypes().contains(element.eClass())){
				continue;
			}
			
			EStructuralFeature attrName = element.eClass().getEStructuralFeature("name");
			if (attrName == null) {
				return false;
			}
		}

		return true;
	}
}
