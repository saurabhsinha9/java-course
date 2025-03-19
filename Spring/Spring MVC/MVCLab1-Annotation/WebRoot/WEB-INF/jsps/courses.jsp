<%@ page language="java"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<h2>Course Information</h2>
<ul>
<c:forEach items="${AL}" var="cou">
<li>
<h1>${cou}</h1>
</li>
</c:forEach>
</ul>
</body>
</html>