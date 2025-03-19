package com.jlcindia.hibernate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private String emailId;
	private double phone;
	private String city;
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	
	public Date getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}



	public Customer() {
		System.out.println("Customer-DC");
	}

	
	
	public Customer(String cname, String emailId, double phone,
			String city, Date timestamp) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.emailId = emailId;
		this.phone = phone;
		this.city = city;
		this.timestamp = timestamp;
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
