package com.jlcindia.hibernate;

import java.util.Date;

public class Request {
	private String reqId;
	private String cid;
	private String message;
	private Date reqDate;
	private int version;
	public Request() {
		// TODO Auto-generated constructor stub
	}
	public Request(String cid, String message, Date reqDate) {
		super();
		this.cid = cid;
		this.message = message;
		this.reqDate = reqDate;
	}
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
