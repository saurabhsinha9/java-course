package com.mypkg.modelcomponent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.util.JdbcUtil;

public class LoginApplicationModel {
	
	public LoginApplicationModel() {
		System.out.println("LoginApplicationModel-DC");
	}
	
	public static String verifyUser(String username,String password){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		 boolean isvalid=false;
		
		 String msg="";
		try{
			con=JdbcUtil.getMySqlConnection();
			pst=con.prepareStatement("select * from registered_users where username=? and password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			rs=pst.executeQuery();
			while(rs.next()){
				isvalid=true;
			}
			if(isvalid){
				msg="Login Successfull";
				
			}else{
				msg="invalid username or password";
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.resourceCleanup(con, pst, rs);
		}
		return msg;
	}
	
	public static String registerUser(String firstname,String lastname,String email,String phone,String gender,String cardtype,String cardnumber,String color[],String username,String password){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String msg="";
		String col = "  ";
		for (int i = 0; i < color.length; i++) {
			col =col+color[i]+"  ";
			
		}
		
		try{
			con=JdbcUtil.getMySqlConnection();
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
				msg="Registration Successfull";
			}
		}
		catch (Exception e) {
			msg="Registration Unsuccessfull";
			e.printStackTrace();
		}finally{
			JdbcUtil.resourceCleanup(con, pst, rs);
		}
		return msg;
	}
	
	public static String passwordSupport(String email){
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String msg="";
		
		boolean isvalid=false;
		
		try{
			con=JdbcUtil.getMySqlConnection();
			pst=con.prepareStatement("select password from registered_users where email=?");
			pst.setString(1, email);
			rs=pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("password"));
				isvalid=true;
			}
			if(isvalid){
				msg="Password is sent to your mail successfully";
			}else{
				msg="Not valid email Id";
			}
		}catch(Exception e){
			
		}finally{
			JdbcUtil.resourceCleanup(con, pst, rs);
		}
		return msg;
	}
}
