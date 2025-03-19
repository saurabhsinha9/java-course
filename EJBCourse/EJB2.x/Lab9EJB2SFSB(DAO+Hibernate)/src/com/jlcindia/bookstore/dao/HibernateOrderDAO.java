package com.jlcindia.bookstore.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;
import com.jlcindia.dao.HibernateTemplate;

public class HibernateOrderDAO implements OrderDAO {

	public int addOrder(OrderTO oto, List items) {
		Order order=new Order(oto.getOrderDate(),oto.getCid(),oto.getTotalQty(),oto.getTotalCost(),oto.getStatus());
		Integer i=(Integer) HibernateTemplate.saveObject(order);
		return i.intValue();
	}

	public int addOrderItem(OrderItemTO oito) {
		OrderItem orderItem=new OrderItem(oito.getBookId(),oito.getQty(),oito.getCost());
		Integer i=(Integer) HibernateTemplate.saveObject(orderItem);
		return i.intValue();
	}

	public void setOrderItemsToOrder(int orderId, List orderItemId) {
		Order order=(Order)HibernateTemplate.loadObject(Order.class, new Integer(orderId));
		Iterator it=orderItemId.iterator();
		Set items=new HashSet();
		while(it.hasNext()){
			int oiid=((Integer)it.next()).intValue();
			OrderItem orderItem=(OrderItem)HibernateTemplate.loadObject(OrderItem.class, new Integer(oiid));
			items.add(orderItem);
		}
		order.setOrderItems(items);
	}

}
