package com.jlcindia.spring3.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A obj=(A)ctx.getBean("aobj");
		obj.m1();
		
		
	}
}
