
<%@page import="com.chola.swagatam.model.swagatam"%>
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
swagatam  ref=(swagatam)row.getObject();
%>
<%
PortletURL editURL=renderResponse.createRenderURL();
editURL.setParameter("id", Long.toString(ref.getId()));
editURL.setParameter("jspPage", "/jsp/updateInductionDetails.jsp");

%>
<liferay-ui:icon-menu>
<liferay-ui:icon  image="edit" message="Edit Induction Details" url="<%=editURL.toString() %>"/>
</liferay-ui:icon-menu>

</body>
</html>