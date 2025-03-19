package com.jlcindia.dao.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bean.Author;
import com.jlcindia.bean.Book;
import com.jlcindia.bean.Order;
import com.jlcindia.bean.OrderItem;
import com.jlcindia.dao.OrderItemDAO;
import com.jlcindia.dao.hibernate.util.PropertyUtil;
import com.jlcindia.to.OrderItemTO;
import com.jlcindia.util.CHibernateTemplate;
import com.jlcindia.util.CHibernateUtil;

public class HibernateOrderItemDAO implements OrderItemDAO {

	public int addOrderItem(OrderItemTO oito) {
		OrderItem orderItem=PropertyUtil.getOrderItemFromOrderItemTO(oito);
		Integer it=(Integer)CHibernateTemplate.saveObject(orderItem);
		return it.intValue();
	}

	public void updateOrderItem(OrderItemTO oito) {
		OrderItem orderItem=PropertyUtil.getOrderItemFromOrderItemTO(oito);
		CHibernateTemplate.updateObject(orderItem);
	}

	public void deleteOrderItem(int orderItemId) {
		CHibernateTemplate.deleteObject(OrderItem.class, orderItemId);
	}

	public OrderItemTO getOrderItemById(int orderItemId) {
		OrderItem oi=(OrderItem)CHibernateTemplate.loadObject(OrderItem.class, orderItemId);
		OrderItemTO oito=PropertyUtil.getOrderItemTOFromOrderItem(oi);
		return oito;
	}

	public void setOrderItemsToOrder(int orderId, Set<Integer> orderItemIds) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Order order=(Order)session.load(Order.class, orderId);
			Set<OrderItem> items=new HashSet<OrderItem>();
			for (int oiid : orderItemIds) {
				OrderItem orderItem=(OrderItem)session.load(OrderItem.class, oiid);
				items.add(orderItem);
			}
			order.setOrderItems(items);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setOrderItemsToOrder"+e);
			tx.rollback();
		}
	}

	public void setOrderToOrderItem(int orderId, int orderItemId) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Order order=(Order)session.load(Order.class, orderId);
			OrderItem oi=(OrderItem)session.load(OrderItem.class, orderItemId);
			oi.setOrder(order);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setOrderToOrderItem"+e);
			tx.rollback();
		}
	}

}
