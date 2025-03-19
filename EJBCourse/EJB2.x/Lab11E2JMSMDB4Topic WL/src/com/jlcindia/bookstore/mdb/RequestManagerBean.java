package com.jlcindia.bookstore.mdb;

import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class RequestManagerBean implements MessageDrivenBean,MessageListener{
	static{
		System.out.println("RequestManagerBean-SB");
	}
	MessageDrivenContext mdc=null;
	
	public void ejbRemove() throws EJBException {
		System.out.println("RequestManagerBean-ejbRemove()");
	}
	
	public void ejbCreate() throws EJBException {
		System.out.println("RequestManagerBean-ejbCreate()");
	}

	public void setMessageDrivenContext(MessageDrivenContext ctx)
			throws EJBException {
		System.out.println("RequestManagerBean-setMessageDrivenContext()");
		mdc=ctx;
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