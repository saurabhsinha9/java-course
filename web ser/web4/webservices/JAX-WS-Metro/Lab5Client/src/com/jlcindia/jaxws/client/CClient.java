package com.jlcindia.jaxws.client;

import java.util.List;

public class CClient {

	
	public static void main(String[] args) {
		CourseManagerService cms=new CourseManagerService();
		CourseManagerDelegate cmd=cms.getCourseManagerPort();
		List<CourseTO> cs=cmd.getAllCourses();
		for(CourseTO cto:cs){
			System.out.println(cto.getCid()+"\t"+cto.getCname()+"\t"+cto.getFaculty()+"\t"+cto.getCost());
		}
	}

}
