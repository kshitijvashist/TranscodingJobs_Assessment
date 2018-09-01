package com.vizarttrancodingjobs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import com.XmlUtils.XmlDocHandler;
import com.vizart.transcodingjobs.generalUtils.XmlParser;
import com.vizary.transcodingjobs.Inereface.ItranscodingJobs;

public class FailedJobsDescriptor implements ItranscodingJobs {
	

	@Override
	public List<String> getFailedStatusErrorDescription(String xmlName) {
		// TODO Auto-generated method stub
	Document doc=XmlParser.getParseXML(xmlName);
		
		
		List<String> listOfErrDesc=new ArrayList<String>();
		
		listOfErrDesc = XmlDocHandler.getXmlTagValues(doc, "verr:error");
		
			
		
		return listOfErrDesc;
	}

	@Override
	public List<String> getParticularPublishedJobs(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getJobsStatusCounter(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}

}
