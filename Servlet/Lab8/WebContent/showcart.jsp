<%@ page import="java.util.*,com.jlcindia.bookstore.servlets.*"%>
<html>
<body>
<center>
<br><br>
<h1>JLC Bookstore</h1>
<table>
<%
List list=(List)request.getAttribute("CART");
Iterator it=list.iterator();
while(it.hasNext()){
	String bn=it.next().toString();
%>
<tr>
<td><%=bn %></td>
<td>
<form action="removecart.jlc">
<input type="hidden" name="bname" value="<%=bn%>"/>
<input type="submit" value="Remove From Cart">
</form>
</td>
</tr>
<%
}
out.println("</table>");
%>
<a href="placeorder.jsp">Place My Order</a>
<p>
<a href="home.jsp">Continue Shopping..</a>
</table>
</center>
</body>
</html>