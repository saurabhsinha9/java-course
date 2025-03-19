package com.jlcindia.dao.jpa;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jlcindia.bean.Account;
import com.jlcindia.bean.Address;
import com.jlcindia.bean.CurrentAccount;
import com.jlcindia.bean.Customer;
import com.jlcindia.bean.LoanAccount;
import com.jlcindia.bean.Request;
import com.jlcindia.bean.SavingsAccount;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.dao.JLCBaseDAO;
import com.jlcindia.util.JPAUtil;

public class JPACustomerDAO extends JLCBaseDAO implements CustomerDAO {

	public void addCustomer(Customer customer) {
		getJPATemplate().persist(customer);
	}

	public void deleteCustomer(int custId) {
		Customer cust=(Customer)getJPATemplate().find(Customer.class, new Integer(custId));
		getJPATemplate().remove(cust);
	}

	public List<Customer> findAllCustomers() {
		EntityTransaction tx=null;
		List<Customer> list=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			String HQL="from Customer cust";
			Query q=manager.createQuery(HQL);
			list=q.getResultList();
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in findAllCustomers"+e);
			tx.rollback();
		}
		return list;
	}

	public Customer findCustomerByCid(int custId) {
		Customer cust=(Customer)getJPATemplate().find(Customer.class, new Integer(custId));
		return cust;
	}

	public void updateCustomer(Customer customer) {
		getJPATemplate().merge(customer);
	}
	
	public void setAddressToCustomer(int addid, int custId) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			Customer cust=(Customer) manager.find(Customer.class, new Integer(custId));
			Address add=(Address)manager.find(Address.class, new Integer(addid));
			cust.setAddress(add);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in setAddressToCustomer"+e);
			tx.rollback();
		}
	}

	public void setCustomerToRequest(int reqId, int custId) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			Customer cust=(Customer) manager.find(Customer.class, new Integer(custId));
			Request req=(Request)manager.find(Request.class, new Integer(reqId));
			req.setCustomer(cust);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in setAddressToCustomer"+e);
			tx.rollback();
		}
	}

	public void setLoanAccountToCustomer(int accno, int custId) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			LoanAccount la=(LoanAccount)manager.find(LoanAccount.class, new Integer(accno));
			Customer cust=(Customer) manager.find(Customer.class, new Integer(custId));
			Set<Account> accs=cust.getAccounts();
			accs.add(la);
			cust.setAccounts(accs);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in setLoanAccountToCustomer"+e);
			tx.rollback();
		}
	}

	public void setSavingsAccountToCustomer(int accno, int custId) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			SavingsAccount sa=(SavingsAccount)manager.find(SavingsAccount.class, new Integer(accno));
			Customer cust=(Customer) manager.find(Customer.class, new Integer(custId));
			Set<Account> accs=cust.getAccounts();
			accs.add(sa);
			cust.setAccounts(accs);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in setLoanAccountToCustomer"+e);
			tx.rollback();
		}
	}

	public void setCurrentAccountToCustomer(int accno, int custId) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			CurrentAccount ca=(CurrentAccount)manager.find(CurrentAccount.class, new Integer(accno));
			Customer cust=(Customer) manager.find(Customer.class, new Integer(custId));
			Set<Account> accs=cust.getAccounts();
			accs.add(ca);
			cust.setAccounts(accs);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in setLoanAccountToCustomer"+e);
			tx.rollback();
		}
	}
}
