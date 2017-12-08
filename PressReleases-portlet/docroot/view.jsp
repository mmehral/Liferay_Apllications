<%@page import="com.chola.pressrelease.service.pressreleaseLocalServiceUtil"%>
<%@page import="com.chola.pressrelease.model.pressrelease"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="updatepress">
<portlet:param name="jspPage" value="/jsp/addpressrelease.jsp"/>
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
pressrelease pr = pressreleaseLocalServiceUtil.fetchpressrelease(1);
if((themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))||(themeDisplay.isSignedIn() && request.isUserInRole("Marketing Admin")))
{
%>
<a href="<%=updatepress%>">Update Press Release</a><hr>
<%
}
%>
<%=pr.getDetails()%>
