package com.jlcindia.dao;

import java.util.List;

import com.jlcindia.to.QueryTO;

public interface QueryDAO {
	public int postQuery(QueryTO qto);

	public void updateQuery(QueryTO qto);

	public List<QueryTO> getQueries(String catName, int start, int total);

	public int getTotalQueries(String catName);

	public List<String> getAllCategories();
}
