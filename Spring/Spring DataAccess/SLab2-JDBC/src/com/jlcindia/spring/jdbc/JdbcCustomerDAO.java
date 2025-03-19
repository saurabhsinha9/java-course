package com.jlcindia.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO{
	
	@Autowired
	JdbcTemplate jdbcTemp;
	
	public int addCustomer(final CustomerTO cto) {
	
		PreparedStatementCreator psc=new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				String sql="insert into customers values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, cto.getCid());
				ps.setString(2, cto.getCname());
				ps.setString(3, cto.getEmail());
				ps.setLong(4, cto.getPhone());
				ps.setString(5, cto.getCity());
				return ps;
			}
		};
		int x=jdbcTemp.update(psc);
		return x;
	}

	public List<CustomerTO> getCustomersByCity(final String city) {
		String sql="select * from customers where city=?";
		PreparedStatementSetter pss=new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, city);
			}
		};
		List<CustomerTO> customersList=jdbcTemp.query(sql,pss,new CustomerRowMapper());
		return customersList;
	}

	public List<CustomerTO> getCustomersByPhone(final long phone) {
		String sql="select * from customers where phone=?";
		PreparedStatementSetter pss=new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setLong(1, phone);
			}
		};
		List<CustomerTO> customersList=jdbcTemp.query(sql,pss,new CustomerRowMapper());
		return customersList;
	}
}
