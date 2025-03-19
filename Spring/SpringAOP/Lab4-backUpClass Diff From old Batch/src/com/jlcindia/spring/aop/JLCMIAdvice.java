package com.jlcindia.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMIAdvice implements MethodInterceptor {
@Autowired
SecurityService ss=null;
@Autowired
LogService ls=null;
@Autowired
TxService ts=null;
	public Object invoke(MethodInvocation mi) throws Throwable {
		ls.logBefore();
		ts.begin();
		Object obj=null;
		obj=mi.proceed();
		ts.commit();
		ls.logReturning();
		return null;

	}

}
