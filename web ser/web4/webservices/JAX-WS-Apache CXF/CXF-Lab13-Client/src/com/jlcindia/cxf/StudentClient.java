package com.jlcindia.cxf;

public class StudentClient {

	public static void main(String[] args) {
		try {
			StudentServiceService sss=new StudentServiceService();
			StudentService ss=sss.getStudentServicePort();
			Student stu=new Student();
			stu.setSid("JLC-99");
			stu.setFname("Saurabh");
			stu.setLname("Sinha");
			stu.setEmail("Sau@jlc");
			ss.addStudent(stu);
			Student st=ss.getStudent("JLC-99");
			if(st!=null){
				System.out.println(st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
