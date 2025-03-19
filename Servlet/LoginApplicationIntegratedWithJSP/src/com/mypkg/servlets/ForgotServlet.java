package com.mypkg.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.util.JdbcUtil;


public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ForgotServlet() {
        super();
       System.out.println("ForgotServlet-DC");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ForgotServlet-DC");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForgotServlet-DC");
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		boolean isvalid=false;
		String msg="";
		
		String em=request.getParameter("email");
		String page="";
		try{
			con=JdbcUtil.getMySqlConnection();
			pst=con.prepareStatement("select email,password from registered_users where email=?");
			pst.setString(1, em);
			rs=pst.executeQuery();
			while(rs.next()){
				isvalid=true;
			}
			if(isvalid){
				msg="password is sent to ur email account";
				page="success.jsp";
			}else{
				msg="Not valid email";
				page="success.jsp";
			}
		}catch(Exception e){
			
		}finally{
			JdbcUtil.resourceCleanup(con, pst, rs);
		}
		request.setAttribute("MSG", msg);
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	public void destroy() {
		System.out.println("ForgotServlet-DC");
	}
}
