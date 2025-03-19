package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	static{
		System.out.println("LogoutServlet-SB");
	}
    public LogoutServlet() {
    	System.out.println("LogoutServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LogoutServlet-init");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LogoutServlet-service() begin");
		try {
			HttpSession session=request.getSession();
			session.invalidate();
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("LogoutServlet-service() end");
	}

	public void destroy() {
		System.out.println("LogoutServlet-destroy() ");
	}

}
