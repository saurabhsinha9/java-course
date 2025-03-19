package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	static{
		System.out.println("DemoServlet-SB");
	}
    
	public DemoServlet() {
		System.out.println("DemoServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("DemoServlet-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
		System.out.println("DemoServlet-service() begin");
		//collect request parameter
		String un=request.getParameter("uname");
		//display request parameters
		PrintWriter out=response.getWriter();
		out.println("<h1> Username: "+un+"</h1>");
		out.println("----");
		//Request Headers
		Enumeration e=request.getHeaderNames();
		while(e.hasMoreElements()){
			String hn=e.nextElement().toString();
			String hv=request.getHeader(hn);
			out.println("<h1>"+hn+"-"+hv+"</h1>");
		}
		out.println("----");
		//Locale supported by browser
		out.println("<h1>request.getLocale():"+request.getLocale()+"</h1>");
		out.println("----");
		out.println("<h1>All Locale Supported</h1>");
		Enumeration locs=request.getLocales();
		while(locs.hasMoreElements()){
			Locale l=(Locale) locs.nextElement();
			out.println("<h1>"+l+"</h1>");
		}
		out.println("--------********--------");
		//other information from request
		out.println("<h1>request.getMethod():"+request.getMethod()+"</h1>");
		out.println("<h1>request.getRequestURI():"+request.getRequestURI()+"</h1>");
		out.println("<h1>request.getRequestURL():"+request.getRequestURL()+"</h1>");
		out.println("<h1>request.getProtocol():"+request.getProtocol()+"</h1>");
		out.println("<h1>request.getScheme():"+request.getScheme()+"</h1>");
		out.println("<h1>request.getCharacterEncoding():"+request.getCharacterEncoding()+"</h1>");
		out.println("<h1>request.getContentLength():"+request.getContentLength()+"</h1>");
		out.println("<h1>request.getContentType():"+request.getContentType()+"</h1>");
		out.println("<h1>request.getPathInfo():"+request.getPathInfo()+"</h1>");
		out.println("<h1>request.getPathTranslated():"+request.getPathTranslated()+"</h1>");
		out.println("<h1>request.getRemoteAddr():"+request.getRemoteAddr()+"</h1>");
		out.println("<h1>request.getRemotePort():"+request.getRemotePort()+"</h1>");
		out.println("<h1>request.getRemoteHost():"+request.getRemoteHost()+"</h1>");
		out.println("<h1>request.getLocalAddr():"+request.getLocalAddr()+"</h1>");
		out.println("<h1>request.getLocalPort():"+request.getLocalPort()+"</h1>");
		out.println("<h1>request.getLocalName():"+request.getLocalName()+"</h1>");
		out.println("<h1>request.getServerPort():"+request.getServerPort()+"</h1>");
		out.println("<h1>request.getServerName():"+request.getServerName()+"</h1>");
		out.println("<h1>request.getQueryString():"+request.getQueryString()+"</h1>");
		out.println("<h1>request.getServletPath():"+request.getServletPath()+"</h1>");
		out.println("<h1>request.getContextPath():"+request.getContextPath()+"</h1>");
		out.println("<h1>request.getRemoteUser():"+request.getRemoteUser()+"</h1>");
		out.println("<h1>request.getUserPrincipal():"+request.getUserPrincipal()+"</h1>");
		out.println("<h1>request.getAuthType():"+request.getAuthType()+"</h1>");
		out.println("--------********--------");
		System.out.println("DemoServlet-service() end");
	}

	public void destroy() {
		System.out.println("DemoServlet-destroy()");
	}
}
