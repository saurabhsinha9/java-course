<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<center>
		<br />
		<h:message id="registerError" for="registerError" style="color:red" />
		<h:form>
			<h:panelGrid id="signupPanel" columns="3">
				<h:outputText value="" />
				<h:outputText value="Tech Forum New Account"
					style="font-size:30;align:center" />


				<h:outputText value="" />
				<h:outputText value="Full Name" />
				<h:inputText id="fname" value="#{signupBean.fullname }"
					required="true" />
				<h:message for="fname" style="color:red" />

				<h:outputText value="Email" />
				<h:inputText id="email" value="#{signupBean.email }" required="true" />
				<h:message for="email" style="color:red" />

				<h:outputText value="User Name" />
				<h:inputText id="uname" value="#{signupBean.username }"
					required="true" />
				<h:message for="uname" style="color:red" />

				<h:outputText value="Password" />
				<h:inputSecret id="pword" value="#{signupBean.password }"
					required="true" />
				<h:message for="pword" style="color:red" />

			</h:panelGrid>
			<h:commandButton value="Signup" action="#{signupBean.registerUser}" />
		</h:form>

	</center>

</body>
</html>