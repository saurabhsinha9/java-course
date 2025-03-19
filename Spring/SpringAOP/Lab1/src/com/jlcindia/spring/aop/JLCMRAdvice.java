package com.jlcindia.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMRAdvice implements AfterReturningAdvice{
	@Autowired
	LogService ls=null;
	public void afterReturning(Object rv, Method m, Object[] args,
			Object target) throws Throwable {
		ls.logEnd();
	}
}
