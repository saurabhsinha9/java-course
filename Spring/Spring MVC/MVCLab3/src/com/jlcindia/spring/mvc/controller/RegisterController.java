package com.jlcindia.spring.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;

import com.jlcindia.spring.mvc.command.Student;

public class RegisterController extends SimpleFormController {
	static{
		System.out.println("RegisterController-SB");
	}
	public RegisterController() {
		System.out.println("RegisterController-DC");
	}
	
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("RegisterController-onSubmit()");
		Student stu=(Student) command;
		System.out.println(stu.getStudentID());
		System.out.println(stu.getName());
		System.out.println(stu.getEmail());
		System.out.println(stu.getPhone());
		System.out.println(stu.getGender());
		System.out.println(stu.getQualification());
		String tim[]=stu.getTimings();
		for (int i = 0; i < tim.length; i++) {
			System.out.println(tim[i]);
		}
		System.out.println(stu.getRemarks());
		return new ModelAndView("home");
	}
	
	
	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {
		System.out.println("RegisterController-formBackingObject()");
		Student stu=new Student();
		stu.setStudentID("JLC-99");
		return stu;
	}
}
