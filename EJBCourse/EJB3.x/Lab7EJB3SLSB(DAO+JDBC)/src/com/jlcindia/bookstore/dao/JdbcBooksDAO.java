package com.jlcindia.bookstore.dao;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jlcindia.bookstore.to.BookTO;
import com.jlcindia.bookstore.util.DataSourceUtil;

public class JdbcBooksDAO implements BooksDAO {

public List getAllBooks() {
		List books=new ArrayList();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try { 
			con=DataSourceUtil.getConnection();
			ps=con.prepareStatement("select * from jlcbooks");
			rs=ps.executeQuery();
			while(rs.next()){
				BookTO bto=new BookTO();
				bto.setBookId(rs.getString(1));
				bto.setBookName(rs.getString(2));
				bto.setAuthor(rs.getString(3));
				bto.setPub(rs.getString(4));
				bto.setIsbn(rs.getString(5));
				bto.setCost(rs.getDouble(6));
				bto.setCat(rs.getString(7));
				bto.setQty(rs.getInt(8));
				books.add(bto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

public BookTO getBookByBookId(String bookId){
	BookTO bto=null;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	try { 
		con=DataSourceUtil.getConnection();
		ps=con.prepareStatement("select * from jlcbooks where bookId=?");
		ps.setString(1, bookId);
		rs=ps.executeQuery();
		if(rs.next()){
			 bto=new BookTO();
			bto.setBookId(rs.getString(1));
			bto.setBookName(rs.getString(2));
			bto.setAuthor(rs.getString(3));
			bto.setPub(rs.getString(4));
			bto.setIsbn(rs.getString(5));
			bto.setCost(rs.getDouble(6));
			bto.setCat(rs.getString(7));
			bto.setQty(rs.getInt(8));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		DataSourceUtil.cleanup(con, ps, rs);
	}
	return bto;
}

public List getBookByCat(String cat){
	List books=new ArrayList();
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	try { 
		con=DataSourceUtil.getConnection();
		ps=con.prepareStatement("select * from jlcbooks where cat=?");
		ps.setString(1, cat);
		rs=ps.executeQuery();
		while(rs.next()){
			BookTO bto=new BookTO();
			bto.setBookId(rs.getString(1));
			bto.setBookName(rs.getString(2));
			bto.setAuthor(rs.getString(3));
			bto.setPub(rs.getString(4));
			bto.setIsbn(rs.getString(5));
			bto.setCost(rs.getDouble(6));
			bto.setCat(rs.getString(7));
			bto.setQty(rs.getInt(8));
			books.add(bto);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		DataSourceUtil.cleanup(con, ps, rs);
	}
	return books;
}

	

}
