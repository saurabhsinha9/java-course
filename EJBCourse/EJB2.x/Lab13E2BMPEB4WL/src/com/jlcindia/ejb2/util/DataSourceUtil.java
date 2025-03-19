package com.jlcindia.ejb2.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataSourceUtil {

	public static DataSource getDataSource() {
		DataSource ds=null;
		try {
			Context ctx=new InitialContext();
			Object obj=ctx.lookup("MySQLDataSourceJNDI");
			ds=(DataSource)obj;
		}catch (Exception e) {
				e.printStackTrace();
			}
		return ds;
	}
	
	

	public static void cleanup(DataSource ds,Connection con, PreparedStatement ps) {
		try {
			if(ds!=null)ds=null;
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
