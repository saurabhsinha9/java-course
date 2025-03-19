package com.jlcindia.bookstore.ejb3.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;

import com.jlcindia.bookstore.dao.DAOFactory;
import com.jlcindia.bookstore.dao.OrderDAO;
import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;

@Stateful(mappedName="CartBean", name="CartBean")
public class CartBean implements CartRemote{

	@Resource
	SessionContext sc=null;
	List<OrderItemTO> cart=new ArrayList<OrderItemTO>();
	
	@PostConstruct
	@PostActivate
	public void init(){
    	//initialization
    	System.out.println("CartBean-init()");
    }
	@PreDestroy
	@PrePassivate
    public void cleanup(){
    	//cleanup
    	System.out.println("CartBean-cleanup()");
    }
	public void addItemToCart(OrderItemTO oito) {
		cart.add(oito);
	}
	public void removeItemToCart(OrderItemTO oito) {
		cart.remove(oito);
	}
	public List<OrderItemTO> showCart() {
		return cart;
	}
	public int placeOrder() {
		Date d=new Date();
		String odate=""+d.getDate()+"-"+d.getMonth()+"-"+d.getYear()+1900;
		String status="New";
		Iterator<OrderItemTO> it=cart.iterator();
		int tq=0;
		double tc=0;
		while(it.hasNext()){
			OrderItemTO oito=it.next();
			tc=tc+oito.getCost();
			tq=tq+oito.getQty();
		}
		OrderTO oto=new OrderTO();
		oto.setOrderDate(odate);
		oto.setTotalCost(tc);
		oto.setTotalQty(tq);
		oto.setStatus(status);
		OrderDAO odao=DAOFactory.getOrderDAO();
		int oid=odao.addOrder(oto,cart);
		return oid;
		
	}

}
