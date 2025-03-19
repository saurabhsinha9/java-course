package com.jlcindia.calci;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/*
 *Exposing the remote BS
 * 
 * Creating the Object of BSI implementation class and 
 * Binding the implementation class obj with RMI registry
 * 
 */
public class RegisterServices {
	
	static{
		System.out.println("RegisterServices-SB");
	}

	public RegisterServices() {
		System.out.println("RegisterServices-DC");
	}

	public static void main(String[] args) throws Exception{
		System.out.println("RegisterServices-main()");
		
		Registry reg=LocateRegistry.createRegistry(22222);//creating rmi registry
		
		CalculatorServiceImpl csi=new CalculatorServiceImpl();//Creating the Object of BSI implementation class
		
		reg.bind("CSI", csi);//Binding the implementation class obj with RMI registry
		System.out.println("Yes,Ready....");

	}

}
