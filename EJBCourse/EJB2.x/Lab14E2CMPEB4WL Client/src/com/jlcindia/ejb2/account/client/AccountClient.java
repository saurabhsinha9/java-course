package com.jlcindia.ejb2.account.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.ejb2.account.AccountHome;
import com.jlcindia.ejb2.account.AccountRemote;

public class AccountClient {
	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			
			AccountHome home=(AccountHome)ctx.lookup("JLCAccountHomeJNDI");
			
			//inserting records
			System.out.println("inserting records");
			AccountRemote ar1=home.create("2007", "CA", "M.G Road",new Double(16000.0));
			AccountRemote ar2=home.create("2008", "CA", "MAthikere");
			System.out.println(ar1.getAccno()+"\t"+ar1.getAtype()+"\t"+ar1.getBranch()+"\t"+ar1.getBal());
			System.out.println(ar2.getAccno()+"\t"+ar2.getAtype()+"\t"+ar2.getBranch()+"\t"+ar2.getBal());
			
			//loading and updating record
			System.out.println("loading and updating record");
			AccountRemote ar=home.findByPrimaryKey("2008");
			System.out.println(ar.getAccno()+"\t"+ar.getAtype()+"\t"+ar.getBranch()+"\t"+ar.getBal());
			ar.setBal(new Double(10000.0));
			
			//display all accounts
			System.out.println("display all accounts");
			Collection col=home.findAllAccounts();
			Iterator it=col.iterator();
			while(it.hasNext()){
				ar=(AccountRemote)it.next();
				System.out.println(ar.getAccno()+"\t"+ar.getAtype()+"\t"+ar.getBranch()+"\t"+ar.getBal());
			}
			
			//display accounts by Type
			System.out.println("display accounts by Type");
			col=home.findAccountsByType("CA");
			it=col.iterator();
			while(it.hasNext()){
				ar=(AccountRemote)it.next();
				System.out.println(ar.getAccno()+"\t"+ar.getAtype()+"\t"+ar.getBranch()+"\t"+ar.getBal());
			}
			
			//display accounts by Branch
			System.out.println("display accounts by Branch");
			col=home.findAccountsByBranch("MAthikere");
			it=col.iterator();
			while(it.hasNext()){
				ar=(AccountRemote)it.next();
				System.out.println(ar.getAccno()+"\t"+ar.getAtype()+"\t"+ar.getBranch()+"\t"+ar.getBal());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
