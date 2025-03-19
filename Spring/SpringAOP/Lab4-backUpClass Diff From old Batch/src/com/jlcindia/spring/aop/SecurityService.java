package com.jlcindia.spring.aop;

public class SecurityService {
	static{
		System.out.println("SecurityService  -S.B");
	}
	public SecurityService(){
		System.out.println("SecurityService  -D.C");
	}
public void verifyUser(){
	System.out.println("SecurityService-verifyUser()");
}
}
