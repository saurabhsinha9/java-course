package com.jlcindia.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.modelcomponent.UserService;

public class RegisterAction {

	public static void register(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String em=request.getParameter("email");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		HttpSession session=request.getSession();
		boolean isValid=false;
		try {
			isValid=UserService.registerUser(fn,ln,em,un,pw);
		} catch (SQLException e) {
			System.out.println("Error in registering the User");
			e.printStackTrace();
		}
		if(isValid){
			session.setAttribute("SMSG", "Register");
			session.setAttribute("UN", un);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			session.setAttribute("EMSG", "Registration Not completed successfully.Please try Again.");
		}
	}

}
