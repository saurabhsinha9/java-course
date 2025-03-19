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
public class MailManagerBean implements MessageListener{
	static{
		System.out.println("MailManagerBean-SB");
	}
	@Resource
	MessageDrivenContext mdc=null;
	
	@PostConstruct
	public void init(){
		System.out.println("MailManagerBean-init()");
	}
	@PreDestroy
	public void cleanup(){
		System.out.println("MailManagerBean-cleanup()");
	}
	

	public void onMessage(Message msg) {
		System.out.println("MailManagerBean-onMessage()");
		try {
			//send mail to emailId of Customer and Manager
			MapMessage mm=(MapMessage)msg;
			System.out.println(mm.getInt("cid"));
			System.out.println(mm.getString("orderId"));
			System.out.println(mm.getString("oDate"));
			System.out.println(mm.getString("Msg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
