<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:import url="header.jsp">
<c:param name="companyName" value="Java Learning Center"/>
</c:import>
<h1>This is Java.jsp<br/><hr/>
Hello! &nbsp;&nbsp;&nbsp;
${param.stuName},<br/><br/>
You have selected <br/><br/> ${param.couName}.
</h1>
<c:import url="footer.jsp">
<c:param name="companyName" value="Java Learning Center"/>
</c:import>
</body>
</html>