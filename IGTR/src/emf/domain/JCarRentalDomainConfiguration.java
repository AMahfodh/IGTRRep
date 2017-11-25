package emf.domain;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import emf.matching.IMatcher;
import rentalService.RentalServicePackage;

public class JCarRentalDomainConfiguration extends AbstractDomainConfiguration {

	private Set<EClass> unconsideredNodeTypes;
	private Set<EReference> unconsideredEdgeTypes;
	private Set<EAttribute> unconsideredAttributeTypes;
	private Set<EAttribute> visibleAttributeTypes;

	@Override
	public EClass deriveNodeType(String name) {
		String n = name;
		if (n.endsWith("[]")){			
			n = n.replace("[]", "Array");
		}
		
		return super.deriveNodeType(n);
	}
	
	@Override
	public Set<EClass> getUnconsideredNodeTypes() {
		if (unconsideredNodeTypes == null) {
			unconsideredNodeTypes = new HashSet<EClass>();			
		}

		return unconsideredNodeTypes;
	}

	@Override
	public Set<EReference> getUnconsideredEdgeTypes() {
		if (unconsideredEdgeTypes == null) {
			unconsideredEdgeTypes = new HashSet<EReference>();
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
	public Set<EAttribute> getVisibleAttributeTypes(EClass eClass) {
		if (visibleAttributeTypes == null) {
			visibleAttributeTypes = new HashSet<EAttribute>();
			
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getBranch_City());
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getBranch_CMax());
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getBranch_RMax());
			
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getCar_Registration());			
		
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getClient_CName());
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getClient_CName());
			
			visibleAttributeTypes.add(RentalServicePackage.eINSTANCE.getReservation_Reference());
		}
		
		return visibleAttributeTypes;
	}
	
	@Override
	public IMatcher createMatcher(Resource modelA, Resource modelB) {		
//		UUIDMatcher uuidMatcher = new UUIDMatcher(this);
//		if (uuidMatcher.canHandle(modelA, modelB)){
//			return uuidMatcher;
//		}
//		
//		NamedElementMatcher namedElementMatcher = new NamedElementMatcher(this);
//		if (namedElementMatcher.canHandle(modelA, modelB)){
//			return namedElementMatcher;
//		}
		
		return null;
	}

	@Override
	public EPackage getEPackage() {
		return RentalServicePackage.eINSTANCE;
	}
	
	@Override
	public boolean treatAttributesAsNodes() {
		return false;
	}
	
}
