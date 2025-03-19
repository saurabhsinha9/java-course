package com.consona.consonabank.services;

public interface AccountService {
	public double getBal(int accno);
	public void fundsTransfer(int saccno,int daccno,double amt);

}
