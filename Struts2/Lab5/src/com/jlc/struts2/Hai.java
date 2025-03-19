package com.jlc.struts2;

public class Hai {
		
	static{
		System.out.println("Hai-SB");
	}
	
	public Hai() {
		System.out.println("Hai-DC");
	}
	
	String msg="Welcome to Java Learning Center";

	public String getMsg() {
		System.out.println("getMsg()");
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("setMsg()");
		this.msg = msg;
	}
	
	
}
