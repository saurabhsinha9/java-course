package com.jlcindia.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyHandlerInterceptor implements HandlerInterceptor{
	static{
		System.out.println("MyHandlerInterceptor-SB");
	}
	public MyHandlerInterceptor() {
		System.out.println("MyHandlerInterceptor-DC");
	}
	
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("MyHandlerInterceptor-afterCompletion()");
	}
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("MyHandlerInterceptor-postHandle()");
	}
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("MyHandlerInterceptor-preHandle()");
		return true;
	}
}
