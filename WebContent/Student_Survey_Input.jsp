<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<style type="text/css">
.odd
{
background-color: silver;
}
.even
{
background-color: white;
}
</style>
<link href="default.css" rel="stylesheet" type="text/css" />

			<h2>Students Details</h2>
			
<s:form action="getSuccessPage" validate="true">
  <s:textfield name="firstName" required="true" label="First Name" />
  <s:textfield name="lastName" label="Last Name"  required="true"/>
  
  <s:textfield name="cityName" label="City" />
  <s:textfield name="stateName" required="true" label="State" />
  <s:textfield name="zipCode" label="Zip Code" />
  
  <s:textfield name="telephoneNumber" label="Phone no" />
  <s:textfield name="email_id" label="e Mail" />
  
  

<s:checkboxlist name="plusPoint"
 label="What do you like the most about the University ?" list="{'Campus','Students','Atmosphere','Location'}" />
<s:select name="recommend" label="recommend" list="{'Select','Very Likely','Likely','Unlikely'}"  />

	<br>
		Feel free to leave a feedback to help us get better!
		<s:textarea name="description" style="width:200px;height:150px" label="Description : "  cols="40" rows="10" />
 <s:submit> </s:submit>
  </s:form>


