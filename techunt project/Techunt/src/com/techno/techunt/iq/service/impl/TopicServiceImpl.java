package com.techno.techunt.iq.service.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techno.techunt.iq.dao.BranchDAO;
import com.techno.techunt.iq.dao.TopicDAO;
import com.techno.techunt.iq.service.BranchService;
import com.techno.techunt.iq.service.TopicService;

public class TopicServiceImpl implements TopicService {
	@Autowired
	private TopicDAO topicDAO;
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addTopic(String topic) {
		
		return topicDAO.addTopic(topic);
	}


}
