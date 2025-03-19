package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterB implements Filter {
	static{
		System.out.println("FilterB-SB");
	}
    public FilterB() {
    	System.out.println("FilterB-DC");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterB-init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterB-doFilter() begin");
		System.out.println("PreProcessing Task begin in FilterB");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("PreProcessing Task end in FilterB");
		System.out.println("FilterB before calling");
		chain.doFilter(request, response);
		System.out.println("FilterB after calling");
		System.out.println("PostProcessing Task begin in FilterB");
		String msg=request.getAttribute("MSG").toString();
		System.out.println(msg);
		System.out.println("PostProcessing Task end in FilterB");
		System.out.println("FilterB-doFilter() end");
	}
	
	public void destroy() {
		System.out.println("FilterB-destroy()");
	}

}
