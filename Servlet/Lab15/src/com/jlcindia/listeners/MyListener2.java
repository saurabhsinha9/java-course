package com.jlcindia.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyListener2 implements ServletContextAttributeListener {
	static{
		System.out.println("MyListener2-SB");
	}
    public MyListener2() {
    	System.out.println("MyListener2-DC");
    }

	
    public void attributeAdded(ServletContextAttributeEvent scae) {
    	System.out.println("MyListener2-attributeAdded()");
    	System.out.println(scae.getName()+"*\t"+scae.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae) {
    	System.out.println("MyListener2-attributeReplaced()");
    	System.out.println(scae.getName()+"-\t"+scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
    	System.out.println("MyListener2-attributeRemoved()");
    	System.out.println(scae.getName()+":\t"+scae.getValue());
    }
	
}
