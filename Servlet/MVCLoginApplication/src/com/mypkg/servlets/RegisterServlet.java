package com.mypkg.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.modelcomponent.LoginApplicationModel;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterServlet() {
        super();
        System.out.println("RegisterServlet-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("RegisterServlet-init()");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");		
		//request parameter 
		String page="register.html";
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String em=request.getParameter("email");
		String ph=request.getParameter("phone");
		String ge=request.getParameter("gender");
		String cty=request.getParameter("ctype");
		String cno=request.getParameter("cnum");
		String co[]=request.getParameterValues("color");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		String message=LoginApplicationModel.registerUser(fn, ln, em, ph, ge, cty, cno, co, un, pw);
		RequestDispatcher rd=null;
		if(message=="Registration Successfull"){
			page="registersuccess.html";
		}
		
		rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}

}
