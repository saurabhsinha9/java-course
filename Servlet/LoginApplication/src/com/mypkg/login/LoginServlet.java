package com.mypkg.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.util.JdbcUtil;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        System.out.println("LoginServlet-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet-init()");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginServlet-service() start");
		String un=request.getParameter("uname");
		String pass=request.getParameter("pword");
		System.out.println(un+"\t"+pass);
		String msg="";
		String username="";
		PreparedStatement prst=null;
		Connection con=null;
		ResultSet rs=null;
		boolean isvalid=false;
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			
			con=JdbcUtil.getMySqlConnection();
			prst=con.prepareStatement("select * from user_login where username=? and password=?");
			prst.setString(1, un);
			prst.setString(2, pass);
			rs=prst.executeQuery();
			while(rs.next()){
				isvalid=true;
			}
			if(isvalid){
				msg="Login Successfull";
				username=un;
				
			}else{
				msg="Invalid username or password";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.resourceCleanup(con, prst, rs);
		}
		
		pw.println("<html><head><title>home</title></head><center><body>");
		pw.println("<h1>My Login Application</h1>");
		pw.println("<h1>"+msg+"</h1>");
		pw.println("Hi,"+username);
		System.out.println("LoginServlet-service() end");
	}

}
