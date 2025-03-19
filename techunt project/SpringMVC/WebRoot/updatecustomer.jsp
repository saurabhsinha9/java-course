<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>

<html>
<body>
<center>
<h:form>
<center>
<h:panelGrid columns="1">
<h:outputText value="UPDATE CUSTOMER"/>
<h:inputHidden/>
<h:inputHidden/>
<h:inputHidden/>
</h:panelGrid>

<h:panelGrid columns="3">
<f:facet name="caption">
</f:facet>

<h:outputText value="Customer ID"/>
<h:inputText id="cid" value="#{customerBean.cid}" readonly="true" />
<h:inputHidden/>

<h:outputText value="Customer Name"/>
<h:inputText id="cname" value="#{customerBean.cname}" readonly="true" />
<h:inputHidden/>
 
<h:outputText value="Email ID"/>
<h:inputText id="email" value="#{customerBean.email}" readonly="true" />
<h:message for="email" style="color:red;"/>

<h:outputText value="Phone No"/>
<h:inputText id="phone" value="#{customerBean.phone}" readonly="false" />
<h:message for="phone" style="color:red;"/>

<h:outputText value="City"/>
<h:inputText id="city" value="#{customerBean.city}" readonly="true" />
<h:message for="city" style="color:red;"/>

<h:commandButton value="Update Now" action="#{customerBean.showUpdateInfo}"/>

</h:panelGrid>
</center>
</h:form>
</center>
</body>
</html>