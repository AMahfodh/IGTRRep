package emf.domain;

public class DomainConfigurationFactory {

	private static EcoreDomainConfiguration ecoreDomainConfiguration = new EcoreDomainConfiguration();
	private static UMLDomainConfiguration umlDomainConfiguration = new UMLDomainConfiguration();
	private static JCarRentalDomainConfiguration rentalServiceDomainConfiguration = new JCarRentalDomainConfiguration();
	
	public static IDomainConfiguration createDomainConfiguration() {
		if (IDomainConfiguration.MODEL_TYPE.equals("ecore")) {
			return ecoreDomainConfiguration;
		}
		if (IDomainConfiguration.MODEL_TYPE.equals("uml")) {
			return umlDomainConfiguration;
		}
		if (IDomainConfiguration.MODEL_TYPE.equals("rentalService")) {
			return rentalServiceDomainConfiguration;
		}
		
		return null;
	}
}
