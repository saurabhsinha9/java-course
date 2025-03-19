<html>
<body>
<jsp:include page="header.jsp">
<jsp:param value="Java Learning Center" name="CompanyName"/>
</jsp:include>
<form action="home.jsp" method="post">
<h2>Enter Course Name</h2>
<input type="text" name="CourseName"/>
<h2>Enter Student Name</h2>
<input type="text" name="StudentName"/>
<input type="submit" value="submit"/>
</form>
<jsp:include page="footer.jsp">
<jsp:param value="Java Learning Center" name="CompanyName"/>
</jsp:include>
</body>
</html>