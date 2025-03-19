<%@ page import="java.util.*,com.jlcindia.hibernate.*" isELIgnored="false"%>

<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>

<html>
<head>
<body>
<center><br>
<logic:notPresent name="BatchStudentsList" scope="session">
<h3>Search for Batch</h3>
<logic:present name="BatchList" scope="session">
<html:form action="/BidSubmit?method=bidSearch">
<table>
<tr>
<td>Select Batch ID</td>
<td>
<bean:define id="batchList" name="BatchList" type="java.util.Collection"/>
<html:select property="batchId">
<html:options collection="batchList" property="value" labelProperty="label"/>
</html:select>
</td>
<td><html:errors property="batchId"/></td>
</tr>
<tr>
<td colspan="2"><html:submit value="Show"/>
</tr>
</table>
</html:form>
</logic:present>
</logic:notPresent>
<logic:notPresent name="STO" scope="session">
<h3>Search for Batch</h3>
<logic:present name="BatchStudentsList" scope="session">
<bean:define id="StuList" name="BatchStudentsList" scope="session" type="java.util.Collection"/>
<h1 align="right">${START }-${END } of ${NOS }</h1>
<table bgcolor="#c3d5c3" border="5">
<tr>
<td>Student ID</td>
<td>FirstName</td>
<td>LastName</td>
<td>Email</td>
<td>Gender</td>
<td>Phone</td>
<td>Quali</td>
<td>Total Fee</td>
<td>FeePaid</td>
<td>Fee Bal</td>
<td>Status</td>
</tr>
<logic:iterate id="stu" name="StuList" type="com.jlcindia.hibernate.StudentTO">
<tr>
<td><bean:write name="stu" property="studentId"/></td>
<td><bean:write name="stu" property="firstName"/></td>
<td><bean:write name="stu" property="lastName"/></td>
<td><bean:write name="stu" property="email"/></td>
<td><bean:write name="stu" property="gender"/></td>
<td><bean:write name="stu" property="phone"/></td>
<td><bean:write name="stu" property="qualification"/></td>
<td><bean:write name="stu" property="totalFee"/></td>
<td><bean:write name="stu" property="feePaid"/></td>
<td><bean:write name="stu" property="feeBal"/></td>
<td><bean:write name="stu" property="status"/></td>

<td>
<html:form action="/sidSubmit.do?method=showStudentBySid">
<html:hidden property="studentId" value="${stu.studentId }"/>
<html:submit value="Edit"/>
</html:form>
</td>
</tr>
</logic:iterate>
</table>
<logic:equal name="ShowPrevious" value="TRUE" scope="session">
<html:link forward="Previous"><h1>Previous</h1></html:link>
</logic:equal>
<logic:equal name="ShowNext" value="TRUE" scope="session">
<html:link forward="Next"><h1>Next</h1></html:link>
</logic:equal>
</logic:present>
</logic:notPresent>
<logic:present name="STO" scope="session">
<bean:define id="sto" name="STO" scope="session" type="com.jlcindia.hibernate.StudentTO"/>
<html:form action="/updateStudent.do?method=updateStudent">
<table bgcolor="#c3d5c3" border="5">
<tr>
<td>Student ID</td>
<td>
<html:hidden property="studentId" value="${sto.studentId }"/>
<html:hidden property="batchId" value="${sto.batchId }"/>
${sto.studentId }
</td>
</tr>
<tr>
<td>FirstName</td>
<td><html:text property="firstName" value="${sto.firstName }"/></td>
</tr>
<tr>
<td>LastName</td>
<td><html:text property="lastName" value="${sto.lastName }"/></td>
</tr>
<tr>
<td>Email</td>
<td><html:text property="email" value="${sto.email}"/></td>
</tr>
<tr>
<td>Gender</td>
<td><html:text property="gender" value="${sto.gender}"/></td>
</tr>
<tr>
<td>Phone</td>
<td><html:text property="phone" value="${sto.phone}"/></td>
</tr>
<tr>
<td>Quali</td>
<td><html:text property="qualification" value="${sto.qualification}"/></td>
</tr>
<tr>
<td>Total Fee</td>
<td><html:text property="totalFee" value="${sto.totalFee}"/></td>
</tr>
<tr>
<td>FeePaid</td>
<td><html:text property="feePaid" value="${sto.feePaid}"/></td>
</tr>
<tr>
<td>Fee Bal</td>
<td><html:text property="feeBal" value="${sto.feeBal}"/></td>
</tr>
<tr>
<td>Status</td>
<td><html:text property="status" value="${sto.status}"/></td>
</tr>
<tr>
<td align="center" colspan="2"><html:submit value="UpdateStudent"/></td>
</tr>
</table>
</html:form>
</logic:present>
</center>
</body>
</html>