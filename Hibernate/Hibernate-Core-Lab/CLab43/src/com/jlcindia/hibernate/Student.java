package com.jlcindia.hibernate;

public class Student {
	private String sid;
	private String sname;
	private String email;
	private String phone;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String email, String phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
