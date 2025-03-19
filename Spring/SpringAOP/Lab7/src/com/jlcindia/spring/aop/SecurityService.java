package com.jlcindia.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	@Pointcut(value="execution(* com.jlcindia.spring.aop.*Service.m*(..))")
	public void jlc(){}
	
	@Around("jlc()")
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("SecurityService-verifyUser()");
		System.out.println("Before proceed()");
		Object o=pjp.proceed();
		System.out.println("After proceed()");
	}
}
