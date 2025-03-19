package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieDemoServlet extends HttpServlet {
	static{
		System.out.println("CookieDemoServlet-SB");
	}
    public CookieDemoServlet() {
    	System.out.println("CookieDemoServlet-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("CookieDemoServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CookieDemoServlet- service() begin");
		String un=request.getParameter("uname");
		System.out.println(un);
		HttpSession session=request.getSession();
		Cookie[] ck=request.getCookies();
		PrintWriter out=response.getWriter();
		if(ck!=null){
			if(ck.length!=0){
				for(int i=0;i<ck.length;i++){
					String cn=ck[i].getName();
					if(cn.equals("JSESSIONID")){
						System.out.println("You are old");
					}else{
						System.out.println("You are New. Welcome..");
					}
					out.println("<h1>"+cn+"--*--"+ck[i].getValue()+"</h1>");
					System.out.println(cn+"--*--"+ck[i].getValue());
				}
			}else{
				System.out.println("Sorry. No Cookies");
			}
		}
		Cookie ck1=new Cookie("email", "saurabh@jlc.com");
		Cookie ck2=new Cookie("phone","9999");
		Cookie ck3=new Cookie("city","Gaya");
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		out.println("<h1>OK DONE</h1>");
		System.out.println("CookieDemoServlet- service() end");
	}

	public void destroy() {
		System.out.println("CookieDemoServlet-destroy");
	}

}
