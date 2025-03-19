package com.jlcindia.bookstore.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bookstore.to.BookTO;

public class HibernateBooksDAO implements BooksDAO {

public List getAllBooks() {
		List books=new ArrayList();
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query q=session.createQuery("from Book b");
			List list=q.list();
			Iterator it=list.iterator();
			while(it.hasNext()){
				Book book=(Book) it.next();
				BookTO bto=new BookTO();
				bto.setBookId(book.getBookId());
				bto.setBookName(book.getBookName());
				bto.setAuthor(book.getAuthor());
				bto.setPub(book.getPub());
				bto.setIsbn(book.getIsbn());
				bto.setCost(book.getCost());
				bto.setCat(book.getCat());
				bto.setQty(book.getQty());
				books.add(bto);
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
		return books;
	}
}
