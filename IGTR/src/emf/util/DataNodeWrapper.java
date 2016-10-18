package emf.util;

import inferences.ParseRuleInstances;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;

public class DataNodeWrapper {

	private IDomainConfiguration domainConfig;

	// disctincAttributeValues -> DataSort
	private Map<Object, String> distinctAttributeValues2DataSort;

	public DataNodeWrapper(List<Resource> models) {
		super();
		distinctAttributeValues2DataSort = new HashMap<Object, String>();
		domainConfig = DomainConfigurationFactory.createDomainConfiguration();

		for (Resource model : models) {
			addDisctinctAttributeValues(model);
		}
	}

	public DataNodeWrapper(Resource... models) {
		super();
		distinctAttributeValues2DataSort = new HashMap<Object, String>();
		domainConfig = DomainConfigurationFactory.createDomainConfiguration();

		for (Resource model : models) {
			addDisctinctAttributeValues(model);
		}
	}

	public Set<Object> getDisctinctAttributeValues() {
		return distinctAttributeValues2DataSort.keySet();
	}

	public Set<String> getDisctinctRepresentativeDataSortElements() {
		Set<String> res = new HashSet<String>();
		for (Object v :  distinctAttributeValues2DataSort.keySet()) {
			String elmt = getRepresentativeDataSortElement(v);
			if (elmt != null && !res.contains(elmt)){
				res.add(elmt);
			}
		}
		
		return res;
	}
	
	public String getRepresentativeDataSortElement(Object attValue) {
		String sort = distinctAttributeValues2DataSort.get(attValue);
		if (sort.equals("String")){
			return sort + "Element";
		} else {
			return null;
		}
	}

	private void addDisctinctAttributeValues(Resource model) {
		TreeIterator<EObject> iterator = model.getAllContents();

		while (iterator.hasNext()) {
			EObject eObject = iterator.next();

			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (domainConfig.getUnconsideredAttributeTypes().contains(eAttribute)
						|| EMFMetaUtil.isUnconsideredStructualFeature(eAttribute)
						|| !domainConfig.getVisibleAttributeTypes().contains(eAttribute)) {
					continue;
				}

				Object attValue = eObject.eGet(eAttribute);
				if (attValue != null && !distinctAttributeValues2DataSort.keySet().contains(attValue)) {
					distinctAttributeValues2DataSort.put(attValue, eAttribute.getEAttributeType().getName());
				}
			}
		}
	}
	
	public static DataNodeWrapper getComprehensiveDataNodeWrapper() {
		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";

		String modelsPath = examplesPath + File.separator + IDomainConfiguration.MODEL_TYPE;
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		List<Resource> models = new ArrayList<Resource>();
		for (File operation : operations) {
			File[] examples = operation.listFiles();
			for (File example : examples) {

				if (example.getName().startsWith(ParseRuleInstances.PREFIX_POSITIVE)
						|| example.getName().startsWith(ParseRuleInstances.PREFIX_POSITIVE)) {
					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original."
							+ IDomainConfiguration.MODEL_TYPE;
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed."
							+ IDomainConfiguration.MODEL_TYPE;

					Resource modelOriginal = EMFResourceUtil.loadModel(pathOriginal);
					Resource modelChanged = EMFResourceUtil.loadModel(pathChanged);

					models.add(modelOriginal);
					models.add(modelChanged);
				}
			}
		}
		
		DataNodeWrapper wrapper = new DataNodeWrapper(models);
		
		return wrapper;
	}

}
