package emf.domain;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import emf.matching.IMatcher;
import emf.matching.SimpleGraphMatcher;
import graph.GraphPackage;

public class GraphDomainConfiguration extends AbstractDomainConfiguration{
	private Set<EClass> unconsideredNodeTypes;
	private Set<EReference> unconsideredEdgeTypes;
	private Set<EAttribute> unconsideredAttributeTypes;
	private Set<EAttribute> visibleAttributeTypes;
	
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
		}
		
		return visibleAttributeTypes;
	}
	
	@Override
	public IMatcher createMatcher(Resource modelA, Resource modelB) {		
		SimpleGraphMatcher matcher = new SimpleGraphMatcher(this);
		if(matcher.canHandle(modelA, modelB)){
			return matcher;
		}
		
		return null;
	}

	@Override
	public EPackage getEPackage() {
		return GraphPackage.eINSTANCE;
	}
	
	@Override
	public boolean treatAttributesAsNodes() {
		return false;
	}
}
