package com.jlcindia.spring.transaction.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService as=(AccountService) ctx.getBean("accountService");
		/*
		Account acc1=new Account(101,"Saurabh",25000);
		as.addAccount(acc1);
		Account acc2=new Account(102,"Dablu",50000);
		as.addAccount(acc2);
		
		*/
		try {
			//System.out.println("Your balance after Deposit "+as.deposit(102, 50000));
		
			//System.out.println("Your balance after Withdraw " +as.withdraw(102, 10000));
			
			as.transferFunds(101, 102, 200000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
