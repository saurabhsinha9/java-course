package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SimpleJdbcCustomerDAO implements CustomerDAO{
	@Autowired
	SimpleJdbcTemplate simpleJdbcTemp;
	
	public int addCustomer(CustomerTO cto) {
		String sql="insert into customers values(?,?,?,?,?)";
		int x=simpleJdbcTemp.update(sql,cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		return x;
	}

	public int updateCustomer(CustomerTO cto) {
		String sql="update customers set cname=?,email=?,phone=?,city=? where cid=?";
		int x=simpleJdbcTemp.update(sql, cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getCid());
		return x;
	}

	public int deleteCustomer(int cid) {
		String sql="delete from customers where cid=?";
		int x=simpleJdbcTemp.update(sql,cid);
		return x;
	}

	public CustomerTO getCustomerByCid(int cid) {
		String sql="select * from customers where cid=?";
		CustomerTO cto=(CustomerTO) simpleJdbcTemp.queryForObject(sql, new CustomerRowMapper(),cid);
		return cto;
	}

	public List<CustomerTO> getAllCustomers() {
		String sql="select * from customers";
		List<CustomerTO> customersList=simpleJdbcTemp.query(sql,new CustomerRowMapper());
		return customersList;
	}

	public List<CustomerTO> getCustomersByCity(String city) {
		String sql="select * from customers where city=?";
		List<CustomerTO> customersList=simpleJdbcTemp.query(sql,new CustomerRowMapper(),city);
		return customersList;
	}

	public List<CustomerTO> getCustomersByPhone(long phone) {
		String sql="select * from customers where phone=?";
		List<CustomerTO> customersList=simpleJdbcTemp.query(sql,new CustomerRowMapper(),phone);
		return customersList;
	}

	public int getCustomerCount() {
		String sql="select count(*) from customers";
		int count=simpleJdbcTemp.queryForInt(sql);
		return count;
	}

	public String getCustomerCityById(int cid) {
		String sql="select city from customers where cid=?";
		String city=(String) simpleJdbcTemp.queryForObject(sql,String.class,cid);
		return city;
	}

}
