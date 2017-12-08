<%@page import="com.service.cholatalkiespathLocalServiceUtil"%>
<%@page import="com.model.cholatalkiespath"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui" %>
<portlet:defineObjects/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/jsp/viewGallery.jsp" />
</portlet:renderURL> --%>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
<%
		String id = renderRequest.getParameter("id");
		System.out.println("ID========" + id);
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	%>
	<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
	<%
	cholatalkiespath imageDetails = cholatalkiespathLocalServiceUtil.getcholatalkiespath(Long.parseLong(id));
			
	%>
	<div>
	<video width="400" controls>
 <source src="/videoGalleryUpload/admin/<%=imageDetails.getVideoPath()%>" type="video/mp4">
 
 </video></div>
	
<div>
<liferay-ui:ratings className="<%=cholatalkiespath.class.getName()%>"
		classPK="<%=imageDetails.getId()%>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(cholatalkiespath.class.getName()), imageDetails.getId(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>
<liferay-ui:discussion 
classPK="<%=imageDetails.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=cholatalkiespath.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>

</div>
</body>
</html>