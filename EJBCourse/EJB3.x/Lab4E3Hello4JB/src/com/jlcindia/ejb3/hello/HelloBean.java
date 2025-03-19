package com.jlcindia.ejb3.hello;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless(mappedName="HelloBean",name="HelloBean") 
public class HelloBean implements HelloRemote {

	@Resource
	SessionContext ctx=null;
	static{
		System.out.println("HelloBean-SB");
	}
	public HelloBean() {
		System.out.println("HelloBean-DC");
	}
	@PostConstruct
	public void init(){
		System.out.println("init()");
	}

	@PreDestroy
	public void cleanup(){
		System.out.println("cleanup()");
	}
	public String getMessage(String name) {
		System.out.println("HelloBean-getMessage()");
		String msg="Hello ! "+name+" Welcome to EJB3...";
		System.out.println(msg);
		return msg;
	}

}
