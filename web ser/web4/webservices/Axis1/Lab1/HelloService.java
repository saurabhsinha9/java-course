package com.jlcindia.axis;

public class HelloService {
	
	public String getMessage(String name,long phone){
		String msg="Hello "+name+" !, Welcome to WebServices World... Using Axis1";
		msg=msg+".\n Any clarification on Axis, Call to "+phone;
		return msg;
	}

}
