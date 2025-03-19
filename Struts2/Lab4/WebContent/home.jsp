	<%@ taglib uri="/struts-tags" prefix="s"%>


<html>
<body>
<center>
<br/>
	<s:if test="#{flag1}">
	<h3>Flag1 value is true</h3>
	</s:if>
	<s:else>
	<h3>Flag1 value is false</h3>
	</s:else>

	<s:if test="#{flag2}">
	<h3>Flag2 value is true</h3>
	</s:if>
	<s:else>
	<h3>Flag2 value is false</h3>
	</s:else>
	
	<hr/>
	<h3>
		<s:iterator value="courses">
			<s:property/>
		</s:iterator>
	</h3>
	
	<hr/>
	<h3>
		<s:subset count="5" source="courses" start="2">
			<s:iterator>
				<s:property/>
			</s:iterator>
		</s:subset>	
	</h3>
	
	<hr/>
	<h3>
		<s:iterator id="x" value="colors">
			<s:property value="x"/>
		</s:iterator>
	</h3>
	
	<hr/>
	<h3>
		<s:append id="mylist">
			<s:param value="%{colors}"/>
			<s:param value="%{courses}"/>
		</s:append>
		<s:iterator value="%{#mylist}">
			<s:property/>
		</s:iterator>
	</h3>
	
	<hr/>
	<h3>
		<s:merge id="mylist1">
			<s:param value="%{colors}"/>
			<s:param value="%{courses}"/>
		</s:merge>
		<s:iterator value="%{#mylist1}">
			<s:property/>
		</s:iterator>
	</h3>
	
	<h3>
		<s:generator separator="," val="%{'aaaa,bbbb,cccc,dddd,eeee'}" count="3">
		<s:iterator>
			<s:property/><br/>
		</s:iterator>
		</s:generator>
		
		<s:url id="testurl" action="jlcindia/Test.action"/>
		
		<s:a href="%{testurl}">Click Here</s:a><br/>
	</h3>
	
	<h3>
		<s:checkboxlist name="colors" label="Select Colors" list="colors"/><br/>
		<s:checkboxlist name="courses" label="Select Courses" list="courses"/><br/>
		<s:select name="colors" label="Select Colors" list="colors" multiple="true"/><br/>
		<s:select name="courses" label="Select Courses" list="courses" multiple="false"/><br/>
	</h3>
</center>
</body>
</html>