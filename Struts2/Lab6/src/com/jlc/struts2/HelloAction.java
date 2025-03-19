package com.jlc.struts2;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class HelloAction extends ActionSupport {


	static{
		System.out.println("HelloAction-SB");
	}
	
	public HelloAction() {
		System.out.println("HelloAction-DC");
	}
	
	public String test()throws Exception{
		System.out.println("HelloAction-test()");
		System.out.println(userId);
		System.out.println(emailId);
		ActionContext ac=ActionContext.getContext();
		Map sessionMap=ac.getSession();
		System.out.println(sessionMap.get("Greeting"));
		System.out.println(sessionMap.get("JLCMSG"));
		return "success";
	}
	private String userId;
	private String emailId;

	public String getUserId() {
		System.out.println("getUserId()");
		return userId;
	}
	public void setUserId(String userId) {
		System.out.println("setUserId()");
		this.userId = userId;
	}
	public String getEmailId() {
		System.out.println("getEmailId()");
		return emailId;
	}
	public void setEmailId(String emailId) {
		System.out.println("setEmailId()");
		this.emailId = emailId;
	}
	
}
