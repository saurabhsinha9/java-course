package com.jlcindia.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.icicibank.accounts.*;
/*
 * lookup rmi registry
 * storing BSI implementation class object in BSI reference variable
 * consuming the Business service
 * 
 */
public class RMIClient {

	static{
		System.out.println("RMIClient-SB");
	}
	public RMIClient() {
		System.out.println("RMIClient-DC");
		
	}
	
	public static void main(String args[])throws Exception{
		System.out.println("RMIClient-main()");
		Registry reg=LocateRegistry.getRegistry("localhost",22222);//getting rmi registry
		
		Object obj=reg.lookup("ASI");//lookup rmi registry
		AccountService as=(AccountService) obj;//storing BSI implementation class object in BSI reference variable
		
		AccountTo ato1=new AccountTo(123,5000.0);
		String msg=as.deposit(ato1);//consuming the Business service
		System.out.println(msg);
		
		AccountTo ato2=new AccountTo(999,9000.0);
		String msg1=as.withdraw(ato2);
		System.out.println(msg1);
		msg1=as.getBal(5000);
		System.out.println(msg1);
	}
}
