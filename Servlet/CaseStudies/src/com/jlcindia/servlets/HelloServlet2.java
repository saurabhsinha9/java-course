package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException {
		System.out.println("GS-service()");
	}
}
