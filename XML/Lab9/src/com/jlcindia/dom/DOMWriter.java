package com.jlcindia.dom;

import java.util.ArrayList;

public class DOMWriter {

	public static void main(String[] args) {
		ArrayList<StudentTO> al=new ArrayList<StudentTO>();
		StudentTO sto=new StudentTO();
		sto.setSid("99");
		sto.setSname("Saurabh");
		sto.setEmail("sau@jlc");
		sto.setPhone("9999");
		sto.setDob("13-07-1989");
		sto.setQuali("B.Tech");
		al.add(sto);
		al.add(sto);
		al.add(sto);
		al.add(sto);
		al.add(sto);
		al.add(sto);
		XMLGenerator.createXML(al);
		XMLGenerator.printToFile("jlc.xml");
	}

}
