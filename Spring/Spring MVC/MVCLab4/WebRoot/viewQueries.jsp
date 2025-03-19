<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Java Learning Center</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.jlc"/>">Home</a></h1>
<h1>List Queries <br>
<c:forEach var="x" items="${list}">
${x}<br/>
</c:forEach>
</h1>
</body>
</html>

