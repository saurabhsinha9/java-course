package com.jlcindia.struts2;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
	
	static{
		System.out.println("HomeAction-SB");
	}
		
	boolean flag1=false;
	boolean flag2=true;
	List<String>courses;
	List<String>colors;
	
	public HomeAction() {
		System.out.println("HomeAction-DC");
		courses=new ArrayList<String>();
		courses.add("Java");
		courses.add("JSP");
		courses.add("EJB");
		courses.add("JDBC");
		courses.add("JSF");
		courses.add("Struts");
		courses.add("Hibernate");
		courses.add("XML");
		courses.add("FLEX");
		
		colors=new ArrayList<String>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("PINK");
		colors.add("YELLOW");
		colors.add("BLACK");
	}
	
	public String execute()throws Exception{
		System.out.println("HomeAction-execute()");
		return "success";
	}

	public boolean isFlag1() {
		System.out.println("isFlag1()");
		return flag1;
	}

	public void setFlag1(boolean flag1) {
		System.out.println("setFlag1()");
		this.flag1 = flag1;
	}

	public boolean isFlag2() {
		System.out.println("isFlag2()");
		return flag2;
	}

	public void setFlag2(boolean flag2) {
		System.out.println("setFlag2()");
		this.flag2 = flag2;
	}

	public List<String> getCourses() {
		System.out.println("getCourses()");
		return courses;
	}

	public void setCourses(List<String> courses) {
		System.out.println("setCourses()");
		this.courses = courses;
	}

	public List<String> getColors() {
		System.out.println("getColors()");
		return colors;
	}

	public void setColors(List<String> colors) {
		System.out.println("setColors()");
		this.colors = colors;
	}
	
	
	
}
