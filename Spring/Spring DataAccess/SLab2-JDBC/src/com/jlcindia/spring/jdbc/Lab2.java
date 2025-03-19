package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("custDAO");
		
		
		CustomerTO cto=new CustomerTO(107, "Srinivas", "sri@jlc.com", 1224, "Blore");
		int x=cdao.addCustomer(cto);
		System.out.println(x);
		
		
		System.out.println("CustomersByCity");
		List<CustomerTO> clist2=cdao.getCustomersByCity("Blore");
		for(CustomerTO ctos:clist2){
			System.out.println(ctos);
		}
		
		
		System.out.println("CustomersByPhone");
		List<CustomerTO> clist3=cdao.getCustomersByPhone(5555);
		for(CustomerTO ctos:clist3){
			System.out.println(ctos);
		}
		
	}
		
}
