package com.jlcindia.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService hello=(HelloService)ctx.getBean("hello");
		hello.m1();
		System.out.println("------------------");
		try {
			hello.m2();
		} catch (Exception e) {}
		System.out.println("-------------------");
		hello.am1();
		System.out.println("------------------");
		try {
			hello.am2();
		} catch (Exception e) {}
		System.out.println("-------------------");
		hello.test1();
		System.out.println("-------------------");
		System.out.println("*************");
		HaiService hai=(HaiService)ctx.getBean("hai");
		hai.m1();
		hai.m2();
		System.out.println("------------------");
		hai.am1();
		System.out.println("------------------");
		hai.am2();
		hai.test1();
		System.out.println("-------------------");
	}

}
