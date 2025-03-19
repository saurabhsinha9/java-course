package com.mypkg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.util.JdbcUtil;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		System.out.println("RegisterServlet-DC");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("RegisterServlet-init()");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		boolean isok = false;
		String msg = "";

		// request parameter
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String em = request.getParameter("email");
		String ph = request.getParameter("phone");
		String ge = request.getParameter("gender");
		String cty = request.getParameter("ctype");
		String cno = request.getParameter("cnum");
		String co[] = request.getParameterValues("color");
		String un = request.getParameter("uname");
		String pw = request.getParameter("pword");
		String col = " ";
		for (int i = 0; i < co.length; i++) {
			col = col+co[i] + "  ";
		}
		try {
			con = JdbcUtil.getMySqlConnection();
			pst = con
					.prepareStatement("insert into registered_users(fname,lname,email,phone,gender,cardtype,cardnumber,color,username,password)values(?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, fn);
			pst.setString(2, ln);
			pst.setString(3, em);
			pst.setString(4, ph);
			pst.setString(5, ge);
			pst.setString(6, cty);
			pst.setString(7, cno);
			pst.setString(8, col);
			pst.setString(9, un);
			pst.setString(10, pw);

			int x = pst.executeUpdate();

			if (x != 0) {
				msg = "Registration Successfull";
				isok = true;
			} else {
				msg = "Not Yet Registered";
				isok = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.resourceCleanup(con, pst, rs);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (isok) {
			out.println("<h1>" + msg);
		} else {
			out.println("<h1>" + msg);
		}
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}

}
