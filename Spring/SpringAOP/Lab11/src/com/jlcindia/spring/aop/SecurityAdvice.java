package com.jlcindia.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityAdvice {
	public String verifyUser(ProceedingJoinPoint pjp,String p1,String p2) throws Throwable{
		System.out.println("SecurityService-verifyUser()"+p1+"\t"+p2);
		System.out.println("Before proceed()");
		Object o=pjp.proceed(new Object[]{p1,p2});
		System.out.println("After proceed()");
		return o.toString();
	}
}
