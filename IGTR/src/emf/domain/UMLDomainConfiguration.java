package emf.domain;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;

import emf.matching.IMatcher;
import emf.matching.NamedElementMatcher;
import emf.matching.UUIDMatcher;

public class UMLDomainConfiguration extends AbstractDomainConfiguration {

	private Set<EClass> unconsideredNodeTypes;
	private Set<EReference> unconsideredEdgeTypes;
	private Set<EAttribute> unconsideredAttributeTypes;
	private Set<EAttribute> visibleAttributeTypes;

	@Override
	public Set<EClass> getUnconsideredNodeTypes() {
		if (unconsideredNodeTypes == null) {
			unconsideredNodeTypes = new HashSet<EClass>();
			
			// For simplification
			unconsideredNodeTypes.add(UMLPackage.eINSTANCE.getLiteralInteger());
			unconsideredNodeTypes.add(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
		}

		return unconsideredNodeTypes;
	}

	@Override
	public Set<EReference> getUnconsideredEdgeTypes() {
		if (unconsideredEdgeTypes == null) {
			unconsideredEdgeTypes = new HashSet<EReference>();

			// For simplification
			unconsideredEdgeTypes.add(UMLPackage.eINSTANCE.getMultiplicityElement_LowerValue());
			unconsideredEdgeTypes.add(UMLPackage.eINSTANCE.getMultiplicityElement_UpperValue());
			
			// redundancies
			unconsideredEdgeTypes.add(UMLPackage.eINSTANCE.getGeneralization_Specific());
		}

		return unconsideredEdgeTypes;
	}

	@Override
	public Set<EAttribute> getUnconsideredAttributeTypes() {
		if (unconsideredAttributeTypes == null) {
			unconsideredAttributeTypes = new HashSet<EAttribute>();
		}

		return unconsideredAttributeTypes;
	}

	@Override
	public Set<EAttribute> getVisibleAttributeTypes() {
		if (visibleAttributeTypes == null) {
			visibleAttributeTypes = new HashSet<EAttribute>();

			visibleAttributeTypes.add(UMLPackage.eINSTANCE.getNamedElement_Name());
			visibleAttributeTypes.add(UMLPackage.eINSTANCE.getClassifier_IsAbstract());
		}

		return visibleAttributeTypes;
	}

	@Override
	public IMatcher createMatcher(Resource modelA, Resource modelB) {
		UUIDMatcher uuidMatcher = new UUIDMatcher(this);
		if (uuidMatcher.canHandle(modelA, modelB)) {
			return uuidMatcher;
		}

		NamedElementMatcher namedElementMatcher = new NamedElementMatcher(this);
		if (namedElementMatcher.canHandle(modelA, modelB)) {
			return namedElementMatcher;
		}

		return null;
	}

	@Override
	public EPackage getEPackage() {
		return UMLPackage.eINSTANCE;
	}
	
	@Override
	public boolean treatAttributesAsNodes() {
		return true;
	}

}
