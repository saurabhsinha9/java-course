package com.jlcindia.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		System.out.println("addCustomer");
		CustomerTO cto=new CustomerTO(110, "Sbhi", "sbhi@jlc.com", 1321, "Delhi");
		int x=cdao.addCustomer(cto);
		System.out.println(x);
	}
}
