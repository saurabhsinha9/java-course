package com.jlcindia.spring.transaction.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService as=(AccountService) ctx.getBean("accountServiceProxy");
		// use any -   accountServiceProxy  accountServiceTarget
		/*Account acc1=new Account(101,"Saurabh",25000);
		as.addAccount(acc1);
		Account acc2=new Account(102,"Dablu",50000);
		as.addAccount(acc2);
		*/
		try {
			//as.deposit(101, 10000);
			//as.withdraw(101, 25000);
			as.transferFunds(101, 102, 4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
