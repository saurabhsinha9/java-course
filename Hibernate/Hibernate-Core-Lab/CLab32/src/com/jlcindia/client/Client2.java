package com.jlcindia.client;

import java.util.HashSet;
import java.util.Set;

import com.jlcindia.dao.BookDAO;
import com.jlcindia.dao.OrderDAO;
import com.jlcindia.dao.OrderItemDAO;
import com.jlcindia.factory.DAOFactory;

public class Client2 {
	public static void main(String[] args) {
		BookDAO bdao=DAOFactory.getBookDAO();
		OrderDAO odao=DAOFactory.getOrderDAO();
		OrderItemDAO oidao=DAOFactory.getOrderItemDAO();
		
		//1.Assosiate Author to Book -ok
		/*Set<Integer> aids=new HashSet<Integer>();
		aids.add(1);
		aids.add(2);
		bdao.setAuthorToBook(1, aids);
		
		Set<Integer> aids1=new HashSet<Integer>();
		aids1.add(1);
		bdao.setAuthorToBook(2, aids1);
		
		Set<Integer> aids2=new HashSet<Integer>();
		aids2.add(1);
		bdao.setAuthorToBook(3, aids2);
		*/
		//2.Assosiate Customer to Order -ok
		/*odao.setCustomerToOrder(3, 1);
		odao.setCustomerToOrder(3, 2);
		odao.setCustomerToOrder(3, 3);
		
		//3.Assosiate Address to order -ok
		odao.setAddressToOrder(1, 1);
		odao.setAddressToOrder(1, 2);
		odao.setAddressToOrder(1, 3);*/
		
		//4.Assosiate OrderItem to Order -ok
		/*Set<Integer> oiids=new HashSet<Integer>();
		oiids.add(1);
		oiids.add(2);
		oidao.setOrderItemsToOrder(1, oiids);
		
		Set<Integer> oiids1=new HashSet<Integer>();
		oiids1.add(4);
		oiids1.add(5);
		oidao.setOrderItemsToOrder(3, oiids1);*/
		
		//5.Assosiate Order to OrderItem -ok
		//oidao.setOrderToOrderItem(2, 3);
	}
}
