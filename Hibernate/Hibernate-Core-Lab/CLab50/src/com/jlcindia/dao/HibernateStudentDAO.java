package com.jlcindia.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import com.jlcindia.hibernate.Student;
import com.jlcindia.hibernate.StudentTO;
import com.jlcindia.hibernate.util.CHibernateTemplate;
import com.jlcindia.hibernate.util.CHibernateUtil;

public class HibernateStudentDAO implements StudentDAO {

	public void saveStudent(Student student) {
		CHibernateTemplate.saveObject(student);
	}

	public void updateStudent(Student student) {
		CHibernateTemplate.updateObject(student);
	}

	public StudentTO findByStudentId(String studentId) {
		StudentTO sto=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Student st=(Student)session.load(Student.class, studentId);
			sto=new StudentTO();
			sto.setStudentId(st.getStudentId());
			sto.setBatchId(st.getBatchId());
			sto.setFirstName(st.getFirstName());
			sto.setLastName(st.getLastName());
			sto.setEmail(st.getEmail());
			sto.setPhone(st.getPhone());
			sto.setGender(st.getGender());
			sto.setQualification(st.getQualification());
			sto.setTotalFee(st.getTotalFee());
			sto.setFeeBal(st.getFeeBal());
			sto.setFeePaid(st.getFeePaid());
			sto.setStatus(st.getStatus());	
			tx.commit();
			session.close();
		}catch (Exception e) {e.printStackTrace();
		}
		return sto;
	}

	public List findByBatchId(String batchId, int start, int total) {
		List stos=new ArrayList();
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Student.class).add(Expression.eq("batchId", batchId));
			ct.setFirstResult(start);
			ct.setMaxResults(total);
			List students=ct.list();
			Iterator it=students.iterator();
			while(it.hasNext()){
				Student st=(Student)it.next();
				StudentTO sto=new StudentTO();
				sto.setStudentId(st.getStudentId());
				sto.setBatchId(st.getBatchId());
				sto.setFirstName(st.getFirstName());
				sto.setLastName(st.getLastName());
				sto.setEmail(st.getEmail());
				sto.setPhone(st.getPhone());
				sto.setGender(st.getGender());
				sto.setQualification(st.getQualification());
				sto.setTotalFee(st.getTotalFee());
				sto.setFeeBal(st.getFeeBal());
				sto.setFeePaid(st.getFeePaid());
				sto.setStatus(st.getStatus());
				stos.add(sto);
			}
			System.out.println(stos);
			System.out.println(stos.size());
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in findByBatchId"+e);
			tx.rollback();
		}
		return stos;
	}

	public List findAllStudents(int start, int total) {
		List students=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Student.class);
			ct.setFirstResult(start);
			ct.setMaxResults(total);
			students=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in findAllStudents"+e);
			tx.rollback();
		}
		return students;
	}

	public int getNumberOfStudents() {
		int nos=0;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			nos=session.createCriteria(Student.class).list().size();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getNumberOfStudents"+e);
			tx.rollback();
		}
		return nos;
	}

	public int getNumberOfStudentsByBatch(String batchId) {
		int nos=0;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Student.class);
			ct.add(Expression.eq("batchId", batchId));
			nos=ct.list().size();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getNumberOfStudentsByBatch"+e);
			tx.rollback();
		}
		return nos;
	}

	public List getBatchesList() {
		List batches=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			batches=session.createQuery("from Student st").list();
			Set set=new HashSet();
			Iterator it=batches.iterator();
			while(it.hasNext()){
				Student st=(Student) it.next();
				set.add(st.getBatchId());
			}
			batches=new ArrayList(set);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getBatchesList"+e);
			tx.rollback();
		}
		return batches;
	}

}
