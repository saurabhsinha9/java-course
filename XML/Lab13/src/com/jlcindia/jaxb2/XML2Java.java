package com.jlcindia.jaxb2;

import java.io.FileInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XML2Java {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			// creating UnMArshaller Object
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) unmarshaller
					.unmarshal(new FileInputStream("cust99.xml"));
			System.out.println(customer);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
