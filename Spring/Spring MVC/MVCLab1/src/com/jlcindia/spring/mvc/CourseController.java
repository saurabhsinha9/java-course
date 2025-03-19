package com.jlcindia.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController{
	static{
		System.out.println("CourseController-SB");
	}
	public CourseController() {
		System.out.println("CourseController-DC");
	}
	@Autowired
	private CourseService courses;
	
	@RequestMapping(value="/course")
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("CourseController-handleRequestInternal()");
		ArrayList<String> al=courses.getCourses();
		ModelAndView mav=new ModelAndView("courses","AL",al);
		System.out.println(al);
		return mav;
	}

}
