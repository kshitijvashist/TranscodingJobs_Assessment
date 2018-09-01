package com.vizart.transcodingjobs.application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.transform.TransformerException;

import com.vizarttrancodingjobs.service.FailedJobsDescriptor;
import com.vizarttrancodingjobs.service.JobsCounterHandler;
import com.vizarttrancodingjobs.service.JobsPublishedParticularScenario;
import com.vizary.transcodingjobs.Inereface.ItranscodingJobs;

public class TranscodingJobsApplication {
	
	public static void main(String args[]) throws TransformerException
	{
		Scanner in = new Scanner(System.in); 
		int val=0;
		//String xmlName=TranscodingJobsUtils.traceJobsRequestFile;
	//System.out.println(xmlName);
	String xmlName="C:\\Users\\m69174\\Downloads\\test\\programming_test_vizrt\\jobs.xml";

	ItranscodingJobs jobs=new JobsCounterHandler();

	List<String> listOfFailedDescriptors=new ArrayList<String>();
	List<String> listOfPublishedJobs=new ArrayList<String>();
	
    
   
	
		
		
	while(true)
		
	{
		System.out.println("Enter the number of Solution you want to check, Like 1, 2 and 3.");

		 val= in.nextInt();
	
	switch(val)
	{
	case 1:
	{
		
			Map<String,Integer>mapCountList=jobs.getJobsStatusCounter(xmlName);
	
			for (Map.Entry<String, Integer> entry : mapCountList.entrySet())
			{
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
	}
		break;
	case 2:
		{
			ItranscodingJobs jobsError=new FailedJobsDescriptor();
			listOfFailedDescriptors=jobsError.getFailedStatusErrorDescription(xmlName);


			listOfFailedDescriptors.forEach(System.out::println);

		}
		break;
	case 3:
		{
			ItranscodingJobs jobsPublished=new JobsPublishedParticularScenario();
		listOfPublishedJobs=jobsPublished.getParticularPublishedJobs(xmlName);

		listOfPublishedJobs.forEach(System.out::println);


		}
		break;
		default:
			System.out.println("Wrong Input Enetered");
			break;
		}
	
	
	}
	
	
	}



	

}
