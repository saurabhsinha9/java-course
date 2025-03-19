package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet{
	
	static{
		System.out.println("DS-SB");
	}
	public DemoServlet() {
		System.out.println("DS-DC");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("DS-init()");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DS-service()-begin");
		System.out.println(request.getCharacterEncoding());
		System.out.println(request.getContentLength());
		response.setContentType("text/html");
		
		System.out.println(request.getContentType());
		System.out.println(request.getContextPath());
		System.out.println(request.getDateHeader(getServletInfo()));
		System.out.println(request.getServletPath());
		System.out.println(request.getServerPort());
		System.out.println(request.getServerName());
		
		System.out.println(request.getSession());
		System.out.println(request.getSession(true));
		
		System.out.println(request.getRequestURL());
		System.out.println(request.getIntHeader(getServletInfo()));
		System.out.println(request.getLocalAddr());
		System.out.println(request.getLocalName());
		System.out.println(request.getLocalPort());
		System.out.println(request.getMethod());
		System.out.println(request.getMethod());
		System.out.println(request.getPathInfo());
		System.out.println(request.getPathTranslated());
		System.out.println(request.getProtocol());
		System.out.println(response.);
		System.out.println("DS-service()-end");
	}
}