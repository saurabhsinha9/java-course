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
			List list=bmr.getAllBooks();
			Iterator it=list.iterator();
			while(it.hasNext()){
				BookTO bto=(BookTO) it.next();
				System.out.println(bto.getBookId()+"\t"+bto.getBookName()+"\t"+bto.getAuthor()+"\t"+bto.getCat()+"\t"+bto.getCost()+"\t"+bto.getIsbn()+"\t"+bto.getPub()+"\t"+bto.getQty());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

