<%@page import="com.jlc.to.*"%>
<html>
<body>
<%StudentTo sto=null; Object obj=request.getAttribute("STo");
if(obj!=null)
{sto=(StudentTo)obj;}
%>
<center>
<table width="100%" height="95%">
<tr valign="top" height="10%">
<td width="100%" align="center">&nbsp;<img alt="" src="JLCHeader.jpg"/><hr></td>
</tr>
<tr valign="middle"><td width="100%" align="center">
<table width="30%">
<tr>
<td align="center" colspan="2"><b><font color="black" size="6">Welcome</font>
<font color="red" size="5"><%=sto.getFname()%><%sto.getLname()%></font></b></td>
</tr>
<tr> 
<td><b><font color="blue" size="5">Username</font><b></td>s
<td><b><font size="5"><%sto.getUsername()%></font></b></td>
</tr>
<tr>
<td><b><font color="blue" size="5"><b>Email</b></font></td>
<td><b><font size="5"><%sto.getEmail()%></font></b></td>
</tr>
<tr>
<td><b><font color="blue" size="5"><b>Phone</b></font></td>
<td><b><font size="5"><%sto.getPhone()%></font></b></td>
</tr>
<tr>
<td><b><font color="blue" size="5"><b>Gender</b></font></td>
<td><b><font size="5"><%sto.getGender()%></font></b></td>
</tr>
<tr>
<td><b><font color="blue" size="5"><b>Qualification</b></font></td>
<td><b><font size="5"><%sto.getQualification()%></font></b></td>
</tr>
</table>
</td></tr>
<tr valign="bottom" height="4%">
<td width="100%" align="center"><hr><b>
<font color="red" size="5">All right reserved @ Java Learning Center</font></b>
</td></tr></table>
</center>
</body>
</html>