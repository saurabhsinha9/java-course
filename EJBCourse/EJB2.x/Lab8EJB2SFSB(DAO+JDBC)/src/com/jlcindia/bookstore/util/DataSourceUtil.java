package com.jlcindia.bookstore.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataSourceUtil {

	public static Connection getConnection(){
		Connection con=null;
		try {
			Context ctx=new InitialContext();
			Object obj=ctx.lookup("MySQLDataSourceJNDI");
			DataSource ds=(DataSource) obj;
			con=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void cleanup(Connection con,Statement st,ResultSet rs){
		try {
			if(con!=null)con.close();
			if(st!=null)st.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
