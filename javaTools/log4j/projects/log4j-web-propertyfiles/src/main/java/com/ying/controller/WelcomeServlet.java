package com.ying.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class WelcomeServlet extends HttpServlet {
	private Logger logger = Logger.getLogger(WelcomeServlet.class);

	public WelcomeServlet() {
		logger.debug("WelcomeServlet:::Instantiation");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("doGet Method Execution started....");
		
		response.getWriter().append("<h1>welcome, this msg is generated form welcome servlet..!!</h1>");
		
		logger.debug("doGet Method Execution completed....");
	}
	
	
	
	
}
