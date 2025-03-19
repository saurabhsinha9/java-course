package com.jlcindia.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.ejb.EJBHome;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ServiceLocator {
	Map cache=null;
	Context ctx=null;
	private static ServiceLocator sl=null;
	private ServiceLocator() {
		try {
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			ctx=new InitialContext(p);
			cache=Collections.synchronizedMap(new HashMap());
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static synchronized ServiceLocator getInstance() {
		if(sl==null){
			sl=new ServiceLocator();
		}
		return sl;
	}
		
	public EJBHome getHome(String homeJndiName) {
		EJBHome home=null;
		try {
			if(cache.containsKey(homeJndiName)){
				home=(EJBHome) cache.get(homeJndiName);
			}else {
				Object o=ctx.lookup(homeJndiName);
				home=(EJBHome)o;
				cache.put(homeJndiName, home);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return home;	
	}
}
