package com.jlcindia.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class CustomerRowMapper implements ParameterizedRowMapper<CustomerTO>{

	public CustomerTO mapRow(ResultSet rs, int rn) throws SQLException {
		CustomerTO cto=new CustomerTO(rs.getInt("cid"), rs.getString("cname"), rs.getString("email"), rs.getLong("phone"), rs.getString("city"));
		return cto;
	}

}
