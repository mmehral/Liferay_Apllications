<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<portlet:defineObjects/>

 <portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/addDetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="showjspURL1">
<portlet:param name="mvcPath" value="/html/editDetails.jsp" />
</portlet:renderURL>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
if(themeDisplay.isSignedIn() && (request.isUserInRole("Administrator") || request.isUserInRole("Compliance Admin")))
{
%>
<a href="<%= showjspURL.toString() %>" >Add Branch Details</a><br><br>
<a href="<%= showjspURL1.toString() %>" >Edit Branch Details</a><br>
<%
}
%>