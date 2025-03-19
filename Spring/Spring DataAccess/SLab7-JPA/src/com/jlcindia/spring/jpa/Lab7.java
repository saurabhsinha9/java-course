package com.jlcindia.spring.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		CustomerTO cto=new CustomerTO(250,"S","ss@ss",5623,"Ob");
		cdao.addCustomer(cto);
		System.out.println("ok");
	}

}
