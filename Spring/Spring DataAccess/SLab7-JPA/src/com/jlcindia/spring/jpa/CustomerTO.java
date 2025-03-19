package com.jlcindia.spring.jpa;


public class CustomerTO {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private String city;
	public CustomerTO() {}
	public CustomerTO(int cid, String cname, String email, long phone,
			String city) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "CustomerTO [cid=" + cid + ", cname=" + cname + ", email="
				+ email + ", phone=" + phone + ", city=" + city + "]";
	}
	
}
