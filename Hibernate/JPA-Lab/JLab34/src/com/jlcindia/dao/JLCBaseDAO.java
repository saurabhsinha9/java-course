package com.jlcindia.dao;

import com.jlcindia.util.JPATemplate;

public class JLCBaseDAO {
	public JPATemplate getJPATemplate(){
		return new JPATemplate();
	}
}
