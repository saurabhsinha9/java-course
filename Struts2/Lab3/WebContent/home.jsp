<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>@home-Registration Application</title>
</head>
<body>
<center>
<h1>Congratulations, your Registration is successful.</h1>
<table bgcolor="#c3d599" width="50%" border="3" bordercolor="black">

	<tr>
		<td>Code</td>
		<td><s:property value="code"/></td>
	</tr>
	
	<tr>
		<td>Batch Id</td>
		<td><s:property value="batchId"/></td>
	</tr>
	
	<tr>
		<td>Student Id</td>
		<td><s:property value="sid"/></td>
	</tr>
	
	<tr>
		<td>Full Name</td>
		<td><s:property value="fname"/></td>
	</tr>
	
	<tr>
		<td>UserName</td>
		<td><s:property value="uname"/></td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td><s:property value="pword"/></td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td><s:property value="email"/></td>
	</tr>
	
	<tr>
		<td>Phone</td>
		<td><s:property value="phone"/></td>
	</tr>
	
	<tr>
		<td>Gender</td>
		<td><s:property value="gender"/></td>
	</tr>
	
	<tr>
		<td>Date of Birth</td>
		<td><s:property value="dob"/></td>
	</tr>
	
	<tr>
		<td>Qualification</td>
		<td><s:property value="qualification"/></td>
	</tr>
	
	<tr>
		<td>Courses</td>
		<td><s:property value="courses"/></td>
	</tr>
	
	<tr>
		<td>Timings</td>
		<td><s:property value="timings"/></td>
	</tr>
	
	<tr>
		<td>Payment Option</td>
		<td><s:iterator value="paymentOption">
				<s:property/><br/>
			</s:iterator>
		</td>
	</tr>
	
	<tr>
		<td>How did You know about JLC ?</td>
		<td><s:property value="aboutus"/></td>
	</tr>
	
	<tr>
		<td>Required Technologies Left</td>
		<td><s:iterator value="reqTechsLeft">
				<s:property/><br/>
			</s:iterator>
		</td>
	</tr>
	
	<tr>
		<td>Required Technologies Right</td>
		<td><s:iterator value="reqTechsRight">
				<s:property/><br/>
			</s:iterator>
		</td>
	</tr>
	
	<tr>
		<td>Learning Order</td>
		<td><s:iterator value="learningOrder">
				<s:property/><br/>
			</s:iterator>
		</td>
	</tr>
	
	<tr>
		<td>Comments</td>
		<td><s:property value="comments"/></td>
	</tr>
	
	<tr>
		<td>Terms Acceptance</td>
		<td>
			<s:if test="%{termsAcceptance==true}">
				<div>Student has Accepted Terms</div>
			</s:if>
			
			<s:elseif test="%{termsAcceptance==false}">
				<div>Student has Not Accepted Terms</div>
			</s:elseif>
		</td>
	</tr>
	<tr>
		<td>Token</td>
		<td><s:property value="token"/></td>
	</tr>

</table>
</center>
</body>
</html>