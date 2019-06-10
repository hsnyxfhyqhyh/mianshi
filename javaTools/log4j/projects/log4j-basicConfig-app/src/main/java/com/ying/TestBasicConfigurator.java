package com.ying; 

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestBasicConfigurator {
	//initializing logger object for current class. 
	private static final Logger logger  = Logger.getLogger(TestBasicConfigurator.class); 
	
	public static void main(String[] args) {
		//using basic configurator
		BasicConfigurator.configure();
		
		logger.error("This is a error msg");
	}
}
