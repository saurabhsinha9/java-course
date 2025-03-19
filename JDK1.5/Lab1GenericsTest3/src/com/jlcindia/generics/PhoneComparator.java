package com.jlcindia.generics;

import java.util.Comparator;

 class phoneComparator implements Comparator<Customer> {
	public int compare(Customer c1,Customer c2){
		int x=(int)(c1.phone-c2.phone);
		return x;
	}




}
