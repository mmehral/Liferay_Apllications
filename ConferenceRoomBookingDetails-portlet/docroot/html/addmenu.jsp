<%@page import="javax.portlet.PortletURL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>   
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<portlet:defineObjects/>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Add Conference Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/addDetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="showjspURL1">
<portlet:param name="mvcPath" value="/html/editDetails.jsp" />
</portlet:renderURL>
<a href="<%= showjspURL.toString() %>" >Add Conference Details</a><hr>
<a href="<%= showjspURL1.toString() %>" >Edit Conference Details</a><hr>

</body>
</html>