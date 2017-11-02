package crossValidation;

import java.io.FileNotFoundException;
import java.io.IOException;

import net.n3.nanoxml.IXMLParser;
import net.n3.nanoxml.IXMLReader;
import net.n3.nanoxml.StdXMLReader;
import net.n3.nanoxml.XMLElement;
import net.n3.nanoxml.XMLException;
import net.n3.nanoxml.XMLParserFactory;

public class JXMLInstances {


	protected XMLElement myXML=null;
	protected XMLElement myXMLXMLElement1=null;
	protected XMLElement myXMLXMLElement2=null;
	protected XMLElement myXMLXMLElement3=null;
	protected XMLElement myXMLXMLElement4=null;
	protected XMLElement myXMLXMLElementNotExist=null;
	protected XMLElement XMLElementTestNew=null;
	protected XMLElement[] xmlElmentForMO =null;
	protected XMLElement[] xmlElmentForMO2 = null;



	public JXMLInstances() throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException, IOException, XMLException{

		IXMLParser parser = XMLParserFactory.createDefaultXMLParser();	
		IXMLReader reader = StdXMLReader.fileReader(HenshinVisualContracts.strFolder + "example.xml");
		parser.setReader(reader);
		myXML = (XMLElement) parser.parse();		
		//
		this.myXML = (XMLElement)myXML.getChildAtIndex(0);
		//		

		this.myXMLXMLElement1 = new XMLElement();
		this.myXMLXMLElement1.setName("Abdullah1");
		this.myXMLXMLElement1.setContent("Barro1");


		this.myXMLXMLElement2 = new XMLElement();
		this.myXMLXMLElement2.setName("Abdullah2");
		this.myXMLXMLElement2.setContent("Barro2");


		this.myXMLXMLElement3 = new XMLElement();
		this.myXMLXMLElement3.setName("Abdullah3");
		this.myXMLXMLElement3.setContent("Barro3");
		this.myXML.addChild(myXMLXMLElement3);


		this.myXMLXMLElement4 = new XMLElement();
		this.myXMLXMLElement4.setName("Abdullah4");
		this.myXMLXMLElement4.setContent("Barro4");



		this.myXMLXMLElementNotExist = new XMLElement();
		this.myXMLXMLElementNotExist.setName("Abdullah4");
		this.myXMLXMLElementNotExist.setContent("Barro4");



		this.xmlElmentForMO = new XMLElement[10];
		this.xmlElmentForMO2 = new XMLElement[6];

		for (int i=0; i<xmlElmentForMO.length; i++){
			xmlElmentForMO[i]=new XMLElement("abdNew1" + i);
		}

		for (int i=0; i<xmlElmentForMO2.length; i++){
			xmlElmentForMO2[i]=new XMLElement("abdNew21" + i);
		}

	}
	
	
	protected void XMLElement(){}


}
