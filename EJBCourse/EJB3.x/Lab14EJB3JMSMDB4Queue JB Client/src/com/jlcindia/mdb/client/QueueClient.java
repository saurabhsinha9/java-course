package com.jlcindia.mdb.client;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;

public class QueueClient {
	public static void main(String[] args) {
		Connection con=null;
		Session s=null;
		try {
			Properties p=new Properties();
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			Context ctx=new InitialContext(p);
			
			ConnectionFactory cf=(ConnectionFactory)ctx.lookup("QueueConnectionFactory");
			con=cf.createConnection();	
			s=con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue que=(Queue)ctx.lookup("queue/JLCQueue");
			MessageProducer producer=s.createProducer(que);
			
			MapMessage mm=s.createMapMessage();
			mm.setInt("cid", 101);
			mm.setString("oDate", "10/10/10");
			mm.setInt("totalQty", 5);
			mm.setDouble("totalCost", 9900);
			mm.setString("status", "New");
			
			producer.send(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
