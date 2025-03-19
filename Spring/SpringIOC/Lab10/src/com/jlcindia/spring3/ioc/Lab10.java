package com.jlcindia.spring3.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Lab10 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring Container Ready");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
		ctx.registerShutdownHook();
		System.out.println("Spring Container down...");
		
		/*Resource rs=new ClassPathResource("applicationContext.xml");
		
		Resource rs=new FileSystemResource("E:/W/b27-28/Spring/SpringIOC/Lab10/src/applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(rs);
		Hello h=(Hello)factory.getBean("hello");
		h.show();
		*/
	}
}
