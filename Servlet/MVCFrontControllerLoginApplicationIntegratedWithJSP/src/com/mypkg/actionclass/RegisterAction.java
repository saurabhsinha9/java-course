package com.mypkg.actionclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.modelcomponent.LoginApplicationModel;

public class RegisterAction {

	public String registerUser(HttpServletRequest request,HttpServletResponse response) {
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
		String message=null;
		 message=LoginApplicationModel.registerUser(fn, ln, em, ph, ge, cty, cno, co, un, pw);		
		return message;
	}

}
