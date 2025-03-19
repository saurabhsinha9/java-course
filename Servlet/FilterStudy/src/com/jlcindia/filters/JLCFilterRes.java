package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jlcindia.servlets.HelloServlet;

public class JLCFilterRes implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init()-filterRes");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter()Res");		
	}
   
	public void destroy() {
		System.out.println("destroyRes");
	}
}
