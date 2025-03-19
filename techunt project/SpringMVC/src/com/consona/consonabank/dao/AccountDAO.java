package com.consona.consonabank.dao;

public interface AccountDAO {
	public double getBal(int accno);
	public void fundsTransfer(int saccno,int daccno,double amt);


}
