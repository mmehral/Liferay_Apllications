<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.service.compliance.service.complianceLocalServiceUtil"%>
<%@page import="com.service.compliance.model.compliance"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>	
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />


<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Back" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<%
String complianceId = renderRequest.getParameter("complianceId");

compliance cp=complianceLocalServiceUtil.fetchcompliance(Long.parseLong(complianceId));

String complianceDesc=cp.getCompliance_description();
String compliancedocument=cp.getCompliance_document_path();
String complianceextension=cp.getCompliance_document_extension();
%>
<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> COMPLIANCE <span class="abt_text_headcol">NOTICE BOARD</span></span>
          <div class="row con_main_panel">
		  <%
		  if(!compliancedocument.isEmpty())
		  {
if (complianceextension.equals("jpg")||complianceextension.equals("jpeg")||complianceextension.equals("gif")||complianceextension.equals("png")||complianceextension.equals("tif")) 
{
%>
<img class="pht_fixed img-responsive" src="/ComplianceUpload/admin/<%=compliancedocument%>"/>
<%
}else
{%>
<a href="/ComplianceUpload/admin/<%=compliancedocument%>" target="_blank"/><%=compliancedocument%></a>
<%}
}
%><br><br>
		  <%=complianceDesc %>
		  </div>
		  </div>
		  </div>
		  </div>
		  </div>
		  
		    <div class="comment">
<liferay-ui:ratings className="<%=compliance.class.getName()%>"
		classPK="<%=cp.getCompliance_id() %>" type="thumbs" />
		
<liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Compliance Portal"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout)%>" />
		
<liferay-ui:ratings className="<%=compliance.class.getName()%>"
		classPK="<%=cp.getCompliance_id() %>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(compliance.class.getName()), cp.getCompliance_id(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>

<liferay-ui:discussion 
classPK="<%=cp.getCompliance_id() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=compliance.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"

/>
</div>