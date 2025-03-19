package com.jlc.dao;
import java.util.*;
import java.sql.*;

import com.jlc.util.QueryTO;
public class JDBCQueryDAO implements QueryDAO{


public int postQuery(QueryTO qto){
	Connection con=null;
	PreparedStatement ps=null;
	int x=0;
	try{
		con=JDBCUtil.getConnection();
	ps=con.prepareStatement("insert into query values(?,?,?,?,?,?)");
	ps.setInt(1, qto.getQueryId());
	ps.setString(2, qto.getSubject());
	ps.setString(3, qto.getAuthor());
	ps.setString(4, qto.getPostDate());
	ps.setString(5, qto.getCatName());
	ps.setString(6, qto.getDescription());
	x=ps.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con,ps);
	}
	return x;
}

public void updateQuery(QueryTO qto){
	Connection con=null;
	PreparedStatement ps=null;
	
	try{
		con=JDBCUtil.getConnection();
	ps=con.prepareStatement("update query set subject=?,author=?,postDate=?,catName=?,description=? where queryId=?");
	ps.setString(1,qto.getSubject());
	ps.setString(2, qto.getAuthor());
	ps.setString(3, qto.getPostDate());
	ps.setString(4, qto.getCatName());
	ps.setString(5, qto.getDescription());
	ps.setInt(6,qto.getQueryId());
	ps.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con,ps);
	}
	
}



public List<QueryTO> getQueries(String catName,int start,int total){
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	List<QueryTO> list=new ArrayList<QueryTO>(); 
	try{
		con=JDBCUtil.getConnection();
	ps=con.prepareStatement("select * from query where catName=? limit ?,?");
	ps.setString(1,catName);
	ps.setInt(2,start);
	ps.setInt(3,total);
	rs=ps.executeQuery();
	while(rs.next()){
		QueryTO cto=new QueryTO();
	cto.setQueryId(rs.getInt(1));
	cto.setSubject(rs.getString(2));
	cto.setAuthor(rs.getString(3));
	cto.setPostDate(rs.getString(4));
	cto.setCatName(rs.getString(5));
	cto.setDescription(rs.getString(6));
	list.add(cto);
	}
		}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con,ps,rs);
	}
	return list;
}



public int getTotalQueries(String catName){
		Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	int x=0;
	try{
		con=JDBCUtil.getConnection();
	ps=con.prepareStatement("select count(*) from query");
	rs=ps.executeQuery();
	if(rs.next()){
		x=rs.getInt(1);
	}
		}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con,ps);
	}
	return x;
}


public List<String> getAllCategories(){
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	List<String> list=new ArrayList<String>(); 
	try{
		con=JDBCUtil.getConnection();
	ps=con.prepareStatement("select * from category");
	rs=ps.executeQuery();
	while(rs.next()){
			String st=rs.getString(2);
		list.add(st);
	}
		}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con,ps,rs);
	}
	return list;
}


}