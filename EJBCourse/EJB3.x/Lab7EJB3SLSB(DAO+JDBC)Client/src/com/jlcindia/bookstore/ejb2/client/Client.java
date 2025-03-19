package com.jlcindia.bookstore.ejb2.client;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.bookstore.ejb2.books.BooksManagerRemote;
import com.jlcindia.bookstore.to.BookTO;

public class Client{

	static{
		System.out.println("Client-SB");
	}
public static void main(String[] args) {
	System.out.println("Client-main()");
	try {
		Properties p=new Properties();
		p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		p.put("java.naming.provider.url", "localhost:1099");
		p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
		Context ctx= new InitialContext(p);
		Object obj=ctx.lookup("BooksManagerBean/remote");
		BooksManagerRemote bmr=(BooksManagerRemote) obj;
		List books=bmr.getAllBooks();
		Iterator it=books.iterator();
		while(it.hasNext()){
			BookTO bto=(BookTO) it.next();
		System.out.println(bto);
		}
		BookTO bto=bmr.getBookByBookId("1");
		System.out.println(bto.getBookId());
		System.out.println(bto.getBookName());
		System.out.println(bto.getAuthor());
		System.out.println(bto.getPub());
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
