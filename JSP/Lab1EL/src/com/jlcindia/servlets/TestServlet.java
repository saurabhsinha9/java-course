package com.jlcindia.servlets;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.collect the parameter
		String sn=request.getParameter("sname");
		String em=request.getParameter("email");
		String ems[]=request.getParameterValues("email");
		System.out.println(sn);
		System.out.println(em);
		for(String str:ems){
			System.out.println(str);
		}
		
		//2.collect Headers
		String ho=request.getHeader("host");
		String re=request.getHeader("referer");
		String al=request.getHeader("accept-language");
		String ae=request.getHeader("accept-encoding");
		System.out.println(ho);
		System.out.println(re);
		System.out.println(al);
		System.out.println(ae);
		
		//3.collect cookie
		Cookie ck[]=request.getCookies();
		for(Cookie c:ck){
			System.out.println(c.getName()+"---"+c.getValue());
		}
		
		Cookie ck1=new Cookie("email","sri@jlc");
		Cookie ck2=new Cookie("phone","123456");
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
