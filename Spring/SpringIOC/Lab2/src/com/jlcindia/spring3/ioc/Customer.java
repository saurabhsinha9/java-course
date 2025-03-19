package com.jlcindia.spring3.ioc;

import java.util.*;

public class Customer {

	//using constructor Injection
	private int cid;
	private String cname;
	private List<String> emails;
	private Set<Long> phones;
	private Address address;
	
	//Using setter Injection
	private Map<String,Long> refs;
	private Properties myProperties;
	private Set<Order>orders;
	public Customer() {	}
	public Customer(int cid, String cname, List<String> emails,
			Set<Long> phones, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.emails = emails;
		this.phones = phones;
		this.address = address;
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
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String, Long> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}
	public Properties getMyProperties() {
		return myProperties;
	}
	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
}
