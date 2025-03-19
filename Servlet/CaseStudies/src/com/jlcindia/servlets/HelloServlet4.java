package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet4 extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		System.out.println("Http-service()");
	}
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("GS-service");		
	}
}
