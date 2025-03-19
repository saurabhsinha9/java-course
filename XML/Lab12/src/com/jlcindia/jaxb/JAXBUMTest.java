package com.jlcindia.jaxb;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;

public class JAXBUMTest {
	public static void main(String[] args) {
		try {
			//unmarshlling
			Students stus=Students.unmarshal(new FileReader("students.xml"));
			Enumeration e=stus.enumerateStudent();
			while(e.hasMoreElements()){
				System.out.println(e.nextElement());
			}
			Address add=new Address();
			add.setStreet("HMT");
			add.setCity("Blore");
			add.setZip("560054");
			add.setState("KA");
			add.setCountry("INDIA");
			Student stu1=new Student();
			stu1.setSid("99");
			stu1.setSname("Saurabh");
			stu1.setEmail("sau@jlc");
			stu1.setPhone("99999");
			stu1.setAddress(add);
		stus.setStudent(2,stu1);
			FileWriter out=new FileWriter("students.xml");
			stus.marshal(out);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
