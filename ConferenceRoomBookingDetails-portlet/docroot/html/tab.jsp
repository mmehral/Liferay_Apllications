<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<portlet:renderURL var="tabURL"/>
 
<%
String tab = ParamUtil.getString(request, "tabs1","New Booking");
%>
 
<liferay-ui:tabs names="New Booking,My Booking,All Booking" url="<%=tabURL.toString()%>" >
 
<c:if test='<%= tab.equalsIgnoreCase("New Booking")%>' >
<jsp:include page="/html/view.jsp" flush="true" />
</c:if>
 
<c:if test='<%= tab.equalsIgnoreCase("My Booking")%>' >
<jsp:include page="/html/mybooking.jsp"flush="true" />
</c:if>
 
<c:if test='<%= tab.equalsIgnoreCase("All Booking")%>' >
<jsp:include page="/html/allbookinglist.jsp" flush="true" />
</c:if>
 
</liferay-ui:tabs>
</body>
</html>