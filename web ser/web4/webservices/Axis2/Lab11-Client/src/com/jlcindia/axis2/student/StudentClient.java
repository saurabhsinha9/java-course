package com.jlcindia.axis2.student;

import com.jlcindia.axis2.student.StudentServiceStub.AddStudent;
import com.jlcindia.axis2.student.StudentServiceStub.GetStudent;
import com.jlcindia.axis2.student.StudentServiceStub.GetStudentResponse;
import com.jlcindia.axis2.student.StudentServiceStub.Student;

public class StudentClient {

	public static void main(String[] args) {
		try {
			StudentServiceStub ssb=new StudentServiceStub();
			Student stu=new Student();
			stu.setSid("JLC-11");
			stu.setFname("Saurabh Kumar");
			stu.setLname("Sinha");
			stu.setEmail("sa@jlc.com");
			AddStudent as=new AddStudent();
			as.setStu(stu);
			ssb.addStudent(as);
			
			GetStudent gs=new GetStudent();
			gs.setSid("JLC-99");
			GetStudentResponse gsr=ssb.getStudent(gs);
			Student stud=gsr.get_return();
			System.out.println(stud);
			if(stud!=null){
				System.out.println(stud.getSid()+"\t"+stud.getFname()+"\t"+stud.getLname()+"\t"+stud.getEmail());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
