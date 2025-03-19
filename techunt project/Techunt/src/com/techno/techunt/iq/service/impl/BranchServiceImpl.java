package com.techno.techunt.iq.service.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techno.techunt.iq.dao.BranchDAO;
import com.techno.techunt.iq.service.BranchService;

public class BranchServiceImpl implements BranchService {
	@Autowired
	private BranchDAO branchDAO;
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addBranch(String branch) {
		
		return branchDAO.addBranch(branch);
	}


}
