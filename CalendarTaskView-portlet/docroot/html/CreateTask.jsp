<%@page import="java.util.Random"%>
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


 <script type="text/javascript">
$( document ).ready(function() {
    $('#<portlet:namespace/>Attendees').textext({
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
function <portlet:namespace />initEditor() { return ""; }	
</script>
<script type="text/javascript">
/* function validateForm() {
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
} */
$(document).ready(function(){
	$("#<portlet:namespace />Attendees").hide();
	  $("#<portlet:namespace />Attendees").closest('.input-text-wrapper').hide();
});


function hideAppointmentshowTask(){
	$("#<portlet:namespace />Attendees").hide();
	  $("#<portlet:namespace />Attendees").closest('.input-text-wrapper').hide();
}


function hideTaskShowAppointment(){
	$("#<portlet:namespace />Attendees").show();
	$("#<portlet:namespace />Attendees").closest('.input-text-wrapper').show();
	
}
</script>
    <title></title>
</head>
<body>

<portlet:actionURL name="createTask" var="createTask">
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


<aui:form name="<%=randStr.toString()%>" action="${createTask}" method="POST">

<aui:input name="taskApp" type="radio" checked="true" value="task" label="Task" onClick="hideAppointmentshowTask()"></aui:input>
<aui:input name="taskApp" type="radio"  value="appointment" label="Appointment" onClick="hideTaskShowAppointment()"></aui:input>
 
<aui:input spellcheck="true" type="text" name="subject" label="Subject">
 <aui:validator name="required"/>
</aui:input>
<%-- <aui:input required="" type="textarea" name="body" label="Body">
 <aui:validator name="required"/></aui:input>
  --%>
  
 <aui:field-wrapper label="Body">
    <liferay-ui:input-editor toolbarSet="SpellChecker" name="body" toolbarSet="liferay-article" initMethod="initEditor" width="200" />
</aui:field-wrapper>
 
<!--Start :  Addition of Attendees field 04/10/2017  -->

<!-- <textarea id="textarea" style="width: 446;"></textarea> -->
<aui:input style="width: 443px;" name="Attendees" id="Attendees" label="Attendees" type="textarea" value="">
 <aui:validator name="required"/>
</aui:input>
<!--End :  Addition of Attendees field 04/10/2017 -->

<aui:input style="width:170px;"  id="taskStartDate" name="taskStartDate" label="Start Date"  size="16" type="text" value=""  readonly="true" >
 <aui:validator name="required" />
</aui:input>

<!-- Time Picker -->
<aui:input style="width:170px;"  id="taskStartTime" name="taskStartTime" label="Start Time"  size="16" type="text" value="" readonly="true">
 <aui:validator name="required"/>
</aui:input>

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


<%-- <aui:input type="hidden"  value="" id="taskEndDate" name="taskEndDate"></aui:input><br/>
 --%>

<aui:button type="submit" value="Create" onClick="return validateForm()"></aui:button>
</aui:form>
<br>
<br>
<!-- <div style="border-bottom:1px solid #cd3947;">&nbsp;</div> -->
</body>


<script type="text/javascript">

$(document).ready(function(){
	
	var d = new Date(),
    month = '' + (d.getMonth() + 1),
    day = '' + d.getDate(),
    year = d.getFullYear();

if (month.length < 2) month = '0' + month;
if (day.length < 2) day = '0' + day;

var defaultDate= [year, month, day].join('/');

//alert("Default date : "+defaultDate);

$("#<portlet:namespace/>taskStartDate").val(defaultDate);
$("#<portlet:namespace/>taskEndDate").val(defaultDate);
	
});

</script> 

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
		         on: {
			          selectionChange: function(event) {
			        	  /* $('#<portlet:namespace/>taskStartDate').val(event.newSelection) */
				          }
				        }
		     
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
		           // console.log(event.newSelection)
		            console.log(event.newSelection);
		           
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
		          toolbars: {
		          }, 
		          zIndex: 99999
		        }, 
		        calendar: {
		              minDate: new Date(),
		              minimumDate: new Date(),
		         },
		         on: {
			          selectionChange: function(event) {
				           // console.log(event.newSelection)
				           /* $('#<portlet:namespace/>taskEndDate').val(event.newSelection) */
				          }
				        }
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
		           // console.log(event.newSelection)
		          }
		        }
		      }
		    );
		  }
		);
</aui:script>

</html>