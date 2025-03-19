package com.jlcindia.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.jlcindia.calci.CalculatorService;
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
		
		Object obj=reg.lookup("CSI");//lookup rmi registry
		CalculatorService cs=(CalculatorService) obj;//storing BSI implementation class object in BSI reference variable
		long a=cs.add(5, 4);
		System.out.println(a);
		long s=cs.sub(9, 3);
		System.out.println(s);
		long m=cs.mul(5, 5);
		System.out.println(m);
		long d=cs.div(8, 4);
		System.out.println(d);
	}
}
