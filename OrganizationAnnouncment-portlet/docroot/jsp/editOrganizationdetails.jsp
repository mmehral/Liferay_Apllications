<%@page import="com.organizationAnnouncement.service.organizationLocalServiceUtil"%>
<%@page import="com.organizationAnnouncement.model.organization"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<style>

#_OrganizationAnnouncment_WAR_OrganizationAnnouncmentportlet_INSTANCE_Z44vLJL9Ypp4_organizationsSearchContainer_col-title
{
width:200px;
}
#_OrganizationAnnouncment_WAR_OrganizationAnnouncmentportlet_INSTANCE_Z44vLJL9Ypp4_organizationsSearchContainer_col-image-name
{
width:200px;
}
</style>
<%
		
		List<organization> list = (List<organization>)organizationLocalServiceUtil.getorganizations(0, organizationLocalServiceUtil.getorganizationsCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/jsp/viewdetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/jsp/editOrganizationdetails.jsp");
%>
<liferay-ui:header title="Show Organization Announcement Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	
<%-- <liferay-ui:search-container delta="3" total="<%=organizationLocalServiceUtil.getorganizationsCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
						
	
	<liferay-ui:search-container-row  modelVar="list1" className="organization">
	
	
	<liferay-ui:search-container-column-text name="OrganiztionTite" property="organization_tite" />
	<liferay-ui:search-container-column-text name="Organiztion Description" property="organization_description" />
	<liferay-ui:search-container-column-text name="Organiztion Image" property="organization_image" />
	<liferay-ui:search-container-column-text name="Organiztion Image" ><a target="_blank" href="/OrganizationAnnouncementUpload/admin/<%=%>"><%=lb.getLbfilename()%></a></liferay-ui:search-container-column-text>
	
	<liferay-ui:search-container-column-jsp name="Actions" path="/jsp/editOrganizationdetailsMenu.jsp"/>
	</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container> --%>	
	
	
	
	<liferay-ui:search-container delta="5" deltaConfigurable="true" total="<%=list.size()%>" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.organizationAnnouncement.model.organization" keyProperty="lbId" modelVar="lb">

        <liferay-ui:search-container-column-text name="Title" value="${lb.organization_tite}" />
         <liferay-ui:search-container-column-text name="Description" value="${lb.organization_description}" />
        <liferay-ui:search-container-column-text name="Image Name" ><a target="_blank" href="/OrganizationAnnouncementUpload/admin/<%=lb.getOrganization_image_path()%>"><%=lb.getOrganization_image_name()%></a></liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-jsp name="Actions" path="/jsp/editOrganizationdetailsMenu.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
	