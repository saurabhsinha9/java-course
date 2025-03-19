package com.jlcindia.bookstore.mdb;

import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class OrderManagerBean implements MessageDrivenBean,MessageListener{
	static{
		System.out.println("OrderManagerBean-SB");
	}
	MessageDrivenContext mdc=null;
	
	public void ejbRemove() throws EJBException {
		System.out.println("OrderManagerBean-ejbRemove()");
	}
	
	public void ejbCreate() throws EJBException {
		System.out.println("OrderManagerBean-ejbCreate()");
	}

	public void setMessageDrivenContext(MessageDrivenContext ctx)
			throws EJBException {
		System.out.println("OrderManagerBean-setMessageDrivenContext()");
		mdc=ctx;
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