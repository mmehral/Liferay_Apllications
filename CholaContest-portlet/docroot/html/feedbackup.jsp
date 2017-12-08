<%@page import="com.chola.contest.model.cholacontest"%>
<%@page import="com.chola.contest.service.cholacontestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page
	import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
	<portlet:defineObjects />
	<portlet:actionURL var="TextURL" name="getTextArea"></portlet:actionURL>
	<%
		String id = renderRequest.getParameter("id");
		System.out.println("ID========" + id);
		Integer contestval = cholacontestLocalServiceUtil.getContestType(id);
		System.out.println("#############" + contestval);
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	%>
	<%
		if (contestval == 1) {
	%>
	<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
	<%
		cholacontest cholapublic = cholacontestLocalServiceUtil.getcholacontest(Long.parseLong(id));
			System.out.print("DASDASDSADSADSADSADA");
			System.out.println("Chola....public===" + cholapublic);
	%>
	<table width="100%">
		<tr>
			<td colspan="2">Contest Description</td>
		</tr>
		<tr>
			<td colspan="2"><%=cholapublic.getContent()%> <br />
				<div style="float: right; padding-right: 10px">
					<%
						if (!cholapublic.getContest_doc().isEmpty()) {
					%>
					<a href="/contestUpload/<%=cholapublic.getContest_doc()%>"
						target="_blank">Click</a>
					<%
						}
					%>
				</div></td>
		</tr>
	</table>

	<liferay-ui:ratings className="<%=cholacontest.class.getName()%>"
		classPK="<%=cholapublic.getId()%>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(cholacontest.class.getName()), cholapublic.getId(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>
<liferay-ui:discussion 
classPK="<%=cholapublic.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=cholacontest.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>
	
	
	
	<%
		}
	%>
	<%
		if (contestval == 2) {
	%>
	Private============
	<%
		}
	%>

</body>
</html>