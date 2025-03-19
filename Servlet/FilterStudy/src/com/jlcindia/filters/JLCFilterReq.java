package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jlcindia.servlets.HelloServlet;

public class JLCFilterReq implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init()-filter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter()");
		request.getRequestDispatcher("/hello.sau").forward(request, response);
		//chain.doFilter(request, response);
	}
   
	public void destroy() {
		System.out.println("destroy");
	}
}
