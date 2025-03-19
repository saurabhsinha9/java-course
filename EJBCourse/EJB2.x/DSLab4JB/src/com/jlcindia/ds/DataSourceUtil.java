package com.jlcindia.ds;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataSourceUtil {

	public static Connection getConnection() {
		Connection con=null;
		try {
			Properties p=new Properties();
			
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("MySQLDataSourceJNDI");
			DataSource ds=(DataSource)obj;
			con=ds.getConnection();
		}catch (Exception e) {
				e.printStackTrace();
			}
		return con;
	}

	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			if(con!=null)con.close();
			if(rs!=null)rs.close();
			if(st!=null)st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
