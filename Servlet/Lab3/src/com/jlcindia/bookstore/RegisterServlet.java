package com.jlcindia.bookstore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    static{
    	System.out.println("RegisterServlet-SB");
    }
	public RegisterServlet() {
		System.out.println("RegisterServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("RegisterServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service() begin");
		//collect request parameter
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String em=request.getParameter("email");
		String ph=request.getParameter("phone");
		String ge=request.getParameter("gender");
		String ct=request.getParameter("ctype");
		String cno=request.getParameter("cnum");
		String co[]=request.getParameterValues("color");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		//process the request data
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(em);
		System.out.println(ph);
		System.out.println(ge);
		System.out.println(ct);
		System.out.println(cno);
		if(co!=null){
		for(int i=0;i<co.length;i++){
		System.out.println(co[i]);
		}
		}else{
			System.out.println("Please Select atleast one color");
		}
		System.out.println(un);
		System.out.println(pw);
		//send the response
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>JLC Bookstore</h1>");
		out.println("<h2>Hi "+fn+" Your Registration has been Completed Successfully</h2>");
		out.println("<h1>JLC Bookstore HomePage</h1>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("RegisterServlet-service() end");
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}

}
