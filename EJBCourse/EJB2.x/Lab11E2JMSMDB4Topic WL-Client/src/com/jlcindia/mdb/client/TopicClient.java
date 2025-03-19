package com.jlcindia.mdb.client;

import java.util.Properties;

import javax.jms.MapMessage;
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
		TopicConnection tcon=null;
		TopicSession ts=null;
		try {
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			
			TopicConnectionFactory factory=(TopicConnectionFactory)ctx.lookup("JLCTopicConnection Factory");
			tcon=factory.createTopicConnection();	
			ts=tcon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			Topic top=(Topic)ctx.lookup("JLCTopic");
			TopicPublisher tpub=ts.createPublisher(top);
			
			MapMessage mm=ts.createMapMessage();
			mm.setInt("cid", 101);
			mm.setString("orderId", "O-99");
			mm.setString("oDate", "10/10/10");
			mm.setString("Msg", "I have placed order 1 month back. but books are not delivered...\n");
			
			tpub.publish(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
