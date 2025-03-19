<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
 <title>Buid Your Project No.1 In Training And Placement</title>
<link rel="stylesheet" 
type="text/css" href="<%=request.getContextPath()%>/css/styles.css"/>
	<link rel="stylesheet" 
	type="text/css" href="<%=request.getContextPath()%>/css/indexstyle.css"/>

</head>
  
  <body alink="RED" vlink="#CC9900" link="#CC9900"  bgcolor="lightgray" >
  <center>
  <table align="center" width="95%" cellspacing="0" cellpadding="0" height="95%">
  <tr height="3px">
  <td colspan="2"><tiles:insert attribute="bvbHeader"/>
  </td>
  </tr>
  
  <tr height="98">
  <td align="center" colspan="2">
  <tiles:insert attribute="bvbBody"/>
  </td>
  </tr>
  
  <tr height="2px">
  <td colspan="2px" align="center"><hr />
  <tiles:insert attribute="bvbFooter"/>
  </td>
  </tr>
  </table>
  </center>
  </body>
</html>
