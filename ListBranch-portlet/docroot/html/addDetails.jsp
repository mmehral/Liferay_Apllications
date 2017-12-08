<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

 <portlet:renderURL var="state">
<portlet:param name="mvcPath" value="/html/addState.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="city">
<portlet:param name="mvcPath" value="/html/addCity.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="branchdetails">
<portlet:param name="mvcPath" value="/html/addbranchdetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="branchproductmapping">
<portlet:param name="mvcPath" value="/html/addbranchproductmapping.jsp" />
</portlet:renderURL> 

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Add Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<a href="<%= city.toString() %>" >Add City</a><hr>
<a href="<%= state.toString() %>" >Add State</a><hr> 
<a href="<%= branchdetails.toString() %>" >Add Branch Details</a><hr>
<a href="<%= branchproductmapping.toString() %>" >Add Branch / Product Mapping</a><hr>