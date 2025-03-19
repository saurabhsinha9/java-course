package com.techno.techunt.iq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.HttpRequestHandler;

public class SessionFilter implements Filter {


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}
	
	

	@Override
	public void doFilter(ServletRequest request, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest) request;
		if(!(req.getRequestURI().endsWith("login.do")))
		{
		HttpSession sess=req.getSession(false);	
		if(sess==null||sess.getAttribute("UTO")==null)
		{
		req.setAttribute("SESSION_ERROR","Session Expired,PLZ login again");
			req.getRequestDispatcher("home.jsp").forward(req, res);		
		}
		}
		chain.doFilter(request, res);
		
		
	}

	

	@Override
	public void destroy() {
		
		
	}
	

}
