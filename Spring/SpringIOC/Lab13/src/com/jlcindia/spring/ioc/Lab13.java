package com.jlcindia.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab13 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello h=(Hello) ctx.getBean("hello");
		h.showEnglish();
		h.showHindi();
	}

}
