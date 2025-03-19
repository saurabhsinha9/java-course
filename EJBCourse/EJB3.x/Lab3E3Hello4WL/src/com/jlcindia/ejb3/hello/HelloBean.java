package com.jlcindia.ejb3.hello;

import javax.ejb.Stateless;

@Stateless(mappedName="HelloBean",name="HelloBean") 
public class HelloBean implements HelloRemote {

	static{
		System.out.println("HelloBean-SB");
	}
	public String getMessage(String name) {
		System.out.println("HelloBean-getMessage()");
		String msg="Hello ! "+name+" Welcome to EJB3...";
		System.out.println(msg);
		return msg;
	}

}
