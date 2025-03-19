package com.mypkg.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

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

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet-service()");
			
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		String page="";
		boolean isvalid=false;
		String msg="You have not entered any value";
		
		String un=request.getParameter("uname");
		String pass=request.getParameter("pword");
		
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
					page="success.jsp";
				}else{
					msg="Invalid username or password";
					page="success.jsp";
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				JdbcUtil.resourceCleanup(con, pst, rs);
			}
		
		request.setAttribute("MSG", msg);
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
