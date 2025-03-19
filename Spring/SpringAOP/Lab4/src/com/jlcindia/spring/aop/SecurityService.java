package com.jlcindia.spring.aop;

public class SecurityService {
	public void verifyUser(String p1,String p2){
		System.out.println("SecurityService-verifyUser()"+p1+"\t"+p2);
	}
}
