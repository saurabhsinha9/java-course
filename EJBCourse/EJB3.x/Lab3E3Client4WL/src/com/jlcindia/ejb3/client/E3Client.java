package com.jlcindia.ejb3.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.text.AbstractDocument.Content;

import com.jlcindia.ejb3.hello.HelloRemote;

public class E3Client {
	static{
		System.out.println("E3Client-SB");
	}
public static void main(String[] args) {
	System.out.println("E3Client-main()");
	try {
		Properties p=new Properties();
		p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		p.put(Context.PROVIDER_URL, "t3://localhost:8001");
		Context ctx= new InitialContext(p);
		
		HelloRemote hr=(HelloRemote) ctx.lookup("HelloBean#com.jlcindia.ejb3.hello.HelloRemote");
		String msg=hr.getMessage("Saurabh");
		System.out.println(msg);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
