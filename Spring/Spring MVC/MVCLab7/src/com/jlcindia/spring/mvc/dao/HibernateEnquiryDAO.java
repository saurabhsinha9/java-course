package com.jlcindia.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jlcindia.spring.mvc.model.Enquiry;

public class HibernateEnquiryDAO implements EnquiryDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void addEnquiry(Enquiry enq) {
		hibernateTemplate.save(enq);
	}

	public String getNextEnquiryID() {
		String enqId=null;
		String enqSubId=null;
		int x=hibernateTemplate.find("from Enquiry enq").size();
		if(x>0){
			Object eid=hibernateTemplate.find("select max(enq.enquiryID) from Enquiry enq").get(0);
			if(eid!=null){
				enqId=eid.toString();
				enqSubId=enqId.substring(2);
				int id=Integer.parseInt(enqSubId);
				enqId="E-"+(++id);
			}
		}else if(x==0){
			enqId="E-1001";
		}
		System.out.println(enqId);
		return enqId;
	}

}
