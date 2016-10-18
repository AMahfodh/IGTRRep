package emf.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import emf.matching.IMatcher;
import emf.util.EMFMetaUtil;

public abstract class AbstractDomainConfiguration implements IDomainConfiguration {

	@Override
	public abstract Set<EClass> getUnconsideredNodeTypes();

	@Override
	public abstract Set<EReference> getUnconsideredEdgeTypes();

	@Override
	public abstract Set<EAttribute> getUnconsideredAttributeTypes();

	@Override
	public abstract IMatcher createMatcher(Resource modelA, Resource modelB);

	@Override
	public abstract EPackage getEPackage();

	@Override
	public EClass deriveNodeType(String name) {
		List<EClass> res = new ArrayList<EClass>();
		for (EClassifier eClassifier : EMFMetaUtil.getAllMetaClassesForPackage(getEPackage())) {
			if ((eClassifier instanceof EClass) && eClassifier.getName().equals(name)) {
				res.add((EClass) eClassifier);
			}
		}

		if (res.size() == 1) {
			return res.get(0);
		}
		if (res.size() == 0) {
			return null;
		}

		assert (false);

		return null;
	}

	@Override
	public EReference deriveEdgeType(EClass srcNodeType, String name) {
		List<EReference> res = new ArrayList<EReference>();

		for (EReference ref : srcNodeType.getEAllReferences()) {
			if (ref.getName().equals(name)) {
				res.add(ref);
			}
		}

		if (res.size() == 1) {
			return res.get(0);
		}
		if (res.size() == 0) {
			return null;
		}

		assert (false);

		return null;
	}

	@Override
	public EAttribute deriveAttributeType(EClass nodeType, String name) {
		List<EAttribute> res = new ArrayList<EAttribute>();

		for (EAttribute att : nodeType.getEAllAttributes()) {
			if (att.getName().equals(name)) {
				res.add(att);
			}
		}

		assert (res.size() == 1);

		return res.get(0);
	}

	@Override
	public boolean doDeriveParameters() {
		return false;
	}
}
