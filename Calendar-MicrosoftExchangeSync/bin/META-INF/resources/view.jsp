<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

Hello Brother...............

<%-- script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script> 
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/monthly.js"></script>--%>
<%-- <link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/monthly.css"> --%>

<!-- <style>
#mycalendar {
	width: 96%;
}
.event_gradient{background:#ebedec  repeat-x;}
</style> -->

<script>
$(document).ready(function(){

	var sampleEvents;
 	$.ajax({
		url : "<portlet:resourceURL id='taskCalendarData'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			sampleEvents=data;
			console.log("Object : "+data);
			console.log("Data : "+JSON.stringify(sampleEvents));
			var now = new Date();
			console.log(now);
			
				for(var i in data.monthly)
				{
					var check = new Date(data.monthly[i].startdate);
				
					console.log(check);
					if ((check.getFullYear() == now.getFullYear()) &&
							   (check.getMonth() == now.getMonth()) &&
							   (check.getDate() >= now.getDate())) 
					{
		/* 		console.log(data.monthly[i]);
				console.log(data.monthly[i].name);
				$('#sidebar').append("<div class='row' style='background:#9e9e9e; padding-left:10px; margin-bottom:5px;'>"
                +"<div class='col-md-12 event_gradient' style='padding:0px 0px 0px 5px;'>"
                +"<div class='col-md-12' style='padding: 12px 0px 12px 5px;font-size: 11px;'>"
                +" <span style='font-weight:bold;font-size: 14px;'>"
				+""+data.monthly[i].name+"</span><br/>Start Date : "+data.monthly[i].startdate+"<br/>"
				+"End Date : "+data.monthly[i].enddate+""
				+"</div>"
				+"</div>"
                +"</div></div>"); */	
				}
				}
			
			$('#mycalendar').monthly({
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
});
	</script>
	
	<portlet:renderURL var="createTaskJspURL"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/CreateTask.jsp"/>
	</portlet:renderURL>
	

	
	<portlet:renderURL var="createAppointmentJspURL"
		windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/CreateAppointment.jsp"/>
	</portlet:renderURL>
	
	<aui:script>
	function sendTask(id)
	{
		console.log(id);
		
		AUI().use('aui-base',
		'aui-io-plugin-deprecated',
		'liferay-util-window',
		function(A) {
		var popUpWindow=Liferay.Util.Window.getWindow(
		{
		dialog: {
		centered: true,
		constrain2view: true,
		//cssClass: 'yourCSSclassName',
		modal: true,
		resizable: false,
		width: 475
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Task");
		popUpWindow.io.set('uri','<%=createTaskJspURL%>&id='+id);
		popUpWindow.io.start();

});
	}
</aui:script>

<aui:script>
function sendAppointment(id)
{
	console.log(id);
	
	AUI().use('aui-base',
	'aui-io-plugin-deprecated',
	'liferay-util-window',
	function(A) {
	var popUpWindow=Liferay.Util.Window.getWindow(
	{
	dialog: {
	centered: true,
	constrain2view: true,
	//cssClass: 'yourCSSclassName',
	modal: true,
	resizable: false,
	width: 475
	}
	}
	).plug(
	A.Plugin.IO,
	{
	autoLoad: false
	}).render();
	popUpWindow.show();
	popUpWindow.titleNode.html("Appointment");
	popUpWindow.io.set('uri','<%=createAppointmentJspURL%>&id='+id);
	popUpWindow.io.start();

});
}
</aui:script>
	
	<%-- <aui:button
type="submit"
value="Create Task"
onClick="<%= createTaskJspURL.toString() %>"
/>
	<aui:button
type="submit"
value="Create Appointment"
onClick="<%= createAppointmentJspURL.toString() %>"
/> --%>
	
	<div class="container gdmor_panel">
	<div class="col-md-12" style="padding:0px;padding:7px;margin-top:-12px">
   <div class="col-md-12" style="padding:0px;">
<div class="monthly" id="mycalendar"></div>
<div class="col-md-12">
<div class="row text_style" style="text-align:right;" ><a href="javascript:;" onclick="sendTask(0)">Create Task</a></div>
<div class="row text_style" style="text-align:right;" on><a href="javascript:;" onclick="sendAppointment(1)">Create Appointment</a></div>
</div>
</div>
    
           <!--  <div class="col-md-6" style="padding:0px;    margin-left: -3px;">
                <div id="sidebar" class="col-md-12" style="height: 237px;overflow: auto;">
                  </div>
                
                <div class="col-md-12">
                 <div class="row text_style" style="text-align:right;" ><a href="javascript:;" onclick="sendTask(0)">Create Task</a></div>
                  <div class="row text_style" style="text-align:right;" on><a href="javascript:;" onclick="sendAppointment(1)">Create Appointment</a></div>
                </div>
            
            </div>  -->
         
		 
</div>
</div>


