<!doctype html>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.calendar.service.eventcalendarLocalServiceUtil"%>
<%@page import="com.chola.calendar.model.eventcalendar"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<html lang="en">
<head></head>
<body>

<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
	
	
<liferay-ui:success key="uploadfilesuccess-key" message="Corporate Events added successfully" />
<liferay-ui:error key="uploadfileerror-key" message="Please try after sometime"/>


<liferay-ui:success key="deleteventssuccess-key" message="Corporate Events deleted successfully" />
<liferay-ui:error key="deleteventserror-key" message="Please try after sometime"/>

<portlet:actionURL var="uploadxcellaction" name="uploadXcelFile"></portlet:actionURL>

<aui:form action="<%=uploadxcellaction%>" method="post" name="uploadXcelFile">
	<aui:input type="file" id="file" name="file" label="Select a excel file to upload">
			<aui:validator name="required" ></aui:validator>
			<aui:validator name="acceptFiles">'.xlsx','.xls'</aui:validator>
			</aui:input>
			<aui:button type="submit" value="Add Corporate Events"></aui:button>
</aui:form>

<portlet:actionURL  name="deleteAllEvents" var="deleteEvents">
</portlet:actionURL>
 

<%
String deleteConfirm = "javascript:confirmDel()";
%>

<br>
<br>
<br>

<br>
<br>

<liferay-ui:icon-menu>
<liferay-ui:icon image="delete" message="Delete last years corporate Events"
url='<%=deleteConfirm%>' />
</liferay-ui:icon-menu>

<script type="text/javascript">
function confirmDel() {
msg = "Are you sure you want to delete all corporate events?";
if(confirm(msg)) {
window.location.href = '<%=deleteEvents.toString()%>';
} else {
return false;
}
}
</script>

</body>
</html>

