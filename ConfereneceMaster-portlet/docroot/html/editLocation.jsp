<%@page import="com.chola.service.conference.service.stateLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.state"%>
<%@page import="com.chola.service.conference.service.locationLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.location"%>
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
List<location> list = (List<location>) locationLocalServiceUtil.getlocations(0, locationLocalServiceUtil.getlocationsCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/editDetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editLocation.jsp");
%>

<liferay-ui:header title="Show Location Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	<liferay-ui:search-container delta="3" total="<%=locationLocalServiceUtil.getlocationsCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
			
	
	<liferay-ui:search-container-row  modelVar="list1" className="location">
	
	<liferay-ui:search-container-column-text name="Location Name" property="location_name" />
	
	<%
	
	state lt = stateLocalServiceUtil.getstate(list1.getState_id());
	%>	
	
	<liferay-ui:search-container-column-text name="State Name" value="<%=lt.getState_name()%>" />
	
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editLocationMenu.jsp"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	
