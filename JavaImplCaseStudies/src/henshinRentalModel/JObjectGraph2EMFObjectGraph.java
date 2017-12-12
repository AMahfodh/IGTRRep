package henshinRentalModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public abstract class JObjectGraph2EMFObjectGraph {

	// The top-most containers
	protected Object jRoot;
	protected EObject eRoot;
	
	// All eObjects
	protected Collection<EObject> allEObjects;
	
	// Mappings TODO: Not yet sure if we need them
	protected Map<Object, EObject> jObject2EObject;
	protected Map<EObject, Object> eObject2JObject;

	public void convert(Object container){
		this.jRoot = container;
		this.eRoot = null;
		
		this.allEObjects = new ArrayList<EObject>();
		
		this.jObject2EObject = new HashMap<Object, EObject>();
		this.eObject2JObject = new HashMap<EObject, Object>();
		
		doConversion();
	}

	protected abstract void doConversion();
	
	public EObject getEObject(Object jObject) {
		return null;
	}

	public Object getJObject(EObject eObject) {
		return null;
	}
}
