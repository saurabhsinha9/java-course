package com.jlc.struts2;

import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport {
	
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
		System.out.println("setUsername()");
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




	public String execute() throws Exception {
		
		System.out.println("LoginAction-execute()");
		if(username.equals(password)){
			return SUCCESS;
		}
		else{
			this.addActionError(getText("login.invalid"));
			return ERROR;
		}
	}

	public void validate() {
		
		System.out.println("LoginAction-validate()");
		
		if((username==null)||(username.length()==0)){
			this.addFieldError("username",getText("login.username.required"));
		}
		
		if((password==null)||(password.length()==0)){
			this.addFieldError("password",getText("login.password.required"));
		}
	}
}
