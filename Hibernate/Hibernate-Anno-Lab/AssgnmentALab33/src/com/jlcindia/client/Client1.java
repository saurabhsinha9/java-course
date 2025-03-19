package com.jlcindia.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.BookDAO;
import com.jlcindia.dao.OrderDAO;
import com.jlcindia.dao.OrderItemDAO;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.factory.DAOFactory;
import com.jlcindia.to.AddressTO;
import com.jlcindia.to.AuthorTO;
import com.jlcindia.to.BookTO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.to.OrderItemTO;
import com.jlcindia.to.OrderTO;


public class Client1 {
	public static void main(String[] args) {
		AddressDAO adao=DAOFactory.getAddressDAO();
		UserDAO udao=DAOFactory.getUserDAO();
		BookDAO bdao=DAOFactory.getBookDAO();
		OrderDAO odao=DAOFactory.getOrderDAO();
		OrderItemDAO oidao=DAOFactory.getOrderItemDAO();
		
		//1.Add the Author
		Map<String,String> login1=new HashMap<String, String>();
		login1.put("saurabh", "saurabh");
		login1.put("dablu", "dablu");
		Set<String> emails=new HashSet<String>();
		emails.add("sau@jlc");
		emails.add("dab@jlc");
		List<String> phones=new ArrayList<String>();
		phones.add("11111");
		phones.add("22222");
		
		AuthorTO author1=new AuthorTO(login1, "Saurabh Sinha", "saur1@gmail.com", 2, 25, "SDSOFT", emails, phones);
		udao.addAuthor(author1);
		AuthorTO author2=new AuthorTO(login1, "Dablu Sinha", "dablu1@gmail.com", 3, 20, "JLC", emails, phones);
		udao.addAuthor(author2);
		
		
		//Adding Books
		BookTO bto1=new BookTO("Mastering Hibernate", 888.99, "JLC", "123-99-97");
		bdao.addBook(bto1);
		BookTO bto2=new BookTO("Mastering Spring", 999.99, "JLC", "127-88-97");
		bdao.addBook(bto2);
		BookTO bto3=new BookTO("Mastering EJB", 777.99, "JLC", "333-99-97");
		bdao.addBook(bto3);
		
		//Add the Customer
		Map<String,String> logins=new HashMap<String, String>();
		logins.put("sri", "sri");
		logins.put("vas", "vas");
		List<Long> ccnos=new ArrayList<Long>();
		ccnos.add(new Long(12345));
		ccnos.add(new Long(99999));
		CustomerTO custo=new CustomerTO(logins, "Srinivas", "sri@jlc", ccnos, "Gold", new Long(11111), "10-10-10");
		udao.addCustomer(custo);
		
		//Add the Orders
		OrderTO order1=new OrderTO(new Date(), 1223, 4, "New"); 
		odao.addOrder(order1);
		OrderTO order2=new OrderTO(new Date(), 350, 1, "New"); 
		odao.addOrder(order2);
		OrderTO order3=new OrderTO(new Date(), 800, 2, "New"); 
		odao.addOrder(order3);
		
		//Add the Address
		AddressTO ato1=new AddressTO("M.K", "BLORE", "KA");
		adao.addAddress(ato1);
		
		//Add the OrderItems
		OrderItemTO oito1=new OrderItemTO("Mastering Hibernate", 2, 600);
		oidao.addOrderItem(oito1);
		OrderItemTO oito2=new OrderItemTO("Mastering Spring", 1, 600);
		oidao.addOrderItem(oito2);
		OrderItemTO oito3=new OrderItemTO("Mastering EJB", 1, 600);
		oidao.addOrderItem(oito3);
		OrderItemTO oito4=new OrderItemTO("Mastering JAVA", 1, 500);
		oidao.addOrderItem(oito4);
		OrderItemTO oito5=new OrderItemTO("Mastering Android", 2, 900);
		oidao.addOrderItem(oito5);
	}

}
