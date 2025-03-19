package com.jlcindia.jsf1;

public class UserBean {

	static{
		
	}
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String username;
	private String password;
	private String errMsg;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public String verifyUser() {
		String str="failure";
		if(username.equals(password)){
			str="success";
		}else{
			errMsg="Invalid Username or Password";
		}
		return str;
	}
}
