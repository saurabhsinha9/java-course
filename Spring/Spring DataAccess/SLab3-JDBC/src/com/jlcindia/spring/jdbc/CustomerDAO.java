package com.jlcindia.spring.jdbc;

import java.util.List;

public interface CustomerDAO {
	public int addCustomer(CustomerTO cto);
	public int updateCustomer(CustomerTO cto);
	public int deleteCustomer(int cid);
	public CustomerTO getCustomerByCid(int cid);
	public List<CustomerTO> getAllCustomers();
	public List<CustomerTO> getCustomersByCity(String city);
	public List<CustomerTO> getCustomersByPhone(long phone);
	public int getCustomerCount();
	public String getCustomerCityById(int cid);
}
