package com.jlcindia.spring.jdbc;

import java.util.List;

public interface CustomerDAO {
	public int addCustomer(CustomerTO cto);
	public List<CustomerTO> getCustomersByCity(String city);
	public List<CustomerTO> getCustomersByPhone(long phone);
}
