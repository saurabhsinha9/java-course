package com.jlcindia.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Lab14 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JLCManager ma=(JLCManager)ctx.getBean("jlc");
		Batch b=new Batch("b-27", "2/2/2", "6:30-8:30", 100);
		ma.addBatch(b);
		Workshop ws=new Workshop("Web Service", 5000, 100);
		ma.addWorkshop(ws);
		
	}

}
