package emf.domain;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

import emf.matching.IMatcher;
import emf.matching.NamedElementMatcher;
import emf.matching.UUIDMatcher;

public class EcoreDomainConfiguration implements IDomainConfiguration {

	private Set<EClass> unconsideredNodeTypes;
	private Set<EReference> unconsideredEdgeTypes;
	private Set<EAttribute> unconsideredAttributeTypes;

	@Override
	public Set<EClass> getUnconsideredNodeTypes() {
		if (unconsideredNodeTypes == null) {
			unconsideredNodeTypes = new HashSet<EClass>();

			// technical
			unconsideredNodeTypes.add(EcorePackage.eINSTANCE.getEFactory());

			// generics
			unconsideredNodeTypes.add(EcorePackage.eINSTANCE.getETypeParameter());
			unconsideredNodeTypes.add(EcorePackage.eINSTANCE.getEGenericType());
		}

		return unconsideredNodeTypes;
	}

	@Override
	public Set<EReference> getUnconsideredEdgeTypes() {
		if (unconsideredEdgeTypes == null) {
			unconsideredEdgeTypes = new HashSet<EReference>();

			// technical
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEFactory_EPackage());
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEPackage_EFactoryInstance());

			// generics
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEClassifier_ETypeParameters());
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEOperation_ETypeParameters());
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEOperation_EGenericExceptions());
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getEClass_EGenericSuperTypes());
			unconsideredEdgeTypes.add(EcorePackage.eINSTANCE.getETypedElement_EGenericType());
		}

		return unconsideredEdgeTypes;
	}

	@Override
	public Set<EAttribute> getUnconsideredAttributeTypes() {
		if (unconsideredAttributeTypes == null) {
			unconsideredAttributeTypes = new HashSet<EAttribute>();

			// technical
			unconsideredAttributeTypes.add(EcorePackage.eINSTANCE.getEClassifier_InstanceClassName());
			unconsideredAttributeTypes.add(EcorePackage.eINSTANCE.getEClassifier_InstanceTypeName());
		}

		return unconsideredAttributeTypes;
	}

	@Override
	public IMatcher createMatcher(Resource modelA, Resource modelB) {		
		UUIDMatcher uuidMatcher = new UUIDMatcher(this);
		if (uuidMatcher.canHandle(modelA, modelB)){
			return uuidMatcher;
		}
		
		NamedElementMatcher namedElementMatcher = new NamedElementMatcher(this);
		if (namedElementMatcher.canHandle(modelA, modelB)){
			return namedElementMatcher;
		}
		
		return null;
	}
}
