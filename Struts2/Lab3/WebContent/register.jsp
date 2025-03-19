<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<title>Registration Application</title>
<s:head theme="ajax"/>
</head>
<body>
<center>
<h1>Registration Form</h1>
<s:actionerror/>

<s:form action="Register">
<table width="100%" bgcolor="#c35d99">
	<tr>
		<td>
			<table width="100%">
				<tr>
					<td>
						<s:hidden name="code" value="JLC-99"/>
						<s:label key="Batch Id"/>
						<s:combobox name="batchId"
									list="{'B16','B17','B18','B19'}" 
									headerKey="-1" 
									headerValue="Select Your Batch"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:label key="Student Id"/>
						<s:textfield name="sid"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:textfield name="fname" label="Full Name"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:textfield name="uname" label="UserName"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:password name="pword" label="Password"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:textfield name="email" label="Email"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:textfield name="phone" label="Phone"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:radio name="gender" 
								 label="Gender" 
								 list="#{'male':'Male','female':'Female'}"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:datetimepicker name="dob" label="Date of Birth[dd-mm-yyyy]"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:select name="qualification"
								  label="Qualification" 
								  list="{'Select','BE/B.Tech','B.Sc','ME/M.Tech','M.Sc','M.Sc','MCA'}"
								  multiple="false"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:select name="courses"
								  label="Courses" 
								  list="%{#{'J2SE':'J2SE','J2ME':'J2ME'}}">
								  
							<s:optgroup label="Technologies"
										list="%{#{'JDBC':'JDBC','JSP':'JSP','Servlets':'Servlets','EJB':'EJB'}}"/>
											  
							<s:optgroup label="Frameworks"
										list="%{#{'Struts':'Struts','Hibernate':'Hibernate','JSF':'JSF','Spring':'Spring'}}"/>	  
						</s:select>		 
					</td>
				</tr>
				
				<tr>
					<td>
						<s:doubleselect name="timings"
										label="Timings"
										list="{'Weekdays','Weekends'}" 
										doubleName="timecourses" 
										doubleList="top=='Weekdays'?{'J2SE','J2ME'}:{'Hibernate','Spring','JSF','WebServices','Flex'}"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:checkboxlist name="paymentOption"
										label="Payment Option"
										list="{'Cash','Cheque','Card'}"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:autocompleter labelposition="left"
										 showDownArrow="false"
										 label="How did You know about JLC ?"
										 list="{'From Friend','By Walk-In to JlC','From Internet surfing','By Seeing JLC Board'}"
										 name="aboutus"/>
					</td>
				</tr>
			</table>
		</td>
		
		<td>
			<table width="100%">
				<tr>
					<td>
						<s:optiontransferselect label="Required Technologies"
												name="reqTechsLeft"
												list="{'Struts','Hibernate','JSF','WebServices'
														,'EJB','JPA'}"
												doubleName="reqTechsRight"
												doubleList="{'Spring','Adobe Flex','XML'}"/>
					</td>
				</tr>
				
				<tr>
					<td>
						
					</td>
				</tr>
				
				<tr>
					<td>
						<s:updownselect list="#{'J2SE':'J2SE','Technologies':'Technologies',
												'Frameworks':'Frameworks'}"
										name="learningOrder"
										headerKey="-1"
										headerValue="---Please Order---"
										emptyOption="true"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:textarea name="comments"
									label="Comments"
									cols="15"
									rows="3"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<s:checkbox name="termsAcceptance"
									label="I accept the Terms &amps; Conditions of JLC"
									fieldValue="true"/>
						<s:token name="token"/>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	
	<tr width="100%">
		<td width="50%">
			<s:submit/>
		</td>
		
		<td width="50%">
			<s:reset/>
		</td>
	</tr>
</table>
</s:form>
</center>
</body>
</html>
