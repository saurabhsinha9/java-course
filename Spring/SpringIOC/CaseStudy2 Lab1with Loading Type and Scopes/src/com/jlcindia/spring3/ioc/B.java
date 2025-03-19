package com.jlcindia.spring3.ioc;

public class B {

	static{
		System.out.println("B-SB");
	}
	public B() {
		System.out.println("B-DC Cons Injection");
	}
	Hello hello=null;
	Hai hai=null;
	
	public B(Hello hello, Hai hai) {
		System.out.println("B-argsCons Cons Injection");
		this.hello = hello;
		this.hai = hai;
	}

	public void show(){
		System.out.println("B-show()");
		hello.m1();
		hai.m2();
	}
}
