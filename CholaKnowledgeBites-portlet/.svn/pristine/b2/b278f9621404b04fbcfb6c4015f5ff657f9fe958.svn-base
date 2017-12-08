
<%@page import="com.chola.knowledgebites.model.kbdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<head>
</head>
<body>
<% 
ResultRow row=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
kbdetails  lbDetails =(kbdetails)row.getObject();
%>
<%
PortletURL editURL=renderResponse.createRenderURL();
editURL.setParameter("id", Long.toString(lbDetails.getId()));
editURL.setParameter("jspPage", "/html/updatedetails.jsp");

PortletURL deleteURL=renderResponse.createActionURL();
deleteURL.setParameter("id", Long.toString(lbDetails.getId()));
deleteURL.setParameter(actionRequest.ACTION_NAME, "deleteKB");

%>
<liferay-ui:icon-menu>
<liferay-ui:icon  image="edit" message="Edit" url="<%=editURL.toString() %>"/>
<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" image="delete" message="Delete"/>
</liferay-ui:icon-menu>

</body>
</html>