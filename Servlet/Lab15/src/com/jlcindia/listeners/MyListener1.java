package com.jlcindia.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener1 implements ServletContextListener {
	static{
		System.out.println("MyListener1-SB");
	}
    public MyListener1() {
    	System.out.println("MyListener1-DC");
    }

    public void contextInitialized(ServletContextEvent sce) {
    	System.out.println("MyListener1-contextInitialized()");
    	System.out.println(sce);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    	System.out.println("MyListener1-contextDestroyed()");
    	System.out.println(sce);
    }
	
}
