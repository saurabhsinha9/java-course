package com.jlcindia.dao.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bean.Address;
import com.jlcindia.bean.Customer;
import com.jlcindia.bean.Order;
import com.jlcindia.dao.OrderDAO;
import com.jlcindia.dao.hibernate.util.PropertyUtil;
import com.jlcindia.to.OrderTO;
import com.jlcindia.util.CHibernateTemplate;
import com.jlcindia.util.CHibernateUtil;

public class HibernateOrderDAO implements OrderDAO {

	public int addOrder(OrderTO oto) {
		Order order=PropertyUtil.getOrderFromOrderTO(oto);
		Integer it=(Integer)CHibernateTemplate.saveObject(order);
		return it.intValue();
	}

	public void updateOrder(OrderTO oto) {
		Order order=PropertyUtil.getOrderFromOrderTO(oto);
		CHibernateTemplate.updateObject(order);
	}

	public void deleteOrder(int orderId) {
		CHibernateTemplate.deleteObject(Order.class, orderId);
	}

	public OrderTO getOrderById(int orderId) {
		Order order=(Order)CHibernateTemplate.loadObject(Order.class, orderId);
		OrderTO oto=PropertyUtil.getOrderTOFromOrder(order);
		return oto;
	}

	public void setAddressToOrder(int aid, int oid) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Address add=(Address)session.load(Address.class, aid);
			Order order=(Order)session.load(Order.class, oid);
			order.setAddress(add);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setAddressToOrder"+e);
			tx.rollback();
		}
	}

	public void setOrderToCustomer(int cid, Set<Integer> oids) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Customer cust=(Customer)session.load(Customer.class, cid);
			Set<Order> orders=new HashSet<Order>();
			for (int oid : oids) {
				Order order=(Order)session.load(Order.class, oid);
				orders.add(order);
			}
			cust.setOrders(orders);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setOrderToCustomer"+e);
			tx.rollback();
		}
	}

	public void setCustomerToOrder(int cid, int oid) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Order order=(Order)session.load(Order.class, oid);
			Customer cust=(Customer)session.load(Customer.class, cid);
			order.setCustomer(cust);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setCustomerToOrder"+e);
			tx.rollback();
		}
	}

}
