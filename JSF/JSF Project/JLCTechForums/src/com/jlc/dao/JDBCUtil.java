package com.jlc.dao;
import java.sql.*;
public class JDBCUtil {
	public static Connection getConnection() {
		Connection con = null;
				try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jlctechforumdb", "root",
					"jlcindia");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void cleanup(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanup(Connection con, Statement st) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
