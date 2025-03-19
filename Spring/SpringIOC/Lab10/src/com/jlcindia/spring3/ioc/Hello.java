package com.jlcindia.spring3.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hello implements InitializingBean,DisposableBean
,BeanNameAware,BeanFactoryAware,ApplicationContextAware{

	int x;
	String str;
	
	A aobj; 
	@Autowired
	B bobj;
	
	String bname;
	
	BeanFactory factory;
	ApplicationContext context;
	
	@Autowired
	BeanFactory factory1;
	
	@Autowired
	ApplicationContext context1;
	
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

	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj(A aobj)");
		this.aobj = aobj;
	}

	@PostConstruct
	public void init(){
		System.out.println("Hello-@PostConstruct-init()");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello-InitializingBean-afterPropertiesSet()");
	}

	public void myInit(){
		System.out.println("Hello-XML-myInit()");
	}
	
	@PreDestroy
	public void cleanup(){
		System.out.println("Hello-@PreDestroy-cleanup()");
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

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("Hello-setApplicationContext(ApplicationContext context)");
		this.context=context;
	}

	public void show() {
		System.out.println("Hello-show()");
		System.out.println(x);
		System.out.println(str);
		aobj.m1();
		bobj.m2();
		System.out.println(bname);
		System.out.println(factory);
		System.out.println(factory1);
		System.out.println(context);
		System.out.println(context1);
	}

}
