package com.jlcindia.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class JLCManager {
	@Autowired
	ApplicationContext ctx=null;
	public void addBatch(Batch bat){
		BatchEvent be=new BatchEvent(this, bat);
		ctx.publishEvent(be);
	}
	public void addWorkshop(Workshop ws){
		WorkShopEvent wse=new WorkShopEvent(this, ws);
		ctx.publishEvent(wse);
	}
}
