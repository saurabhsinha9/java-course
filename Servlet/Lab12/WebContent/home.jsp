<html>
<head>
<title>Java Learning Center</title>
</head>
<body>
<center>
<h1>JLC URL Demo</h1>
<hr/><br>
<h1>
<%
String url1="hai.jsp";
String url2=response.encodeURL("hello.jsp");
String url3=response.encodeURL("hellohai.jsp");
out.println(url1+"<br>");
out.println(url2+"<br>");
out.println(url3+"<br>");
%>
<a href="<%=url1%>">Hai Guys</a>
<a href="<%=url2%>">Hello Guys</a>
<a href="<%=url3%>">Hello Hai Guys</a>
</h1>
<form action="demo.jlc">
<table>
<tr>
<td>Enter Name</td>
<td><input type="text" name="uname"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit"/></td>
<td><input type="hidden" name="JSESSIONID" value="<%=session.getId()%>"/></td>
</tr>
</table>
</form>
</center>
</body>
</html>