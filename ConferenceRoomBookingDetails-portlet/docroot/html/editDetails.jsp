<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<portlet:renderURL var="facility">
<portlet:param name="mvcPath" value="/html/editFacility.jsp" />
</portlet:renderURL> 

<%-- <portlet:renderURL var="location">
<portlet:param name="mvcPath" value="/html/editLocation.jsp" />
</portlet:renderURL>  --%>

 <portlet:renderURL var="floor">
<portlet:param name="mvcPath" value="/html/editFloor.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="room">
<portlet:param name="mvcPath" value="/html/editRoom.jsp" />
</portlet:renderURL> 

 

<%
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Edit Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<a href="<%= facility.toString() %>" >Edit Facility Master</a><hr>
<%-- <a href="<%= location.toString() %>" >Edit Location Master</a><hr> --%>
<a href="<%= floor.toString() %>" >Edit Floor/Wing Master</a><hr>
<a href="<%= room.toString() %>" >Edit Room Master</a><hr>


