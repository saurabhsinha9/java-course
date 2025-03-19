package com.jlcindia.dao;

import com.jlcindia.bean.Request;

public interface RequestDAO {
	public void addRequest(Request request);
	public void deleteRequest(int reqId);
	public void updateRequest(Request request);
	public Request findRequestByReqId(int reqId);
}
