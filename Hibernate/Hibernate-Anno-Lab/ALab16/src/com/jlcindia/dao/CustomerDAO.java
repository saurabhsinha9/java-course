package com.jlcindia.dao;

import com.jlcindia.to.CustomerTO;

public interface CustomerDAO {
	public int addCustomer(CustomerTO cto);
	public void updateCustomer(CustomerTO cto);
	public void deleteCustomer(int cid);
	public CustomerTO getCustomerByCid(int cid);
}
