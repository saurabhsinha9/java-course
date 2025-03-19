package com.consona.consonabank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.consona.consonabank.dao.CustomerDAO;
import com.consona.consonabank.to.CustomerTO;

public class CustomerServiceImpl implements CustomerService {
@Autowired
CustomerDAO cdao;
@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public CustomerTO getCustomerByCid(int cid) {
			return cdao.getCustomerByCid(cid);
	}

@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateCustomer(CustomerTO cto) {
		cdao.updateCustomer(cto);

	}
@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public CustomerTO verifyCustomer(String un, String pw) {
			return cdao.verifyCustomer(un, pw);
	}

}
