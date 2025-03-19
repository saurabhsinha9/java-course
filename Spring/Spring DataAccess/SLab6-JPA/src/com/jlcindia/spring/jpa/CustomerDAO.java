package com.jlcindia.spring.jpa;

import java.util.List;

public interface CustomerDAO {

	public List<CustomerTO> getAllCustomers();
	public List<CustomerTO> getCustomersByName(String cname);
	public List<CustomerTO> getCustomers(String cname,String city);
	public int addCustomer(CustomerTO cto);
	public int updateCustomer(CustomerTO cto);
	public int deleteCustomer(int cid);
	
}
