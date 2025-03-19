package com.jlcindia.bookstore.dao;

import java.util.List;

import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;

public interface OrderDAO {

	public int addOrder(OrderTO oto, List items);
	public int addOrderItem(OrderItemTO oito);
	public void setOrderItemsToOrder(int orderId,List orderItemId);
}
