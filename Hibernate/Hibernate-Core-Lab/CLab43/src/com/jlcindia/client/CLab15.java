package com.jlcindia.client;

import java.util.List;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.factory.DAOFactory;

public class CLab15 {

	public static void main(String[] args) {
		CustomerDAO customerDAO=DAOFactory.getCustomerDAO();
		List<Customer> customers=null;
		Customer c=null;
		//Add Customer
		/*Customer sa=new Customer("Sau", "su1@jlc", "gaya", 50000, "VISA", 220456, "Active");
		Customer ga=new Customer("Gau", "gu1@jlc", "blore", 30000, "Master", 550321, "Active");
		Customer fa=new Customer("Far", "fr1@jlc", "blore", 20000, "Amex", 350324, "Deactive");
		Customer ra=new Customer("Rag", "rg1@jlc", "blore", 10000, "Master", 404321, "Active");
		customerDAO.addCustomer(sa);
		customerDAO.addCustomer(ga);
		customerDAO.addCustomer(fa);
		customerDAO.addCustomer(ra);
		*/
		
		/*System.out.println("All Customers");
		customers=customerDAO.getAllCustomers();
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("All Customers 0 4");
		customers=customerDAO.getAllCustomers(0,4);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by City");
		customers=customerDAO.getCustomerByCity("Blore");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by City 0 3");
		customers=customerDAO.getCustomerByCity("Blore",0,3);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by CardType");
		customers=customerDAO.getCustomerByCardType("VISA");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by CardType 0 10");
		customers=customerDAO.getCustomerByCardType("Master",0,10);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by Bal");
		customers=customerDAO.getCustomerByBal(50000);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by Bal 0 5");
		customers=customerDAO.getCustomerByBal(50000,0,5);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by Status");
		customers=customerDAO.getCustomerByStatus("Active");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by Status 0 3");
		customers=customerDAO.getCustomerByStatus("Active",0,3);
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by Name");
		customers=customerDAO.getCustomerByName("Saurabh");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by City,CardType");
		customers=customerDAO.getCustomers("Blore", "Amex");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by City,CardType,status");
		customers=customerDAO.getCustomers("Blore", "Master","Active");
		for(Customer c:customers){
			System.out.println(c);
		}*/
		
		/*System.out.println("Customers by email");
		c=customerDAO.getCustomerByEmail("sau@jlc");
		System.out.println(c);*/
		
		System.out.println("Customers by ccno");
		c=customerDAO.getCustomerByCard(654321);
		System.out.println(c);
	}

}
