package com.consona.consonabank.util;

import com.consona.consonabank.hibernate.Customer;
import com.consona.consonabank.to.CustomerTO;

public class CustomerUtil {
	public static Customer getCustomerFromCustomerTO(CustomerTO cto)
	{
		Customer cu=new Customer();
		cu.setCid(cto.getCid());
		cu.setCity(cto.getCity());
		cu.setCname(cto.getCname());
		cu.setEmail(cto.getEmail());
		cu.setPassword(cto.getPassword());
		cu.setPhone(cto.getPhone());
		cu.setUsername(cto.getUsername());
		if(cto.getAccountTO()!=null)
		cu.setAccount(AccountUtil.getAccountFromAccountTO(cto.getAccountTO()));
		return cu;		
		
	}
	
	public static CustomerTO getCustomerTOFromCustomer(Customer cu)
	{
		CustomerTO cto=new CustomerTO();
		cto.setCid(cu.getCid());
		cto.setCity(cu.getCity());
		cto.setCname(cu.getCname());
		cto.setEmail(cu.getEmail());
		cto.setPassword(cu.getPassword());
		cto.setPhone(cu.getPhone());
		cto.setUsername(cu.getUsername());
		if(cu.getAccount()!=null)
			cto.setAccountTO(AccountUtil.getAccountTOFromAccount(cu.getAccount()));
			return cto;
		
	}
	
	

}
