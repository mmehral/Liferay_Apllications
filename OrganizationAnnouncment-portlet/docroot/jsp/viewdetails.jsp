<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Organization Announcement Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

 <portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/jsp/addOrganizationdetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="showjspURL1">
<portlet:param name="mvcPath" value="/jsp/editOrganizationdetails.jsp" />
</portlet:renderURL>

<a href="<%= showjspURL.toString() %>" >Add Organization Announcement Details</a><br><br>
<a href="<%= showjspURL1.toString() %>" >Edit Organization Announcement Details</a><br>