package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	//declaring variable
	String phoneNo;
	String emailId;
	String State;
	String Country;
	static{
		System.out.println("TestServlet-SB");
	}
    public TestServlet() {
    	System.out.println("TestServlet-DC");
    }
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("TestServlet-init() begin");
		//collecting config parameter
		phoneNo=config.getInitParameter("phone");
		emailId=config.getInitParameter("email");
		//creating context Object
		//ServletContext sc=this.getServletContext();
		ServletContext sc1=config.getServletContext();
		//collecting context parameter
		State=sc1.getInitParameter("state");
		Country=sc1.getInitParameter("country");
		System.out.println("TestServlet-init() end");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet- service() begin");
		//collecting request Parameter
		String un=request.getParameter("uname");
		
		//sending the response by displaying the parameter name & values
		PrintWriter out=response.getWriter();
		out.println("<h1>UserName: "+un+"</h1>");
		out.println("<h1>PhoneNo: "+phoneNo+"</h1>");
		out.println("<h1>EmailId: "+emailId+"</h1>");
		out.println("<h1>State: "+State+"</h1>");
		out.println("<h1>Country: "+Country+"</h1>");
		System.out.println("TestServlet- service() end");
	}
	
	public void destroy() {
		System.out.println("TestServlet-destroy()");
	}
}
