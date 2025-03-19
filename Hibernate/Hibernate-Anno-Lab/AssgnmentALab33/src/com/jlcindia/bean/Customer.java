package com.jlcindia.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer extends User{
	private List<Long> ccnos;
	private String custType;
	private Long phone;
	private String dob;
	private Set<Order> orders;
	public Customer() {
	}
	public Customer(Map<String, String> logins, String fullName, String email,
			List<Long> ccnos, String custType, Long phone, String dob,
			Set<Order> orders) {
		super(logins, fullName, email);
		this.ccnos = ccnos;
		this.custType = custType;
		this.phone = phone;
		this.dob = dob;
		this.orders = orders;
	}
	public List<Long> getCcnos() {
		return ccnos;
	}
	public void setCcnos(List<Long> ccnos) {
		this.ccnos = ccnos;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
}
