<%@page import="com.service.model.newhire"%>
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
newhire  com=(newhire)row.getObject();
%>
<%
PortletURL editURL=renderResponse.createRenderURL();
editURL.setParameter("newhireId", Long.toString(com.getNewhire_id()));
editURL.setParameter("jspPage", "/jsp/newhiredetailsupdatereference.jsp");

PortletURL deleteURL=renderResponse.createActionURL();
deleteURL.setParameter("newhireId", Long.toString(com.getNewhire_id()));
deleteURL.setParameter(actionRequest.ACTION_NAME, "deletenewhiredetailsreference");

%>
<liferay-ui:icon-menu>
<liferay-ui:icon  image="edit" message="Edit NewHire" url="<%=editURL.toString() %>"/>

<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" image="delete"
		message="Delete NewHire"></liferay-ui:icon-delete>
</liferay-ui:icon-menu>

</body>
</html>