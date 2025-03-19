package com.jlcindia.bookstore.ejb2.client;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.bookstore.ejb2.cart.CartHome;
import com.jlcindia.bookstore.ejb2.cart.CartRemote;
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
			
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("JLCCartHomeJNDI");
			CartHome home=(CartHome) obj;
			CartRemote cr=home.create("C-99");
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
			List items=cr.showCart();
			System.out.println(items.size());
			//you wrote the code to display the items in cart
			int id=cr.placeOrder("C-99");
			System.out.println(id);
		} catch (Exception e) {
			System.out.println(e); 
			e.printStackTrace();
		}
	}
}

