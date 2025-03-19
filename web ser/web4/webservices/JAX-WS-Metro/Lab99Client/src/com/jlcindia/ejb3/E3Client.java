package com.jlcindia.ejb3;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;


public class E3Client {
	static{
		System.out.println("E3Client-SB");
	}
public static void main(String[] args) {
	System.out.println("E3Client-main()");
	try {
		Properties p=new Properties();
		p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		p.put("java.naming.provider.url", "localhost:1099");
		p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
		Context ctx= new InitialContext(p);
		HelloRemote hr=(HelloRemote) ctx.lookup("HelloBean/remote");
		String msg=hr.getMessage("Saurabh");
		System.out.println(msg);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
