package com.jlcindia.struts1;

public class StudentTO 
{
	private String bid;
	private String sid;
	private String sname;
	private String email;
	private String phone;
	
	public StudentTO(){
		System.out.println("StudentTO-DC");
	}
	public StudentTO(String bid, String sid, String sname, String email,
			String phone) {
		super();
		System.out.println("StudentTO-argsCons..");
		this.bid = bid;
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public String getBid() {
		System.out.println("getBid()");
		return bid;
	}
	public void setBid(String bid) {
		System.out.println("setBid()");
		this.bid = bid;
	}
	public String getSid() {
		System.out.println("getSid()");
		return sid;
	}
	public void setSid(String sid) {
		System.out.println("setSid()");
		this.sid = sid;
	}
	public String getSname() {
		System.out.println("getSname()");
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setSname()");
		this.sname = sname;
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
