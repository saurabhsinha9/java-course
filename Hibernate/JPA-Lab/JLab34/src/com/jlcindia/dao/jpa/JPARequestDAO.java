package com.jlcindia.dao.jpa;

import com.jlcindia.bean.Request;
import com.jlcindia.dao.JLCBaseDAO;
import com.jlcindia.dao.RequestDAO;

public class JPARequestDAO extends JLCBaseDAO implements RequestDAO {

	public void addRequest(Request request) {
		getJPATemplate().persist(request);
	}

	public void deleteRequest(int reqId) {
		Request request=(Request)getJPATemplate().find(Request.class, new Integer(reqId));
		getJPATemplate().remove(request);
	}

	public Request findRequestByReqId(int reqId) {
		Request request=(Request)getJPATemplate().find(Request.class, new Integer(reqId));
		return request;
	}

	public void updateRequest(Request request) {
		getJPATemplate().merge(request);
	}

}
