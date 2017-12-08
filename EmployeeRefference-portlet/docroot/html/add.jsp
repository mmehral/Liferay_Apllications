<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/email.jsp");

PortletURL showURL=renderResponse.createRenderURL();
showURL.setParameter("jspPage", "/html/edit.jsp");

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");

%>
<liferay-ui:header title="Show Referal Details"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<a href="<%=addURL.toString()%>">Add Description</a><br>
<a href="<%=showURL.toString()%>">Edit Description</a>