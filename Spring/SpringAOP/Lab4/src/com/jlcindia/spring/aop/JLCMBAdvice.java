package com.jlcindia.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMBAdvice implements MethodBeforeAdvice{
	@Autowired
	SecurityService ss=null;
	@Autowired
	LogService ls=null;
	public void before(Method m, Object[] args, Object target){
		ls.logParams(args[0].toString(), args[1].toString());
		ss.verifyUser(args[0].toString(), args[1].toString());
	}
}
