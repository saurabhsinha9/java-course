package org.jlcindia.axis;

public class StudentService {
public String addStudent(Student stu){
	System.out.println("StudentService-addStudent(Student stu)");
	System.out.println(stu);
	return "ok";
}

public Student getStudent(String sid){
	
	Student stu=null;
	if(sid.equals("JLC-99")){
		System.out.println("in if block");
		stu=new Student();
		stu.setSid("JLC-99");
		stu.setFname("Saurabh");
		stu.setLname("Sinha");
		stu.setEmail("saurabh@jlc");
	}
	return stu;
}
}
