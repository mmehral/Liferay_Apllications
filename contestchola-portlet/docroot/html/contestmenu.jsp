<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="javax.portlet.PortletURL"%>

<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/add.jsp");

PortletURL showURL=renderResponse.createRenderURL();
showURL.setParameter("jspPage", "/html/show.jsp");

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");

%>
<liferay-ui:header title="Show Contest"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<a href="<%=addURL.toString()%>">Add Contest</a><br>
<a href="<%=showURL.toString()%>">Edit Contest</a>