package com.jlcindia.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	static{
		System.out.println("LoginAction-SB");
	}
	
	public LoginAction() {
		System.out.println("LoginAction-DC");
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
	
	public void validate() {
		System.out.println("validate");
	}
	
	
	public String execute() throws Exception {
		System.out.println("LoginAction-execute()");
		String status="failed";
		if(username.equals(password)){
			status="success";
		}else{
			addActionError("UserName or Password is Invalid");
		}
		return status;
	}
	
}
