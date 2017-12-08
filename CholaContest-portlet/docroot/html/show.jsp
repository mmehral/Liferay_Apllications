
<%@page import="com.chola.contest.model.cholacontest"%>
<%@page import="com.chola.contest.service.cholacontestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<%
		int count = cholacontestLocalServiceUtil.getcholacontestsCount();
		System.out.println("%%%%%" + count);
		List<cholacontest> list = (List<cholacontest>) cholacontestLocalServiceUtil.getcholacontests(0, count);
		System.out.println("%%%%%" + list);
	//	PortletURL backURL = renderResponse.createRenderURL();
	//	backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/show.jsp");
		
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");

	%>
<liferay-ui:header title="Show Contest"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	<liferay-ui:search-container delta="10"
	   total="<%=cholacontestLocalServiceUtil.getcholacontestsCount()%>"
		emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results 
			results="<%=ListUtil.subList(list, searchContainer.getStart(),
						searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row modelVar="list1" className="cholacontest">
    <liferay-ui:search-container-column-text name="Contest Title" property="contest_title" />    
	<liferay-ui:search-container-column-text name="Start Date" property="startdate" />
	<liferay-ui:search-container-column-text name="End Date" property="enddate" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editMenu.jsp"/>
			
	</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	