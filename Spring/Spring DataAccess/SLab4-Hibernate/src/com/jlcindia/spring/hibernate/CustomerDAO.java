package com.jlcindia.spring.hibernate;

import java.util.List;

public interface CustomerDAO {

	public List<CustomerTO> getCustomersByCity(String city);
	public List<CustomerTO> getAllCustomers1();
	public List<CustomerTO> getCustomersByName1(String cname);
	public List<CustomerTO> getCustomers1(String cname,String city);
	public List<CustomerTO> getAllCustomers2();
	public List<CustomerTO> getCustomersByName2(String cname);
	public List<CustomerTO> getCustomers2(String cname,String city);
	public int getCustomerCount();
	public CustomerTO getCustomerByCid(int cid);
	public int addCustomer(CustomerTO cto);
	public int updateCustomer(CustomerTO cto);
	public int deleteCustomer(int cid);
	
}
