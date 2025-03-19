package com.jlcindia.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {
	static{
		System.out.println("TestFilter-SB");
	}
    public TestFilter() {
    	System.out.println("TestFilter-DC");
    }

    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("TestFilter-init()");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("TestFilter-doFilter() begin");
		System.out.println("PreProcessing Task begin");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		Date d=new Date();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println(d);
		System.out.println("PreProcessing Task end");
		System.out.println("TestFilter before calling TestServlet");
		chain.doFilter(request, response);
		System.out.println("TestFilter after calling TestServlet");
		System.out.println("PostProcessing Task begin");
		String msg=request.getAttribute("MSG").toString();
		System.out.println(msg);
		System.out.println("PostProcessing Task end");
		System.out.println("TestFilter-doFilter() end");
	}

	public void destroy() {
		System.out.println("TestFilter-destroy()");
	}
	
}
