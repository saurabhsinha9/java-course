<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
    
<html><body>
   <table width="99%" height="99%" bgcolor="#c3d599">
    <tr height="10%">
    <td colspan="2" align="center">
    <tiles:insert attribute="HEADER"/>
    </td>
    </tr>
    
    <tr height="85%">
    <td width="18%" valign="top">
    <tiles:insert attribute="VMENU"/>
    </td>
    <td width="66%" valign="top">
    <tiles:insert attribute="BODY"/>
    </td>
    
    </tr>
    
    <tr height="5%">
    <td colspan="2" align="center">
    <tiles:insert attribute="FOOTER"/>
    </td>
    </tr>
    
 </table></body>
    </html>
    