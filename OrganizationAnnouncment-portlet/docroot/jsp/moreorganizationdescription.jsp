<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.organizationAnnouncement.service.organizationLocalServiceUtil"%>
<%@page import="com.organizationAnnouncement.model.organization"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Back" backLabel="Back" backURL="<%=backURL.toString()%>" />
<%
ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

String organizationId = renderRequest.getParameter("organizationId");
organization cp=organizationLocalServiceUtil.fetchorganization(Long.parseLong(organizationId));

String organizationDesc=cp.getOrganization_description();
String organizationImage=cp.getOrganization_image_path();
%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head">ORGANIZAITION &nbsp;<span class="abt_text_headcol">ANNOUNCEMENTS</span></span>
          <div class="row con_main_panel">
          <%=organizationDesc %><br><br>
<%
if (!organizationImage.isEmpty()) {
%>
<a href="/OrganizationAnnouncementUpload/admin/<%=organizationImage%>" target="_blank"><%=cp.getOrganization_image_name()%></a>
<%
}
%>
</div>
</div>
</div>
</div>
</div>
<div class="comment">
<liferay-ui:ratings className="<%=organization.class.getName()%>"
		classPK="<%=cp.getOrganization_id() %>" type="thumbs" />
		
<liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Organisation Announcements"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout)%>" />
		
<liferay-ui:ratings className="<%=organization.class.getName()%>"
		classPK="<%=cp.getOrganization_id() %>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(organization.class.getName()),cp.getOrganization_id(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>

<liferay-ui:discussion 
classPK="<%=cp.getOrganization_id() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=organization.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>