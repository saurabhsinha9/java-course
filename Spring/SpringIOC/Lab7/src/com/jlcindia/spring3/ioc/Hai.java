package com.jlcindia.spring3.ioc;

public class Hai {

	String msg;
	int x;
	
	
	public Hai(String msg, int x) {
		System.out.println("Hai 2 args cons");
		this.msg = msg;
		this.x = x;
	}
	
	public void show() {
		System.out.println(msg);
		System.out.println(x);
	}
	
}
