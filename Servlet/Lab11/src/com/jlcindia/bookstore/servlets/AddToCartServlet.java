package com.jlcindia.bookstore.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartServlet extends HttpServlet {
	static{
		System.out.println("AddToCartServlet-SB");
	}
    public AddToCartServlet() {
    	System.out.println("AddToCartServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("AddToCartServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AddToCartServlet-service() begin");
		String bn=request.getParameter("bname");
		Cookie ck=new Cookie(bn,bn);
		response.addCookie(ck);
		RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
		System.out.println("AddToCartServlet-service() end");
	}

	public void destroy() {
		System.out.println("AddToCartServlet-destroy()");
	}

}
