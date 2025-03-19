package com.jlcindia.bookstore.ejb3.client;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.bookstore.ejb3.cart.CartRemote;
import com.jlcindia.bookstore.to.OrderItemTO;

public class Client {
	static{
		System.out.println("Client-SB");
	}

	public Client() {
		System.out.println("Client-DC");
	}
	
	public static void main(String args[]){
		System.out.println("Client-main()");
		
		try {
			Properties p=new Properties();
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			Context ctx=new InitialContext(p);
			
			Object obj=ctx.lookup("CartBean/remote");
			if(obj!=null){
				CartRemote cr=(CartRemote) obj;
				OrderItemTO oito1=new OrderItemTO();
				oito1.setBookId("B-101");
				oito1.setQty(2);
				oito1.setCost(200);
				cr.addItemToCart(oito1);
				cr.addItemToCart(oito1);
				
				OrderItemTO oito2=new OrderItemTO();
				oito2.setBookId("B-102");
				oito2.setQty(3);
				oito2.setCost(300);
				cr.addItemToCart(oito2);
				cr.addItemToCart(oito2);
				List<OrderItemTO> items=cr.showCart();
				System.out.println("Total Book"+items.size());
				Iterator<OrderItemTO> it=items.iterator();
				while(it.hasNext()){
					OrderItemTO oito=it.next();
					System.out.println(oito.getBookId()+"\t"+oito.getCost()+"\t"+oito.getQty());
				}
				int x=cr.placeOrder();
			}else{
				System.out.println("Object returned null");
			}
		} catch (Exception e) {
			System.out.println(e); 
			e.printStackTrace();
		}
	}
}
