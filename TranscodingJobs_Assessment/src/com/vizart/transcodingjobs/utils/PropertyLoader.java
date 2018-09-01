package com.vizart.transcodingjobs.utils;


/*File Name: MyServletContextListener.class
Author : m62168
Company : TCS
Description : It starts the ASListener and MCA Application as the web application is deployed.       
*/


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class PropertyLoader implements ServletContextListener {
		
  public void contextInitialized(ServletContextEvent sce) {
	  TranscodingJobsUtils.loadPropertiesFile();
	  }
  
  
	public void contextDestroyed(ServletContextEvent sce){
        try {
        	
        } catch (Exception ex) {
        }
    }
}