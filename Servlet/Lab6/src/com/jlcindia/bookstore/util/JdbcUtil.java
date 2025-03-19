package com.jlcindia.bookstore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {

	public static Connection getOracleConnection(){
	Connection con=null;
	try{
	//1.load the driver class 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.establish the connection
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jlcindia");
	}catch(Exception e){
	e.printStackTrace();
	}
	return con;
	}
	public static Connection getMysqlConnection(){
	Connection con=null;
	try{
	//1.load the driver class 
	Class.forName("com.mysql.jdbc.Driver");
	//2.establish the connection
	con=DriverManager.getConnection("jdbc:mysql://localhost/sausoft","root","jlcindia");
	}catch(Exception e){
	e.printStackTrace();
	}
	return con;
	}
	public static void cleanUp(Connection con,Statement st){
	try{
	//7.release the resources
	if(st!=null)
	st.close();
	if(con!=null)
	con.close();
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	public static void cleanUp(Connection con,Statement st,ResultSet rs){
	try{
	//7.release the resources
	if(st!=null)
	st.close();
	if(con!=null)
	con.close();
	if(rs!=null)
	rs.close();
	}catch(Exception e){
	e.printStackTrace();
	}
	}
}
