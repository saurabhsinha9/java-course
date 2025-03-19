package com.jlcindia.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab8 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService hello=(HelloService)ctx.getBean("hello");
		hello.m1("Saurabh", "Sinha");
		System.out.println("---------------");
		hello.am1("Dablu", "Sinha");
		System.out.println("---------------");
		try {
			hello.m2("jlc1", "jlc2");
		} catch (Exception e) {}
		System.out.println("---------------");
		hello.am2("133333", "756555");
	}

}
