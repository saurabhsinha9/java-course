package com.jlcindia.bookstore.ejb2.cart;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBObject;

import com.jlcindia.bookstore.to.OrderItemTO;

public interface CartRemote extends EJBObject{
public void addItemToCart(OrderItemTO oito)throws RemoteException;
public void removeItemToCart(OrderItemTO oito)throws RemoteException;
public List showCart()throws RemoteException;
public int placeOrder(String cid)throws RemoteException;
}
