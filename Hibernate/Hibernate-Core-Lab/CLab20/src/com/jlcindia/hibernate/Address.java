package com.jlcindia.hibernate;

public class Address {
	private int adid;
	private String street;
	private String city;
	private String state;
	public Address() {
	}
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
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
	
	public String toString() {
		return "Address [adid=" + adid + ", street=" + street + ", city="
				+ city + ", state=" + state + "]";
	}
	
}
