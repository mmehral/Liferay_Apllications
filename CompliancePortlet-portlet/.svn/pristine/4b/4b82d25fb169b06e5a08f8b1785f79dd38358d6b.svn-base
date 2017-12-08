<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.service.compliance.service.complianceLocalServiceUtil"%>
<%@page import="com.service.compliance.model.compliance"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="javax.portlet.PortletURL"%>
<portlet:defineObjects/>

 <portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/jsp/addComplianceDetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="showjspURL1">
<portlet:param name="mvcPath" value="/jsp/editComplianceDetails.jsp" />
</portlet:renderURL>

<portlet:renderURL var="backURL">
<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<liferay-ui:header title="Compliance" backLabel="Back" backURL="<%=backURL.toString()%>" />

<a href="<%= showjspURL.toString() %>" >Add Compliance Details</a><hr>
<a href="<%= showjspURL1.toString() %>" >Edit Compliance Details</a>