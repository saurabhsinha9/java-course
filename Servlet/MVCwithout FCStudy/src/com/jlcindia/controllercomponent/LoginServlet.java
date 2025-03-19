package com.jlcindia.controllercomponent;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.modelcomponent.UserService;


public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		
		boolean isValid=false;
		try {
			isValid=UserService.verifyUser(un,pw);
		} catch (SQLException e) {
			System.out.println("Error in verifying User");
			e.printStackTrace();
		}
		if(isValid){
			request.setAttribute("SMSG", "Login");
			request.setAttribute("UN", un);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			request.setAttribute("EMSG", "Invalid UserName or Password");
		}
		
		
	}


}
