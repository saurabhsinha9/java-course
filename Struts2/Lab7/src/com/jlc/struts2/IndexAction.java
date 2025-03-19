package com.jlc.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{
	
	static{
		System.out.println("IndexAction-SB");
	}
	
	public IndexAction() {
		System.out.println("IndexAction-DC");
	}
	
	public String execute() throws Exception {
		
		System.out.println("IndexAction-execute()");
		
		return SUCCESS;
	}
}
