<%@page import="com.service.compliance.model.compliance"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<% 
ResultRow row=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
compliance  com=(compliance)row.getObject();
%>
<%
PortletURL editURL=renderResponse.createRenderURL();
editURL.setParameter("complianceId", Long.toString(com.getCompliance_id()));
editURL.setParameter("jspPage", "/jsp/compliancedetailsupdatereference.jsp");

PortletURL deleteURL=renderResponse.createActionURL();
deleteURL.setParameter("complianceId", Long.toString(com.getCompliance_id()));
deleteURL.setParameter(actionRequest.ACTION_NAME, "deletecompliancedetailsreference");

%>
<liferay-ui:icon-menu>
<liferay-ui:icon  image="edit" message="Edit Compliance" url="<%=editURL.toString() %>"/>

<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" image="delete"
		message="Delete Compliance"></liferay-ui:icon-delete>
</liferay-ui:icon-menu>

</body>
</html>