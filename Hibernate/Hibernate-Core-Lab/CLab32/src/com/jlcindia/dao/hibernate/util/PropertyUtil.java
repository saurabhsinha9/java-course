package com.jlcindia.dao.hibernate.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jlcindia.bean.Address;
import com.jlcindia.bean.Author;
import com.jlcindia.bean.Book;
import com.jlcindia.bean.Customer;
import com.jlcindia.bean.Order;
import com.jlcindia.bean.OrderItem;
import com.jlcindia.to.AddressTO;
import com.jlcindia.to.AuthorTO;
import com.jlcindia.to.BookTO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.to.OrderItemTO;
import com.jlcindia.to.OrderTO;

public class PropertyUtil {
	public static AddressTO getAddressTOFromAddress(Address add){
		AddressTO ato=new AddressTO();
		ato.setAddId(add.getAddId());
		ato.setStreet(add.getStreet());
		ato.setCity(add.getCity());
		ato.setState(add.getState());
		return ato;
	}
	
	public static Address getAddressFromAddressTO(AddressTO ato){
		Address add=new Address();
		add.setAddId(ato.getAddId());
		add.setStreet(ato.getStreet());
		add.setCity(ato.getCity());
		add.setState(ato.getState());
		return add;
	}
	
	public static AuthorTO getAuthorTOFromAuthor(Author author){
		AuthorTO ato=new AuthorTO();
		ato.setUserId(author.getUserId());
		ato.setFullName(author.getFullName());
		ato.setEmail(author.getEmail());
		ato.setAge(author.getAge());
		ato.setCompany(author.getCompany());
		ato.setExp(author.getExp());
		Map<String,String> logins=new HashMap<String, String>(author.getLogins());
		ato.setLogins(logins);
		Set<String> emails=new HashSet<String>(author.getEmails());
		ato.setEmails(emails);
		List<String> phones=new ArrayList<String>(author.getPhones());
		ato.setPhones(phones);
		return ato;
	}
	public static Author getAuthorFromAuthorTO(AuthorTO ato){
		Author au=new Author();
		au.setUserId(ato.getUserId());
		au.setFullName(ato.getFullName());
		au.setEmail(ato.getEmail());
		au.setAge(ato.getAge());
		au.setCompany(ato.getCompany());
		au.setExp(ato.getExp());
		Map<String,String> logins=new HashMap<String, String>(ato.getLogins());
		au.setLogins(logins);
		Set<String> emails=new HashSet<String>(ato.getEmails());
		au.setEmails(emails);
		List<String> phones=new ArrayList<String>(ato.getPhones());
		au.setPhones(phones);
		return au;
	}
	
	
	public static CustomerTO getCustomerTOFromCustomer(Customer cust){
		CustomerTO cto=new CustomerTO();
		cto.setUserId(cust.getUserId());
		cto.setFullName(cust.getFullName());
		cto.setEmail(cust.getEmail());
		cto.setPhone(cust.getPhone());
		cto.setDob(cust.getDob());
		Map<String,String> logins=new HashMap<String, String>(cust.getLogins());
		cto.setLogins(logins);
		List<Long> ccnos=new ArrayList<Long>(cust.getCcnos());
		cto.setCcnos(ccnos);
		cto.setCustType(cust.getCustType());
		Set<OrderTO> otos=new HashSet<OrderTO>();
		Set<Order> orders=cust.getOrders();
		for(Order order:orders){
			OrderTO oto=PropertyUtil.getOrderTOFromOrder(order);
			otos.add(oto);
		}
		cto.setOrderTos(otos);
		return cto;
	}
	
	public static Customer getCustomerFromCustomerTO(CustomerTO cto){
		Customer cust=new Customer();
		cust.setUserId(cto.getUserId());
		cust.setFullName(cto.getFullName());
		cust.setEmail(cto.getEmail());
		Map<String,String> logins=new HashMap<String, String>(cto.getLogins());
		cust.setLogins(logins);
		List<Long> ccnos=new ArrayList<Long>(cto.getCcnos());
		cust.setCcnos(ccnos);
		cust.setCustType(cto.getCustType());
		cust.setDob(cto.getDob());
		cust.setPhone(cto.getPhone());
		return cust;
	}
	
	public static BookTO getBookTOFromBook(Book book) {
		BookTO bto=new BookTO();
		bto.setBookId(book.getBookId());
		bto.setBookName(book.getBookName());
		bto.setIsbn(book.getIsbn());
		bto.setPrice(book.getPrice());
		bto.setPub(book.getPub());
		Set<AuthorTO> atos=new HashSet<AuthorTO>();
		Set<Author> authors=book.getAuthors();
		for(Author author:authors){
			AuthorTO ato=PropertyUtil.getAuthorTOFromAuthor(author);
			atos.add(ato);
		}
		bto.setAuthors(atos);
		return bto;
	}

	public static Book getBookFromBookTO(BookTO bto) {
		Book book=new Book();
		book.setBookId(bto.getBookId());
		book.setBookName(bto.getBookName());
		book.setIsbn(bto.getIsbn());
		book.setPrice(bto.getPrice());
		book.setPub(bto.getPub());
		return book;
	}
	public static OrderTO getOrderTOFromOrder(Order order) {
		OrderTO oto=new OrderTO();
		oto.setOrderId(order.getOrderId());
		oto.setOrderDate(order.getOrderDate());
		oto.setTotalCost(order.getTotalCost());
		oto.setTotalNos(order.getTotalNos());
		oto.setStatus(order.getStatus());
		AddressTO ato=PropertyUtil.getAddressTOFromAddress(order.getAddress());
		oto.setAddressTO(ato);
		Set<OrderItemTO> oitos=new HashSet<OrderItemTO>();
		Set<OrderItem> orderItems=order.getOrderItems();
		for(OrderItem oi:orderItems){
			OrderItemTO oito=PropertyUtil.getOrderItemTOFromOrderItem(oi);
			oitos.add(oito);
		}
		oto.setOrderItemTOs(oitos);
		return oto;
	}
	
	public static Order getOrderFromOrderTO(OrderTO oto) {
		Order order=new Order();
		order.setOrderId(oto.getOrderId());
		order.setOrderDate(oto.getOrderDate());
		order.setTotalCost(oto.getTotalCost());
		order.setTotalNos(oto.getTotalNos());
		order.setStatus(oto.getStatus());
		return order;
	}
	public static OrderItemTO getOrderItemTOFromOrderItem(OrderItem oi) {
		OrderItemTO oito=new OrderItemTO();
		oito.setOrderItemId(oi.getOrderItemId());
		oito.setBookName(oi.getBookName());
		oito.setCost(oi.getCost());
		oito.setQty(oi.getQty());
		return oito;
	}

	public static OrderItem getOrderItemFromOrderItemTO(OrderItemTO oito) {
		OrderItem oi=new OrderItem();
		oi.setOrderItemId(oito.getOrderItemId());
		oi.setBookName(oito.getBookName());
		oi.setCost(oito.getCost());
		oi.setQty(oito.getQty());
		return oi;
	}
}
