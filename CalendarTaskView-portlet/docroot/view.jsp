<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />



<%
/* String formSumit=(String)renderRequest.getAttribute("<portlet:namespace/>formSubmit");   
String formSumit1=(String)request.getAttribute("<portlet:namespace/>formSubmit");
//String formSumit=(String)request.getAttribute("formSubmit");
System.out.println("Form submitted successfully : "+formSumit+formSumit1); */

HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(renderRequest);
HttpServletRequest httpOrigReq = PortalUtil.getOriginalServletRequest(httpReq);
String formSubmit = httpOrigReq.getParameter("_CalendarTaskView_WAR_CalendarTaskViewportlet_formSubmit");

if(formSubmit!=null){
	%>
	<script>
	
	//window.location.assign("/")
	</script>
	
	<%
}
%>

<liferay-ui:success key="passMatched" message="Microsoft Exchange Server Authenticated successfully"/>
<liferay-ui:error key="passMismatched" message="Invalid credentials"/>

<style>
.monthly-header-title-date{float:none;}
.monthly-header-title-date:hover{float:none;}
.monthly-prev, .monthly-next {width: 2em;}


.monthly-day .monthly-event-indicator {
	display: inline-block;
    margin: 0.04em;
    width: 7px;
    height: 6px;
	border-radius: 0.25em;
	vertical-align: middle;
	background: #7BA7CE;
}
</style>

<script>
function openpopup()
{
	sendTask(0);
}

