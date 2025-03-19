package com.jlc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("uname");
		System.out.println(un);
		HttpSession session=request.getSession();
		System.out.println(session);
		System.out.println(session.getId());
		boolean b=session.isNew();
		if(b){
			System.out.println("New Client-Session just created.");
		}else{
			System.out.println("Old Client-Session previously created.");
			System.out.println("Session ID:"+session.getId());
			System.out.println("Session Created Time:"+session.getCreationTime());
			System.out.println("Session last Time:"+session.getLastAccessedTime());
			PrintWriter out=response.getWriter();
			out.println("<h1> OK done</h1>");
			
		}
		session.invalidate();
		System.out.println(session);
	}

}
