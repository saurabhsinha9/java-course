package com.jlcindia.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.modelcomponent.UserService;

public class LoginAction {

	public static void login(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		HttpSession session=request.getSession();
		boolean isValid=false;
		try {
			isValid=UserService.verifyUser(un,pw);
		} catch (SQLException e) {
			System.out.println("Error in verifying User");
			e.printStackTrace();
		}
		if(isValid){
			session.setAttribute("SMSG", "Login");
			session.setAttribute("UN", un);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			session.setAttribute("EMSG", "Invalid UserName or Password");
		}
		
	}

}
