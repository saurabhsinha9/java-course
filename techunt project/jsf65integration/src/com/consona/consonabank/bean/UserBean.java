package com.consona.consonabank.bean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.consona.consonabank.services.AccountService;
import com.consona.consonabank.services.CustomerService;
import com.consona.consonabank.to.CustomerTO;

public class UserBean {
	@Autowired
	CustomerService custService;
	@Autowired
	AccountService accService;
	
	private String username;
	private String password;
	private String error;
	
	public String getUsername() {
		System.out.println("UserBean.getUsername()");
		return username;
	}
	public void setUsername(String username) {
		System.out.println("UserBean.setUsername()");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
public String verifyUser()
{
	error=null;
	System.out.println("verifyUser called from userBean");
	System.out.println("custService="+custService);
	CustomerTO cto=custService.verifyCustomer(username, password);
	System.out.println("cto:"+cto);
	if(cto==null)
	{
		error="Invalid username or password";
		return null;
	}
	else
	{
		int cid=cto.getCid();
		HttpSession session=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		if(session!=null)
		{
			session.setAttribute("CTO",cto);
			System.out.println(cid);
		}
		return "success";
	}
	
}
}
