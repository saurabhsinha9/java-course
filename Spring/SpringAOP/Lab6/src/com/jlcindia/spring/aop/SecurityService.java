package com.jlcindia.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	@Pointcut(value="execution(* com.jlcindia.spring.aop.*Service.m*(..))")
	public void jlc(){}
	
	@Before("jlc()")
	public void verifyUser(){
		System.out.println("SecurityService-verifyUser()");
	}
}
