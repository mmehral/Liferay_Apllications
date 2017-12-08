<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="portlet"  uri="http://java.sun.com/portlet_2_0"%>
<portlet:defineObjects/>
POp........
<%
String id=request.getParameter("val");
System.out.println("Pop up......value====="+id);
%>
</body>
</html>