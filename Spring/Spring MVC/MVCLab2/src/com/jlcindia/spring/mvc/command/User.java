package com.jlcindia.spring.mvc.command;

public class User {
	static{
		System.out.println("User-SB");
	}
	public User() {
		System.out.println("User-DC");
	}
	private String username;
	private String password;
	public String getUsername() {
		System.out.println("User-getUsername()");
		return username;
	}
	public void setUsername(String username) {
		System.out.println("User-setUsername()");
		this.username = username;
	}
	public String getPassword() {
		System.out.println("User-getPassword()");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("User-setPassword()");
		this.password = password;
	}
	
}
