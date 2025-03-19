package com.jlcindia.spring.jdbc;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{
	@Autowired
	JdbcTemplate jdbcTemp;
	
	public int addCustomer(CustomerTO cto) {
		String sql="insert into customers values(?,?,?,?,?)";
		Object []args={cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		int argTypes[]={Types.INTEGER,Types.CHAR,Types.CHAR,Types.BIGINT,Types.CHAR};
		int x=jdbcTemp.update(sql, args, argTypes);
		return x;
	}

	public int updateCustomer(CustomerTO cto) {
		String sql="update customers set cname=?,email=?,phone=?,city=? where cid=?";
		Object []args={cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getCid()};
		int argTypes[]={Types.CHAR,Types.CHAR,Types.BIGINT,Types.CHAR,Types.INTEGER};
		int x=jdbcTemp.update(sql, args, argTypes);
		return x;
	}

	public int deleteCustomer(int cid) {
		String sql="delete from customers where cid=?";
		Object []args={cid};
		int argTypes[]={Types.INTEGER};
		int x=jdbcTemp.update(sql, args, argTypes);
		return x;
	}

	public CustomerTO getCustomerByCid(int cid) {
		String sql="select * from customers where cid=?";
		Object []args={cid};
		int argTypes[]={Types.INTEGER};
		CustomerTO cto=(CustomerTO) jdbcTemp.queryForObject(sql, args, argTypes, new CustomerRowMapper());
		return cto;
	}

	public List<CustomerTO> getAllCustomers() {
		String sql="select * from customers";
		List<CustomerTO> customersList=jdbcTemp.query(sql, new CustomerRowMapper());
		return customersList;
	}

	public List<CustomerTO> getCustomersByCity(String city) {
		String sql="select * from customers where city=?";
		Object []args={city};
		int argTypes[]={Types.CHAR};
		List<CustomerTO> customersList=jdbcTemp.query(sql,args,argTypes,new CustomerRowMapper());
		return customersList;
	}

	public List<CustomerTO> getCustomersByPhone(long phone) {
		String sql="select * from customers where phone=?";
		Object []args={phone};
		int argTypes[]={Types.BIGINT};
		List<CustomerTO> customersList=jdbcTemp.query(sql,args,argTypes,new CustomerRowMapper());
		return customersList;
	}

	public int getCustomerCount() {
		String sql="select count(*) from customers";
		int count=jdbcTemp.queryForInt(sql);
		return count;
	}

	public String getCustomerCityById(int cid) {
		String sql="select city from customers where cid=?";
		Object []args={cid};
		int argTypes[]={Types.INTEGER};
		String city=(String) jdbcTemp.queryForObject(sql, args, argTypes,String.class);
		return city;
	}

}
