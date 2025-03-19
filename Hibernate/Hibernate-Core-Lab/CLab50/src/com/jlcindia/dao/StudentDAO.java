package com.jlcindia.dao;

import java.util.List;

import com.jlcindia.hibernate.Student;
import com.jlcindia.hibernate.StudentTO;

public interface StudentDAO {
	public void saveStudent(Student student);
	public void updateStudent(Student student);
	public StudentTO findByStudentId(String studentId);
	public List findByBatchId(String batchId,int start,int total);
	public List findAllStudents(int start,int total);
	public int getNumberOfStudents();
	public int getNumberOfStudentsByBatch(String batchId);
	public List getBatchesList();
}
