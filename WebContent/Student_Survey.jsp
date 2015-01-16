<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<title>Students Details</title> 


			<h2>Students Details</h2>
			<table>
<tr>
<td width="10%">Survey Id </td>
    <td width="10%">First Name</td>
    <td width="10%">Last Name</td>
    <td width="10%" >City Name</td>
    <td width="10%">State</td>
    <td width="10%">Phone No</td>
    <td width="20%">Interest</td>
        <td width="10%" >Plus Point</td>
    <td width="20%" >Comments</td>
    </tr>
    
<s:iterator value="students" status="rowstatus">
<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
 
    <td><s:property value="#rowstatus.count"/></td>
     <td width="10%"><s:property value="firstName"/></td>
     <s:hidden name="survey_id"   /> 
     <td width="10%"><s:property value="lastName" /></td>
     <td width="10%" ><s:property value="cityName"/></td>
     <td width="10%"><s:property value="stateName"/></td>
     <td width="10%"><s:property value="telephoneNumber"/></td>
     <td width="5%"><s:property value="plusPoint"/></td>
     <td width="20%"><s:property value="description"/></td>
      <td width="20%">
      
      <s:url id="url" action="deleteRecord" >
           <s:param name="survey_id"><s:property value="survey_id" /></s:param>
         </s:url>
         <s:a href="%{url}">Delete Record</s:a></td>
       
    
</tr> 
</s:iterator>


</table>
<s:label key="name"></s:label>

