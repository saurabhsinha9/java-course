package com.jlcindia.enums;

import com.jlcindia.enums.course.Hello;


interface i1{
	void m1();
}
interface i2{
	void m2();
}

enum course implements i1,i2{
	
	JAVA(101,99.9,"Sri"),JDBC(102,88.8,"Nivas"),JSP(103,99.9,"Dande"),
	EJB(104,999.9,"Saurabh"),SPRING;
	private int cid;
	double cost;
	String fname;
	static String company="JLC";
	course(){
		System.out.println("course-DC");
	}
	
	private course(int cid, double cost, String fname) {
		System.out.println("course-argsCons");
		this.cid = cid;
		this.cost = cost;
		this.fname = fname;
	}
	static{
		System.out.println("course-SB");
	}
	{
		System.out.println("course-IB");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		course.company = company;
	}
	
	public String toString(){
		return ""+cid+"\t"+cost+"\t"+fname+"\t"+company+"\t"+ordinal();
	}
	public enum Hello{
		A,B
	};

	public void m2() {
		System.out.println("m2()");
	}

	public void m1() {
		System.out.println("m1()");
	}
	
}

public class Lab1 {
	public static void main(String[] args) {
		//course c=new course();
		course c1=null;
		c1=course.EJB;
		System.out.println(c1);
		for(course cou:course.values()){
			System.out.println(cou);
		}
		//course c2=new course(111,222,"abc");
		c1=course.SPRING;
		c1.setCid(111);
		c1.setCost(222);
		c1.setFname("abc");
		System.out.println(c1);
		System.out.println(course.Hello.A+"\t"+course.Hello.A.ordinal());
		Hello h=course.Hello.B;
		System.out.println(h);
		System.out.println(h.ordinal());
	}
}
/*at the time of object creation
 * enum fields initialized with fields, 
 * 1.IB executed 
 * 2.and argumented constructor called for fields with parameter
 * DC called for fields with no parameter
 * 
 * */
 