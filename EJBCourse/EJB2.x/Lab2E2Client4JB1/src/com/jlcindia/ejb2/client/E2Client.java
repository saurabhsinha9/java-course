package com.jlcindia.ejb2.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.ejb2.hello.HelloHome;
import com.jlcindia.ejb2.hello.HelloRemote;

public class E2Client {
	
	static{
		System.out.println("E2Client-SB");
	}

	public E2Client() {
		System.out.println("E2Client-DC");
	}
	
	public static void main(String args[]){
		System.out.println("E2Client-main()");
		
		try {
			Properties p=new Properties();
			
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("JLCHelloHomeJNDI");
			HelloHome home=(HelloHome) obj;
			HelloRemote hr=home.create();
			String msg=hr.getMessage("Saurabh");
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
