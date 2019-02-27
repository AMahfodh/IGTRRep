package emf.domain;

public class DomainConfigurationFactory {

	private static EcoreDomainConfiguration ecoreDomainConfiguration = new EcoreDomainConfiguration();
	private static UMLDomainConfiguration umlDomainConfiguration = new UMLDomainConfiguration();
	private static JCarRentalDomainConfiguration rentalServiceDomainConfiguration = new JCarRentalDomainConfiguration();
	private static GraphDomainConfiguration graphDomainConfiguration = new GraphDomainConfiguration();
	
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
		if (IDomainConfiguration.MODEL_TYPE.equals("graph")) {
			return graphDomainConfiguration;
		}
		
		
		
		return null;
	}
}
