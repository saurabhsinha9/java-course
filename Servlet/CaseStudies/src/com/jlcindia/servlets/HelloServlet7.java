package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet7 extends HttpServlet {
	
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException {
		System.out.println("GS-service()");
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		service(request,response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("HTTP-service()");
		String method=request.getMethod();
		if(method.equals("GET")){
			doGet(request,response);
		}
		if(method.equals("POST")){
			doPost(request,response);
		}
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("dopost");
	}	
}
