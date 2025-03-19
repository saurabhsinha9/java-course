package com.jlcindia;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[] args)throws Exception {
		Registry reg=LocateRegistry.getRegistry("localhost",56348);//getting rmi registry
		
		Object obj=reg.lookup("ADD_IMPL_Object");//lookup rmi registry
		Add ad=(Add)obj;
		String nm=ad.show("Saurabh");
		System.out.println(nm);
	}
}
