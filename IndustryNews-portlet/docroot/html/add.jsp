<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib prefix="aui"  uri="http://liferay.com/tld/aui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	alert("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script>


<script>
$(document).ready(function() {
$("#datepicker-13").datepicker({
dateFormat : 'dd/mm/yy'

});
$("#datepicker-14").datepicker({
dateFormat : 'dd/mm/yy',
minDate : 0
});
jQuery("#myForm").validationEngine();
});
</script>



<title>Insert title here</title>
</head>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");

%>

<body>
<portlet:actionURL var="industryURL" windowState="normal"
	name="industryAction">
</portlet:actionURL>
<liferay-ui:header title="Show Industry News"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<aui:form action="<%=industryURL%>" id="myForm">
	<aui:input name="title" >
	<aui:validator name="required"/>
	</aui:input>
	<liferay-ui:input-editor name="content" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<br>
	<br>
	<br>
	<%-- <aui:input name="createDate" placeholder="DD/MM/YYYY">
	<aui:validator name="required" errorMessage="Enter date"/>
	</aui:input> --%>Select Date :<br>
	<input type="text" id="datepicker-13" name="createDate" label="Select Date"
    class="validate[required]">
    
    <!-- <input id="datepicker" type="text" name="createDate" placeholder="DD/MM/YYYY" onchange="return checkdd(this)"/>(dd/mm/yyyy)  -->
	<br><br>
	<aui:button type="submit" />
</aui:form>
<aui:script>
	function <portlet:namespace/>initEditor() {
		return "";
	}
</aui:script>
</body>
</html>