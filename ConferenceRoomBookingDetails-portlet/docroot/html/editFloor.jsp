<%@page import="com.chola.conferenceroombooking.service.cityLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.city"%>
<%@page import="com.chola.conferenceroombooking.service.locationLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.location"%>
<%@page import="com.chola.conferenceroombooking.service.stateLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.state"%>
<%@page import="com.chola.conferenceroombooking.service.floorwingLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.floorwing"%>
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
		
		List<floorwing> list = (List<floorwing>) floorwingLocalServiceUtil.getfloorwings(0, floorwingLocalServiceUtil.getfloorwingsCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/editDetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editFloor.jsp");
%>

<liferay-ui:header title="Show Floor/Wing Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	
<liferay-ui:search-container delta="3" total="<%=floorwingLocalServiceUtil.getfloorwingsCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
			
	
	<liferay-ui:search-container-row  modelVar="list1" className="floorwing">
	
	
	
	  <%
	state lt = stateLocalServiceUtil.getstate(list1.getState_id());
	System.out.print("lt......................"+lt);
	%>	
		<%
  /* city ln = locationLocalServiceUtil.getlocationname(list1.getLocation_id()); */ 
		city ln = cityLocalServiceUtil.getcity(list1.getLocation_id());
		System.out.print("ln......................"+ln.getCity_name()); 
	%> 
	<liferay-ui:search-container-column-text name="State Name" value="<%=lt.getState_name()%>" />
	
 
	<liferay-ui:search-container-column-text name="Location Name" value="<%=ln.getCity_name()%>" />
	 <%-- <liferay-ui:search-container-column-text name="Location Name" value="<%=ln.getCity_name())%>" /> --%>  
	
	<liferay-ui:search-container-column-text name="Floor Name" property="floor_name" />
	
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editFloorMenu.jsp"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	