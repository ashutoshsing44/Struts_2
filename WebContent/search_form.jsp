<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div align="center">
<h2>Students Details</h2>
			
<s:form action="fetchStudentList" validate="true">
  <s:textfield name="firstName"  label="First Name" />
  <s:textfield name="lastName" label="Last Name" />
  <s:textfield name="cityName" label="City" />
  <s:textfield name="stateName"  label="State" />
  <s:submit> </s:submit>
  </s:form>
</div>
