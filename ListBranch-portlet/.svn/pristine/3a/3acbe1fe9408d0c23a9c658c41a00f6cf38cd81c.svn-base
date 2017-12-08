<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<portlet:renderURL var="state">
<portlet:param name="mvcPath" value="/html/editState.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="city">
<portlet:param name="mvcPath" value="/html/editCity.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="branchdetails">
<portlet:param name="mvcPath" value="/html/editbranchdetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="branchproductmapping">
<portlet:param name="mvcPath" value="/html/editbranchmapping.jsp" />
</portlet:renderURL> 

<%
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Edit Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<a href="<%= city.toString() %>" >Edit City</a><hr>
<a href="<%= state.toString() %>" >Edit State</a><hr>
<a href="<%= branchdetails.toString() %>" >Edit Branch Details</a><hr>
<a href="<%= branchproductmapping.toString() %>" >Edit Branch / Product Mapping</a><hr>