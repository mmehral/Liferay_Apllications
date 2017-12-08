<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.action.ContestMainAction"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.contest.service.cholacontestLocalServiceUtil"%>
<%@page import="com.chola.contest.model.cholacontest"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
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
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<body>


	<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
	<portlet:defineObjects />
	
	<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>



<liferay-ui:header title="Home"
	backLabel="&laquo; Back to Home" backURL="<%=backURL.toString()%>" />
	
	<portlet:actionURL var="TextURL" name="getTextArea"></portlet:actionURL>
	<%
		String id = renderRequest.getParameter("id");
		System.out.println("ID========" + id);
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	%>
		<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
	<%
		cholacontest cholapublic = cholacontestLocalServiceUtil.getcholacontest(Long.parseLong(id));
			System.out.print("DASDASDSADSADSADSADA");
			System.out.println("Chola....public===" + cholapublic);
	%>
	<table width="100%">
		<tr style="background-color:  #85c1e9;  font-size: 14px;text-align: center;font-weight: bold;">
			<td colspan="2">Contest Description</td>
		</tr>
		<tr>
		<td>Contest Title</td>
		<td><%=cholapublic.getContest_title() %></td>
		</tr>
		<tr>
		<td>Contest Description</td>
			<td ><%=cholapublic.getContent()%> 
				</td>
		</tr>
		<tr>
		
		<div style="float: right; padding-right: 10px">
		
					<%
						if (!cholapublic.getContest_doc().isEmpty()) {
					%>
		<td>Attachement</td>
		<td >
					<a href="/contestUpload/<%=cholapublic.getContest_doc()%>"
						target="_blank">Click</a>
		</td>
					<%
						}
					%>
				</div>
		
		</tr>
		<%-- <tr>
		<%
		
		List<ContestUserDetails> cud=ContestUserDetailsLocalServiceUtil.getUserIdByContestId(Long.parseLong(id));
		
		String user_id="";
		for(ContestUserDetails csd:cud){
			user_id=csd.getUser_id();
		}
		
		//ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String particularUserId = String.valueOf(themeDisplay.getUserId());
		
		
		
		%>
		
		<%
		if(particularUserId.equals(user_id)){
		%>
		<td colspan="2" style="padding-left: 8px;"><a href="mailto:shrikanth.domala@cloverInfotech.com?subject=<%=cholapublic.getContest_title() %>">Revert</a></td>
		<%}
		 %>
		</tr> --%>
		
		<%
		User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		List<Long> contentIds=ContestMainAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
		if(contentIds!=null){
		if (contentIds.contains(cholapublic.getContent_id())) {
		   %>
		   <tr>
	<td colspan="2" style="padding-left: 8px;"><a href="mailto:shrikanth.domala@cloverInfotech.com?subject=<%=cholapublic.getContest_title() %>">Revert</a></td>
	</tr>
		   <%
		}
		}
		%>
	
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
classPK="<%=cholapublic.getContent_id() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=cholacontest.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>
	
	
	

</body>
</html>