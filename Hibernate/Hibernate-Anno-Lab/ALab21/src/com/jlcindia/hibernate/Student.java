package com.jlcindia.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	private String email;
	private String phone;
	
	@OneToOne
	@JoinColumn(name="adid")
	private Address address;
	
	public Student() {
	}
	
	public Student(String sname, String email, String phone) {
		this.sname = sname;
		this.email = email;
		this.phone = phone;
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
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}
}
