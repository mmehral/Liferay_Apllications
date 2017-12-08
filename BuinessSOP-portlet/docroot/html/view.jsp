<%@page import="com.chola.business.service.businesssopusersLocalServiceUtil"%>
<%@page import="com.chola.business.model.businesssopusers"%>
<%@page import="com.chola.business.service.businesssoppathLocalServiceUtil"%>
<%@page import="com.chola.business.model.businesssoppath"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.business.service.businesssopDetailsLocalServiceUtil"%>
<%@page import="com.chola.business.model.businesssopDetails"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<portlet:renderURL var="addSop">
   <portlet:param name="jspPage" value="/html/businessSOP.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updateSop">
   <portlet:param name="jspPage" value="/html/updatesop.jsp" />
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator"))
	{
%>
<a href="<%=addSop%>">Add a SOP</a><br>
<a href="<%=updateSop%>">Update or Delete a SOP</a><br>
<%
	}
%>
	<br><br>Business Sop's 
<%

	List<businesssopDetails> busDetails = businesssopDetailsLocalServiceUtil.getbusinesssopDetailses(0, businesssopDetailsLocalServiceUtil.getbusinesssopDetailsesCount());
	
	for(businesssopDetails details : busDetails)
	{
		List<businesssopusers> busUsersList = businesssopusersLocalServiceUtil.getSOPdocuments(details.getId());
		for(businesssopusers busUsers : busUsersList)
		{
		if(details.getFlag().equalsIgnoreCase("1") && (busUsers.getUser_id()==themeDisplay.getUserId() || details.getCreatedBy().equalsIgnoreCase(String.valueOf(themeDisplay.getUserId()))))
		{
		%>
		<hr>Title : <%=details.getBusinesstitle() %><br>
		Description : <%=details.getBusinessDesc() %><br>
		Documents : 
		<%
		List<businesssoppath> sopPath = businesssoppathLocalServiceUtil.getSOPdocuments(details.getId());
		for(businesssoppath path :sopPath)
		{
		%>
		<a target="_blank" href="/BusinessSopUpload/admin/<%=path.getBusinessdoc() %>"><%=path.getBusinessdoc() %></a><br>
		<%
		}
		}
		}
	}
}
%>
</body>
</html>