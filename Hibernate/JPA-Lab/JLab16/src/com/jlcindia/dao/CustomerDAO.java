package com.jlcindia.dao;

import com.jlcindia.bean.Customer;
import com.jlcindia.to.CustomerTO;

public interface CustomerDAO {
	public void addCustomer(Customer cust);
	public void updateCustomer(CustomerTO cto);
	public void deleteCustomer(int cid);
	public CustomerTO getCustomerByCid(int cid);
}
