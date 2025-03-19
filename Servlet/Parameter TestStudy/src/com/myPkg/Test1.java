package com.myPkg;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Test1 extends	HttpServlet {
		String phone;
		String email;
		String state;
		String country;
		 public void init(ServletConfig sc)
		{
			System.out.println("TestServlet-init()");
			phone=sc.getInitParameter("phone");
			email=sc.getInitParameter("Email");
			ServletContext ctx=sc.getServletContext();
			state=ctx.getInitParameter("State");
			country=ctx.getInitParameter("Country");
		}
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
		{
			System.out.println("TestServlet-Service()");
		String un=req.getParameter("uname");
		System.out.println(un);

		PrintWriter out=res.getWriter();
		out.println("<h1>Username:"+un+"<h1>");
		out.println("<h1>Phone:"+phone+"<h1>");
		out.println("<h1>Email:"+email+"<h1>");
		out.println("<h1>State:"+state+"<h1>");
		out.println("<h1>Country:"+country+"<h1>");
		}
		public void destroy()
		{
			System.out.println("TestServlet-destroy()");
		}
}