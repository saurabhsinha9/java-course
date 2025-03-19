package com.jlcindia.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	@Pointcut(value="execution(* com.jlcindia.spring.aop.*Service.m*(..))")
	public void jlc(){}
	
	@Before("jlc()")
	public void logBegin(){
		System.out.println("LogService-logBegin()");
	}
	@AfterReturning("jlc()")
	public void logEnd(){
		System.out.println("LogService-logEnd()");
	}
	@AfterThrowing("jlc()")
	public void logException(){
		System.out.println("LogService-logException()");
	}
	@After("jlc()")
	public void logOk(){
		System.out.println("LogService-logOk()");
	}
}
