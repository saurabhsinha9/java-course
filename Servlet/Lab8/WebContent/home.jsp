<%@ page import="java.util.*,com.jlcindia.bookstore.servlets.*"%>
<html>
<body>
<center>
<br><br><br>
<h1>JLC Bookstore</h1>
<table>

<%
List books=new ArrayList();
Book book=new Book();
book.setBid(101);
book.setBname("Learn Java");
book.setAuthor("Srinivas");
book.setCost(99.99);
book.setCat("Java");
book.setPub("JLC");
book.setIsbn("11-11");
books.add(book);

book=new Book();
book.setBid(102);
book.setBname("Learn JDBC");
book.setAuthor("Srinivas");
book.setCost(99.99);
book.setCat("Java");
book.setPub("JLC");
book.setIsbn("11-12");
books.add(book);

book=new Book();
book.setBid(103);
book.setBname("Learn JSP");
book.setAuthor("Srinivas");
book.setCost(99.99);
book.setCat("Java");
book.setPub("JLC");
book.setIsbn("11-13");
books.add(book);

book=new Book();
book.setBid(104);
book.setBname("Learn EJB");
book.setAuthor("Srinivas");
book.setCost(99.99);
book.setCat("Java");
book.setPub("JLC");
book.setIsbn("11-14");
books.add(book);

book=new Book();
book.setBid(105);
book.setBname("Learn Hibernate");
book.setAuthor("Srinivas");
book.setCost(99.99);
book.setCat("Java");
book.setPub("JLC");
book.setIsbn("11-15");
books.add(book);

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
	 book=(Book)it.next();
%>
<tr>
<td><%=book.getBid() %></td>
<td><%=book.getBname() %></td>
<td><%=book.getAuthor() %></td>
<td><%=book.getCost() %></td>
<td><%=book.getCat() %></td>
<td><%=book.getPub() %></td>
<td><%=book.getIsbn() %></td>
<td>
<form action="addcart.jlc">
<input type="hidden" name="bname" value="<%=book.getBname()%>"/>
<input type="submit" value="Add TO Cart">
</form>
</td>
</tr>
<%
}
out.println("</table>");
%>
<a href="placeorder.jsp">Place My Order</a>
<form action="showcart.jlc">
<input type="submit" value="Show My Cart">
</form>
</table>
</center>
</body>
</html>