package com.jlcindia.spring.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Lab4 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		/*
		System.out.println("addCustomer");
		CustomerTO cto=new CustomerTO(109, "Abhi", "abhi@jlc.com", 4321, "Delhi");
		int x=cdao.addCustomer(cto);
		System.out.println(x);
		
		System.out.println("updateCustomer");
		CustomerTO cto1=new CustomerTO(107, "Srinivas Dande", "sd@jlc.com", 1598, "Mysore");
		int y=cdao.updateCustomer(cto1);
		System.out.println(y);
		
		System.out.println("deleteCustomer");
		int z=cdao.deleteCustomer(106);
		System.out.println(z);
		*/
		
		System.out.println("HQL: AllCustomers");
		List<CustomerTO> clist1=cdao.getAllCustomers1();
		for(CustomerTO ctos:clist1){
			System.out.println(ctos);
		}
		
		
		System.out.println("HQL: CustomersByName");
		List<CustomerTO> clist2=cdao.getCustomersByName1("Saurabh");
		for(CustomerTO ctos:clist2){
			System.out.println(ctos);
		}
		
		System.out.println("HQL: CustomersByName and City");
		List<CustomerTO> clist3=cdao.getCustomers1("Dablu", "Blore");
		for(CustomerTO ctos:clist3){
			System.out.println(ctos);
		}
		
		
		System.out.println("DC: AllCustomers");
		List<CustomerTO> clist4=cdao.getAllCustomers2();
		for(CustomerTO ctos:clist4){
			System.out.println(ctos);
		}
		
		
		System.out.println("DC: CustomersByName");
		List<CustomerTO> clist5=cdao.getCustomersByName2("Saurabh");
		for(CustomerTO ctos:clist5){
			System.out.println(ctos);
		}
		
		System.out.println("DC: CustomersByName and City");
		List<CustomerTO> clist6=cdao.getCustomers2("Dablu", "Blore");
		for(CustomerTO ctos:clist6){
			System.out.println(ctos);
		}
		
		System.out.println("CustomerCount");
		int count=cdao.getCustomerCount();
		System.out.println(count);
	}
}

