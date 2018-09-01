package com.vizart.transcodingjobs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
/**
 * loadPropertiesFile:This Method loads the property file
 * when the deployment descriptor runs.
 * voicemailResponsePath:This variable provides the path for
 * voiceMailResponse Xml file.
 * document format.
 * @author m69174
 */
public class TranscodingJobsUtils {
	private static Logger LOGGER = Logger.getLogger("VoiceMailLog");
	public static final Properties prop = new Properties();
	public static final String configFilePath = "C:\\Users\\m69174\\Downloads\\test\\app.properties";
	//public static final String configFilePath = "/usr/local/apache-tomcat-8.0.37/webapps/TestMigration/app.properties";

	
	public static InputStream input = null;
	public static String traceJobsRequestFile;
	
	public static void loadPropertiesFile(){
		
		 try {
				input = new FileInputStream(TranscodingJobsUtils.configFilePath);
				try {
					TranscodingJobsUtils.prop.load(input); //Load the property file for VoiceMail Stub.
					LOGGER.info("Property file has been loaded successfully");
					
				} catch (IOException e) {
					e.getMessage();
				}
				
				traceJobsRequestFile = TranscodingJobsUtils.prop.getProperty("traceJobsRequestFile");//Fetching the path of XML file response.
					
		 System.out.println(traceJobsRequestFile);}
		 catch (Exception e) {
			 LOGGER.error("Error in loading the property file");
				
			
			}
		 
	}} 
		 
