package com.mypkg.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.jdbc.util.JdbcUtil;
import com.mypkg.validation.MyValidation;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        System.out.println("LoginServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet-service()");
			
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		boolean isvalid=false;
		boolean isok=false;
		String msg="You have not entered any value";
		
		String un=request.getParameter("uname");
		String pass=request.getParameter("pword");
		if(un!=null && pass!=null){
			try{
				con=JdbcUtil.getMySqlConnection();
				pst=con.prepareStatement("select * from registered_users where username=? and password=?");
				pst.setString(1, un);
				pst.setString(2, pass);
				rs=pst.executeQuery();
				while(rs.next()){
					isvalid=true;
				}
				if(isvalid){
					msg="Login Successfull";
					isok=true;
				}else{
					msg="Invalid username or password";
					isok=false;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				JdbcUtil.resourceCleanup(con, pst, rs);
			}
		}else{
			System.out.println("You have not entered any value");
		}
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(isok){
			out.println("<h1>"+msg);
		}else{
			out.println("<h1>"+msg);
		}
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
