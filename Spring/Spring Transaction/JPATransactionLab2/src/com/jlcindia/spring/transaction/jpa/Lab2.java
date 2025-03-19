package com.jlcindia.spring.transaction.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService as=(AccountService) ctx.getBean("accountServiceProxy");
		// use any -   accountServiceProxy  accountServiceTarget
		/*
		System.out.println("ok");
		Account acc1=new Account(101,"Saurabh",25000);
		as.addAccount(acc1);
		Account acc2=new Account(102,"Dablu",50000);
		as.addAccount(acc2);
		
		*/
		try {
			//System.out.println("Your balance after Deposit "+as.deposit(102, 50000));
		
			//System.out.println("Your balance after Withdraw " +as.withdraw(102, 90000));
			
			as.transferFunds(101, 102, 5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
