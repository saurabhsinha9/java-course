package com.jlcindia.jaxws;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	public List<CourseTO> getAllCourses(){
		List<CourseTO> courses=new ArrayList<CourseTO>();
		CourseTO cto=new CourseTO();
		cto.setCid(101);
		cto.setCname("Spring");
		cto.setFaculty("Srinivas");
		cto.setCost(999.9);
		courses.add(cto);
		courses.add(cto);
		courses.add(cto);
		courses.add(cto);
		courses.add(cto);
		return courses;
	}

}
