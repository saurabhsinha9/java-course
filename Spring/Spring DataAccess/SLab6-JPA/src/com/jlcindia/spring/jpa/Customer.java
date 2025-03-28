package com.jlcindia.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private String city;
	public Customer() {}
	public Customer(int cid,String cname, String email, long phone,
			String city) {
		this.cid=cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}
	@Id
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
		return "Customer [cid=" + cid + ", cname=" + cname + ", email="
				+ email + ", phone=" + phone + ", city=" + city + "]";
	}
	
}
