<%@page import="java.sql.*"%>
<%@page import="com.jdbc.util.*"%>
<html>
<body>
<center><table>
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
	String sql="select email from registered_users";
	rs=st.executeQuery(sql);
	while(rs.next()){
		System.out.println(rs.getInt(1)+"\t"+rs.getString(4));
	%>


<tr>
	<td>ID</td>
	<td><%=rs.getInt("id") %></td>
</tr>
<tr>
	<td>Email</td>
	<td><%=rs.getString("email")%></td>
</tr>

	
	<%} 
}catch(Exception e){
	
}finally{
	JdbcUtil.resourceCleanup(con, st, rs);
} %>
</table></center>
</body>
</html>