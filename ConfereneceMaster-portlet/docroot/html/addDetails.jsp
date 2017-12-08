<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<portlet:renderURL var="facility">
<portlet:param name="mvcPath" value="/html/addFacility.jsp" />
</portlet:renderURL> 

<portlet:renderURL var="location">
<portlet:param name="mvcPath" value="/html/addLocation.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="floor">
<portlet:param name="mvcPath" value="/html/addFloor.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="room">
<portlet:param name="mvcPath" value="/html/addRoom.jsp" />
</portlet:renderURL> 



<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Add Conference Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<a href="<%= facility.toString() %>" >Add Facility Master</a><hr>
<a href="<%= location.toString() %>" >Add Location Master</a><hr>
<a href="<%= floor.toString() %>" >Add Floor/Wing Master</a><hr>
<a href="<%= room.toString() %>" >Add Room Master</a><hr>
