<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="liferay-portlet" %>

<%-- <liferay-portlet:renderURL varImpl="searchURL">
        <liferay-portlet:param name="mvcPath" value="/html/guestbook/view_search.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />

            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form> --%>

 <%@ include file="/html/portlet/test/init.jsp"%>

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
</div> --%>