package com.jlcindia.spring3.ioc;

public class Hai {

	int x;
	String msg;
	

	public Hai() {
		System.out.println("Hai-Dc");
	}


	public Hai(int x, String msg) {
		System.out.println("Hai-2 arg cons");
		this.x = x;
		this.msg = msg;
	}




	public void show() {
		System.out.println(msg);
		System.out.println(x);
	}
	
}
