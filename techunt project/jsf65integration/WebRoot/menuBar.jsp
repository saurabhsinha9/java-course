<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.ajax4jsf.org/rich" prefix="rich" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h:form>
<h:panelGrid columns="1">
<h:commandLink value="Show My Bal" action="#{accountBean.showBalance}"/>
<h:commandLink value="Funds Transfer" action="#{accountBean.showFTForm}" />
<h:commandLink value="Update My Info" action="#{customerBean.updateCustomerInfo}"/>
</h:panelGrid>
</h:form>

</body>
</html>