package com.jlcindia.hibernate;

public class Student {
	private int sid;
	private String sname;
	private String city;
	private String status;
	private double totalfee;
	
	public Student() {
		System.out.println("Student-DC");
	}
	
	public Student(String sname, String city, String status, double totalfee) {
		System.out.println("Student-argscons");
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
}
