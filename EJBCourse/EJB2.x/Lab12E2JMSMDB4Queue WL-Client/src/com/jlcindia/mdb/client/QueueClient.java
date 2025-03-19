package com.jlcindia.mdb.client;

import java.util.Properties;

import javax.jms.MapMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;

public class QueueClient {
	public static void main(String[] args) {
		QueueConnection qcon=null;
		QueueSession qs=null;
		try {
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			
			QueueConnectionFactory qcf=(QueueConnectionFactory)ctx.lookup("JLCQueueConnection Factory");
			qcon=qcf.createQueueConnection();	
			qs=qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue que=(Queue)ctx.lookup("JLCQueue");
			QueueSender qsend=qs.createSender(que);
			
			MapMessage mm=qs.createMapMessage();
			mm.setInt("cid", 101);
			mm.setString("oDate", "10/10/10");
			mm.setInt("totalQty", 5);
			mm.setDouble("totalCost", 9900);
			mm.setString("status", "New");
			
			qsend.send(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
