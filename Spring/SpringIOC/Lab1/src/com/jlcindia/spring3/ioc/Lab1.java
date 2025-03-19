package com.jlcindia.spring3.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		System.out.println("Spring Container is going to start...");
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring Container started");
		System.out.println("getting A class Object using getBean()");
		A ao=(A) ctx.getBean("aobj");
		System.out.println("invoking A class show()");
		ao.show();
		System.out.println("getting B class Object using getBean()");
		B bo=(B) ctx.getBean("bobj");
		System.out.println("invoking B class show()");
		bo.show();
	}

}
