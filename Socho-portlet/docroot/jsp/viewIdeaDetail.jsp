<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.chola.socho.Socho"%>
<%@page import="com.chola.socho.service.ideaLocalServiceUtil"%>
<%@page import="com.chola.socho.model.idea"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.socho.service.topicsLocalServiceUtil"%>
<%@page import="com.chola.socho.model.topics"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<body>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
	
<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

String ideaId = request.getParameter("idea");
System.out.println("Idea Id : "+ideaId);

idea ideas = ideaLocalServiceUtil.getidea(Long.parseLong(ideaId));

topics topics = topicsLocalServiceUtil.fetchtopics(Long.parseLong(ideas.getTopic()));
String topic = topics.getTopicName();

User userd = UserLocalServiceUtil.getUser(ideas.getUserId());
%>
<div> Id : <%=ideas.getId() %></div><br>

<div> Topic : <%=topic %></div><br>

<div>Shared By : <%=userd.getFirstName() %> <%=userd.getLastName() %></div><br>

<div>Idea Details : <%=ideas.getSharedIdea() %></div><br>

<div>Attachment : <a target="_blank" href="/SochoUpload/<%=ideas.getUserId() %>/<%=ideas.getSharedFile()%>"><%=ideas.getSharedFile()%></a></div><br>

<div>Shared Date : <%=ideas.getSharedDate() %></div><br>

<%-- <liferay-ui:ratings className="<%=idea.class.getName()%>"
		classPK="<%=ideas.getId()%>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(idea.class.getName()), ideas.getId(),
					WorkflowConstants.STATUS_APPROVED);
	%> --%>

	<%-- <c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if> --%>
<%-- <liferay-ui:discussion 
classPK="<%=ideas.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=idea.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/> --%>

</body>
</html>
