package com.jlc.struts2;

import com.opensymphony.xwork2.ActionSupport;



public class TestAction extends ActionSupport {

	static{
		System.out.println("TestAction-SB");
	}
	
	public TestAction() {
		System.out.println("TestAction-DC");
	}
	
	public String test()throws Exception{
		System.out.println("TestAction-test()");
		System.out.println(userId);
		System.out.println(emailId);
		
		if(userId.equals("sd")){
			//throw new Exception();
			Thread.sleep(300);
		}
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
