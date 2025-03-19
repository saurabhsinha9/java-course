package com.mypkg.actionclass;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.modelcomponent.LoginApplicationModel;

public class ForgotAction {

	public String passwordSupport(HttpServletRequest request,HttpServletResponse response){
		String em=request.getParameter("email");
		String message=null;
		message=LoginApplicationModel.passwordSupport(em);
		return message;
	}

}
