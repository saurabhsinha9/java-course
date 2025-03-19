<%@ page language="java" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/techunt.tld" prefix="thunt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <html:base />
    
    <title>login.jsp</title>
 </head>
   <body>
  <!--<thunt:removeInfoFromSession info="SHOW_POST,UTO,QUESTION_LIST,START,END,TOTAL,SHOW_NEXT,SHOW_PREVIOUS,COMPANY,SEARCH_BY,TOPIC,DATE"/>
    --><table>
          <tr>
          <td>Login Form</td>
          <td><html:text property="login" /></td>
          <td><html:errors property="invalid" />${SESSION_ERROR}</td>
        </tr>
        <tr>
          <td>Username</td>
          <td><html:text property="username" /></td>
          <td><html:errors property="username" /></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><html:password property="password" /></td>
          <td><html:errors property="password" /></td>
        </tr>
        <tr>
          <td colspan="3" align="center"><html:submit value="Login Me" /></td>
        </tr>
        <tr>
          <td>NEW USER</td>
          
          <td><a href="showregistration.jsp">SignUp Here</a>  </td>
        </tr>
      </table>
 
  </body>
</html:html>
