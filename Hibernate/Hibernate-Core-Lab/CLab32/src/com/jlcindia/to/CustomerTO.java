package com.jlcindia.to;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerTO extends UserTO{
	private List<Long> ccnos;
	private String custType;
	private Long phone;
	private String dob;
	private Set<OrderTO> orderTos;
	public CustomerTO() {
	}
	public CustomerTO(Map<String, String> logins, String fullName,
			String email, List<Long> ccnos, String custType, Long phone,
			String dob) {
		super(logins, fullName, email);
		this.ccnos = ccnos;
		this.custType = custType;
		this.phone = phone;
		this.dob = dob;
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
	public Set<OrderTO> getOrderTos() {
		return orderTos;
	}
	public void setOrderTos(Set<OrderTO> orderTos) {
		this.orderTos = orderTos;
	}
	
	public String toString() {
		return "CustomerTO [ccnos=" + ccnos + ", custType=" + custType
				+ ", phone=" + phone + ", dob=" + dob + ", orderTos="
				+ orderTos + "]";
	}
	
}
