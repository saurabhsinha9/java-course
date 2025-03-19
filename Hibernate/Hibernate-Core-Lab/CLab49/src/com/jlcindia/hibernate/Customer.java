package com.jlcindia.hibernate;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private String city;
	private String status;
	public Customer() {
		System.out.println("Customer-DC");
	}
	public Customer(String cname, String email, String phone, String city,
			String status) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.status = status;
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
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", phone=" + phone + ", city=" + city + ", status=" + status
				+ "]";
	}
	
}
