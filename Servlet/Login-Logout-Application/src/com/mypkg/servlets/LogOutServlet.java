package com.mypkg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
static{
	System.out.println(" LogOutServlet-SB");
}
 public LogOutServlet(){
	System.out.println(" LogOutServlet-DC");
}

public void init() throws ServletException {
	System.out.println(" LogOutServlet-init()");
}

public void destroy() {
	System.out.println(" LogOutServlet-desroy()");
}
public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

	System.out.println("LogOutServlet-service()--begin");
	HttpSession session= request.getSession();
session.invalidate();

RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
rd.forward(request, response);
System.out.println("LogOutServlet-service()--end");
}

}