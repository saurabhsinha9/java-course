package com.jlcindia.bean;


public class Address {
	private int addId;
	private String street;
	private String city;
	private String state;
	private Order order;
	public Address() {
	}
	public Address(String street, String city, String state, Order order) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.order = order;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
