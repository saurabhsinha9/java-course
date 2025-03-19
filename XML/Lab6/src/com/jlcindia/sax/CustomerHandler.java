package com.jlcindia.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomerHandler extends DefaultHandler{
	Customer c=null;
	ArrayList<Customer> list=new ArrayList<Customer>();
	boolean customer=false;
	boolean cname=false;
	boolean email=false;
	boolean phone=false;
	
	public void startElement(String ns, String tn, String tln,Attributes attr) throws SAXException {
		if(tn.equals("customer")){
			customer=true;
			c=new Customer();
			c.setCid(attr.getValue(0));
			c.setCity(attr.getValue(1));			
		}else if (tn.equals("cname")) {
			cname=true;
		}else if (tn.equals("email")) {
			email=true;
		}else if (tn.equals("phone")) {
			phone=true;
		}
		
	}

	public void endElement(String ns, String tn, String tln)			throws SAXException {
		 if (tn.equals("cname")) {
				cname=false;
			}else if (tn.equals("email")) {
				email=false;
			}else if (tn.equals("phone")) {
				phone=false;
			}else if (tn.equals("customer")) {
				customer=false;
				list.add(c);
			}
	}

	public void characters(char[] ch, int start, int total)throws SAXException {
		String str=new String(ch, start, total);
		if(cname){
			c.setCname(str);
		}else if(email){
			c.setEmail(str);
		}else if(phone){
			c.setPhone(str);
		}
	}
	List<Customer> getAllCustomers(){
		return list;
	}
	
	public void error(SAXParseException e) throws SAXException {
		e.printStackTrace();
	}
}
