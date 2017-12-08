<%@page import="com.chola.videogallery.model.videogallerypath"%>
<%@page import="com.chola.videogallery.service.videogallerypathLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>	

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<portlet:defineObjects />
<liferay-theme:defineObjects /> 

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
			ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	%>
	<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
	<%
	videogallerypath imageDetails = videogallerypathLocalServiceUtil.getvideogallerypath(Long.parseLong(id));
			
	%>
	<div>
	<video width="100%" controls>
 <source src="<%=imageDetails.getAlbumVideoPath()%>" type="video/mp4">
 
 </video></div>
	
<div>
<liferay-ui:ratings className="<%=videogallerypath.class.getName()%>"
		classPK="<%=imageDetails.getId()%>" numberOfStars="5" />

<liferay-ui:ratings className="<%=videogallerypath.class.getName()%>"
		classPK="<%=imageDetails.getId() %>" type="thumbs" />
		
<%-- <liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Video Gallery"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout)%>" /> --%>
		
		
	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(videogallerypath.class.getName()), imageDetails.getId(),
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
className="<%=videogallerypath.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>

</div>
</body>
</html>