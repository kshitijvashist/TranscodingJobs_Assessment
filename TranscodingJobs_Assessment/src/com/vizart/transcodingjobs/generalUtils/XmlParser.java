package com.vizart.transcodingjobs.generalUtils;
import java.io.File;

/**
 * getParseXML:This Method takes the xml file
 * as an input , parse it and return the 
 * document format.
 * @author m69174
 */

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
public class XmlParser {
	private static Logger LOGGER = Logger.getLogger("voiceMailLog");

	public static Document getParseXML(String xmlName)
	{
		DocumentBuilder docBuilder;
		Document doc=null;
		File inputFile = new File(xmlName);
		try
		{
			LOGGER.info("Xml File name and Path="+xmlName);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		
	docBuilder = docFactory.newDocumentBuilder();
		
		 doc=docBuilder.parse(inputFile);
		 		}
		catch(Exception e)
		
		{
			LOGGER.error("Error in parsing "+xmlName+" File" );
		}		 
		 return doc;
	}
}
