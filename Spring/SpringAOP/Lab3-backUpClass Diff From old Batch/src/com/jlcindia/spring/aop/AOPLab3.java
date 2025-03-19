package com.jlcindia.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AOPLab3 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("USING TARGET OBJECT");
		CustomerService cs=(CustomerService )ctx.getBean("csTarget");
		cs.addCustomer();
		cs.updateCustomer();
		 AccountService as=( AccountService )ctx.getBean("asTarget");
		 as.mydeposit();

		 try{
			 as.mywithdraw();
		 }
		 catch(Exception e){
			 System.out.println("sorry");
		 }

	}

}
