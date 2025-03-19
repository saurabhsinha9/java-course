package com.techno.techunt.iq.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.techno.techunt.iq.dao.BranchDAO;
import com.techno.techunt.iq.hibernate.pc.Branch;

public class HibernateBranchDAO implements BranchDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public boolean addBranch(String branchname) {
		Branch branch=new Branch(branchname);
		Integer in=(Integer) hibernateTemplate.save(branch);
		if(in>0)
		{
			System.out.println("data has been saved successfully");
			return true;
			
		}
		return false;
			
	}

}
