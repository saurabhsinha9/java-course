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
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			
			Object obj=ctx.lookup("JLCHelloHomeJNDI");//lookup the jndi registry and get the BI object
			HelloHome home=(HelloHome) obj;//storing the BI or remote Interface object in home interface ref-var
			HelloRemote hr=home.create();//from HI ref-var calling create method of HI whose return type is RI
			String msg=hr.getMessage("Saurabh");//invoking the remote BS using remote Interface object
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
