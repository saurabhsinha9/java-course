package com.jlcindia.bookstore.mdb;

import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class MailManagerBean implements MessageDrivenBean,MessageListener{
	static{
		System.out.println("MailManagerBean-SB");
	}
	MessageDrivenContext mdc=null;
	
	public void ejbRemove() throws EJBException {
		System.out.println("MailManagerBean-ejbRemove()");
	}

	public void ejbCreate() throws EJBException {
		System.out.println("MailManagerBean-ejbCreate()");
	}
	
	public void setMessageDrivenContext(MessageDrivenContext ctx)
			throws EJBException {
		System.out.println("MailManagerBean-setMessageDrivenContext()");
		mdc=ctx;
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
