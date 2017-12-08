<%@page import="com.chola.quarterly.service.quarterlyreportsLocalServiceUtil"%>
<%@page import="com.chola.quarterly.model.quarterlyreports"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="updatequater">
<portlet:param name="jspPage" value="/jsp/addquarterly.jsp"/>
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
quarterlyreports pr = quarterlyreportsLocalServiceUtil.fetchquarterlyreports(1);
if((themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))||(themeDisplay.isSignedIn() && request.isUserInRole("Compliance Admin")))
{
%>
<a href="<%=updatequater%>">Update Quarterly Financials</a><hr>
<%
}
%>
<%=pr.getDetails()%>
