package com.jlcindia.jaxrs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;



public class RSClient {

	public static void main(String[] args) {
		ClientConfig config=new DefaultClientConfig();
		Client client=Client.create(config);
		WebResource webres=client.resource("http://localhost:2345/Lab15/services/jlccust/customers/cid/999");
		String str=webres.get(String.class);
		System.out.println(str);
		ClientResponse cresp=webres.accept("text/xml").get(ClientResponse.class);
		int status=cresp.getStatus();
		System.out.println(status);
		Customer cust=cresp.getEntity(Customer.class);
		System.out.println(cust);
		
		webres=client.resource("http://localhost:2345/Lab15/services/jlccust/custs/city/Blore");
		str=webres.get(String.class);
		System.out.println(str);
		cresp=webres.accept("text/xml").get(ClientResponse.class);
		status=cresp.getStatus();
		System.out.println(status);
		Customers cs=cresp.getEntity(Customers.class);
		for(Customer c:cs.getCustomer())
		System.out.println(c);
		
		webres=client.resource("http://localhost:2345/Lab15/services/jlccust/custs/add/");
		webres.post(cust);
		
		webres=client.resource("http://localhost:2345/Lab15/services/jlccust/custs/update/");
		webres.put(cust);
	}

}
