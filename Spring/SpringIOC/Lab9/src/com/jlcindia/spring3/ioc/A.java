package com.jlcindia.spring3.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Autowired
	Hello hello;
	
	@Resource
	Hai hai;
	
	
	public void m1() {
		System.out.println("A-m1()");
		hai.show();
		hello.show();
		System.out.println(hai==hello);
	}

}
