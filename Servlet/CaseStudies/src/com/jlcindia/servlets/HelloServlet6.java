package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet6 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		System.out.println("dopost");
	}
	
}
