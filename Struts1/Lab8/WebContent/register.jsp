<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html>
<body bgcolor="lightYellow">
<center>
<br/>
<font color="green">
<h1>Java Learning center</h1>
</font>
<h1><bean:message key="label.reg.header"/></h1>
<font color="red" size="5">${EMSG}</font>
<html:form action="/RegisterSubmit">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td>Student ID</td>
		<td><html:text property="sid"/></td>
		<td><html:errors property="sid"/></td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><html:text property="username"/></td>
		<td><html:errors property="username"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><html:password property="password"/></td>
		<td><html:errors property="password"/></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><html:text property="email"/></td>
		<td><html:errors property="email"/></td>
	</tr>
	<tr>
		<td>DOB</td>
		<td><html:text property="dob"/></td>
		<td><html:errors property="dob"/></td>
	</tr>
	<tr>
		<td>Phone</td>
		<td><html:text property="phone"/></td>
		<td><html:errors property="phone"/></td>
	</tr>
	<tr>
		<td>Fee</td>
		<td><html:text property="fee"/></td>
		<td><html:errors property="fee"/></td>
	</tr>
	<tr>
		<td>Course</td>
		<td><html:checkbox property="course" value="Java"/>Java
			<html:checkbox property="course" value="JDBC"/>JDBC
			<html:checkbox property="course" value="EJB"/>EJB
			<html:checkbox property="course" value="JSP"/>JSP
		</td>
		<td><html:errors property="course"/></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><html:radio property="gender" value="Male"/>Male
			<html:radio property="gender" value="Female"/>Female
		</td>
		<td><html:errors property="gender"/></td>
	</tr>	
	<tr>
		<td>Qualification</td>
		<td><html:select property="quali">
			<html:option value="Select">Select</html:option>
			<html:option value="M.Sc">M.Sc</html:option>
			<html:option value="B.Sc">B.Sc</html:option>
			<html:option value="B.Tech">B.Tech</html:option>
			<html:option value="M.Tech">M.Tech</html:option>
			</html:select>
		</td>
		<td>
		<html:errors property="quali"/>
		</td>
	</tr>
	<tr>
		<td colspan="3" align="center"><html:submit value="Register"/></td>
	</tr>
</table>
</html:form>
</center>
</body>
</html>