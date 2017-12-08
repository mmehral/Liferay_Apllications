<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="javax.portlet.PortletURL"%>
<portlet:defineObjects/>
<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/add.jsp");

PortletURL showURL=renderResponse.createRenderURL();
showURL.setParameter("jspPage", "/html/show.jsp");

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");

%>
  
    
<liferay-ui:header title="Show Chola live feed"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<a href="<%=addURL.toString()%>">Add today's Chola live feed</a><br>
<a href="<%=showURL.toString()%>">Edit today's Chola live feed</a>