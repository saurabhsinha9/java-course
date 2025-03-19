<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<html>
<body>
<center>
<br><h:form>
<h:panelGrid columns="1" cellspacing="5">
<h:outputText value="Funds Transfer Form"/>
<h:outputText value="#{accountBean.error}" style="color:red;"/>
</h:panelGrid>

<h:panelGrid columns="3">
<h:outputText value="Source Acc No"/>
<h:inputText id="saccno" value="#{accountBean.saccno}" readonly="false"/>
<h:inputHidden/>

<h:outputText value="Destination Acc No"/>
<h:inputText id="daccno" value="#{accountBean.daccno}" required="true">
<f:validateLongRange minimum="100"/>
</h:inputText>
<h:message for="daccno" style="color:red"/>

<h:outputText value="Amount"/>
<h:inputText id="amount" value="#{accountBean.amount}" required="true">
<f:validateDoubleRange minimum="100"/>
</h:inputText>

<h:message for="amount" style="color:red;"/>
<h:commandButton value="Transfer Now" action="#{accountBean.transferFunds}"/>
</h:panelGrid>
</h:form>
</center>
</body>
</html>


