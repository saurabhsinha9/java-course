package com.jlcindia.spring3.ioc;

public class Hai extends Hello{


	int x;
	String msg;
	
	Hai(){
		System.out.println("Hai-DC");
	}
	
	public void setX(int x) {
		System.out.println("setX(int x)");
		this.x = x;
	}

	public void setMsg(String msg) {
		System.out.println("setMsg(String msg)");
		this.msg = msg;
	}


	public void show() {
		System.out.println(msg);
		System.out.println(x);
		System.out.println(str);
		System.out.println(a);
	}
	
}
