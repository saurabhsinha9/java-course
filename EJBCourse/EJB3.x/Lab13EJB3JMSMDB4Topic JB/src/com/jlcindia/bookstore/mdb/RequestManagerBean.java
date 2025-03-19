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
{@ActivationConfigProperty(propertyName="destinationType",propertyValue="javax.jms.Topic")
	,@ActivationConfigProperty(propertyName="destination",propertyValue="topic/JLCTopic")
	,@ActivationConfigProperty(propertyName="acknowledgeMode",propertyValue="Auto-acknowledge")})
public class RequestManagerBean implements MessageListener{
	static{
		System.out.println("RequestManagerBean-SB");
	}
	
	@Resource
	MessageDrivenContext mdc=null;
	
	@PostConstruct
	public void init(){
		System.out.println("RequestManagerBean-init()");
	}
	@PreDestroy
	public void cleanup(){
		System.out.println("RequestManagerBean-cleanup()");
	}
	
	public void onMessage(Message msg) {
		System.out.println("RequestManagerBean-onMessage()");
		try {
			//send mail to emailId of Customer and Manager
			MapMessage mm=(MapMessage)msg;
			System.out.print(mm.getInt("cid")+"\t"+mm.getString("orderId")+"\t"+mm.getString("oDate")+"\t"+mm.getString("Msg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}