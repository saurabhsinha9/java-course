package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import org.springframework.web.servlet.ModelAndView;

import com.jlcindia.spring.mvc.command.Student;

public class RegisterWizardController extends AbstractWizardFormController {
	static{
		System.out.println("RegisterWizardController-SB");
	}
	public RegisterWizardController() {
		System.out.println("RegisterWizardController-DC");
	}
	
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("RegisterWizardController-processCancel()");
		return new ModelAndView("register1");
	}	
	
	protected ModelAndView processFinish(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("RegisterWizardController-processFinish()");
		return new ModelAndView("registerFinal.jlc");
	}

	
	protected void validatePage(Object command, Errors errors, int page) {
		System.out.println("RegisterWizardController-validatePage()");
		Student stu=(Student) command;
		switch(page){
		case 0:
			
			if(stu.getStudentID()==null||stu.getStudentID().length()==0){
				errors.rejectValue("studentID", "error.studentID",new Object[]{},"Student ID is required.");
			}
			
			if(stu.getFname()==null||stu.getFname().length()==0){
				errors.rejectValue("fname", "error.fname",new Object[]{},"FirstName is required.");
			}
			
			if(stu.getLname()==null||stu.getLname().length()==0){
				errors.rejectValue("lname", "error.lname",new Object[]{},"LastName is required.");
			}
			
			break;
		case 1:
			
			if(stu.getEmail()==null||stu.getEmail().length()==0){
				errors.rejectValue("email", "error.email",new Object[]{},"Email is required.");
			}else if(!((stu.getEmail().contains("@"))&&(stu.getEmail().endsWith(".com")||stu.getEmail().endsWith(".co.in")||
					stu.getEmail().endsWith(".in")))){
				errors.rejectValue("email", "error.email",new Object[]{},"Invalid Email.");
			}
			
			if(stu.getPhone()==null||stu.getPhone().length()==0){
				errors.rejectValue("phone", "error.phone",new Object[]{},"Phone is required.");
			}else if(stu.getPhone().length()!=10){
				errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains 10 digits.");
			}else if(stu.getPhone().length()==10){
				try {
					Integer.parseInt(stu.getPhone());
				} catch (Exception e) {
					errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains Only digits.");
				}
			}
			
			if(stu.getTimings().length<1){
				errors.rejectValue("timings", "error.timings",new Object[]{},"Select Suitable Timings.");
			}
			
			break;
		case 3:
			
			if(stu.getGender()==null||stu.getGender().length()==0){
				errors.rejectValue("gender", "error.gender",new Object[]{},"Gender is required.");
			}
			
			if(stu.getQualification()==null||stu.getQualification().length()==0||
					stu.getQualification().equals("----Select Option----")){
				errors.rejectValue("qualification", "error.qualification",new Object[]{},"Select Qualification.");
			}
			
			break;
		}
	}
}
