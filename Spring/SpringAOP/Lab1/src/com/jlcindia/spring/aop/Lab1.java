package com.jlcindia.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService1=(HelloService)ctx.getBean("helloTarget");
		helloService1.m1();
		HaiService haiService1=(HaiService)ctx.getBean("haiTarget");
		haiService1.m2();
		System.out.println("--------------");
		HelloService helloService2=(HelloService)ctx.getBean("helloProxy");
		helloService2.m1();
		try {
			helloService2.m2();
		} catch (Exception e) {}
		HaiService haiService2=(HaiService)ctx.getBean("haiProxy");
		haiService2.m2();
	}

}
