package com.jlc.struts2;

import java.util.List;

public class Student {
	
	static{
		System.out.println("Student-SB");
	}
	
	public Student() {
		System.out.println("Student-DC");
	}
	
	String sname;
	List<Address> address;
	
	public Student(String sname, List<Address> address) {
		super();
		System.out.println("Student-argsCons");
		this.sname = sname;
		this.address = address;
	}
	
	public String getSname() {
		System.out.println("getSname()");
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setSname()");
		this.sname = sname;
	}
	public List<Address> getAddress() {
		System.out.println("getAddress()");
		return address;
	}
	public void setAddress(List<Address> address) {
		System.out.println("setAddress()");
		this.address = address;
	}
	
	
}
