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
			p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:8001");
			
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("MySQLDataSourceJNDI");
			DataSource ds=(DataSource)obj;
			con=ds.getConnection();
		}catch (Exception e) {
				e.printStackTrace();
			}
		return con;
	}

	public static void cleanup(ResultSet rs,Statement st,Connection con) {
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
