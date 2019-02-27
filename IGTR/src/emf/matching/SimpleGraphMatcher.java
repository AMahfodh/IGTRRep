package emf.matching;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import emf.domain.IDomainConfiguration;
import graph.Edge;
import graph.Node;

public class SimpleGraphMatcher extends NamedElementMatcher {
		
	public SimpleGraphMatcher(IDomainConfiguration domainConfiguration) {
		super(domainConfiguration);		
		super.useQualifiedNames = false;
	}

	@Override
	protected boolean isCorresponding(EObject elementA, EObject elementB){	
		assert (elementA != null && elementB != null) : "One of the elements to check for correspondence is null!";
		if(elementA.eClass() != elementB.eClass()) return false;
		
		EClass classA = elementA.eClass();
				
		switch(classA.getName()){
		case "Node":
			return super.isCorresponding(elementA, elementB);		
		case "Edge": 
			EObject sourceA, sourceB, targetA, targetB;
			
			EStructuralFeature sourceRef = classA.getEStructuralFeature("source");
			EStructuralFeature targetRef = classA.getEStructuralFeature("target");
			
			if(sourceRef != null && sourceRef instanceof EReference &&
					targetRef != null && targetRef instanceof EReference) {
				sourceA = (EObject) elementA.eGet(sourceRef);
				sourceB = (EObject) elementB.eGet(sourceRef);
				targetA = (EObject) elementA.eGet(targetRef);
				targetB = (EObject) elementB.eGet(targetRef);

				return super.isCorresponding(sourceA, sourceB) && super.isCorresponding(targetA, targetB);
			}
			
			return false;		
		case "Graph": return true;
		default: return false;
		}
	}
	
	@Override
	public boolean canHandle(Resource modelA, Resource modelB){
		return domainConfiguration.MODEL_TYPE.equals("graph");
	}
}
