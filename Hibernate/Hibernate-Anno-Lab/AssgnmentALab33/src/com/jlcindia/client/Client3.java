package com.jlcindia.client;

import java.util.HashSet;
import java.util.Set;

import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.BookDAO;
import com.jlcindia.dao.OrderDAO;
import com.jlcindia.dao.OrderItemDAO;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.factory.DAOFactory;
import com.jlcindia.to.AuthorTO;
import com.jlcindia.to.BookTO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.to.OrderItemTO;
import com.jlcindia.to.OrderTO;

public class Client3 {
	public static void main(String[] args) {
		AddressDAO adao=DAOFactory.getAddressDAO();
		UserDAO udao=DAOFactory.getUserDAO();
		BookDAO bdao=DAOFactory.getBookDAO();
		OrderDAO odao=DAOFactory.getOrderDAO();
		OrderItemDAO oidao=DAOFactory.getOrderItemDAO();
		
		/*//1.Load Book #1
		BookTO bto=bdao.getBookById(1);
		System.out.println("Info of Book#1");
		System.out.println(bto);
		Set<AuthorTO> authors=bto.getAuthors();
		System.out.println("Author of Book#1");
		for(AuthorTO ato:authors){
			System.out.println(ato);
			System.out.println("Emails:"+ato.getEmails());
			System.out.println("Logins:"+ato.getLogins());
			System.out.println("Phones:"+ato.getPhones());
			System.out.println("");
		}
		*/
		//2.Load Customer #3
		CustomerTO cto=udao.getCustomerById(3);
		System.out.println("Info of Customer#3");
		System.out.println(cto);
		System.out.println("Logins:"+cto.getLogins());
		System.out.println("Credit Cards:"+cto.getCcnos());
		System.out.println("");
		
		Set<OrderTO> orders=cto.getOrderTos();
		System.out.println("Order placed by Customer#3");
		for(OrderTO oto:orders){
			System.out.println("Info of Order#"+oto.getOrderId());
			System.out.println(oto);
			System.out.println("Address of Order#"+oto.getOrderId());
			System.out.println(oto.getAddressTO());
			System.out.println("OrderItems of Order#"+oto.getOrderId());
			for(OrderItemTO oito:oto.getOrderItemTOs()){
				System.out.println(oito);
			}
		}
		
	}
}
