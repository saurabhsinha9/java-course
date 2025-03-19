<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<head>
<link href="images/jlc.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<center>
		<br />
		<h:messages layout="table" style="color:red" />
		<h:form>
			<h:panelGrid id="viewQueryPanel" columns="2" styleClass="items"
				headerClass="itemsHeader" footerClass="itemsHeader"
				columnClasses="oddColumn,evenColumn">
				<h:panelGroup id="x">
					<h:outputText value="Select Category" styleClass="textSize1" />
					<h:selectOneMenu id="catName" value="#{viewQueryBean.catName }"
						styleClass="textSize2">
						<f:selectItems value="#{viewQueryBean.catList }" />
					</h:selectOneMenu>
					<h:message for="catName" style="color:red" />

				</h:panelGroup>
				<h:commandButton value="View Queries"
					actionListener="#{viewQueryBean.viewQueries}"
					styleClass="textSize2" />
			</h:panelGrid>

		</h:form>
		<h:panelGrid id="showStatus" rendered="#{viewQueryBean.showDataTable}">
			<h:outputFormat value="Showing {0}-{1} of {2}" styleClass="textSize1">
				<f:param value="#{viewQueryBean.min }" />
				<f:param value="#{viewQueryBean.max }" />

				<f:param value="#{viewQueryBean.total }" />
			</h:outputFormat>
		</h:panelGrid>
		<h:form>
			<h:dataTable id="qlist" binding="#{viewQueryBean.queryDataTable }"
				rendered="#{viewQueryBean.showDataTable }"
				value="#{viewQueryBean.queryList }" var="query" styleClass="items"
				headerClass="itemsHeader" footerClass="itemsHeader"
				columnClasses="oddColumn,evenColumn" border="3">
				<h:column>
					<f:facet name="header">
						<h:outputText value="Query ID" />
					</f:facet>
					<h:commandLink value="#{query.queryId }"
						actionListener="#{viewQueryBean.viewSelectedQuery }"
						styleClass="textSize2" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Post Date" />
					</f:facet>
					<h:outputText value="#{query.postDate }" styleClass="textSize2" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Author" />
					</f:facet>
					<h:outputText value="#{query.author }" styleClass="textSize2" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Subject" />
					</f:facet>
					<h:outputText rendered="#{not viewQueryBean.editable }"
						value="#{query.subject }" styleClass="textSize2" />
					<h:inputText rendered="#{viewQueryBean.editable }"
						value="#{query.subject }" styleClass="textSize2" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Description" />
					</f:facet>
					<h:outputText rendered="#{not viewQueryBean.editable }"
						value="#{query.description }" styleClass="texSize2" />
					<h:inputText rendered="#{viewQueryBean.editable }"
						value="#{query.description }" styleClass="textSize2" />
				</h:column>
				<h:column>
					<h:commandLink rendered="#{not viewQueryBean.editable }"
						value="Edit" actionListener="#{viewQueryBean.editSelectedQuery }"
						styleClass="textSize2" />
					<h:commandLink rendered="#{viewQueryBean.editable }" value="Save"
						actionListener="#{viewQueryBean.saveEditedQuery }"
						styleClass="textSize2" />
				</h:column>
				<h:column>
					<h:commandLink value="View"
						actionListener="#{viewQueryBean.viewSelectedQuery }"
						styleClass="textSize2" />
				</h:column>
			</h:dataTable>
			<h:panelGrid columns="2" id="links">
				<h:panelGrid id="PreviousPanel"
					rendered="#{viewQueryBean.showPreviousLink }">
					<h:commandLink value="Previous" styleClass="textSize1"
						actionListener="#{viewQueryBean.getPreviousQueries }" />
				</h:panelGrid>
				<h:panelGrid id="NextPanel"
					rendered="#{viewQueryBean.showNextLink }">
					<h:commandLink value="Next" styleClass="textSize1"
						actionListener="#{viewQueryBean.getNextQueries }" />
				</h:panelGrid>
			</h:panelGrid>
		</h:form>
		<h:form>
			<h:panelGrid id="viewQuery"
				rendered="#{viewQueryBean.showDetailsPanel }" columns="2"
				styleClass="items" headerClass="itemsHeader"
				footerClass="itemsHeader" columnClasses="oddColumn,evenColumn">
				<h:outputText value="Query ID" styleClass="textSize1" />
				<h:outputText value="#{viewQueryBean.queryTO.queryId }"
					styleClass="textSize1" />
				<h:outputText value="Author" styleClass="textSize1" />
				<h:outputText value="#{viewQueryBean.queryTO.author }"
					styleClass="textSize1" />
				<h:outputText value="Post Date" styleClass="textSize1" />

				<h:outputText value="#{viewQueryBean.queryTO.postDate}"
					styleClass="textSize1" />
				<h:outputText value="Subject" styleClass="textSize1" />
				<h:outputText value="#{viewQueryBean.queryTO.subject }"
					styleClass="textSize1" />
				<h:outputText value="Description" styleClass="textSize1" />
				<h:outputText value="#{viewQueryBean.queryTO.description }"
					styleClass="textSize1" />
				<h:outputText value="Category" styleClass="textSize1" />
				<h:outputText value="#{viewQueryBean.queryTO.catName }"
					styleClass="textSize1" />
				<h:commandButton value="Post Answer"
					actionListener="#{viewQueryBean.viewQueries }"
					styleClass="textSize2" />
				<h:commandButton value="Cancel"
					actionListener="#{viewQueryBean.cancelShowDetails }"
					styleClass="textSize2" />
			</h:panelGrid>

		</h:form>
	</center>

</body>
</html>