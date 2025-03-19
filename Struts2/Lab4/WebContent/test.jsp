		<%@ taglib uri="/struts-tags" prefix="s"%>


<html>
<head><s:head theme="ajax"/></head>
<body>
<center>
<br/>
<s:url id="hellourl" action="jlcindia/Hello.action"/>
<s:url id="haiurl" action="jlcindia/Hai.action"/>
<s:tabbedPanel id="test">
	<s:div id="one" label="Tab1" theme="ajax" labelposition="top">
		This is First Plane<br/>
		<s:form>
			<s:textfield name="tt" label="Test Text"/><br/>
			<s:textfield name="tt2" label="Test Text2"/>
			<s:submit/>
		</s:form>
	</s:div>
	
	<s:div id="two" label="Tab2" theme="ajax" href="%{hellourl}">
		This is the Remote Tab<br/>
	</s:div>
	
	<s:div id="three" label="Tab3" theme="ajax" href="%{haiurl}">
		This is Remote Tab<br/>
	</s:div>
	<s:div id="4" label="Tab4" theme="ajax">
		This is Remote Tab<br/>
	</s:div>
</s:tabbedPanel>
</center>
</body>
</html>