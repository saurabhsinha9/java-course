<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
	<html>
	<body>
	<center>
	<h1>Java Learning Center</h1>
	<h2>Home</h2>
	Hi !,<h:outputText value="#{UserBean.username}"/><br/>
	Welcome to JLC Home Page.
	</center>
	</body>
	</html>
</f:view>