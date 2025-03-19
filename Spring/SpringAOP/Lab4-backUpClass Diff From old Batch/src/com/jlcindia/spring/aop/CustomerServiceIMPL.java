package com.jlcindia.spring.aop;

public class CustomerServiceIMPL implements CustomerService {
	static{
		System.out.println("CustomerServiceIMPL-S.B");
	}
	public  CustomerServiceIMPL(){
		System.out.println("CustomerServiceIMPL-D.C");
	}

	public void addCustomer()  {
		System.out.println("CustomerServiceIMPL-addCustomer-begin()");
		System.out.println("CustomerServiceIMPL-addCustomer-done()");
		System.out.println("CustomerServiceIMPL-addCustomer-end()");
	}
	public void updateCustomer() {
		System.out.println("CustomerServiceIMPL-updateCustomer-begin()");
		System.out.println("CustomerServiceIMPL-updateCustomer-done()");
		System.out.println("CustomerServiceIMPL-updateCustomer-end()");
	}
}
