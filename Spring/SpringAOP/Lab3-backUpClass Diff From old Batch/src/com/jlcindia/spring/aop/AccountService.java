package com.jlcindia.spring.aop;

public class AccountService {

	public void getBal(){
		System.out.println("AccountServicegetBal()--begin");
		System.out.println("AccountServicegetBal()--done");
		System.out.println("AccountServicegetBal()--end");
	}
	public void mydeposit(){
		System.out.println("AccountServicemydeposit()--begin");
		System.out.println("AccountServicemydeposit()--done");
		System.out.println("AccountServicemydeposit()--end");
	}

	public void mywithdraw() throws Exception{
		System.out.println("AccountServicemywithdraw()--begin");
      if(1==1){
    	  throw new InsufficientFundsException();
      }
      	System.out.println("withdraw-end");
	}
	}
