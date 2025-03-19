package com.jlcindia.anno;

@Author(
		   name = "Benjamin Franklin",
		   date = "3/27/2003"
		)
@ClassPreamble(author = "Saurabh", date = "12-02-1969", reviewers = { "A,B,C,D" })
		
public class Lab1 {
	public static void main(String[] args) {
		Lab1 l=new Lab1();
		l.m1();
		l.m2();
		System.out.println();
	}
	@SuppressWarnings(value = "unchecked")
	void m1() { 
		System.out.println("m1");
	}
	

	@SuppressWarnings("unchecked")
	void m2() {
		System.out.println("m2");
		System.out.println(Author.class);
	}
	

	@Override
	public String toString() {
		return "hello";
	}
}
