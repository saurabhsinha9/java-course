package com.jlcindia.bookstore.dao;

import java.util.List;

import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;

public interface OrderDAO {

	int addOrder(OrderTO oto, List<OrderItemTO> cart);

}
