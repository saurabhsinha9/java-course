package com.jlcindia.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityService {
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("SecurityService-verifyUser()");
		System.out.println("Before proceed()");
		Object o=pjp.proceed();
		System.out.println("After proceed()");
	}
}
