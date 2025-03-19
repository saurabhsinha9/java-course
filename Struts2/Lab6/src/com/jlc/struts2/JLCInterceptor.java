package com.jlc.struts2;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class JLCInterceptor implements Interceptor{

	static{
		System.out.println("JLCInterceptor-SB");
	}
	
	public JLCInterceptor() {
		System.out.println("JLCInterceptor-DC");
	}
	
	public void init() {
		
		System.out.println("JLCInterceptor-init()");
	}

	public void destroy() {
		System.out.println("JLCInterceptor-destroy()");
		
	}

	
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("JLCInterceptor-intercept()");
		System.out.println("Pre Processing Code of JLC Interceptor Here");
		ActionContext ac=invocation.getInvocationContext();
		Map sessionMap=ac.getSession();
		sessionMap.put("JLCMSG", "Welcome to Java Learning center");
		String result=invocation.invoke();
		System.out.println("Post Processing Code of JLC Interceptor Here");
		return result;
	}

}
