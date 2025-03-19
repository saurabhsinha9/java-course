package com.consona.consonabank.util;

import com.consona.consonabank.hibernate.Account;
import com.consona.consonabank.to.AccountTO;

public class AccountUtil {
	public static Account getAccountFromAccountTO(AccountTO acto)
	{
     Account ac=new Account();
	ac.setAccno(acto.getAccno());
	 ac.setAtype(acto.getAtype());
	 ac.setBal(acto.getBal());
	return ac;

}
	
	public static AccountTO getAccountTOFromAccount(Account ac)
	{
		AccountTO acto=new AccountTO();
		acto.setAccno(ac.getAccno());
		acto.setAtype(ac.getAtype());
		acto.setBal(ac.getBal());
			
		return acto;
	}
	
	
}