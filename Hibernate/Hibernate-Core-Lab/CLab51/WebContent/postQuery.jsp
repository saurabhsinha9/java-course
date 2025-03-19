<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<center>
		<br>
		<h:messages layout="table" style="color:red" />
		<h:form>
		
			<h:panelGrid id="postQueryPanel" columns="1">
			<center>
				<h:outputText value="Post Your Query"
					style="font-size:30;align:center" />
				<h:panelGroup id="x">
					<h:outputText value="Category" />
					<h:selectOneMenu id="catName" value="#{postQueryBean.catName }">
						<f:selectItems value="#{postQueryBean.catList }" />
					</h:selectOneMenu>
					<h:message for="catName" style="color:red" />
				</h:panelGroup>
				<h:panelGroup>
				<center>
					<h:outputText value="Subject" />
					<h:inputText id="subject" value="#{postQueryBean.subject }"
						required="true" /></center>
					<h:message for="subject" style="color:red" />
				</h:panelGroup>
				<h:panelGroup>
				<center>
					<h:outputText value="Description" />
					<h:inputText id="description" value="#{postQueryBean.description }"
						required="true" />
						</center>
					<h:message for="description" style="color:red" />
					
				</h:panelGroup>
				</center>
			</h:panelGrid>
			<h:commandButton value="Post Query"
				action="#{postQueryBean.postQuery }" />
		</h:form>
	</center>
</body>
</html>