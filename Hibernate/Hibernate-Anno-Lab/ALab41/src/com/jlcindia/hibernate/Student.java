package com.jlcindia.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@Embedded
	@AttributeOverrides({@AttributeOverride(name="bid",column=@Column(name="bid")),@AttributeOverride(name="sid",column=@Column(name="sid"))})
	private SID studentId;
	private String sname;
	private String email;
	private String phone;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(SID studentId, String sname, String email, String phone) {
		super();
		this.studentId = studentId;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public SID getStudentId() {
		return studentId;
	}
	public void setStudentId(SID studentId) {
		this.studentId = studentId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
