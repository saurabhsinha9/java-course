<%@ page isELIgnored="false"%>
<%@ taglib uri="/WEB-INF/jlc.tld" prefix="sd"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jlc"%>
<html>
<body>
<h1>Student Search</h1>${SESS }
<form action="search.jsp">
<h2>Enter Sid</h2>
<input type="text" name="sid"/><br/>
<input type="submit" value="Show"/><br/>
</form>
<jlc:set var="sid" value="${param.sid}" scope="session"/>
<jlc:if test="${sid ne null}">
<hr/>
Custom Tag Evaluated
<sd:student sid="${param.sid}" name="STU" scope="session"/>
<hr/>
EL Expr Evaluated
Sid:${STU.sid}<br/>
Sname:${STU.sname}<br/>
Email:${STU.email}<br/>
Phone:${STU.phone}<br/>
</jlc:if>
</body>
</html>