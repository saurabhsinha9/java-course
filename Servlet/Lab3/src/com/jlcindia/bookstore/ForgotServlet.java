package com.jlcindia.bookstore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotServlet extends HttpServlet {
	static{
		System.out.println("ForgotServlet-SB");
	}
    public ForgotServlet() {
    	System.out.println("ForgotServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("ForgotServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForgotServlet-service() begin");
		//collect request Parameter
		String em=request.getParameter("email");
		//process the data
		System.out.println(em);
		//send the response
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>JLC Bookstore</h1>");
		out.println("<h2>Hi Your Registration Password has been sent to your email ID Successfully</h2>");
		out.println("<h1>JLC Bookstore HomePage</h1>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("ForgotServlet-service() end");
	}
	
	public void destroy() {
		System.out.println("ForgotServlet-destroy()");
	}
}
