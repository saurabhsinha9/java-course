package com.jlcindia.spring3.ioc;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {


	public static void main(String[] args) {
		System.out.println("Spring Container is going to start...");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring Container started");
		
		Customer c=(Customer)ctx.getBean("cust");
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getEmails());
		System.out.println(c.getPhones());
		System.out.println(c.getRefs());
		System.out.println(c.getMyProperties());
		System.out.println(c.getAddress());
		Set<Order> orders=c.getOrders();
		for(Order o:orders){
			System.out.println(o);
		}
	}
}
