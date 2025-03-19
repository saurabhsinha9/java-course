package com.jlcindia.bookstore.mdb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig=
{@ActivationConfigProperty(propertyName="destinationType",propertyValue="javax.jms.Queue")
	,@ActivationConfigProperty(propertyName="destination",propertyValue="queue/JLCQueue")
	,@ActivationConfigProperty(propertyName="acknowledgeMode",propertyValue="Auto-acknowledge")})
public class OrderManagerBean implements MessageListener{
	static{
		System.out.println("OrderManagerBean-SB");
	}
	@Resource
	MessageDrivenContext mdc=null;
	
	@PostConstruct
	public void init(){
		System.out.println("OrderManagerBean-init()");
	}
	@PreDestroy
	public void cleanup(){
		System.out.println("OrderManagerBean-cleanup()");
	}
	public void onMessage(Message msg) {
		System.out.println("OrderManagerBean-onMessage()");
		try {
			//store in DB
			MapMessage mm=(MapMessage)msg;
			System.out.print(mm.getInt("cid")+"\t"+mm.getString("oDate")
					+"\t"+mm.getInt("totalQty")+"\t"+mm.getDouble("totalCost")+"\t"+mm.getString("status"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}