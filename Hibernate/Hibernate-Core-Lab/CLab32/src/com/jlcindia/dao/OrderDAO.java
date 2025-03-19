package com.jlcindia.dao;

import java.util.Set;

import com.jlcindia.to.OrderTO;


public interface OrderDAO {
	public int addOrder(OrderTO oto);
	public void updateOrder(OrderTO oto);
	public void deleteOrder(int orderId);
	public OrderTO getOrderById(int orderId);
	public void setAddressToOrder(int aid,int oid);
	public void setOrderToCustomer(int cid,Set<Integer> oids);
	public void setCustomerToOrder(int cid,int oid);
}
