package com.jlcindia.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMIAdvice implements MethodInterceptor{
	@Autowired
	SecurityService ss=null;
	@Autowired
	LogService ls=null;
	public Object invoke(MethodInvocation mi) throws Throwable {
		ls.logBegin();
		ss.verifyUser();
		mi.proceed();
		ls.logEnd();
		return null;
	}
}
