package com.jlcindia.sax;

import java.util.Iterator;
import java.util.List;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MySAXReader {

	public static void main(String[] args) {
		try {
			//creating xml reader factory
			XMLReader reader=XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
			//create Instance of handler class
			CustomerHandler ch=new CustomerHandler();
			//registering with the reader
			reader.setContentHandler(ch);
			//DTD handler
			reader.setDTDHandler(ch);
			//Error Handler
			reader.setErrorHandler(ch);
			
			reader.setFeature("http://xml.org/sax/features/validation", true);
			//parse the xml line by line
			reader.parse("src/customers.xml");
			
			List<Customer> list=ch.getAllCustomers();
			Iterator<Customer> it=list.iterator();
			while(it.hasNext()){
				Customer c=it.next();
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
