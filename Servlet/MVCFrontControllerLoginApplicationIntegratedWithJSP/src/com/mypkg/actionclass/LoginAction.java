package com.mypkg.actionclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.modelcomponent.LoginApplicationModel;

public class LoginAction {

	public String verifyUser(HttpServletRequest request,HttpServletResponse response) {
		String un=request.getParameter("uname");
		String pass=request.getParameter("pword");
		String message="";
		message=LoginApplicationModel.verifyUser(un, pass);
		return message;
	}

}
