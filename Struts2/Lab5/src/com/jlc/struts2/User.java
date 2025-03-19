package com.jlc.struts2;

public class User {

	static{
		System.out.println("User-SB");
	}
	
	public User() {
		System.out.println("User-DC");
	}
	
	private String name;
	private String email;
	private String phone;
	

	//setter and getter
	
	public String getName() {
		System.out.println("getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println("setName()");
		this.name = name;
	}
	public String getEmail() {
		System.out.println("getEmail()");
		return email;
	}
	public void setEmail(String email) {
		System.out.println("setEmail()");
		this.email = email;
	}
	public String getPhone() {
		System.out.println("getPhone()");
		return phone;
	}
	public void setPhone(String phone) {
		System.out.println("setPhone()");
		this.phone = phone;
	}
	
	
}
