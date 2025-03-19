package com.mypkg.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.mypkg.modelcomponent.LoginApplicationModel;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        System.out.println("LoginServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet-service()");
		
		String un=request.getParameter("uname");
		String pass=request.getParameter("pword");
		
		String page="";
		RequestDispatcher rd=null;
		String message=null;
		message=LoginApplicationModel.verifyUser(un, pass);
		if(message!=null){
			page="success.jsp";
		}
		request.setAttribute("MSG", message);
		rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
