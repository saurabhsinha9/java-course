package com.jlcindia.bookstore.ejb2.client;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.bookstore.ejb2.books.BooksManagerHome;
import com.jlcindia.bookstore.ejb2.books.BooksManagerRemote;
import com.jlcindia.bookstore.to.BookTO;

public class Client {
	static{
		System.out.println("Client-SB");
	}

	public Client() {
		System.out.println("Client-DC");
	}
	
	public static void main(String args[]){
		System.out.println("Client-main()");
		
		try {
			Properties p=new Properties();
			
			p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "t3://localhost:7001");
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("JLCBooksManagerHomeJNDI");
			BooksManagerHome home=(BooksManagerHome) obj;
			BooksManagerRemote bmr=home.create();
			List books=bmr.getAllBooks();
			Iterator it=books.iterator();
			System.out.println("getAllBooks");
			while(it.hasNext()){
				BookTO bto=(BookTO) it.next();
			System.out.println(bto.getBookId()+"\t"+bto.getBookName()+"\t"+bto.getAuthor()+"\t"+bto.getCost()+"\t"+bto.getCat()+"\t"+bto.getPub()+"\t"+bto.getIsbn()+"\t"+bto.getQty());
			}
			System.out.println("getBookByBookId");
			BookTO bto=bmr.getBookByBookId("4");
			System.out.println(bto.getBookId());
			System.out.println(bto.getBookName());
			System.out.println(bto.getAuthor());
			System.out.println(bto.getPub());
			System.out.println("getBookByCat");
			books=bmr.getBookByCat("java");
			it=books.iterator();
			while(it.hasNext()){
				bto=(BookTO) it.next();
			System.out.println(bto.getBookId()+"\t"+bto.getBookName()+"\t"+bto.getAuthor()+"\t"+bto.getCost()+"\t"+bto.getCat()+"\t"+bto.getPub()+"\t"+bto.getIsbn()+"\t"+bto.getQty());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

