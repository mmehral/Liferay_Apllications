<!doctype html>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<html lang="en">
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>

<head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
 <portlet:renderURL var="manageEvents">
   <portlet:param name="jspPage" value="/html/manageevents.jsp" />
</portlet:renderURL> 
<%-- <script type="text/javascript"
	src="<%=request.getContextPath()%>/js/monthly.js"></script>--%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/ics.deps.min.js"></script>
	<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/dateformat.js"></script> 
</head>

<style type="text/css">
body {
	font-family: Calibri;
	background-color: #f0f0f0;
	padding: 0em 1em;
}

#mycalendartraining {
	width: 100%;
	margin: 2em auto 0 auto;
	max-width: 80em;
	border: 1px solid #666;
	font-size:18px !important;
}
</style>
<body>
<%
PortletURL url=renderResponse.createRenderURL();

url.setParameter("jspPage", "/html/assign.jsp");
%>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long userId=themeDisplay.getUserId();
User particularUser=UserLocalServiceUtil.getUser(userId);

String screenName=particularUser.getScreenName();
if((themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))||themeDisplay.isSignedIn() && request.isUserInRole("L&D Admin"))
{
%>




 <a href="<%=manageEvents%>">Manage Trainings</a> <hr>
<a href="<%=url.toString()%>">Assign Training</a>
<%
}
%>
<script type="text/javascript">

