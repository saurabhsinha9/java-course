package com.jlc.action;

import javax.servlet.*;
import javax.servlet.http.*;
import com.jlc.model.StudentModel;
import com.jlc.to.StudentTo;
import com.jlc.validator.JLCValidator;

public class LoginAction {
	public void login(HttpServletRequest req,HttpServletResponse res){
		boolean isError=false;
		StudentTo sto=null;
		String result="index.jsp";
		String username=req.getParameter("uname");
		String email=req.getParameter("pass");
		
		if(!JLCValidator.required(username)){
			req.setAttribute("username ErrorMesaage","Username is required");
			isError=true;
			}
		if(!JLCValidator.required(password)){
			req.setAttribute("password ErrorMesaage","Password is required");
			isError=true;
			}
		if(!isError){
			sto = StudentModel.validateLogin(username,password);
			if(sto!=null){
				result="home.jsp";
				req.setAttribute("STO",sto);
 			}else{
				req.setAttribute("invalidLogin","Username or Password is Invalid");
 			}
 			}
		try{
			RequestDispatcher rd= req.getRequestDispatcher(result);
			rd.forward(req,res);
		    }catch(Exception e){
		    	e.printStackTrace();
		    	System.out.println("Error in Forwarding from LoginAction");
		    	    }
			}
				}
	
	
