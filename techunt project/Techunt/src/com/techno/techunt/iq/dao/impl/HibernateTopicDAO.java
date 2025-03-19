package com.techno.techunt.iq.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.techno.techunt.iq.dao.BranchDAO;
import com.techno.techunt.iq.dao.TopicDAO;
import com.techno.techunt.iq.hibernate.pc.Branch;
import com.techno.techunt.iq.hibernate.pc.Topic;

public class HibernateTopicDAO implements TopicDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public boolean addTopic(String topicname) {
		Topic topic=new Topic(topicname);
		Integer in=(Integer) hibernateTemplate.save(topic);
		if(in>0)
		{
			System.out.println("data has been saved successfully");
			return true;
			
		}
		return false;
			
	}

}
