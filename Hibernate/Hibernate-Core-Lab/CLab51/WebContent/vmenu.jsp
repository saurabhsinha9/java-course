<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<html><body>
<h:panelGrid id="vmenuPanel" columns="1" style="valign:top;">
<h:panelGroup>
<h:outputText value="Welcome  "/>
<h:outputText value="#{homeBean.userTO.fullname}" style="font-size:35"/>
</h:panelGroup>
<h:outputText value=""/>
<h:outputText value=""/>
<h:outputLink value="postQueryHome.jlc">
<h:outputText value="Post Your Query" style="font-size:20"/>
</h:outputLink>
<h:outputLink value="viewQueryHome.jlc">
<h:outputText value="View Queries" style="font-size:20"/>
</h:outputLink>
<h:outputText value=""/>
<h:outputText value=""/>
<h:panelGroup>
<h:commandButton value="Logout" action="#{logoutBean.logoutUser}" style="font-size:35"/>
</h:panelGroup>

</h:panelGrid>
</body>
</html>