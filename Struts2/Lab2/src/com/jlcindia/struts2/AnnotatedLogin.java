package com.jlcindia.struts2;


import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

import com.opensymphony.xwork2.ActionSupport;


@Results({
	@Result(name="success", value="/home.jsp"),
	@Result(name="failed", value="/login.jsp")
})

public class AnnotatedLogin extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static{
		System.out.println("AnnotatedLogin-SB");
	}
	public AnnotatedLogin() {
		System.out.println("AnnotatedLogin-DC");
	}
	private String username;
	private String password;
	
	public String getUsername() {
		System.out.println("getUsername()");
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername");
		this.username = username;
	}
	
	public String getPassword() {
		System.out.println("getPassword()");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword()");
		this.password = password;
	}
	
	
	public String execute()throws Exception{
		
		String status="failed";
		
		if(username.equals(password)){
			status="success";
		}else{
			addActionError("Invalid Username or Password");
		}
		return status;
	}
}
