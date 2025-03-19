package com.jlcindia.to;

public class AddressTO {
	private int addId;
	private String street;
	private String city;
	private String state;
	private OrderTO orderTO;
	public AddressTO() {
	}
	public AddressTO(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
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
	public OrderTO getOrderTO() {
		return orderTO;
	}
	public void setOrderTO(OrderTO orderTO) {
		this.orderTO = orderTO;
	}
	public String toString() {
		return "AddressTO [addId=" + addId + ", street=" + street + ", city="
				+ city + ", state=" + state + ", orderTO=" + orderTO + "]";
	}
}
