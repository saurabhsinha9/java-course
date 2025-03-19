<%@ taglib uri="/WEB-INF/jlc.tld" prefix="jlc"%>

<jlc:set name="sid" value="99" scope="session"/>
<jlc:set name="sname" value="sri"/>
<br/>Sid:<jlc:out name="sid" scope="session"/>
<br/>Sname:<jlc:out name="sname" scope=""/>
<br/>Sname:<jlc:out name="sname" scope="request"/>
 <jlc:remove name="sname"/>
<jlc:remove name="sid"/>
<br/>Sid:<jlc:out name="sid" scope="session"/>
<br/>Sname:<jlc:out name="sname"/> 