package com.jlcindia.spring3.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Resource(name="hello1")//byName
	Hello hello1;
	
	@Resource(name="hello2")
	Hello hello2;
	
	@Resource//byType
	Hai hai;
	
	
	public void m1() {
		System.out.println("A-m1()");
		hai.show();
		hello1.show();
		hello2.show();
	}

}
