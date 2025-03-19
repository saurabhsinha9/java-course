package com.jlcindia.jaxb;

import java.io.FileWriter;

public class JAXBMTest {
	public static void main(String[] args) {
		try {
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
			
			Student stu2=new Student();
			stu2.setSid("11");
			stu2.setSname("Sau");
			stu2.setEmail("saur@jlc");
			stu2.setPhone("99999");
			stu2.setAddress(add);
			Students students=new Students();
			students.addStudent(stu1);
			students.addStudent(stu2);
			students.addStudent(stu1);
			students.addStudent(stu2);
			students.addStudent(stu1);
			FileWriter out=new FileWriter("students.xml");
			students.marshal(out);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
