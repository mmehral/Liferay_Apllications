<%@page import="com.chola.listbranch.model.state"%>
<%@page import="com.chola.listbranch.service.stateLocalServiceUtil"%>
<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.city"%>
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
		List<city> list = (List<city>) cityLocalServiceUtil.getcities(0, cityLocalServiceUtil.getcitiesCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editCity.jsp");
%>

<liferay-ui:header title="Show City Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	
<liferay-ui:search-container delta="3" total="<%=cityLocalServiceUtil.getcitiesCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
			
	
	<liferay-ui:search-container-row  modelVar="list1" className="city">
	
	<liferay-ui:search-container-column-text name="City Name" property="city_name" />
	
	<%
	state lt = stateLocalServiceUtil.getstate(list1.getState_id());
	%>	
	
	<liferay-ui:search-container-column-text name="State Name" value="<%=lt.getState_name()%>" />
	
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editCityMenu.jsp"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	