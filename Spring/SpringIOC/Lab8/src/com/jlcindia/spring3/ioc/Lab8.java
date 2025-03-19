package com.jlcindia.spring3.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab8 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A obj=(A)ctx.getBean("aobj");
		obj.m1();
		
		B obj1=(B)ctx.getBean("bobj");
		obj1.m1();
	}
}
