package com.jlc.action;

import javax.servlet.*;
import javax.servlet.http.*;
import com.jlc.model.StudentModel;
import com.jlc.to.StudentTo;
import com.jlc.validator.JLCValidator;

public class RegisterAction {
	public void retrievePassword(HttpServletRequest req,HttpServletResponse res){
		boolean isError=false;
		String result="register.jsp";
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String gender=req.getParameter("gender");		
		String qualification=req.getParameter("qualification");
		String username=req.getParameter("uname");		
		String password=req.getParameter("pss");
	
		/*VALIDATING FIRST NAME*/
	if(!JLCValidator.required(fname)){
	req.setAttribute("firstNameErrorMesaage","First name is Required");
	isError=true;
	}else if(!JLCValidator.validateFirstCharacterAsUpper(fname)){
		req.setAttribute("firstNameErrorMesaage","First name must starts with capital letter");
	isError=true;
	}else if(!JLCValidator.minLength(fname,3)){
		req.setAttribute("firstNameErrorMesaage","First name must be minimum 3 character");
	isError=true;
	}else if(!JLCValidator.maxLength(fname,10)){
		req.setAttribute("firstNameErrorMesaage","First name must be maximum 10 character");
	isError=true;
	}else if(!JLCValidator.validateName(fname)){
		req.setAttribute("firstNameErrorMesaage","First name must be only Character");
	isError=true;
	}
	
	/*VALIDATING LAST NAME*/
	if (lname!=null && lname.length()>0){
	if(!JLCValidator.validateFirstCharacterAsUpper(lname)){
		req.setAttribute("lastNameErrorMesaage","Last name must start with capital letter");
		isError=true;
		}else if(!JLCValidator.minLength(lname,3)){
			req.setAttribute("lastNameErrorMesaage","Last name must be minimum 3 character");
		isError=true;
		}else if(!JLCValidator.maxLength(lname,10)){
			req.setAttribute("lastNameErrorMesaage","last name must be maximum 10 character");
		isError=true;
		}else if(!JLCValidator.validateName(lname)){
			req.setAttribute("lastNameErrorMesaage","last name must be only Character");
		isError=true;
		}
	}
	
	/* VALIDATING EMAIL */
	if(!JLCValidator.required(email)){
		req.setAttribute("emailErrorMesaage","Email is Required");
		isError=true;
		}else if(!JLCValidator.maxLength(email,32)){
			req.setAttribute("emailErrorMesaage","Email must be maximum 32 character");
		isError=true;
		}else if(!JLCValidator.validateEmail(email)){
			req.setAttribute("emailErrorMesaage","Please enter valid email id");
		isError=true;
		}
	/* VALIDATING PHONE */
	if(!JLCValidator.required(phone)){
		req.setAttribute("phoneErrorMesaage","phone is Required");
		isError=true;
		}else if(!JLCValidator.validateLong(phone)){
			req.setAttribute("phoneErrorMesaage","phone must be digit only");
		isError=true;
		}else if(!JLCValidator.minLength(phone,10)&& JLCValidator.minLength(phone,10)){
			req.setAttribute("phoneErrorMesaage","phone must be 10 digits");
		isError=true;
		}
	/* VALIDATING GENDER */
	if(!JLCValidator.required(gender)){
		req.setAttribute("genderErrorMesaage","please select the gender");
		isError=true;
		}
	
	/* VALIDATING USERNAME */
	if(!JLCValidator.required(username)){
		req.setAttribute("usernameErrorMesaage","UserName is Required");
		isError=true;
		}else if(!JLCValidator.minLength(username,6)){
			req.setAttribute("usernameErrorMesaage","UserName must be minimum 6 character long");
		isError=true;
		}else if(!JLCValidator.maxLength(username,8)){
			req.setAttribute("usernameErrorMesaage","UserName must be maximum 8 character long");
		isError=true;
		}else if(StudentModel.alreadyRegistered(username)){
			req.setAttribute("usernameErrorMesaage","UserName is already used.Please use different username");
		isError=true;
		}
	/* VALIDATING PASSWORD */
	if(!JLCValidator.required(password)){
		req.setAttribute("passwordErrorMesaage","Password is Required");
		isError=true;
		}else if(!JLCValidator.minLength(password,5)){
			req.setAttribute("passwordErrorMesaage","Password must be minimum 5 character long");
		isError=true;
		}else if(!JLCValidator.maxLength(password,10)){
			req.setAttribute("passwordErrorMesaage","Password must be maximum 10 character long");
		isError=true;
		}
	if(!isError){
	StudentTo sto=new StudentTo();
	sto.setFname(fname);
	sto.setLname(lname);
	sto.setEmail(email);
	sto.setPhone(Long.parseLong(phone));
	sto.setGender(gender);
	sto.setQualification(qualification);
	sto.setUsername(username);
	sto.setPassword(password);
	if(StudentModel.registerStudent(sto)){
	result="sucess.jsp";
	req.setAttribute("sucess Message","Registration Completes sucessfully");
	}else{
		req.setAttribute("error in Registration","Error happened in registration.Please try later");
	}
		}
	try {
		RequestDispatcher rd = req.getRequestDispatcher(result);
		rd.forward(req,res);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error in forwarding from LoginAction");
	}
			}
	
		}
