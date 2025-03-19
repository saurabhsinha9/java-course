package com.jlcindia.hibernate;

public class Customer {
	private int cid;
	private String cname;
	private String emailId;
	private double phone;
	private String city;
	
	public Customer() {
		System.out.println("Customer-DC");
	}

	public Customer(String cname, String emailId, double phone, String city) {
		System.out.println("Customer-ArgsCons..");
		this.cname = cname;
		this.emailId = emailId;
		this.phone = phone;
		this.city = city;
	}
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return ""+cid+"\t"+cname+"\t"+emailId+"\t"+phone+"\t"+city;
	}
}
