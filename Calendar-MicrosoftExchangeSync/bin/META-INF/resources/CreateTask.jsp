<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
$( document ).ready(function() {
$(".modal-content").addClass("top_header_popup");
$(".modal-header").addClass("top_header_border");
});
</script>
<style>



table {
font-family: arial, sans-serif;
border-collapse: collapse;
width: 100%;
}

th {
border: 1px solid #dddddd;
text-align: left;
padding: 8px;
background:#8a040b;
color:#fff;
}

td {
border: 1px solid #dddddd;
text-align: left;
padding: 8px;
}

tr:nth-child(even) {
background-color: #dddddd;
}


/* border top start */

.top_header_popup{border-top: 23px solid #284b8b;}
.top_header_border{border-top: 2px solid #ca3646;;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>

<script type="text/javascript">
function validateForm() {
    var subject = $("#<portlet:namespace/>subject").val();
    var body = $("#<portlet:namespace/>body").val();
    var startdate = $("#<portlet:namespace/>taskStartDate").val();
    var enddate = $("#<portlet:namespace/>taskEndDate").val();
    if (subject==null||subject == "") {
        alert("Subject must be filled out");
        return false;
    }
    if (body==null||body == "") {
        alert("Body must be filled out");
        return false;
    }
    if (startdate==null||startdate == "") {
        alert("Start Time must be selected");
        return false;
    }
    
    if(startdate=="____/__/__ __:__"){
    	alert("Start Time must be selected");
        return false;
    }
    if (enddate==null||enddate == "") {
        alert("End Time must be selected");
        return false;
    }
    if(enddate=="____/__/__ __:__"){
    	alert("End Time must be selected");
        return false;
    }
    return true
}
</script>
    <title></title>
</head>
<body>


<portlet:actionURL name="createTask" var="createTask">
</portlet:actionURL>


<aui:form action="${createTask}" method="POST">
<aui:input type="text" name="subject" label="Subject">
 <aui:validator name="required"/>
</aui:input>
<aui:input required="" type="textarea" name="body" label="Body">
 <aui:validator name="required"/></aui:input>
 

<aui:input style="width:170px;"  id="taskStartDate" name="taskStartDate" label="Start Time"  size="16" type="text" value="">
 <aui:validator name="required"/>
</aui:input>

<%-- <aui:input type="hidden"  id="taskStartDate" name="taskStartDate"></aui:input><br/> --%>
 

<aui:input style="width:170px;" id="taskEndDate"  name="taskEndDate" label="End Time"  size="16" type="text" value="" >
 <aui:validator name="required"/>
</aui:input>

<%-- <aui:input type="hidden"  value="" id="taskEndDate" name="taskEndDate"></aui:input><br/>
 --%>

<aui:button type="submit" value="Create Task" onClick="return validateForm()"></aui:button>
</aui:form>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
<script type="text/javascript">

$('#<portlet:namespace/>taskStartDate').datetimepicker({
	mask:'9999/19/39 29:59',
	minDate:new Date()
});
$('#<portlet:namespace/>taskEndDate').datetimepicker({
	mask:'9999/19/39 29:59',
	minDate:new Date()
});

</script>
</html>