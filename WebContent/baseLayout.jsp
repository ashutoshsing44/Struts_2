<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">1

<html>
    <head>
    <LINK REL="stylesheet" HREF="sheet.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>ABC</title>
    </head>
    <body>
                    <tiles:insertAttribute name="header" />
                    <tiles:insertAttribute name="body" />
                    <tiles:insertAttribute name="footer" />
         </body>
</html>
