package com.jlc.struts2;

import java.util.Calendar;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	
	static{
		System.out.println("MyInterceptor-SB");
	}
	
	public MyInterceptor() {
		System.out.println("MyInterceptor-DC");
	}
	
	public void init() {
		
		System.out.println("MyInterceptor-init()");
	}

	public void destroy() {
		System.out.println("MyInterceptor-destroy()");
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("MyInterceptor-intercept()");
		System.out.println("Pre Processing Code of My Interceptor Here");
		ActionContext ac=invocation.getInvocationContext();
		Map sessionMap=ac.getSession();
		Calendar calendar=Calendar.getInstance();
		int hour=calendar.get(Calendar.HOUR_OF_DAY);	
		String greeting=(hour<6)?"Good Evening":
			((hour<12)?"Good Morning":
				((hour<18)?"Good AfterNoon":"Good Evening"));
		sessionMap.put("Greeting", greeting);
		String result=invocation.invoke();
		System.out.println("Post Processing Code of My Interceptor Here");
		return result;
	}

}
