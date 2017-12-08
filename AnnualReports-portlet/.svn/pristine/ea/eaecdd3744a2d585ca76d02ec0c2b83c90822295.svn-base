<%@page import="com.chola.annual.service.annualreportsLocalServiceUtil"%>
<%@page import="com.chola.annual.model.annualreports"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="updateannual">
<portlet:param name="jspPage" value="/jsp/addannualreports.jsp"/>
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
annualreports pr = annualreportsLocalServiceUtil.fetchannualreports(1);
if(themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))
{
%>
<a href="<%=updateannual%>">Update Annual Reports</a><hr>
<%
}
%>
<%=pr.getDetails()%>
