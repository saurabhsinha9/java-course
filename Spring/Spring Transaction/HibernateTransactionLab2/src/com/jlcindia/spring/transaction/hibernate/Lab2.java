package com.jlcindia.spring.transaction.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService as=(AccountService) ctx.getBean("accountServiceTarget");
		// use any -   accountServiceProxy  accountServiceTarget
		/*
		
		Account acc1=new Account("Saurabh",25000);
		as.addAccount(acc1);
		Account acc2=new Account("Dablu",50000);
		as.addAccount(acc2);
		
		*/
		try {
			//System.out.println("Your balance after Deposit "+as.deposit(101, 50000));
		
			//System.out.println("Your balance after Withdraw " +as.withdraw(101, 50000));
			
			as.transferFunds(101, 102, 10000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
