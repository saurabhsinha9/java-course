package com.jlcindia.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/jlccust/")
public class CustomerService {
	
	@GET
	@Path("/customers/cid/{id}/")
	public Customer getCustomerByCid(@PathParam("id")int id){
		System.out.println("invoking getCustomerByCid(),Customer id is:"+id);
		Customer cust=new Customer();
		cust.setCid(102);
		cust.setCname("Saurabh");
		cust.setEmail("sau@jlc");
		cust.setPhone(9999);
		cust.setCity("Blore");
		return cust;
	}
	@GET
	@Path("/customers/city/{city}/")
	public Customers getCustomerByCity(@PathParam("city") String city){
		System.out.println("invoking getCustomerByCity(),Customer city is:"+city);
		Customer cust=new Customer();
		cust.setCid(101);
		cust.setCname("Saurabh");
		cust.setEmail("sau@jlc");
		cust.setPhone(9999);
		cust.setCity("Blore");
		Customers cs=new Customers();
		cs.getCustomer().add(cust);
		cs.getCustomer().add(cust);
		cs.getCustomer().add(cust);
		cs.getCustomer().add(cust);
		cs.getCustomer().add(cust);
		cs.getCustomer().add(cust);
		for(Customer c1:cs.getCustomer())
			System.out.println(c1);
		return cs;
	}
	@PUT
	@Path("/customers/update/")
	public void updateCustomer(Customer customer){
		System.out.println("invoking updateCustomer()");
		System.out.println(customer);
	}
	
	@POST
	@Path("/customers/add/")
	public String addCustomer(Customer customer){
		System.out.println("invoking addCustomer()");
		System.out.println(customer);
		return "JLC-99";
	}
}
