package com.jlcindia.bookstore.ejb3.cart;

import java.util.List;

import javax.ejb.Remote;

import com.jlcindia.bookstore.to.OrderItemTO;

@Remote
public interface CartRemote{
public void addItemToCart(OrderItemTO oito);
public void removeItemToCart(OrderItemTO oito);
public List showCart();
public int placeOrder();
}
