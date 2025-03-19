<%@page import="java.sql.*"%>
<%@page import="com.jdbc.util.*"%>
<html>
<body>
<table>
<tr>
<%! Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		boolean isvalid=false;
		String msg="";
%>
<%
try{
	con=JdbcUtil.getMySqlConnection();
	st=con.createStatement();
	String sql="select * from registered_users";
	rs=st.executeQuery(sql);
	while(rs.next()){
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9));
	%>
	<h1><br/>
	ID:<%=rs.getInt(1) %><br/>
	fname:<%=rs.getString(2)%><br/>
	lname:<%=rs.getString(3)%><br/>
	email:<%=rs.getString(4)%><br/>
	phone:<%=rs.getString(5)%><br/>
	gender:<%=rs.getString(6)%><br/>
	cardtype:<%=rs.getString(7)%><br/>
	cardnumber:<%=rs.getString(8)%><br/>
	color:<%=rs.getString(9)%><br/>
	username:<%=rs.getString(10)%></h1>
	<% }
	%>
	<% 
}catch(Exception e){
	
}finally{
	JdbcUtil.resourceCleanup(con, st, rs);
} %>
</tr>
</table>
</body>
</html>