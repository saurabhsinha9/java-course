package com.jlcindia.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService hello1=(HelloService)ctx.getBean("helloTarget");
		hello1.m1("Saurabh","Sinha");
		System.out.println("------------------");
		HaiService hai1=(HaiService)ctx.getBean("haiTarget");
		hai1.m2("Saurabh","Sinha");
		System.out.println("------------------");
		System.out.println("------------------");
		
		HelloService hello2=(HelloService)ctx.getBean("helloProxy");
		hello2.m1("Saurabh","Sinha");
		System.out.println("------------------");
		
		try {
			hello2.m2("Saurabh","Sinha");
		} catch (Exception e) {}
		System.out.println("-------------------");
		System.out.println("------------------");
		HaiService hai2=(HaiService)ctx.getBean("haiProxy");
		hai2.m2("Saurabh","Sinha");
	}

}
