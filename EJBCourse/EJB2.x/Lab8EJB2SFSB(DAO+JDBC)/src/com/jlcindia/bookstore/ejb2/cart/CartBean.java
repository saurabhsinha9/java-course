package com.jlcindia.bookstore.ejb2.cart;

import java.rmi.RemoteException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.jlcindia.bookstore.dao.DAOFactory;
import com.jlcindia.bookstore.dao.OrderDAO;
import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;

public class CartBean implements SessionBean{

	int x;
	SessionContext sc=null;
	String cid=null;
	List cart=new ArrayList();
	public void ejbActivate() throws EJBException, RemoteException {
		//initialization
		System.out.println("CartBean-ejbActivate() ");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		//cleanup
		System.out.println("CartBean- ejbPassivate()");
	}

	public void ejbRemove() throws EJBException, RemoteException {
		//cleanup
		System.out.println("CartBean-ejbRemove()");
	}

	public void setSessionContext(SessionContext ctx) throws EJBException,RemoteException {
		//initialization
		System.out.println("CartBean-setSessionContext()");
		this.sc=ctx;
	}
    public void ejbCreate(){
    	//initialization
    	System.out.println("CartBean-ejbCreate()");
    }
    public void ejbCreate(String cid){
    	//initialization
    	System.out.println("CartBean-ejbCreate(String cid)");
    	this.cid=cid;
    }
    
    public void addItemToCart(OrderItemTO oito){
    	cart.add(oito);
    }
    public void removeItemToCart(OrderItemTO oito){
    	cart.remove(oito);
    }
    public List showCart(){
		return cart;
    }
    public int placeOrder(String cid){
    	this.cid=cid;
    	Date d=new Date();
    	String odate=""+d.getDate()+"-"+d.getMonth()+"-"+d.getYear();
    	String status="New";
    	Iterator it=cart.iterator();
    	int tq=0;
    	double tc=0.0;
    	while(it.hasNext()){
    		OrderItemTO oito=(OrderItemTO)it.next();
    		tc=tc+oito.getCost();
    		tq=tq+oito.getQty();
    	}
    	OrderTO oto=new OrderTO();
    	oto.setOrderDate(odate);
    	oto.setCid(cid);
    	oto.setTotalCost(tc);
    	oto.setTotalQty(tq);
    	oto.setStatus(status);
    	OrderDAO odao=DAOFactory.getOrderDAO();
    	int oid=odao.addOrder(oto,cart);
    	return oid;
    }
}
