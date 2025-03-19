package com.jlcindia.spring3.ioc;

public class Address {
	//using constructor Injection
	private int adid;
	private String street;
	private String city;
	
	public Address() {}
	public Address(int adid, String street, String city) {
		super();
		this.adid = adid;
		this.street = street;
		this.city = city;
	}
	
	public String toString(){
		return ""+adid+"\t"+street+"\t"+city;
	}
	
}
