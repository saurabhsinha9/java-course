package com.jlcindia.listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {
	static{
		System.out.println("MyContextListener-SB");
	}
   
    public MyContextListener() {
    	System.out.println("MyContextListener-DC");
    }
    ServletContext context=null;
    public void contextInitialized(ServletContextEvent sce) {
    	System.out.println("MyContextListener-contextInitialized()");
    	context=sce.getServletContext();
    	ArrayList al=new ArrayList();
    	al.add("Head First Java");
    	al.add("Head First JSP");
    	al.add("Head First Servlet");
    	al.add("Head First Struts");
    	al.add("Head First EJB");
    	al.add("Head First Hibernate");
    	context.setAttribute("Book", al);
    	Integer i=new Integer(0);
    	context.setAttribute("TV", i);
    	context.setAttribute("CO", i);
    }

	
    public void contextDestroyed(ServletContextEvent sce) {
    	System.out.println("MyContextListener-contextDestroyed()");
    }
	
}
