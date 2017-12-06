<%@page import="java.util.Random"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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
.top_header_border{border-top: 2px solid #ca3646;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>

</head>
<body>


<%
String appointmentId=request.getParameter("appointmentId");


String afterDecode=URLDecoder.decode(appointmentId);
//String taskId=request.getQueryString();
System.out.println("AppointmentID After Decode : "+afterDecode);

%>

<script type="text/javascript">
var body;
/* $(document).ready(function(){ */
 	$.ajax({
 		async: false,
		url : "<portlet:resourceURL id='fetchparticularappointmentdetails'/>",
		type : 'POST',
		dataType : 'json',
		data:{appointmentId: '<%=afterDecode%>'},
		success : function(data) {
//console.log(data);	

var id=data.particularTask[0].id;
var subject=data.particularTask[0].subject;
 body=data.particularTask[0].body;
var attendees=data.particularTask[0].attendees;
	
	console.log("Attendees : "+attendees);
	
$('#<portlet:namespace/>textarea').textext({
    plugins : 'tags prompt focus autocomplete ajax arrow',
    tagsItems: attendees,
    ajax : {
        url : '<portlet:resourceURL id="getAttendeesEmailIds" />',
        dataType : 'json',
        cacheResults : true
    }
});
	
$("input[type='hidden'][name!='<portlet:namespace/>appointmentid']").attr('name', 'attendees');
$("input[type='hidden'][name!='<portlet:namespace/>appointmentid']").attr('id', 'attendees');
$("#attendees").val("");

var startdate=data.particularTask[0].startdate;
var starttime=data.particularTask[0].starttime;
var enddate=data.particularTask[0].enddate;
var endtime=data.particularTask[0].endtime;

$('#<portlet:namespace/>appointmentid').val(id);
$('#<portlet:namespace/>subject').val(subject);
$('#<portlet:namespace/>body').val(body);



$('#<portlet:namespace/>taskStartDate').val(startdate);
$('#<portlet:namespace/>taskStartTime').val(starttime);
$('#<portlet:namespace/>taskEndDate').val(enddate);
$('#<portlet:namespace/>taskEndTime').val(endtime);
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
 	
 	 $('#<portlet:namespace />body').html(body);
/* }); */


</script>


<portlet:actionURL name="updateAppointment" var="updateAppointment">
</portlet:actionURL>
<portlet:actionURL name="deleteAppointment" var="deleteAppointment">
</portlet:actionURL>


<%
String CHAR_LIST = 
"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
int RANDOM_STRING_LENGTH = 5;

StringBuffer randStr = new StringBuffer();
for(int i=0; i<RANDOM_STRING_LENGTH; i++){
    int number =0;
    
    int randomInt = 0;
    Random randomGenerator = new Random();
    randomInt = randomGenerator.nextInt(CHAR_LIST.length());
    if (randomInt - 1 == -1) {
    	number= randomInt;
    } else {
    	number= randomInt - 1;
    }   
    char ch = CHAR_LIST.charAt(number);
    randStr.append(ch);
}

%>

<aui:script use="aui-base">
Liferay.provide(window, 'mySubmitForm', function(action) {
  if(action==1){
     A.one('#<portlet:namespace/><%=randStr.toString()%>').set('action',"<%=updateAppointment%>");
  }else{
     A.one('#<portlet:namespace/><%=randStr.toString()%>').set('action',"<%=deleteAppointment%>");
  }
});
</aui:script>


<aui:form name="<%=randStr.toString()%>" action="${updateAppointment}" method="POST">
<aui:input name="appointmentid" type="hidden" id="appointmentid"></aui:input>

<aui:input required=""  type="text" id="subject" name="subject" label="Subject">
 <aui:validator name="required"/>
</aui:input>
<%-- <aui:input required=""  type="textarea" id="body" name="body" label="Body">
 <aui:validator name="required"/>
</aui:input> --%>


<aui:field-wrapper label="Body">
    <liferay-ui:input-editor name="body" toolbarSet="liferay-article" initMethod="initEditor" width="200" />
</aui:field-wrapper>

<aui:input style="width: 443px;" name="textarea" id="textarea" label="Attendees" type="textarea" value="">
 <aui:validator name="required"/>
</aui:input>


<aui:input style="width:170px;"  id="taskStartDate" name="taskStartDate" label="Start Date"  size="16" type="text" value="" readonly="true">
 <aui:validator name="required"/>
</aui:input>

<!-- Time Picker -->
<aui:input style="width:170px;"  id="taskStartTime" name="taskStartTime" label="Start Time"  size="16" type="text" value="" readonly="true">
 <aui:validator name="required"/>
</aui:input>


<%-- <aui:input type="hidden"  id="taskStartDate" name="taskStartDate"></aui:input><br/> --%>
 

<aui:input style="width:170px;" id="taskEndDate"  name="taskEndDate" label="End Date"  size="16" type="text" value="" readonly="true">
 <aui:validator name="required"/>
 <aui:validator name="custom" errorMessage="Enter a date greater than the Start date">
 
    function(val, fieldNode, ruleValue) 
                         { 
                            
                             var startDateObj = document.getElementById("<portlet:namespace />taskStartDate");
                             var startDate;
                             var result=false;
                             //case when end date is blank
                             //no validation required then
                             if(val == ""){
                                 return true;
                             }
                             if(startDateObj) {
                                 startDate = new Date(startDateObj.value);
                             }else{
                                 result = false;
                             }
                             var endDate = new Date(val);
                             
                             if(startDate && endDate){
                                 result = endDate.getTime()>=startDate.getTime();
                             }else{
                                 result = false;
                             }
                             
                             return result;
                         }
 
 </aui:validator>
 
</aui:input>

<!--End Time Picker  -->
<aui:input style="width:170px;"  id="taskEndTime" name="taskEndTime" label="End Time"  size="16" type="text" value="" readonly="true">
 <aui:validator name="required"/>
 <aui:validator name="custom" errorMessage="Enter a end time greater than the Start time">
     function(val, fieldNode, ruleValue) 
                         { 
                            
                             var startDateObj = document.getElementById("<portlet:namespace />taskStartDate");
                             var endDateObj = document.getElementById("<portlet:namespace />taskEndDate");
                             
                             var startTimeObj = document.getElementById("<portlet:namespace />taskStartTime");
                             var endTimeObj = document.getElementById("<portlet:namespace />taskEndTime");
                             var startDate;
                              var endDate;
                             var result=false;
                             //case when end date is blank
                             //no validation required then
                             if(val == ""){
                                 return true;
                             }
                             if(startDateObj&&endDateObj) {
                                 startDate = new Date(startDateObj.value);
                                  endDate = new Date(endDateObj.value);
                             }else{
                                 result = false;
                             }
                             
                             if(endDate.getTime()==startDate.getTime()){
                             
                             
                             var t = new Date();
								d = t.getDate();
								m = t.getMonth() + 1;
								y = t.getFullYear();

							//Convert time into date object
								var d1 = new Date(m + "/" + d + "/" + y + " " + startTimeObj.value);
								var d2 = new Date(m + "/" + d + "/" + y + " " + endTimeObj.value);
								
								//Get timestamp
								
								var t1 = d1.getTime();
								var t2 = d2.getTime();
								
								
								if(startDateObj && endDateObj){
								result=t1 < t2;
								}else{
                                 result = false;
                             } 
                             
                             }else{
								result=true; 
							 }
                     
                             
                             return result;
                         }
 </aui:validator>
</aui:input>

<aui:button type="submit" value="Update" onClick="mySubmitForm(1)"></aui:button><!--1 is for update Task  -->
<aui:button type="submit" value="Delete" onClick="mySubmitForm(0)"></aui:button><!--0 is for deleting Task  -->

</aui:form>

<br>
<br>




<aui:script>
YUI({ lang: 'en' }).use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#<portlet:namespace/>taskStartDate',
		        mask:'%Y/%m/%d',
		        minDate: new Date(),
		        popover: {
		          zIndex: 99999
		        },
		        calendar: {
		              minDate: new Date(),
		              minimumDate: new Date(),
		         },
		      }
		    );
		  }
		);
