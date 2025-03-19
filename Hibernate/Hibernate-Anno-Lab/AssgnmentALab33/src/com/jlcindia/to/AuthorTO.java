package com.jlcindia.to;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AuthorTO extends UserTO{
	private int exp;
	private int age;
	private String company;
	private Set<String> emails;
	private List<String> phones;
	private Set<BookTO> books;

	public AuthorTO() {
	}

	public AuthorTO(Map<String, String> logins, String fullName,
			String email, int exp, int age, String company, Set<String> emails,
			List<String> phones) {
		super(logins, fullName, email);
		this.exp = exp;
		this.age = age;
		this.company = company;
		this.emails = emails;
		this.phones = phones;
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

	public Set<BookTO> getBooks() {
		return books;
	}

	public void setBooks(Set<BookTO> books) {
		this.books = books;
	}

	public String toString() {
		return "AuthorTO [exp=" + exp + ", age=" + age + ", company=" + company
				+ ", emails=" + emails + ", phones=" + phones + ", books="
				+ books + "]";
	}	
	
}
