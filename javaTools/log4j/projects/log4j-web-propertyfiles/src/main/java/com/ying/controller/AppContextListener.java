package com.ying.controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AppContextListener implements ServletContextListener {

	private Logger logger = Logger.getLogger(AppContextListener.class); 
	
	public void contextInitialized(ServletContextEvent contextEvent) {
		logger.info("************context initialzation started**********");
		
		ServletContext context = contextEvent.getServletContext(); 
		
		String log4jConfigLocation = context.getInitParameter("Log4j-config-location"); 
		String fullPath = context.getRealPath("") + File.separator + log4jConfigLocation; 
		
		PropertyConfigurator.configure(fullPath);
		logger.info("************log4j initialized successfully ********");
		
		logger.info("************context initialzation ended**********");
		
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		logger.info("context object destroyed");
	}
	
	

}
