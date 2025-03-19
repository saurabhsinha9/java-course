package com.jlcindia.ejb2.customer.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.ejb2.customer.CustomerHome;
import com.jlcindia.ejb2.customer.CustomerRemote;

public class CustomerClient {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			CustomerHome ch=(CustomerHome)ctx.lookup("JLCCustomerHomeJNDI");
			
			/*CustomerRemote cr1=ch.create("105", "CC", "C@JLC");
			CustomerRemote cr2=ch.create("106", "DD", "D@JLC","2222");
			CustomerRemote cr3=ch.findByPrimaryKey("105");
			cr3.setPhone("1234");*/
			
			/*System.out.println("All Customers");
			Collection col=ch.findAllCustomers();
			Iterator it=col.iterator();
			while(it.hasNext()){
				CustomerRemote crr=(CustomerRemote)it.next();
				String cid=crr.getPrimaryKey().toString();
				System.out.println(cid);
				CustomerRemote cr=ch.findByPrimaryKey(cid);
				System.out.println(cr.getCid()+"\t"+cr.getCname()+"\t"+cr.getEmail()+"\t"+cr.getPhone());
			}*/
			
			/*System.out.println("Customer by Name");
			Collection col1=ch.findAllCustomersByName("CC");
			Iterator it1=col1.iterator();
			while(it1.hasNext()){
				CustomerRemote crr=(CustomerRemote)it1.next();
				String cid=crr.getPrimaryKey().toString();
				System.out.println(cid);
				CustomerRemote cr=ch.findByPrimaryKey(cid);
				System.out.println(cr.getCid()+"\t"+cr.getCname()+"\t"+cr.getEmail()+"\t"+cr.getPhone());
			}*/
			
			System.out.println("Customer by Email");
			CustomerRemote crr =ch.findCustomerByEmail("D@JLC");
				String cid=crr.getPrimaryKey().toString();
				System.out.println(cid);
				CustomerRemote cr=ch.findByPrimaryKey(cid);
				System.out.println(cr.getCid()+"\t"+cr.getCname()+"\t"+cr.getEmail()+"\t"+cr.getPhone());
				
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
