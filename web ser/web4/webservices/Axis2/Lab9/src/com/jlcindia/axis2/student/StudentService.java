package com.jlcindia.axis2.student;

public class StudentService {
	public void addStudent(Student stu){
		System.out.println("In addStudent() of SS");
		System.out.println(stu);
	}
	public Student getStudent(String sid){
		System.out.println("In getStudent() of SS");
		System.out.println(sid);
		Student stu=null;
		if(sid.equals("JLC-99")){
			System.out.println("in if Block");
			stu=new Student();
			stu.setSid(sid);
			stu.setFname("Saurabh");
			stu.setLname("Sinha");
			stu.setEmail("saurabh@jlc");
		}
		return stu;
	}
}
