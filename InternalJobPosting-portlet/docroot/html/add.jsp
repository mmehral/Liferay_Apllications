<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<%@page import="javax.portlet.PortletURL"%>

<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/email.jsp");

PortletURL showURL=renderResponse.createRenderURL();
showURL.setParameter("jspPage", "/html/edit.jsp");

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Show InternalRefferal Details"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<a href="<%=addURL.toString()%>">Add InternalJob</a><br>
<a href="<%=showURL.toString()%>">Edit InternalJob</a>