package com.mypkg.session;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TestSession() {
       System.out.println("TestSession-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("TestSession-init()");
	}

	public void destroy() {
		System.out.println("TestSession-destroy()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestSession-service()-begin");
		
		
		System.out.println("TestSession-service()-begin");
	}

}
