package com.jlcindia.struts2;

import org.apache.struts2.config.Result;

import com.opensymphony.xwork2.ActionSupport;



@Result(name="success", value="/login.jsp")
public class AnnotatedDisplayLoginForm extends ActionSupport{
	
	
	private static final long serialVersionUID = 1L;

	static{
		System.out.println("AnnotatedDisplayLoginForm-SB");
	}
	
	public AnnotatedDisplayLoginForm() {
		System.out.println("AnnotatedDisplayLoginForm-DC");
	}
		
	public String execute(){
		
		String status="success";
		return status;

	}
	
}
