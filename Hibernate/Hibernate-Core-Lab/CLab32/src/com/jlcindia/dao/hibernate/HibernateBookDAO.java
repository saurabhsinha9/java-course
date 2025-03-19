package com.jlcindia.dao.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bean.Author;
import com.jlcindia.bean.Book;
import com.jlcindia.dao.BookDAO;
import com.jlcindia.dao.hibernate.util.PropertyUtil;
import com.jlcindia.to.BookTO;
import com.jlcindia.util.CHibernateTemplate;
import com.jlcindia.util.CHibernateUtil;

public class HibernateBookDAO implements BookDAO {

	public int addBook(BookTO bto) {
		Book book=PropertyUtil.getBookFromBookTO(bto);
		Integer it=(Integer)CHibernateTemplate.saveObject(book);
		return it.intValue();
	}

	public void updateBook(BookTO bto) {
		Book book=PropertyUtil.getBookFromBookTO(bto);
		CHibernateTemplate.updateObject(book);
	}

	public void deleteBook(int bookId) {
		CHibernateTemplate.deleteObject(Book.class, bookId);
	}

	public BookTO getBookById(int bookId) {
		Book book=(Book) CHibernateTemplate.loadObject(Book.class, bookId);
		BookTO bto=PropertyUtil.getBookTOFromBook(book);
		return bto;
	}

	public void setAuthorToBook(int bid, Set<Integer> aids) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Book book=(Book)session.load(Book.class, bid);
			Set<Author> authors=new HashSet<Author>();
			for (int aid : aids) {
				Author author=(Author)session.load(Author.class, aid);
				authors.add(author);
			}
			book.setAuthors(authors);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in setAuthorToBook"+e);
			tx.rollback();
		}
	}

}
