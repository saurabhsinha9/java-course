package com.consona.consonabank.bean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;

import com.consona.consonabank.services.CustomerService;
import com.consona.consonabank.to.CustomerTO;

public class CustomerBean {
@Autowired
CustomerService custService;
private int cid;
private String cname;
private String email;
private long phone;
private String city;
private String username;
private String password;
private String error;
public CustomerService getCustService() {
	return custService;
}
public void setCustService(CustomerService custService) {
	this.custService = custService;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
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

public String showUpdateInfo()
{
	System.out.println("showUpdateInfo called");
	CustomerTO cto=new CustomerTO();
	cto.setCid(cid);
	cto.setCname(cname);
	cto.setEmail(email);
	cto.setCity(city);
	cto.setPhone(phone);
	cto.setUsername(username);
	cto.setPassword(password);
	if(custService!=null)
	{
	try
	{
		custService.updateCustomer(cto);
		HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		if(session!=null)
		{
			CustomerTO cto1=(CustomerTO) session.getAttribute("CTO");
			cto1.setEmail(email);
			cto1.setPhone(phone);
			cto1.setCity(city);
		}
		
	}catch(Exception e)
	{
	e.printStackTrace();
	return null;
	}
	}
		return "updateSuccess";
	
	
	
}
public String updateCustomerInfo()
{
	System.out.println("updateCustomerInfo called");
	initialize();
	return "update";
	
	
}
private void initialize() {

	HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	if(session!=null)
	{
		CustomerTO cto=(CustomerTO) session.getAttribute("CTO");
		if(cto!=null)
		{
			cid=cto.getCid();
			cname=cto.getCname();
			city=cto.getCity();
			phone=cto.getPhone();
			email=cto.getEmail();
			username=cto.getUsername();
			password=cto.getPassword();
		}
	}
	
	
}
}