</aui:script>

<aui:script>
YUI().use(
		  'aui-timepicker',
		  function(Y) {
		    new Y.TimePicker(
		      {
		        trigger: '#<portlet:namespace/>taskStartTime',
		        popover: {
		          zIndex: 99999
		        },
		        on: {
		          selectionChange: function(event) {
		            //console.log(event.newSelection)
		          }
		        }
		      }
		    );
		  }
		);
</aui:script>

<aui:script>
YUI({ lang: 'en' }).use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#<portlet:namespace/>taskEndDate',
		        mask:'%Y/%m/%d',
		        popover: {
		          zIndex: 99999
		        },
		        calendar: {
		              minDate: new Date(),
		              minimumDate: new Date(),
		         },
		      }
		    );
		  }
		);
</aui:script>

<aui:script>
YUI().use(
		  'aui-timepicker',
		  function(Y) {
		    new Y.TimePicker(
		      {
		        trigger: '#<portlet:namespace/>taskEndTime',
		        popover: {
		          zIndex: 99999
		        },
		        on: {
		          selectionChange: function(event) {
		            //console.log(event.newSelection)
		          }
		        }
		      }
		    );
		  }
		);
</aui:script>

<script>
function <portlet:namespace />initEditor() {
       return body;
}
</script>
</body>
</html>