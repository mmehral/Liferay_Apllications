<%@page import="com.service.compliance.service.complianceLocalServiceUtil"%>
<%@page import="com.service.compliance.model.compliance"%>
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
#_CompliancePortlet_WAR_CompliancePortletportlet_INSTANCE_xHZ7OuXpoJZu_compliancesSearchContainer_col-compliance_tite{
width:200px;
}
#_CompliancePortlet_WAR_CompliancePortletportlet_INSTANCE_xHZ7OuXpoJZu_compliancesSearchContainer_col-compliance-shortdescription{
width:200px;
}
</style>
<%
		List<compliance> list = (List<compliance>)complianceLocalServiceUtil.getcompliances(0, complianceLocalServiceUtil.getcompliancesCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/jsp/viewdetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/jsp/editComplianceDetails.jsp");
%>
<liferay-ui:header title="Show Compliance Details" backLabel="Back" backURL="<%=backURL.toString()%>" />
	
<liferay-ui:search-container delta="3" total="<%=complianceLocalServiceUtil.getcompliancesCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
	    <liferay-ui:search-container-row className="com.service.compliance.model.compliance" keyProperty="lbId" modelVar="lb">
	<liferay-ui:search-container-column-text name="Title" value="${lb.compliance_tite}" />
	<liferay-ui:search-container-column-text name="Short Description" value="${lb.compliance_shortdescription}"  />
	<liferay-ui:search-container-column-text name="Description" value="${lb.compliance_description}" />
	<liferay-ui:search-container-column-text name="Image Name" ><a target="_blank" href="/ComplianceUpload/admin/<%=lb.getCompliance_document_path()%>"><%=lb.getCompliance_document_name()%></a></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-jsp name="Actions" path="/jsp/editcompliancedetailsMenu.jsp"/>
	</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	