package com.jlcindia.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	static{
		System.out.println("TestAction-SB");
	}
	
	public TestAction() {
		System.out.println("TestAction-DC");
	}
	
	public String execute()throws Exception{
		System.out.println("TestAction-execute()");
		return "success";
	}
}
