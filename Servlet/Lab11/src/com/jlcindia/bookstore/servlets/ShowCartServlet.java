package com.jlcindia.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowCartServlet extends HttpServlet {
	static{
		System.out.println("ShowCartServlet-SB");
	}
    public ShowCartServlet() {
    	System.out.println("ShowCartServlet-DC");
    }
    
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("ShowCartServlet-init()");
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ShowCartServlet-service() begin");
		Cookie[]ck=request.getCookies();
		List cart=new ArrayList();
		for(int i=0;i<ck.length;i++){
			String cn=ck[i].getName();
			if(!cn.equals("JSESSIONID")){
				cart.add(cn);
			}
		}
		request.setAttribute("CART", cart);
		RequestDispatcher rd=request.getRequestDispatcher("/showcart.jsp");
		rd.forward(request, response);
		System.out.println("ShowCartServlet-service() end");
	}

	public void destroy() {
		System.out.println("ShowCartServlet-destroy()");
	}
}
