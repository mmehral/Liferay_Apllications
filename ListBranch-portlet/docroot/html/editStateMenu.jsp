

<%@page import="com.chola.listbranch.model.state"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
ResultRow row=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
state  ref=(state)row.getObject();
%>
<%
PortletURL editURL=renderResponse.createRenderURL();
editURL.setParameter("stateId", Long.toString(ref.getState_id()));
editURL.setParameter("jspPage", "/html/stateupdatereference.jsp");

PortletURL deleteURL=renderResponse.createActionURL();
deleteURL.setParameter("stateId", Long.toString(ref.getState_id()));
deleteURL.setParameter(actionRequest.ACTION_NAME, "deletestatereference");

%>
<liferay-ui:icon-menu>
<liferay-ui:icon  image="edit" message="Edit" url="<%=editURL.toString() %>"/>

<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" image="delete"
		message="Delete"></liferay-ui:icon-delete>
</liferay-ui:icon-menu>

</body>
</html>