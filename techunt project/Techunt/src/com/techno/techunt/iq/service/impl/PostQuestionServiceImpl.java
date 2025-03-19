package com.techno.techunt.iq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techno.techunt.iq.dao.PostQuestionDAO;
import com.techno.techunt.iq.dao.TopicDAO;
import com.techno.techunt.iq.service.PostQuestichenService;

public class PostQuestionServiceImpl implements PostQuestichenService{
	@Autowired
	private PostQuestionDAO qsDAO;
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean savePostQuestichen() {
		 return qsDAO.postQuestion();
	}

}
