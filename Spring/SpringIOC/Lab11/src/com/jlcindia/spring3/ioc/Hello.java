package com.jlcindia.spring3.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean
,BeanNameAware,BeanFactoryAware{

	int x;
	String str;
	String bname;
	
	BeanFactory factory;
	static{
		System.out.println("Hello-SB");
	}
	public Hello() {
		System.out.println("Hello-DC");
	}
	
	public Hello(int x) {
		System.out.println("Hello(int x)");
		this.x = x;
	}

	public void setStr(String str) {
		System.out.println("Hello-setStr(String str)");
		this.str = str;
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello-InitializingBean-afterPropertiesSet()");
	}

	public void myInit(){
		System.out.println("Hello-XML-myInit()");
	}
	
	public void destroy() throws Exception {
		System.out.println("Hello-DisposableBean-destroy()");
	}

	public void myCleanup(){
		System.out.println("Hello-XML-myCleanup()");
	}
	
	public void setBeanName(String bname) {
		System.out.println("Hello-setBeanName(String bname)");
		this.bname=bname;
	}

	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("Hello-setBeanFactory(BeanFactory factory)");
		this.factory=factory;
	}

	public void show() {
		System.out.println("Hello-show()");
		System.out.println(x);
		System.out.println(str);
		System.out.println(bname);
		System.out.println(factory);	
	}

}
