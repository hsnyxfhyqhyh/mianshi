package com.ying;

import java.io.File;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestPropertiesConfigFile {

		//initializing logger object for current class. 
		private static final Logger logger  = Logger.getLogger(TestPropertiesConfigFile.class); 
		
		public static void main(String[] args) {
			//Initialize log4j
			PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "log4j.properties");
			
			logger.error("This is a error msg");//
		}	
}
