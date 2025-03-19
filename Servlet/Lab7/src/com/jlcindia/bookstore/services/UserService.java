package com.jlcindia.bookstore.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.bookstore.util.JdbcUtil;

public class UserService {

	public static boolean verifyUser(String username,String password){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		 boolean isverified=false;
		try{
			con=JdbcUtil.getMysqlConnection();
			pst=con.prepareStatement("select * from registered_users where username=? and password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			rs=pst.executeQuery();
			if(rs.next()){
				isverified=true;
			}
		}catch (Exception e) {
			isverified=false;
			e.printStackTrace();
		}finally{
			JdbcUtil.cleanUp(con, pst, rs);
		}
		return isverified;
	}
	
	public static boolean registerUser(String firstname,String lastname,String email,String phone,String gender,String cardtype,String cardnumber,String color[],String username,String password){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		boolean isregistered=false;
		String col = "  ";
		for (int i = 0; i < color.length; i++) {
			col =col+color[i]+"  ";
			
		}
		
		try{
			con=JdbcUtil.getMysqlConnection();
			pst=con.prepareStatement("insert into registered_users(fname,lname,email,phone,gender,cardtype,cardnumber,color,username,password)values(?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setString(3, email);
			pst.setString(4, phone);
			pst.setString(5, gender);
			pst.setString(6, cardtype);
			pst.setString(7, cardnumber);
			pst.setString(8, col);
			pst.setString(9, username);
			pst.setString(10, password);
			int x=pst.executeUpdate();
			
			if(x!=0){
				isregistered=true;
			}
		}
		catch (Exception e) {
			isregistered=false;
			e.printStackTrace();
		}finally{
			JdbcUtil.cleanUp(con, pst, rs);
		}
		return isregistered;
	}
	
	public static boolean passwordSupport(String email){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		boolean issupported=false;
		try{
			con=JdbcUtil.getMysqlConnection();
			pst=con.prepareStatement("select password from registered_users where email=?");
			pst.setString(1, email);
			rs=pst.executeQuery();
			if(rs.next()){
				issupported=true;
			}
		}catch(Exception e){
			
		}finally{
			JdbcUtil.cleanUp(con, pst, rs);
		}
		return issupported;
	}
}
