<%@ page import="java.util.*,com.jlcindia.bookstore.util.*"%>
<html>
<body>
<center>
<br><br>
<h1>JLC Bookstore</h1>
<form action="booksearch.jlc">
<table>
<tr>
<td>Select Category</td>
<td><input type="text" name="cat"/></td>
</tr>
<tr>
<td><input type="submit" value="Show"/></td>
</tr>
<tr>
<td>
<%
Object obj1=request.getAttribute("MSG");
if(obj1!=null){
	out.println("<h1>"+obj1+"</h1>");
}

Object obj2=request.getAttribute("BOOKS");
if(obj2!=null){
	List books=(List)obj2;
	out.println("<table>");
%>
<tr>
<td>Book Id</td>
<td>Book Name</td>
<td>Author</td>
<td>Cost</td>
<td>Cat</td>
<td>Pub</td>
<td>ISBN</td>
</tr>
<%
Iterator it=books.iterator();
while(it.hasNext()){
	Book book=(Book)it.next();
%>
<tr>
<td><%=book.getBid() %></td>
<td><%=book.getBname() %></td>
<td><%=book.getAuthor() %></td>
<td><%=book.getCost() %></td>
<td><%=book.getCat() %></td>
<td><%=book.getPub() %></td>
<td><%=book.getIsbn() %></td>
</tr>
<% 
}
out.println("</table>");
}
%>
</td>
</tr>
</table>
</form>
</center>
</body>
</html>