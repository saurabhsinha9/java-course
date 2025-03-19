package com.jlcindia.spring.ioc;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class JLCListener implements ApplicationListener{
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof BatchEvent){
			BatchEvent batchEvent=(BatchEvent)event;
			Batch bat=batchEvent.getBatch();
			System.out.println(bat);
		}else if(event instanceof WorkShopEvent){
			WorkShopEvent wsEvent=(WorkShopEvent)event;
			Workshop ws=wsEvent.getWs();
			System.out.println(ws);
		}	
	}
}
