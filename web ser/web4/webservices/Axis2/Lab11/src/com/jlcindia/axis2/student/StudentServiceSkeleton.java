package com.jlcindia.axis2.student;

import com.jlcindia.axis2.student.xsd.Student;

public class StudentServiceSkeleton{
	public void addStudent(AddStudent addStudent){
   	 System.out.println("in addStudent() of sss");
   	 Student stud=addStudent.getStu();
   	 System.out.println(stud.getSid()+"\t"+stud.getFname()+"\t"+stud.getLname()+"\t"+stud.getEmail());
    }
  
public GetStudentResponse getStudent(GetStudent getStudent){
System.out.println("in getStudent() of sss");
String sid=getStudent.getSid();
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
GetStudentResponse gsr=new GetStudentResponse();
gsr.set_return(stu);
return gsr;
}
}
       