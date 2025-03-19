package com.jlcindia.generics;

public class Customer implements Comparable<Customer> {
	int cid;
	String cname;
	String email;
	long phone;
	public Customer(int cid, String cname, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
	}
	public String toString(){
		return ""+cid+"\t"+cname+"\t"+email+"\t"+phone;
		
	}
	public int compareTo(Customer c){
		int x=this.cid-c.cid;
		return x;
	}

}
