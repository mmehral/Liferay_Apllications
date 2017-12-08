<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<portlet:actionURL var="action" name="uploadFile"></portlet:actionURL>
<%
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (themeDisplay.isSignedIn()) {
		if (request.isUserInRole("Administrator")) {
%>

<form action="${action}" method="post" enctype="multipart/encrpt">
	Upload Holiday List <br>
	<input type="file" id="file" name="file" /><br> 
	<input type="submit" value="Upload" />
</form>
<%
	}
	}else{
%>

<%}%>