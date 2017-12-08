<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<portlet:actionURL var="TextURL" name="getTextArea"></portlet:actionURL>
<%
String id=renderRequest.getParameter("id");
System.out.println("ID========"+id);
%>
<form action="${TextURL}" method="post">
<input type="hidden" name="id" value="<%=id%>">

<table width="100%">
<tr>

				<td>FeedBack</td>
				<td><textarea rows="4" cols="100"
						name="<portlet:namespace/>feedback" style="width: 300px">
                         </textarea></td>
                         <tr>
			<td><input type="submit" 
				 value="Submit" /></td>
		</tr>



</table>



</form>
</body>
</html>