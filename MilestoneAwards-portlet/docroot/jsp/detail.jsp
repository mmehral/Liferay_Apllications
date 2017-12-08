<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
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
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

%>
<portlet:actionURL name="sendWish" var="sendWish" />
<form action="<%=sendWish %>" method="post" name="fm" >
<input type="hidden" name="userName" value=<%=id%>>
<textarea id="personalMessage" name="personalMessage" rows="4" cols="60" maxlength="2000" placeholder="Write Your Wish here !!!"></textarea><br>
	<aui:button type="submit" id="submit" value="Send Wish"></aui:button>
</form>
<div>
</div>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>