function rejectTraining(that){
	var id=$(that).siblings('input[id=trainingid]').val();
    var title=$(that).siblings('input[id=trainingtitle]').val();
    var description= $(that).siblings('input[id=trainingdescription]').val();
    var startdate=$(that).siblings('input[id=trainingstartdate]').val();
    var enddate=$(that).siblings('input[id=trainingenddate]').val();
    var contentid=$(that).siblings('input[id=trainingcontentid]').val();
    var screenname=$(that).siblings('input[id=trainingintendeduser]').val();
	var flag=2;
    $.ajax({
		url : "<portlet:resourceURL id='updateTrainingIntendedTableFlagToReject'/>",
		type : 'POST',
		dataType : 'json',
		data:{scName: '<%=screenName%>',trainingId:id,contentId:contentid,statusflag:flag},
		success : function(data) {
	//alert(data);
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	

}

function eventGenerator(that){
	 
		var id=$(that).siblings('input[id=trainingid]').val();
		//alert(id);
	    var title=$(that).siblings('input[id=trainingtitle]').val();
	    var description= $(that).siblings('input[id=trainingdescription]').val();
	    var startdate=$(that).siblings('input[id=trainingstartdate]').val();
	    var enddate=$(that).siblings('input[id=trainingenddate]').val();
	    var contentid=$(that).siblings('input[id=trainingcontentid]').val();
	    var screenname=$(that).siblings('input[id=trainingintendeduser]').val();
	    var flag=3;
	    
	    var EventDesc= description;
	    var EventAddr1=" ";
	    if(EventDesc.trim()==""){	
	    	var EventDesc=" ";
	    }
	    var EventName= title;
	    if(EventName==""){	
	    	var EventName=" ";
	    }
	
	    var EventExpiry= enddate;
	    if(EventExpiry=='null'){
	    	var dateEnd=" ";
	    }else{
	    	Expiry = new Date(EventExpiry);
	    	 var dateEnd = Expiry.format("m/dd/yyyy H:MM"); 
	    }
	    var EventDay= startdate;
	    if(EventDay=='null'){
	    	var dateString=" ";
	    }else{
	    	today = new Date(EventDay);
	    	 var dateString = today.format("m/dd/yyyy H:MM");
	    }
	    var cal = ics();
	    	cal.addEvent(EventName.trim(), EventDesc.trim(), EventAddr1.trim(), dateString.trim()+" am", dateEnd.trim()+" pm");
	        cal.download(EventName);   
	        
	        $.ajax({
	    		url : "<portlet:resourceURL id='updateTrainingIntendedTableFlagToReject'/>",
	    		type : 'POST',
	    		dataType : 'json',
	    		data:{scName: '<%=screenName%>',trainingId:id,contentId:contentid,statusflag:flag},
	    		success : function(data) {
	    	//alert(data);
	    		},
	    		error : function() {
	    			console.log("There was an error. Try again please!");
	    		}
	    	});
	        
}


$(document).ready(function(){
	
/* 	$('.test-ics').click(function(){
	  
	});	 */
	
	var sampleEvents;
 	$.ajax({
		url : "<portlet:resourceURL id='trainingCalendarData'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			sampleEvents=data;		
			
			//alert(JSON.stringify(sampleEvents));
			$('#mycalendartraining').monthly({
				mode : 'event',
				dataType : 'json',
				events : sampleEvents
		
			});
			$('.monthly-event-indicator').css({'display':'none'});
			$('.monthly-day .monthly-indicator-wrap .monthly-event-indicator').each(function(i, obj) {
				$('.monthly-event-indicator:first-child').css({'display':'block'});
			});
		},
		error : function() { 
			console.log("There was an error. Try again please!");
		}
	});	
	
	
	$.ajax({
		url : "<portlet:resourceURL id='intendedTrainingList'/>",
		type : 'POST',
		dataType : 'json',
		data:{scName: '<%=screenName%>'},
		success : function(data) {
			//alert(JSON.stringify(data));
		
			var now = new Date();
			console.log(now);
			if(data.monthly!="")
				{
				$('#sidebar').append("<b>Upcomings Trainings For you :</b> <br/>"); 
				}
			else{
				$('#sidebar').append("No Trainings for you")
			}
			
			 var tr;
				for(var i in data.monthly)
				{
						var check = new Date(data.monthly[i].startdate);
				
					console.log(check);
					if ((check.getFullYear() == now.getFullYear()) &&
							   
							   (check.getDate() >= now.getDate())) 
					{
				console.log(data.monthly[i]);
				
				/* $('#sidebar').append("<div>Training Description :"+data.monthly[i].description+"<br/> Training Start Date : "+data.monthly[i].startdate+"<br/>Training End Date : "+data.monthly[i].enddate+"<a id='' class='test-ics' href='javascript:;' onclick='eventGenerator(this)'>Attend</a>&nbsp;&nbsp;&nbsp;&nbsp;<a id='' class=''  href='javascript:;' onclick='rejectTraining(this)'>Reject</a>"
				+"<input id='trainingid' type='hidden' value='"+data.monthly[i].id+"'> "
				+"<input id='trainingtitle' type='hidden' value='"+data.monthly[i].title+"'> "
				+"<input id='trainingdescription' type='hidden' value='"+data.monthly[i].title+"'> "
				+"<input id='trainingstartdate' type='hidden' value='"+data.monthly[i].startdate+"'> "
				+"<input id='trainingenddate' type='hidden' value='"+data.monthly[i].enddate+"'> "	
				+"<input id='trainingcontentid' type='hidden' value='"+data.monthly[i].content_id+"'> "	
				+"<input id='trainingintendeduser' type='hidden' value='"+data.monthly[i].screenname+"'> "	
				+"</div>");	 */
				
				 tr = $('<tr/>');
		            tr.append("<td>" + data.monthly[i].title + "</td>");
		            tr.append("<td>" + data.monthly[i].description + "</td>");
		            tr.append("<td>" + data.monthly[i].startdate + "</td>");
		            tr.append("<td>" + data.monthly[i].enddate + "</td>");
		            tr.append("<td><a id='' class='test-ics' href='javascript:;' onclick='eventGenerator(this)'>Attend</a>&nbsp;&nbsp;&nbsp;&nbsp;<a id='' class=''  href='javascript:;' onclick='rejectTraining(this)'>Reject</a>"
		            		+"<input id='trainingid' type='hidden' value='"+data.monthly[i].id+"'> "
		    				+"<input id='trainingtitle' type='hidden' value='"+data.monthly[i].title+"'> "
		    				+"<input id='trainingdescription' type='hidden' value='"+data.monthly[i].title+"'> "
		    				+"<input id='trainingstartdate' type='hidden' value='"+data.monthly[i].startdate+"'> "
		    				+"<input id='trainingenddate' type='hidden' value='"+data.monthly[i].enddate+"'> "	
		    				+"<input id='trainingcontentid' type='hidden' value='"+data.monthly[i].content_id+"'> "	
		    				+"<input id='trainingintendeduser' type='hidden' value='"+data.monthly[i].screenname+"'> "	
		            +"</td>");
		            $('table').append(tr);
				
				}else{
					
				}
					
				} 
	
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	
				});	

</script>

<portlet:resourceURL var="resourceURL"></portlet:resourceURL>
<div class="monthly" id="mycalendartraining"></div>

<div id="sidebar"></div>

<table style="width: 100%;">
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Start Date</th>
        <th>End Date</th>
         <th>Action</th>
        
    </tr>
</table>
</body>
</html>
