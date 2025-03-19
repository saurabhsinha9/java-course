package com.jlcindia.spring.mvc.dao;

import com.jlcindia.spring.mvc.model.Enquiry;

public interface EnquiryDAO {
	public String getNextEnquiryID();
	public void addEnquiry(Enquiry enq);
}
