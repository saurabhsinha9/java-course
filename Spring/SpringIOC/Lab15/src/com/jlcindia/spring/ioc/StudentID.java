package com.jlcindia.spring.ioc;

public class StudentID {
	String bid;
	int sid;
	public StudentID( int sid,String bid) {
		super();
		this.bid = bid;
		this.sid = sid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
