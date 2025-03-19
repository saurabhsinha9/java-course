package com.jlcindia.modelcomponent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jlcindia.jdbc.util.JdbcUtil;

public class UserService {

	public static boolean verifyUser(String un, String pw) throws SQLException {
		Connection con=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		boolean isFind=false;
		con=JdbcUtil.getDataBaseConnection();
		String sql="select * from users where username=? and password=?";
		prst=con.prepareStatement(sql);
		prst.setString(1, un);
		prst.setString(2, pw);
		rs=prst.executeQuery();
		if(rs.next()){
			isFind=true;
		}
		JdbcUtil.cleanUp(con, prst, rs);
		return isFind;
	}

	public static boolean registerUser(String fn, String ln, String em,String un, String pw) throws SQLException {
		Connection con=null;
		PreparedStatement prst=null;
		boolean isInsert=false;
		con=JdbcUtil.getDataBaseConnection();
		String sql="insert into users values(?,?,?,?,?)";
		prst=con.prepareStatement(sql);
		prst.setString(1, fn);
		prst.setString(2, ln);
		prst.setString(3, em);
		prst.setString(4, un);
		prst.setString(5, pw);
		int x=prst.executeUpdate();
		if(x==1){
			isInsert=true;
		}
		return isInsert;
	}

}
