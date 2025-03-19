package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("simpleCustDAO");
		/*
		System.out.println("addCustomer");
		CustomerTO cto=new CustomerTO(108, "Ganesh", "gan@jlc.com", 4114, "Mysore");
		int x=cdao.addCustomer(cto);
		System.out.println(x);
		
		
		System.out.println("updateCustomer");
		CustomerTO cto1=new CustomerTO(103, "Amit Kr", "amit123@jlc.com", 5225, "Mysore");
		int y=cdao.updateCustomer(cto1);
		System.out.println(y);
		
		
		System.out.println("deleteCustomer");
		int z=cdao.deleteCustomer(105);
		System.out.println(z);
		*/
		
		System.out.println("CustomerByCid");
		CustomerTO cto2=cdao.getCustomerByCid(102);
		System.out.println(cto2);
		
		
		System.out.println("AllCustomers");
		List<CustomerTO> clist1=cdao.getAllCustomers();
		for(CustomerTO ctos:clist1){
			System.out.println(ctos);
		}
		
		
		System.out.println("CustomersByCity");
		List<CustomerTO> clist2=cdao.getCustomersByCity("Blore");
		for(CustomerTO ctos:clist2){
			System.out.println(ctos);
		}
		
		
		System.out.println("CustomersByPhone");
		List<CustomerTO> clist3=cdao.getCustomersByPhone(2222);
		for(CustomerTO ctos:clist3){
			System.out.println(ctos);
		}
		
		
		System.out.println("CustomerCount");
		int count=cdao.getCustomerCount();
		System.out.println(count);
		
		
		System.out.println("CustomerCityById");
		String city=cdao.getCustomerCityById(106);
		System.out.println(city);
	}

}
