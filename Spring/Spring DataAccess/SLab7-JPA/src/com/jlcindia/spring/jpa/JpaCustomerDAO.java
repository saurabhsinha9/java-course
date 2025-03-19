package com.jlcindia.spring.jpa;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.support.JpaDaoSupport;

public class JpaCustomerDAO extends JpaDaoSupport implements CustomerDAO {

	public int addCustomer(CustomerTO cto) {
		final Customer c=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		JpaCallback jc=new JpaCallback(){

			public Object doInJpa(EntityManager em) throws PersistenceException {
				em.persist(c);
				return em;
			}
			
		};
		System.out.println(c);
		System.out.println(jc);
		getJpaTemplate().execute(jc);
		return cto.getCid();
	}

	
	

}
