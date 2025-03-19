<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h:form>
<h1>User Account Login</h1>
<h:panelGrid>
<h:outputText id="errorMessage" value="#{userBean.error}" style="color:red;font-size:large;"/>
</h:panelGrid>

<h:panelGrid columns="3" border="1">
<h:outputText id="usernameTxt" value="USERNAME"/>
<h:inputText id="username" value="#{userBean.username}" required="true"/>
<h:message for="username" style="color:red;"/>
<h:outputText id="passwordTxt" value="PASSWORD"/>
<h:inputSecret id="password" value="#{userBean.password}" required="true"/>
<h:message for="password" style="color:red;"/>
</h:panelGrid>

<h:panelGrid columns="1">
<h:commandButton id="loginButton" action="#{userBean.verifyUser}" value="LOGIN"/>
</h:panelGrid>
</h:form>

</center>
</body>
</html>