<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.promotion.service.usersLocalServiceUtil"%>
<%@page import="com.chola.promotion.model.users"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
$( document ).ready(function() {
	$(".modal-content").addClass("top_header_popup");
	$(".modal-header").addClass("top_header_border");
});
</script>
<style >
/* border top start */

.top_header_popup{border-top: 23px solid #284b8b;}
.top_header_border{border-top: 2px solid #ca3646;;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>
</head>
<body>

<%
String id = request.getParameter("id");
System.out.println("SRNO or Id : "+id);

users usersList = usersLocalServiceUtil.fetchusers(Long.parseLong(id));
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	 
%>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
<div>Emp Id : <%=usersList.getEmpId() %></div><br>

<div> Emp Name : <%=usersList.getEmpName() %></div><br>

<div>Write Up : <%=usersList.getWriteUp() %></div><br>

<div>Promoted Date : <%=usersList.getAwardedDate()%></div><br>

<portlet:actionURL name="postMessage" var="saveURL" />
<form action="<%=saveURL %>" method="post" name="fm" >
<input type="hidden"  name="empId" value='<%=usersList.getEmpId() %>'/>
<div>Message : <textarea name="message" rows="5" cols="30"></textarea></div><br>
<div> <input type="submit" value="Submit"/></div><br>
</form>
<div>
<liferay-ui:ratings className="<%=users.class.getName()%>"
		classPK="<%=usersList.getId()%>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(users.class.getName()), usersList.getId(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>
<liferay-ui:discussion 
classPK="<%=usersList.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=users.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>

</div>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>