$(document).ready(function(){

	
	var sampleEvents;
	var successAuthenticated;
 	$.ajax({
		url : "<portlet:resourceURL id='taskCalendarData'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			sampleEvents=data;
			console.log(JSON.stringify(data));
			var isAuthenticated=data.auth[0].status;
			
			
			//console.log("Status  : "+isAuthenticated)
			if(isAuthenticated=="1"){
				
console.log("Successfully Authenticated")				
				console.log("Object : "+data);
				var now = new Date();
				//console.log(now);
				
					for(var i in data.monthly)
					{
						var check = new Date(data.monthly[i].startdate);
					
						//console.log(check);
						if ((check.getFullYear() == now.getFullYear()) &&
								   (check.getMonth() == now.getMonth()) &&
								   (check.getDate() >= now.getDate())) 
						{
			
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
				
				
				
			}else {
				console.log("Authentication Failed")
				$('#mycalendar').monthly({
					mode : 'event',
					dataType : 'json',
					events : sampleEvents
			
				});
				//$('.MicrosoftAuthError').show();
				$('.syncbutton').show();
				  $("#mycalendar").css("pointer-events", "none");
				$("#mycalendar").css("cursor", "default"); 
			}
		
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
value="/html/CreateTask.jsp"/>
	</portlet:renderURL>
	

	
	<portlet:renderURL var="createAppointmentJspURL"
		windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/CreateAppointment.jsp"/>
	</portlet:renderURL>
	
	
	
		<portlet:renderURL var="editDeleteTaskJspURL"
		windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/EditDeleteTask.jsp"/>
	</portlet:renderURL>
	
	<portlet:renderURL var="editDeleteAppointmentJspURL"
		windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/EditDeleteAppointment.jsp"/>
	</portlet:renderURL>
	
	<portlet:renderURL var="enterMicrosoftExchangePassword"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath"
value="/html/MicrosoftPasswordDetails.jsp"/>
	</portlet:renderURL>
	
	
	<aui:script>
	function sendTask(id)
	{
		//console.log(id);
		
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
		width: 500,
		height:1000
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Task/Appointment");
		popUpWindow.io.set('uri','<%=createTaskJspURL%>&id='+id);
		popUpWindow.io.start();

});
	}
</aui:script>

<aui:script>
function sendAppointment(id)
{
	//console.log(id);
	
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
	
	
	<aui:script>
	function configureMicrosoftPassword() {
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
				width: 500,
				height:400
				}
				}
				).plug(
				A.Plugin.IO,
				{
				autoLoad: false
				}).render();
				popUpWindow.show();
				popUpWindow.titleNode.html("Microsoft Exchange Settings");
				popUpWindow.io.set('uri','<%=enterMicrosoftExchangePassword%>');
				popUpWindow.io.start();

			});
	}
	</aui:script>
	
	
	<aui:script>
	function editDeletTask(taskId)
	{
		//console.log(taskId);
		
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
		popUpWindow.titleNode.html("Edit/Delete Task");
		popUpWindow.io.set('uri','<%=editDeleteTaskJspURL%>&taskId='+encodeURI(taskId));
		popUpWindow.io.start();

	});
	}
	
	
	
	function editDeleteAppointment(appointmentId)
	{
		//console.log(appointmentId);
		
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
		popUpWindow.titleNode.html("Edit/Delete Appointment");
		popUpWindow.io.set('uri','<%=editDeleteAppointmentJspURL%>&appointmentId='+encodeURI(appointmentId));
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
	
	<div class="col-md-12" style="padding-left: 0px;padding-right: 0px">
	
	<div class="col-md-12 tab_01">Calendar</div>
<div class="col-md-12" style="padding:0px;">

<div class="col-md-12 panel_adj" style="padding:0px;">

<div class="col-md-12" style="padding:0px;">
 

<!-- <div class="MicrosoftAuthError" style="
    background: red;
    height: auto;
    width: 100%;
    position: absolute;
    margin-top: 93px;
    z-index: 20;
    padding: 5px;
    color: #fff;
    border-radius: 5px;
    text-align: justify;
    font-size: medium;
    line-height: 18px;display: none;">Your Outlook password is not configured. Please click <a href="javascript:;" onclick="configureMicrosoftPassword()">here</a> to enter Outlook password.
</div> -->

<div class="monthly" id="mycalendar">
</div>
<div id="syncbutton" title="Your Outlook password is not configured" class="syncbutton" style="float:right;display:none;"><a href="javascript:;" onclick="configureMicrosoftPassword()"><img src="/theme/images/sync.png" id="syncbuttonimg"/></a></div>
<!-- <script type="text/javascript">
YUI().use(
		  'aui-tooltip',
		  function(Y) {
		    new Y.Tooltip(
		      {
		        trigger: '#syncbutton',
		        position: 'top'
		      }
		    ).render();
		  }
		);
</script> -->


</div>

</div>

</div> 
 
 
<!-- <div class="col-md-6 margin-top-51" style="padding:0px;height: 248px;">

<div class="col-md-12 panel_ra">

<div class="col-md-12" style="padding:0px;">


<div class="col-md-12 panel_ra_ht" style="height: 248px;">
<div class="row bd_bg_new">

<div class="col-md-12" style="padding:0px;">

<div class="col-md-12" style="padding: 6px 5px 8px 0px;font-size: 12px; font-weight:bold; line-height:13px;">

This task list or appointment list should be fetched from Microsoft exchange server. 
<span class="bd_img_btn">SEND WISH</span></div>


</div>

</div>




<div class="row bd_bg_new">

<div class="col-md-12" style="padding:0px 0px 0px 5px;">

<div class="col-md-12" style="padding: 6px 5px 8px 0px;font-size: 12px; font-weight:bold; line-height:13px;">

This task list or appointment list should be fetched from Microsoft exchange server. 
<span class="bd_img_btn">SEND WISH</span></div>


</div>

</div>


<div class="row bd_bg_new">

<div class="col-md-12" style="padding:0px 0px 0px 5px;">

<div class="col-md-12" style="padding: 6px 5px 8px 0px;font-size: 12px; font-weight:bold; line-height:13px;">

This task list or appointment list should be fetched from Microsoft exchange server. This task list or appointment list should be fetched from Microsoft exchange server. 
<span class="bd_img_btn">SEND WISH</span></div>


</div>

</div> 

</div>

</div> 
 
</div>

</div> -->

</div> 
