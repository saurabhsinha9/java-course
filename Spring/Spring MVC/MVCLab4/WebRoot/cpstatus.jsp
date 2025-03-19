<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.jlc"/>">Home</a></h1>
<h1>${msg}</h1>
</body>
</html>

