package com.jlcindia.spring3.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Lab11 {
	public static void main(String[] args) {
		
		/*Resource rs=new ClassPathResource("applicationContext.xml");
		*/
		Resource rs=new FileSystemResource("E:/W/b27-28/Spring/SpringIOC/Lab10/src/applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(rs);
		Hello h=(Hello)factory.getBean("hello");
		h.show();
		
	}
}
