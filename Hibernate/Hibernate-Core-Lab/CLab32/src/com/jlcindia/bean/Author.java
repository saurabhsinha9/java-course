package com.jlcindia.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Author extends User{
	private int exp;
	private int age;
	private String company;
	private Set<String> emails;
	private List<String> phones;
	private Set<Book> books;
	public Author() {
	}
	public Author(Map<String, String> logins, String fullName, String email,
			int exp, int age, String company, Set<String> emails,
			List<String> phones, Set<Book> books) {
		super(logins, fullName, email);
		this.exp = exp;
		this.age = age;
		this.company = company;
		this.emails = emails;
		this.phones = phones;
		this.books = books;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
