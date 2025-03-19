package com.consona.consonabank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.consona.consonabank.dao.AccountDAO;

@Transactional
public class AccountServiceImpl implements AccountService {
@Autowired
AccountDAO adao;
	@Transactional(propagation=Propagation.REQUIRED)
	public double getBal(int accno) {
			return adao.getBal(accno);
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void fundsTransfer(int saccno, int daccno, double amt) {
		adao.fundsTransfer(saccno, daccno, amt);

	}

}
