<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
	<html>
	<body>
	<center>
	<h1>Java Learning Center</h1>
	<h2>Login Form</h2>
	
	<h:outputText value="#{UserBean.errMsg}"/>
	<h:form>
	<h:panelGrid id="loginpannel" columns="3">
	<h:outputText value="Username"/>
	<h:inputText id="uname" value="#{UserBean.username}" required="true"/>
	<h:message for="uname"/>
	
	<h:outputText value="Password"/>
	<h:inputText id="pword" value="#{UserBean.password}" required="true"/>
	<h:message for="pword"/>
	
	<h:commandButton value="Login" action="#{UserBean.verifyUser}"/>
	</h:panelGrid>
	</h:form>
	</center>
	</body>
	</html>
</f:view>