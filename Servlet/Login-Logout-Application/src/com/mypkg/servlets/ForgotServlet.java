package com.mypkg.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.servlets.modelcomponent.LoginApplicationModel;


public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ForgotServlet() {
        super();
       System.out.println("ForgotServlet-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ForgotServlet-DC");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForgotServlet-DC");
		
		String em=request.getParameter("email");
		
		String page="";
		String message=LoginApplicationModel.passwordSupport(em);
		RequestDispatcher rd=null;
		if(message!=null){
			page="success.jsp";
		}
		request.setAttribute("MSG1", message);
		rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	public void destroy() {
		System.out.println("ForgotServlet-DC");
	}
}
