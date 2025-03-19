package com.jlcindia.spring3.ioc;

public class Hello {

	int a;
	String str;
	public Hello() {
		System.out.println("Hello-0 args cons");
	}
	
	public void setA(int a) {
		System.out.println("setA(int a)");
		this.a = a;
	}

	public void setStr(String str) {
		System.out.println("setStr(String str)");
		this.str = str;
	}

	public void show() {
		System.out.println(a);
		System.out.println(str);
	}
	
	
}
