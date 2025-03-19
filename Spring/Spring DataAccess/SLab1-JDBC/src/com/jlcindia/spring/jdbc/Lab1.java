package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("custDAO");
		
		/*
		CustomerTO cto=new CustomerTO(106, "munit Ji", "mun123@jlc.com", 4224, "Mysore");
		int x=cdao.addCustomer(cto);
		System.out.println(x);
		*/
		
		/*
		CustomerTO cto1=new CustomerTO(106, "munit Ji", "mun123@jlc.com", 4224, "Mysore");
		int y=cdao.updateCustomer(cto1);
		System.out.println(y);
		*/
		
		/*
		int z=cdao.deleteCustomer(104);
		System.out.println(z);
		*/
		
		System.out.println("CustomerByCid");
		CustomerTO cto2=cdao.getCustomerByCid(102);
		System.out.println(cto2);
		
		
		System.out.println("AllCustomers");
		List<CustomerTO> clist1=cdao.getAllCustomers();
		for(CustomerTO cto:clist1){
			System.out.println(cto);
		}
		
		
		System.out.println("CustomersByCity");
		List<CustomerTO> clist2=cdao.getCustomersByCity("Blore");
		for(CustomerTO cto:clist2){
			System.out.println(cto);
		}
		
		
		System.out.println("CustomersByPhone");
		List<CustomerTO> clist3=cdao.getCustomersByPhone(5555);
		for(CustomerTO cto:clist3){
			System.out.println(cto);
		}
		
		
		System.out.println("CustomerCount");
		int count=cdao.getCustomerCount();
		System.out.println(count);
		
		
		System.out.println("CustomerCityById");
		String city=cdao.getCustomerCityById(105);
		System.out.println(city);
	}

}
