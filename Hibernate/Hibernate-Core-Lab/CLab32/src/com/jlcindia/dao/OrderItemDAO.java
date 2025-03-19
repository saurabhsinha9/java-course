package com.jlcindia.dao;

import java.util.Set;

import com.jlcindia.to.OrderItemTO;


public interface OrderItemDAO {
	public int addOrderItem(OrderItemTO oito);
	public void updateOrderItem(OrderItemTO oito);
	public void deleteOrderItem(int orderItemId);
	public OrderItemTO getOrderItemById(int orderItemId);
	public void setOrderItemsToOrder(int orderId,Set<Integer> orderItemIds);
	public void setOrderToOrderItem(int orderId,int orderItemId);
}
