<%@ page language="java" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>Login Form</title>
 </head>
   <body>
   <center>
  
  <table>
         <html:form action="login.do">  
        <tr>
          <td>Username</td>
          <td><html:text property="username" /></td>
          </tr>
        <tr>
          <td>Password</td>
          <td><html:password property="password" /></td>
          </tr>
        <tr>
          <td colspan="3" align="center"><html:submit value="Login Me" /></td>
        </tr>
        <tr>
          <td>NEW USER</td>
          
          <td><a href="showregistration.do">SignUp Here</a>  </td>
        </tr>
         </html:form>
      </table>

 </center>
  </body>
</html>
