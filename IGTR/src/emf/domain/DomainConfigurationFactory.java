package emf.domain;


public class DomainConfigurationFactory {

	private static EcoreDomainConfiguration ecoreDomainConfiguration = new EcoreDomainConfiguration();
	
	public static IDomainConfiguration createDomainConfiguration(String modelType){
		if (modelType.equals("ecore")){
			return ecoreDomainConfiguration;
		}
		
		return null;
	}
}
