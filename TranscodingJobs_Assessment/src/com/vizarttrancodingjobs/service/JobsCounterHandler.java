package com.vizarttrancodingjobs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import com.XmlUtils.XmlDocHandler;
import com.vizart.transcodingjobs.generalUtils.XmlParser;
import com.vizary.transcodingjobs.Inereface.ItranscodingJobs;

public class JobsCounterHandler implements ItranscodingJobs {
	public Map<String,Integer> getJobsStatusCounter(String xmlName)
	{
		Map<String,Integer> statusCountList=new HashMap<String,Integer>();
		try
		{
			int activeCount=0;
			int failedCount=0;
			int finishedCount=0;
			Document doc=XmlParser.getParseXML(xmlName);
		
		
		List<String> listOfStatus=new ArrayList<String>();
		
		listOfStatus = XmlDocHandler.getXmlTagValues(doc, "vaext:status");
		
			for(String status:listOfStatus)
			{
				if(status.equals("finished"))
					finishedCount++;
				if(status.equals("active"))
					activeCount++;
				
				if(status.equals("failed"))
					failedCount++;
					
			}
			
			statusCountList.put("finished", finishedCount);
			statusCountList.put("active", activeCount);
			statusCountList.put("failed", failedCount);
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			//System.out.println("req="+req);
		return statusCountList;
	}

	@Override
	public List<String> getFailedStatusErrorDescription(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getParticularPublishedJobs(String xmlName) {
		// TODO Auto-generated method stub
		return null;
	}

}
