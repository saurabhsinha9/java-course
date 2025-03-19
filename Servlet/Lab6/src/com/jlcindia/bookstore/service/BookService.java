package com.jlcindia.bookstore.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jlcindia.bookstore.util.Book;
import com.jlcindia.bookstore.util.JdbcUtil;

public class BookService {

	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public List getBooksByCat(String cat) {
		List books=new ArrayList();
		try {
			con=JdbcUtil.getMysqlConnection();
			String sql="select * from jlcbooks where cat=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, cat);
			rs=ps.executeQuery();
			while(rs.next()){
				Book book=new Book();
				book.setBid(rs.getInt(1));
				book.setBname(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setCost(rs.getDouble(4));
				book.setCat(rs.getString(5));
				book.setPub(rs.getString(6));
				book.setIsbn(rs.getString(7));
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			JdbcUtil.cleanUp(con, ps, rs);
		}
		return books;
	}

}
