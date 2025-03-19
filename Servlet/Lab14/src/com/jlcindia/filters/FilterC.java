package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterC implements Filter {
	static{
		System.out.println("FilterC-SB");
	}
    public FilterC() {
    	System.out.println("FilterC-DC");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterC-init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterC-doFilter() begin");
		System.out.println("PreProcessing Task begin in FilterC");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("PreProcessing Task end in FilterC");
		System.out.println("FilterC before calling");
		chain.doFilter(request, response);
		System.out.println("FilterC after calling");
		System.out.println("PostProcessing Task begin in FilterC");
		String msg=request.getAttribute("MSG").toString();
		System.out.println(msg);
		System.out.println("PostProcessing Task end in FilterC");
		System.out.println("FilterC-doFilter() end");
	}
	
	public void destroy() {
		System.out.println("FilterC-destroy()");
	}

}
