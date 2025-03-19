package com.jlcindia.jaxrs;

import org.apache.cxf.jaxrs.client.WebClient;

public class RSClient {

	public static void main(String[] args) {
		WebClient client1=WebClient.create("http://localhost:1111/jlc/");
		client1.path("jlccust/customers/cid/999");
		Customer c=client1.get(Customer.class);
		System.out.println(c);
		
		WebClient client2=WebClient.create("http://localhost:1111/jlc/");
		client2.path("jlccust/customers/add/",c);
		client2.post(c);
		
		WebClient client3=WebClient.create("http://localhost:1111/jlc/");
		client3.path("jlccust/customers/update/",c);
		client3.put(c);
		
		WebClient client4=WebClient.create("http://localhost:1111/jlc/");
		client4.path("jlccust/customers/city/Bangalore");
		Customers cs=client4.get(Customers.class);
		for(Customer c1:cs.getCustomer())
		System.out.println(c1);
	}

}
