<%@page import="com.contest.model.CholaContest"%>
<%@page import="com.contest.service.CholaContestLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	/**
	 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui" %>
<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/add.jsp");
%>

<%
		int count = CholaContestLocalServiceUtil.getCholaContestsCount();
		System.out.println("%%%%%" + count);
		List<CholaContest> list = (List<CholaContest>) CholaContestLocalServiceUtil.getCholaContests(0, count);
		System.out.println("%%%%%" + list);
	//	PortletURL backURL = renderResponse.createRenderURL();
	//	backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/view.jsp");
	%>
<%
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (themeDisplay.isSignedIn()) {
		if (request.isUserInRole("Administrator")) {
%>
<a href="<%=addURL.toString()%>">Add</a>


<%
	}%>
	
<%-- <portlet:renderURL var="ContestURL" >

<portlet:param name="mvcPath" value="/html/details.jsp"/>
</portlet:renderURL>	
<%for(CholaContest c : list){ %>

<a href="<%=ContestURL.toString()%>&contestId=<%=c.getId()%>" ><%=c.getContent() %></a><br/>
<%} %>--%>

<liferay-ui:search-container delta="10"
	   total="<%=CholaContestLocalServiceUtil.getCholaContestsCount()%>"
		emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results 
			results="<%=ListUtil.subList(list, searchContainer.getStart(),
						searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row modelVar="list1" className="CholaContest">
    <liferay-ui:search-container-column-text name="Contest" property="content" />
	<liferay-ui:search-container-column-text name="Start Date" property="startdate" />
	<liferay-ui:search-container-column-text name="End Date" property="enddate" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editMenu.jsp"/>
			
	</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	



<%	}
%> 



