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
		ls.logParams(mi.getArguments()[0].toString(),mi.getArguments()[1].toString());
		ss.verifyUser(mi.getArguments()[0].toString(), mi.getArguments()[1].toString());
		String str=(String) mi.proceed();
		ls.logReturnValue(str);
		return str;
	}
}
