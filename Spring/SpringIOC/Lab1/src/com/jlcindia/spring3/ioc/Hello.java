package com.jlcindia.spring3.ioc;

public class Hello {

	static{
		System.out.println("Hello-SB");
	}
	int x;
	public Hello() {
		System.out.println("Hello-DC Cons Injection");
	}
	public Hello(int x) {
		System.out.println("Hello-1 args using Cons Injection");
		this.x=x;
	}
	
	public void m1(){
		System.out.println("Hello-m1()");
		System.out.println(x);
	}
}
