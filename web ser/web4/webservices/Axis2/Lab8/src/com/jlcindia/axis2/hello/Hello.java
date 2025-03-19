package com.jlcindia.axis2.hello;

public class Hello {
	public String getMessage(String name){
		String msg="Hello! "+name+" Welcome to JLC Axis2 World...";
		System.out.println(msg);
		return msg;
	}
}
