package com.consona.consonabank.bean;

import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.consona.consonabank.exceptions.AccountNotFoundException;
import com.consona.consonabank.exceptions.InSufficientFundsException;
import com.consona.consonabank.services.AccountService;
import com.consona.consonabank.to.CustomerTO;

public class AccountBean {
	@Autowired
	AccountService accService;
	
	private int saccno;
	private int daccno;
	private double amount;
	private String error;
	
	public AccountService getAccService() {
		return accService;
	}
	public void setAccService(AccountService accService) {
		this.accService = accService;
	}
	public int getSaccno() {
		return saccno;
	}
	public void setSaccno(int saccno) {
		this.saccno = saccno;
	}
	public int getDaccno() {
		return daccno;
	}
	public void setDaccno(int daccno) {
		this.daccno = daccno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public String showBalance() throws ServletException
	{
		CustomerTO cto=null;
		HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		if(session!=null)
		{
			cto=(CustomerTO) session.getAttribute("CTO");
		}
		else
		{
			return null;
		}
		double bal=accService.getBal(cto.getAccountTO().getAccno());
		if(session!=null)
		
			session.setAttribute("BAL",bal);
			return "balance";
		
		
	}
	public String showFTForm()
	{
		CustomerTO cto=null;
		System.out.println("AccountBean.showFTForm() called");
		HttpSession session=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		try
		{
			if(session!=null)
			{
				cto=(CustomerTO) session.getAttribute("CTO");
				if(cto!=null)
					saccno=cto.getAccountTO().getAccno();
					
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("showFTForm compleated successfully");
		return "fundsTransfer";
		
	}
	
	
	public String transferFunds()
	{
		error="";
		System.out.println("transferFunds called");
		if(accService!=null)
			if(saccno==daccno)
			{
				error="Can't transfer to same account";
				return null;
			}
			else
			{
				try
				{
					accService.fundsTransfer(saccno, daccno, amount);
				}catch(InSufficientFundsException e)
				{
					error="InSufficient Fund";
					return null;
				}catch(AccountNotFoundException e)
				{
					error="Destination account not found";
					return null;
				}
			}
		return "fundsTransferSuccess";
		
		
	}
		
	
}
