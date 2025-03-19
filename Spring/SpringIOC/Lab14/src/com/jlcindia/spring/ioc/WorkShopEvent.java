package com.jlcindia.spring.ioc;

import org.springframework.context.ApplicationEvent;

public class WorkShopEvent extends ApplicationEvent{
	Workshop ws;

	public WorkShopEvent(Object source, Workshop ws) {
		super(source);
		this.ws = ws;
	}

	public Workshop getWs() {
		return ws;
	}
	
	
}
