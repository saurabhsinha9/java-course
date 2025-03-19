package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemoServlet extends HttpServlet {
	static{
		System.out.println("SessionDemoServlet-SB");
	}
    public SessionDemoServlet() {
    	System.out.println("SessionDemoServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("SessionDemoServlet-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SessionDemoServlet-service() begin");
		String un=request.getParameter("uname");
		System.out.println(un);
		HttpSession session=request.getSession();
		boolean b=session.isNew();
		if(b){
			System.out.println("New Client-Session just created");
		}else{
			System.out.println("Old client-session previously created");
			System.out.println("Session ID-"+session.getId());
			System.out.println("Session Created Time-"+session.getCreationTime());
			System.out.println("Session Last Time-"+session.getLastAccessedTime());
			ServletContext ctx=session.getServletContext();
			System.out.println("Accessing Servlet Context with session object-"+ctx);
			
			PrintWriter out=response.getWriter();
			out.println("<h1>Ok Done</h1>");
			session.setMaxInactiveInterval(10);
			//session.invalidate();
			
		}
		System.out.println("SessionDemoServlet-service() end");
	}

	public void destroy() {
		System.out.println("SessionDemoServlet-destroy()");
	}

}
