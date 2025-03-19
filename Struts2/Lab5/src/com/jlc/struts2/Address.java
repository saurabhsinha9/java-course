package com.jlc.struts2;

import java.util.List;

public class Address {
	
	static{
		System.out.println("Address-SB");
	}
	
	public Address() {
		System.out.println("Address-DC");
	}
	
	String city;
	List<String> phones;
	
	public Address(String city, List<String> phones) {
		super();
		System.out.println("Address-argsCons");
		this.city = city;
		this.phones = phones;
	}

	public String getCity() {
		System.out.println("getCity()");
		return city;
	}

	public void setCity(String city) {
		System.out.println("setCity()");
		this.city = city;
	}

	public List<String> getPhones() {
		System.out.println("getPhones()");
		return phones;
	}

	public void setPhones(List<String> phones) {
		System.out.println("setPhones()");
		this.phones = phones;
	}
	
	
	
}
