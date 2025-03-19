package com.jlcindia.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="email")
	private String emailId;
	@Column(name="phone")
	private double phone;
	@Column(name="city")
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
