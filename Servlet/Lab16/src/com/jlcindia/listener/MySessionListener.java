package com.jlcindia.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
	static{
		System.out.println("MySessionListener-SB");
	}
    public MySessionListener() {
        System.out.println("MySessionListener-DC");
    }

    ServletContext context=null;
    HttpSession session=null;
    public void sessionCreated(HttpSessionEvent hse) {
    	 System.out.println("MySessionListener-sessionCreated");
    	 session=hse.getSession();
    	 context=session.getServletContext();
    	 int tv=Integer.parseInt(context.getAttribute("TV").toString());
    	 tv++;
    	 int co=Integer.parseInt(context.getAttribute("CO").toString());
    	 co++;
    	 context.setAttribute("TV", new Integer(tv));
    	 context.setAttribute("CO", new Integer(co));
    }

	
    public void sessionDestroyed(HttpSessionEvent hse) {
    	 System.out.println("MySessionListener-sessionDestroyed");
    	 session=hse.getSession();
    	 context=session.getServletContext();
    	 int co=Integer.parseInt(context.getAttribute("CO").toString());
    	 co--;
    	 context.setAttribute("CO", new Integer(co));
    }
	
}
