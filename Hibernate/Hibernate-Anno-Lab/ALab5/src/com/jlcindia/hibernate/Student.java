package com.jlcindia.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="dob")
	private String dob;
	@Column(name="qualification")
	private String qualification;
	/*
	 * JPA does Not have annotation to support collection type data bcoz it Some Persistence 
	 * provider doesnot support collection type data and during the development of JPA
	 * sun people only gives the Annotation which is common type to all the PP.
	 * JPA is a Java Persistence API standard  
	 * 
	 * so we0 are using here hibernate annotation which supports collection data types
	 */
	@CollectionOfElements
	@JoinTable(name="courses",joinColumns=@JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	@Column(name="course")
	private String courses[];
	@CollectionOfElements
	@JoinTable(name="emails",joinColumns=@JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	@Column(name="emailId")
	private List<String> emails;
	@CollectionOfElements
	@JoinTable(name="marks",joinColumns=@JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	@Column(name="course")
	private List<Integer> marks;
	@CollectionOfElements
	@JoinTable(name="phones",joinColumns=@JoinColumn(name="sid"))
	@Column(name="phoneNo")
	private Set<Long> phones;
	@CollectionOfElements
	@JoinTable(name="refs",joinColumns=@JoinColumn(name="sid"))
	@Column(name="rphone")
	private Map<String,Long> refs;
	
	public Student() {
		System.out.println("Student-DC");
	}
	
	public Student(String sname, String dob, String qualification,
			String[] courses, List<String> emails, List<Integer> marks,
			Set<Long> phones, Map<String, Long> refs) {
		System.out.println("Student-ArgsCons..");	
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}
}
