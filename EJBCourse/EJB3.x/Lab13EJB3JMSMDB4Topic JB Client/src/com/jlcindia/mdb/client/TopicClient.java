package com.jlcindia.mdb.client;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;

public class TopicClient {
	public static void main(String[] args) {
		Connection con=null;
		Session s=null;
		try {
			Properties p=new Properties();
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			Context ctx=new InitialContext(p);
			
			ConnectionFactory factory=(ConnectionFactory)ctx.lookup("TopicConnectionFactory");
			con=factory.createConnection();	
			s=con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Topic top=(Topic)ctx.lookup("topic/JLCTopic");
			MessageProducer producer=s.createProducer(top); 
			
			MapMessage mm=s.createMapMessage();
			mm.setInt("cid", 101);
			mm.setString("orderId", "O-99");
			mm.setString("oDate", "10/10/10");
			mm.setString("Msg", "I have placed order 1 month back. but books are not delivered...\n");
			
			producer.send(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
