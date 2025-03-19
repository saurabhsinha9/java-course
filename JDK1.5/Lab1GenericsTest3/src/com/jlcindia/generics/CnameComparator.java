package com.jlcindia.generics;

import java.util.Comparator;

public class CnameComparator implements Comparator<Customer> {
	public int compare(Customer c1,Customer c2){
		int x=c1.cname.compareTo(c2.cname);
		return x;
	}

}
