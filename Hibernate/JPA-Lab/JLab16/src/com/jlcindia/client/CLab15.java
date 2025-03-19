package com.jlcindia.client;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.factory.DAOFactory;
import com.jlcindia.to.CustomerTO;

public class CLab15 {

	public static void main(String[] args) {
		CustomerDAO customerDAO=DAOFactory.getCustomerDAO();
		
		//1.add Customer
		Customer cust=new Customer("ds","ds@jlc",9999,"Blore","Enabled");
		customerDAO.addCustomer(cust);
		
		//2.get Customer
		CustomerTO ct=customerDAO.getCustomerByCid(1);
		System.out.println(ct.getCid()+"\t"+ct.getCname()+"\t"+ct.getEmail()+"\t"+ct.getPhone()+"\t"+ct.getCity()+"\t"+ct.getStatus());
		
		//3.delete Customer
		customerDAO.deleteCustomer(2);
		
		//4.update Customer
		CustomerTO co=customerDAO.getCustomerByCid(1);
		co.setCname("Saurabh");
		co.setEmail("sa@jlc");
		co.setStatus("Enable");
		customerDAO.updateCustomer(co);
		System.out.println(co.getCid()+"\t"+co.getCname()+"\t"+co.getEmail()+"\t"+co.getPhone()+"\t"+co.getCity()+"\t"+co.getStatus());
		
	}

}
