package com.jlcindia.spring3.ioc;

public class A {

	static{
		System.out.println("A-SB");
	}
	public A() {
		System.out.println("A-DC");
	}
	Hello hello=null;
	Hai hai=null;
	public void setHello(Hello hello) {
		System.out.println("A-setHello(Hello hello) Setter Injection");
		this.hello = hello;
	}
	public void setHai(Hai hai) {
		System.out.println("A-setHai(Hai hai) Setter Injection");
		this.hai = hai;
	}
	public void show(){
		System.out.println("A-show()");
		hello.m1();
		hai.m2();
	}
}
