package com.jlcindia.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {

	public static final String DriverClass="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost/sanjay";
	public static final String Username="root";
	public static final String Password="jlcindia";
	
	static{
		try {
			Class.forName(DriverClass);
		} catch (Exception e) {
			System.out.println("Error in Loading the class");
			System.out.println("Error in instantiating the class");
			e.printStackTrace();
		}
	}
	
	public static Connection getDataBaseConnection(){
		Connection con=null;
		try {
			con=DriverManager.getConnection(URL,Username,Password);
		} catch (Exception e) {
			System.out.println("Error in getting the Connection");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void cleanUp(Connection con,Statement st,ResultSet rs){
		try {
			if(con!=null)con.close();
			if(st!=null)st.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			System.out.println("Error in closing the connection");
			e.printStackTrace();
		}
	}
}
