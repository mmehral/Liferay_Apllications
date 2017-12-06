 <%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
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
 
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.core.css" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.plugin.tags.css" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.plugin.autocomplete.css" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.plugin.focus.css" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.plugin.prompt.css" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/tagscss/textext.plugin.arrow.css" type="text/css" />
	<script src="<%=request.getContextPath()%>/tagsjs/textext.core.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.tags.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.autocomplete.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.suggestions.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.filter.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.focus.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.prompt.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.ajax.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=request.getContextPath()%>/tagsjs/textext.plugin.arrow.js" type="text/javascript" charset="utf-8"></script>


<script type="text/javascript">
$( document ).ready(function() {
    $('#<portlet:namespace/>textarea').textext({
        plugins : 'tags prompt focus autocomplete ajax arrow',
        ajax : {
            url : '<portlet:resourceURL id="getAttendeesEmailIds" />',
            dataType : 'json',
            cacheResults : true
        }
    });
    
    $("input[type='hidden']").attr('name', 'attendees');
    $("input[type='hidden']").attr('id', 'attendees');
    $("#attendees").val("");
    
});
</script>

<script type="text/javascript">
function validateForm() {
    var subject = $("#<portlet:namespace/>subject").val();
    var body = $("#<portlet:namespace/>body").val();
    var attendees = $('#<portlet:namespace/>textarea').textext()[0].hiddenInput().val();
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
    
    if (attendees==null||attendees == "") {
        alert("Attendees must be selected");
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
    }if(enddate=="____/__/__ __:__"){
    	alert("End Time must be selected");
        return false;
    }
    return true
}
</script>

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
</head>
<body>



<portlet:actionURL name="createAppointment" var="createAppointment">
</portlet:actionURL>


<aui:form action="${createAppointment}" method="POST">
<aui:input required=""  type="text" id="subject" name="subject" label="Subject">
 <aui:validator name="required"/>
</aui:input>
<aui:input required=""  type="textarea" id="body" name="body" label="Body">
 <aui:validator name="required"/>
</aui:input>



<!--Start :  Addition of Attendees field 07/05/2017  -->

<!-- <textarea id="textarea" style="width: 446;"></textarea> -->
<aui:input style="width: 443px;" name="textarea" id="textarea" label="Attendees" type="textarea" value="">
 <aui:validator name="required"/>
</aui:input>
<!--End :  Addition of Attendees field 07/05/2017 -->


<aui:input style="width:170px;" id="taskStartDate" name="taskStartDate" label="Start Time"  size="16" type="text" value="">
 <aui:validator name="required"/>

</aui:input>

<aui:input style="width:170px;" id="taskEndDate"  name="taskEndDate" label="End Time"  size="16" type="text" value="" >
 <aui:validator name="required"/>
</aui:input>

<aui:button type="submit" value="Create Appointment" onClick="return validateForm()"></aui:button>
</aui:form>


<script type="text/javascript">
/* $(".form_datetime").datetimepicker("setDate", new Date);
$("#dtp_input1").datetimepicker("setDate", new Date); */
$('#<portlet:namespace/>taskStartDate').datetimepicker({
	mask:'9999/19/39 29:59',
		minDate:new Date()
});
$('#<portlet:namespace/>taskEndDate').datetimepicker({
	mask:'9999/19/39 29:59',
		minDate:new Date()
});
</script>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html> 

