package com.jlcindia.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterA implements Filter {
	static{
		System.out.println("FilterA-SB");
	}
    public FilterA() {
    	System.out.println("FilterA-DC");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterA-init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterA-doFilter() begin");
		System.out.println("PreProcessing Task begin in FilterA");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("PreProcessing Task end in FilterA");
		System.out.println("FilterA before calling");
		chain.doFilter(request, response);
		System.out.println("FilterA after calling");
		System.out.println("PostProcessing Task begin in FilterA");
		String msg=request.getAttribute("MSG").toString();
		System.out.println(msg);
		System.out.println("PostProcessing Task end in FilterA");
		System.out.println("FilterA-doFilter() end");
	}
	
	public void destroy() {
		System.out.println("FilterA-destroy()");
	}

}
