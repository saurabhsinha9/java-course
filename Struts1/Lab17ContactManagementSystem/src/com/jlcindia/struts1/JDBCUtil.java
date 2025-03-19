package com.jlcindia.struts1;

import java.sql.*;

public class JDBCUtil {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cmsdb","root","jlcindia");
	}catch(Exception e){
		e.printStackTrace();
	}
	return con;
}
	
	public static void cleanup(Connection con,Statement st,ResultSet rs){
		try{
			if(rs!=null){rs.close();}
			if(st!=null){st.close();}
			if(con!=null){con.close();}
			}catch (Exception e){
				e.printStackTrace();
			}
	}
	
	
	public static void cleanup(Connection con,Statement st){
		
		try{
			if(st!=null){
				st.close();
				}
			if(con!=null){
				con.close();
				}
		}catch (Exception e){
			e.printStackTrace();
		}
		}
	}
