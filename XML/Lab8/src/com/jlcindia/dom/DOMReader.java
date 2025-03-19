package com.jlcindia.dom;

import java.util.ArrayList;
import java.util.Iterator;

public class DOMReader {

	public static void main(String[] args) {
		ArrayList<StudentTO> al=StudentReader.getStudents("src/jlc.xml");
		System.out.println(al);
		Iterator<StudentTO> i=al.iterator();
		while(i.hasNext()){
			StudentTO sto=i.next();
			System.out.println(sto);
		}
	}

}
