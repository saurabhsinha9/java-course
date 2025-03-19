package com.jlcindia.dao;

import java.util.List;

import com.jlcindia.bean.Customer;

public interface CustomerDAO {
	public int addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int cid);
	public Customer getCustomerByCid(int cid);
	public Customer getCustomerByEmail(String email);
	public Customer getCustomerByCard(int ccno);
	public List<Customer> getAllCustomers();
	public List<Customer> getAllCustomers(int start,int total);
	public List<Customer> getCustomerByCity(String city);
	public List<Customer> getCustomerByCity(String city,int start,int total);
	public List<Customer> getCustomerByName(String name);
	public List<Customer> getCustomerByName(String name,int start,int total);
	public List<Customer> getCustomerByCardType(String cardType);
	public List<Customer> getCustomerByCardType(String cardType,int start,int total);
	public List<Customer> getCustomerByStatus(String status);
	public List<Customer> getCustomerByStatus(String status,int start,int total);
	public List<Customer> getCustomerByBal(double bal);
	public List<Customer> getCustomerByBal(double bal,int start,int total);
	public List<Customer> getCustomers(String city,String cardType);
	public List<Customer> getCustomers(String city,String cardType,int start,int total);
	public List<Customer> getCustomers(String city,String cardType,String status);
	public List<Customer> getCustomers(String city,String cardType,String status,int start,int total);
}
