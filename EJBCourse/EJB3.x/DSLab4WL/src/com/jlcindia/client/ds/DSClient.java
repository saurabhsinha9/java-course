package com.jlcindia.client.ds;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.ds.DataSourceUtil;

public class DSClient {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try {
		con=DataSourceUtil.getConnection();
		st=con.createStatement();
		rs=st.executeQuery("select * from students");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		DataSourceUtil.cleanup(rs,st,con);
	}
}
}
