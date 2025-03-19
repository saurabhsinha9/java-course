package com.jdbc.util;

import java.sql.*;

public class JdbcUtil {

	
	
	public JdbcUtil() {
		System.out.println("JdbcUtil-DC");
	}

	 
	
	public static Connection getMySqlConnection(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/sausoft","root","jlcindia");
		} catch (Exception e) {
			System.out.println("Exception in geting the MySqlConnection  "+e);
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static void resourceCleanup(Connection con,Statement st,ResultSet rs){
		try {
			if(con!=null){
			con.close();
			}
			if(st!=null){
				st.close();
			}
			if(rs!=null){
				rs.close();
			}
		} catch (Exception e) {
			System.out.println("Exception in cleaning the Resource  "+e);
			e.printStackTrace();
		}
	}
}
