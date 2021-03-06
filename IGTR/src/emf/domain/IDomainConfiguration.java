package emf.domain;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import emf.matching.IMatcher;

/**
 * Generic interface for providing additional, domain-specific configuration
 * data to adapt the generic EMF import facility to domain specifics, if needed.
 * 
 */
public interface IDomainConfiguration {

	//public static final String MODEL_TYPE = "ecore";
	//public static final String MODEL_TYPE = "uml";
	//public static final String MODEL_TYPE = "rentalService";
	public static final String MODEL_TYPE = "graph";
	
	public Set<EClass> getUnconsideredNodeTypes();

	public Set<EReference> getUnconsideredEdgeTypes();

	public Set<EAttribute> getUnconsideredAttributeTypes();
	
	public Set<EAttribute> getVisibleAttributeTypes(EClass eClass);

	public IMatcher createMatcher(Resource modelA, Resource modelB);

	public EPackage getEPackage();
	
	public EClass deriveNodeType(String name);

	public EReference deriveEdgeType(EClass srcNodeType, String name);

	public EAttribute deriveAttributeType(EClass nodeType, String name);
	
	public boolean doDeriveParameters();
	
	public boolean treatAttributesAsNodes();
}
