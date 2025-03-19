package com.consona.consonabank.services;

import com.consona.consonabank.to.CustomerTO;

public interface CustomerService {
public CustomerTO getCustomerByCid(int cid);
public void updateCustomer(CustomerTO cto);
public CustomerTO verifyCustomer(String un,String pw);

}
