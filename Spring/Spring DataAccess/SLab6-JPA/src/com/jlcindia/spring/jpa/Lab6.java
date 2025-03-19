package com.jlcindia.spring.jpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab6 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		/*
		
		CustomerTO cto1=new CustomerTO(500,"Raj","raj@jlc.com",8652,"blore");
		System.out.println(cdao.addCustomer(cto1));
		
		
		CustomerTO cto2=new CustomerTO(109,"SriRaj","sriraj@jlc.com",1252,"Pune");
		System.out.println(cdao.updateCustomer(cto2));
		
		System.out.println(cdao.deleteCustomer(110));
		
		*/
		
		System.out.println("AllCustomers");
		List<CustomerTO> clist1=cdao.getAllCustomers();
		for(CustomerTO ctos:clist1){
			System.out.println(ctos);
		}
		
		
		System.out.println("CustomersByName");
		List<CustomerTO> clist2=cdao.getCustomersByName("Saurabh");
		for(CustomerTO ctos:clist2){
			System.out.println(ctos);
		}
		
		System.out.println("CustomersByName and City");
		List<CustomerTO> clist3=cdao.getCustomers("Dablu", "Blore");
		for(CustomerTO ctos:clist3){
			System.out.println(ctos);
		}
	}

}
