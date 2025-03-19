package com.jlcindia.spring3.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		System.out.println("MyBeanPostProcessor-postProcessAfterInitialization");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {
		System.out.println("MyBeanPostProcessor-postProcessBeforeInitialization");
		return bean;
	}

}
