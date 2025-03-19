package com.jlcindia;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIRegistry {
	public static void main(String[] args)throws Exception {
		Registry reg=LocateRegistry.createRegistry(56348);
		AddImpl ai=new AddImpl();
		reg.bind("ADD_IMPL_Object", ai);
		System.out.println("ok");
	}
}
