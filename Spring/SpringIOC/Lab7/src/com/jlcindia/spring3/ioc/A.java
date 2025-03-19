package com.jlcindia.spring3.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Autowired //byType
	Hello hello;
	@Autowired
	Hai hai;
	
	
	public void m1() {
		System.out.println("A-m1()");
		hai.show();
		hello.show();
	}

}
