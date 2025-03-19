package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract public class HelloServlet3 extends GenericServlet {

	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		System.out.println("Http-service()");
	}

}
