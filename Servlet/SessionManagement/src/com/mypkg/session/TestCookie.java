package com.mypkg.session;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestCookie() {
        System.out.println("TestCookie-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("TestCookie-init()");
	}

	public void destroy() {
		System.out.println("TestCookie-destroy()");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestCookie-service()-begin");
		String name=request.getParameter("uname");
		System.out.println(name);
		Cookie ckn=new Cookie("Email","saurabh@gmail.com");
		response.addCookie(ckn);
		Cookie ck1=new Cookie("Email1","saurabh1@gmail.com");
		response.addCookie(ck1);
		Cookie ck2=new Cookie("Email2","saurabh2@gmail.com");
		response.addCookie(ck2);
		Cookie ck3=new Cookie("Email3","saurabh3@gmail.com");
		response.addCookie(ck3);
		Cookie ck[]=request.getCookies();
		for (int i = 0; i < ck.length; i++) {
			String cn = ck[i].getName();
			System.out.println(cn);
			String cv=ck[i].getValue();
			System.out.println(cv);
		}
		
		System.out.println("TestCookie-service()-end");
	}

}
