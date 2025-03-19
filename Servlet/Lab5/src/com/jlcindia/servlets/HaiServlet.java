package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HaiServlet extends HttpServlet {
	static{
		System.out.println("HaiServlet-SB");
	}
    public HaiServlet() {
    	System.out.println("HaiServlet-SB");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("HaiServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HaiServlet-service() begin");
		String name=request.getParameter("name");
		System.out.println(name);
		String nm=request.getAttribute("NM").toString();
		System.out.println(nm);
		RequestDispatcher rd1=request.getRequestDispatcher("/header.jlc");
		rd1.include(request, response);
		PrintWriter out=response.getWriter();
		out.println("<font color=blue size=10>welcome to Java Learning Center </font><br/><br/><br/><br/><br/>");
		RequestDispatcher rd2=request.getRequestDispatcher("/footer.jsp");
		rd2.include(request, response);
		System.out.println("HaiServlet-service() end");
	}

	public void destroy() {
		System.out.println("HaiServlet-destroy()");
	}

}
