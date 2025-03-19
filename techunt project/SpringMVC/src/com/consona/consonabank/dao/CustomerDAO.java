package com.consona.consonabank.dao;

import com.consona.consonabank.to.CustomerTO;

public interface CustomerDAO {
	public CustomerTO getCustomerByCid(int cid);
	public void updateCustomer(CustomerTO cto);
	public CustomerTO verifyCustomer(String un,String pw);


}
