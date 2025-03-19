package com.jlcindia.jaxb2;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXB2XML {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			// creating MArshaller Object
			Marshaller marshaller = jaxbContext.createMarshaller();
			Customer customer = new Customer();
			customer.setCid("101");
			customer.setCname("Saurabh");
			customer.setEmail("sau@jlc");
			customer.setPhone("999");
			marshaller.marshal(customer, new FileOutputStream("cust99.xml"));
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
