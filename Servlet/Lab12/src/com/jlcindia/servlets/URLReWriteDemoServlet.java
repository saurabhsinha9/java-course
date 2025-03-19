package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class URLReWriteDemoServlet extends HttpServlet {
	static{
		System.out.println("URLReWriteDemoServlet-SB");
	}
    public URLReWriteDemoServlet() {
    	System.out.println("URLReWriteDemoServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("URLReWriteDemoServlet-init()");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("URLReWriteDemoServlet-service() begin");
		String un=request.getParameter("uname");
		System.out.println(un);
		HttpSession session=request.getSession();
		String url=response.encodeURL("home.jsp");
		RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		System.out.println("URLReWriteDemoServlet-service() end");
	}
	
	public void destroy() {
		System.out.println("URLReWriteDemoServlet-destroy()");
	}
}
