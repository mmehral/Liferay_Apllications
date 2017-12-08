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
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/contestmenu.jsp");
%>

<%
		int count = CholaContestLocalServiceUtil.getCholaContestsCount();
		System.out.println("%%%%%" + count);
		List<Object[]> list =  CholaContestLocalServiceUtil.ContestList();
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
	
<portlet:renderURL var="ContestURL" >

<portlet:param name="mvcPath" value="/html/details.jsp"/>
</portlet:renderURL>	
<%for(CholaContest c : list){ %>

<a href="<%=ContestURL.toString()%>&contestId=<%=c.getId()%>" ><%=c.getContent() %></a><br/>
<%} %>

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

 <%if(list.size()!=0){ %>
<table width=100%>

<tr style="background-color:  #85c1e9;  font-size: 14px;text-align: center;font-weight: bold;">
<th style="text-align: center;font-weight: bold;">Contest Title</th>
<th style="text-align: center;font-weight: bold;">Contest Description</th>
<th style="text-align: center;font-weight: bold;">Feed Back</th>
</tr>

<%for(Object[] c : list){ %>

<tr>
<td style="padding-left: 8px;"><%=c[2] %></td>
<td style="padding-left: 8px;"><%=c[1] %></td>
<td style="padding-left: 8px;">
<portlet:renderURL var="feedURL">
<portlet:param name="id" value="<%=String.valueOf(c[0]) %>"/>
<portlet:param name="mvcPath" value="/html/feedback.jsp"/>
</portlet:renderURL>
<a href="${feedURL}">click</a>

</td>
</tr>

<%} %>

</table>
<%}else{ %>
<table width=100%>
<tr style="background-color:  #85c1e9;  font-size: 14px;text-align: center;font-weight: bold;">
<th colspan="3">Right Now there is no contest</th>
</tr>
</table>
<%} %>
<%}%> 
