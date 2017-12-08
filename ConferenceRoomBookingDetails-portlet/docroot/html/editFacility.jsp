
<%@page import="com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.facilitymaster"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<script>
$(document).ready(function() {
	var stateid=$("#State Id").val();
	
	var state=$('.state').val();
	

})
</script>
<portlet:defineObjects/>
<%     


List<facilitymaster> list = (List<facilitymaster>) facilitymasterLocalServiceUtil.getfacilitymasters(0,facilitymasterLocalServiceUtil.getfacilitymastersCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/editDetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editFacility.jsp");
%>

<liferay-ui:header title="Show Facility Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	<liferay-ui:search-container delta="3" total="<%=facilitymasterLocalServiceUtil.getfacilitymastersCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
			
	
	<liferay-ui:search-container-row  modelVar="list1" className="facilitymaster">
	
	<liferay-ui:search-container-column-text name="Facility Name" property="facility_name" />
	
	<liferay-ui:search-container-column-text name="Facility Description" property="facility_description" />
	
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editFacilityMenu.jsp"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	
