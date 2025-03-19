package com.jlcindia.spring3.ioc;

public class B {

	Hello hello1;
	Hello hello2;
	
	public void setHello1(Hello hello1) {
		this.hello1 = hello1;
	}
	
	public void setHello2(Hello hello2) {
		this.hello2 = hello2;
	}
	public void m1() {
		System.out.println("B-m1()");
		hello1.show();
		hello2.show();
	}

}
