package com.vizarttrancodingjobs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import com.XmlUtils.XmlDocHandler;
import com.vizart.transcodingjobs.generalUtils.XmlParser;
import com.vizary.transcodingjobs.Inereface.ItranscodingJobs;

public class JobsPublishedParticularScenario implements ItranscodingJobs {


	@Override
	public List<String> getParticularPublishedJobs(String xmlName) {
Document doc=XmlParser.getParseXML(xmlName);
		
		
		List<String> listOfPublishedJobs=new ArrayList<String>();
		
		listOfPublishedJobs = XmlDocHandler.getXmlTagValues(doc, "atom:id");
		

		
	
			
			return listOfPublishedJobs;
	}

	@Override
	public Map<String, Integer> getJobsStatusCounter(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getFailedStatusErrorDescription(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}}
