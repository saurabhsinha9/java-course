package com.jlcindia.hibernate;

import java.io.Serializable;

public class SID implements Serializable {
	private String bid;
	private String sid;
	public SID() {
		// TODO Auto-generated constructor stub
	}
	public SID(String bid, String sid) {
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
}
