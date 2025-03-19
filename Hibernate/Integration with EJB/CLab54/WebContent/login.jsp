<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<<f:view>
<html><body><center><br>
<h:message id="loginError" for="loginError" style="color:red"/>
<h:form>
<h:panelGrid id="loginPanel" columns="3">
<h:outputText value="Account Login" style="font-size:20"/>
<h:outputText value=""/>
<h:outputText value=""/>
<h:outputText value="User Name"/>
<h:inputText id="uname" value="#{loginBean.username}" required="true"/>
<h:message for="uname" style="color:red"/>

<h:outputText value="Password"/>
<h:inputSecret id="pword" value="#{loginBean.password}" required="true"/>
<h:message for="pword" style="color:red"/>
</h:panelGrid>

<h:commandButton value="Login" action="#{loginBean.verifyUser}"/>
</h:form>

<h:outputLink value="signupHome.jlc">
<h:outputText value="New User Signup" style="font-size:20"/>
</h:outputLink>
</center></body></html></f:view>