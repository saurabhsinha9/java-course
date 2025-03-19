package com.jlc.dao;

import java.sql.*;

import com.jlc.util.UserTO;

public class JDBCUserDAO implements UserDAO {
	
public UserTO verifyUser(String username, String password) {
		
		UserTO uto=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			if(rs.next()){
				if(password.equals(rs.getString("password"))){
					
					int uid=rs.getInt("userId");
					String fname=rs.getString("fullname");
					String email=rs.getString("email");
					String uname=rs.getString("username");
					String pword=rs.getString("password");
					
					uto=new UserTO(uid, fname, email, uname, pword);
				}
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(con,ps,rs);
		}
			return uto;
	}

	
	public UserTO registerUser(UserTO uto) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement("insert into users values(?,?,?,?,?)");
			int userId=getUserId();
					ps.setInt(1, userId);
			ps.setString(2, uto.getFullname());
			ps.setString(3, uto.getEmail());
			ps.setString(4, uto.getUsername());
			ps.setString(5, uto.getPassword());

			ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} finally {

			JDBCUtil.cleanup(con, ps, rs);
		}
		System.out.println(uto);
		return uto;
	}
private int getUserId(){
	int userId=0;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getConnection();
		ps=con.prepareStatement("select max(userId) from users");
		rs=ps.executeQuery();
		if(rs.next()){
			int id=rs.getInt(1);
			userId=id+1;
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con, ps, rs);
	}
	return userId;
}
	
}
