package com.jlcindia.bookstore.dao;

import java.util.List;

import com.jlcindia.bookstore.to.OrderTO;

public interface OrderDAO {

	public int addOrder(OrderTO oto, List items);

}
