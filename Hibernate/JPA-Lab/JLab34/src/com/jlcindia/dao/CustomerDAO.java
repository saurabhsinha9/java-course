package com.jlcindia.dao;

import java.util.List;

import com.jlcindia.bean.Customer;


public interface CustomerDAO {
	public void addCustomer(Customer customer);
	public void deleteCustomer(int custId);
	public void updateCustomer(Customer customer);
	public void setAddressToCustomer(int addid,int custId);
	public void setCustomerToRequest(int reqId,int custId);
	public void setLoanAccountToCustomer(int accno,int custId);
	public void setSavingsAccountToCustomer(int accno,int custId);
	public void setCurrentAccountToCustomer(int accno,int custId);
	public Customer findCustomerByCid(int custId);
	public List<Customer> findAllCustomers();
}
