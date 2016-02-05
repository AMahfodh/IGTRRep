package emf.domain;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import emf.matching.IMatcher;

/**
 * Generic interface for providing additional, domain-specific configuration
 * data to adapt the generic EMF import facility to domain specifics, if needed.
 * 
 */
public interface IDomainConfiguration {

	public Set<EClass> getUnconsideredNodeTypes();

	public Set<EReference> getUnconsideredEdgeTypes();

	public Set<EAttribute> getUnconsideredAttributeTypes();
	
	public IMatcher createMatcher();
}
