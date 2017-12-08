<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>SearchPractice</b> portlet.

<%    
	PortletURL viewPageURL = renderResponse.createActionURL();
	viewPageURL.setParameter("_spage", "/portlet_action/test/addView");
	viewPageURL.setParameter("urlType", "Action");
	viewPageURL.setWindowState(WindowState.NORMAL);
	
	
	PortletURL renderPageUrl = renderResponse.createActionURL();
	renderPageUrl.setParameter("_spage", "/portlet_action/test/searchPage");
	renderPageUrl.setParameter("urlType", "Action");
	renderPageUrl.setWindowState(WindowState.NORMAL);
%>


<form name="myform" action="<%= viewPageURL%>" method="post">

	<table style="border-spacing: 10px 10px; border-collapse: separate;">
		<tr>

			<td>Username :</td>
			<td><input type="text" name="<portlet:namespace/>userName" value=""/></td>
		</tr>
		<tr>
			<td>Title :</td>
			<td><input type="text" name="<portlet:namespace/>title" /></td>
		</tr>
		<tr>
			<td>Content :</td>
			<td><input type="text" name="<portlet:namespace/>content" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit"></td>
		</tr>

	</table>
</form>

<div align="left">
	<a href="<%=renderPageUrl%>">Search Page</a>
</div>