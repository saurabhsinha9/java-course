package com.jlc.action;

import javax.servlet.*;
import javax.servlet.http.*;
import com.jlc.model.StudentModel;
import com.jlc.to.StudentTo;
import com.jlc.validator.JLCValidator;

public class RetrievePasswordAction{
	public void retrievePassword(HttpServletRequest req,HttpServletResponse res){
boolean isError=false;
String result="forgetPassword.jsp";
String username=req.getParameter("uname");
String email=req.getParameter("email");
/*VALIDATING USERNAME*/
if(!JLCValidator.required(username)){
	req.setAttribute("username ErrorMesaage","Username is required");
	isError=true;
	}
/*VALIDATING Email*/
if(!JLCValidator.required(email)){
	req.setAttribute("email ErrorMesaage","Email is Required");
	isError=true;
	}else if (!JLCValidator.validateEmail(email)){
		req.setAttribute("email ErrorMesaage","provide valid email id");
	isError=true;
	}
if(!isError){
	StudentTo sto = StudentModel.retrievePassword(username, email);
	if(sto==null){
		req.setAttribute("invalid Information","Information you provide is Invalid");
		}else{
			result="sucess.jsp";
			req.setAttribute("sucessMessage","Hi <font color=\"black">"+ sto.getUsername()+"</font><br/><fontcolor=\"red\">Your Passowrd is</font><font color=\"black">"+sto.getPassword()+"</font>");
		}
}
try{
	
	RequestDispatcher rd= req.getRequestDispatcher(result);
	rd.forward(req,res);
    } catch(Exception e){
    	e.printStackTrace();
    	System.out.println("Error in Forwarding from RetrievePasswordAction");
    	    }
	}
		}



