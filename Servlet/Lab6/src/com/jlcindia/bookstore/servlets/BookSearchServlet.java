package com.jlcindia.bookstore.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.bookstore.service.BookService;

public class BookSearchServlet extends HttpServlet {
	BookService bs=null;
	static{
		System.out.println("BookSearchServlet-SB");
	}
    public BookSearchServlet() {
    	System.out.println("BookSearchServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("BookSearchServlet-init() begin");
		bs=new BookService();
		System.out.println("BookSearchServlet-init() end");
	}


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BookSearchServlet-SB");
		//collect request parameter
		String cat=request.getParameter("cat");
		//call model
		List books=bs.getBooksByCat(cat);
		
		//store data in request
		if(books.size()==0){
			request.setAttribute("MSG", "Books are Not Available.");
		}else{
			request.setAttribute("BOOKS", books);
		}
		//forward to HomePage
		RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
		System.out.println("BookSearchServlet-SB");
	}

	
	public void destroy() {
		System.out.println("BookSearchServlet-SB");
	}

}
