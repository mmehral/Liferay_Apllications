<!doctype html>
<%@page import="com.chola.calendar.service.eventcalendarLocalServiceUtil"%>
<%@page import="com.chola.calendar.model.eventcalendar"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<html lang="en">
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/monthly.js"></script>
	<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/dateformat.js"></script>
	<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/ics.deps.min.js"></script>
<portlet:defineObjects />
<style type="text/css">

#mycalendar {
	width: 96%;

}
.event_gradient{background:#ebedec url(/theme/images/custom/gradient.gif) repeat-x;}
</style>
<%-- <portlet:renderURL var="addEvents">
   <portlet:param name="jspPage" value="/html/eventsmaster/home.jsp" />
</portlet:renderURL> --%>
<%
//eventcalendar events =eventcalendarLocalServiceUtil.geteventcalendar(2);

ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))
{
%>
<%-- <a href="<%=addEvents%>">Click here to Add Events</a> --%>
<%
}
%>

<portlet:resourceURL var="resourceURL"></portlet:resourceURL>
<div class="col-md-12" style="padding:0px;">
   <div class="col-md-6" style="padding:0px;">
<div class="monthly" id="mycalendar"></div>
</div>
    
            <div class="col-md-6" style="padding:0px;    margin-left: -3px;">
                <div class="col-md-12" style="height: 237px;overflow: auto;">
            <div class="row" style="background:#9e9e9e; padding-left:10px; margin-bottom:5px;">
                	
                    <div class="col-md-12 event_gradient" style="padding:0px 0px 0px 5px;">
                    
                    <div class="col-md-12" style="padding: 12px 0px 12px 5px;font-size: 11px;">
  
  <span style="font-weight:bold;font-size: 14px;">Today</span>
  <br>
  This task list or appointment list should be fetched from Microsoft exchange server. <span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 8px; float:right; margin-right:10px;">More +</span></div>
                    
                    
                    </div>
                    
                </div>
                
                  <div class="row" style="background:#9e9e9e; padding-left:10px; margin-bottom:5px;">
                	
                    <div class="col-md-12 event_gradient" style="padding:0px 0px 0px 5px;">
                    
                    <div class="col-md-12" style="padding: 12px 0px 12px 5px;font-size: 11px;">
  
  <span style="font-weight:bold;font-size: 14px;">Today</span>
  <br>
  This task list or appointment list should be fetched from Microsoft exchange server. <span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 8px; float:right; margin-right:10px;">More +</span></div>
                    
                    
                    </div>
                    
                </div>
                
                
              <div class="row" style="background:#9e9e9e; padding-left:10px; margin-bottom:5px;">
                	
                    <div class="col-md-12 event_gradient" style="padding:0px 0px 0px 5px;">
                    
                    <div class="col-md-12" style="padding: 12px 0px 12px 5px;font-size: 11px;">
  
  <span style="font-weight:bold;font-size: 14px;">Today</span>
  <br>
  This task list or appointment list should be fetched from Microsoft exchange server. <span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 8px; float:right; margin-right:10px;">More +</span></div>
                    
                    
                    </div>
                    
                </div>          
                
                </div>
                
                <div class="col-md-12">
                
                <div class="row text_style" style="text-align:right;"><a href="#">View All</a></div>
                </div>
            
            </div>
         
		 
</div>
<script>
function eventGenerator(that){

	var title=$(that).siblings('input[id=title]').val();
	var description= $(that).siblings('input[id=description]').val();
	var startdate=$(that).siblings('input[id=startdate]').val();
	var enddate=$(that).siblings('input[id=enddate]').val();

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
	var dateEnd = Expiry.format("m/dd/yyyy HH:MM"); 
	alert(dateEnd);
	}
	
	var EventDay= startdate;
	if(EventDay=='null'){
	var dateString=" ";
	}else{
	today = new Date(EventDay);
	var dateString = today.format("m/dd/yyyy HH:MM");
	alert(dateString);
	}
	var cal = ics();
	cal.addEvent(EventName.trim(), EventDesc.trim(), EventAddr1.trim(), dateString.trim(), dateEnd.trim());
	cal.download(EventName); 
	}
	
	
var sampleEvents;
		$(document).ready(function() {
		
			$.ajax({
				url : '<%=resourceURL%>',
				type : 'POST',
				dataType : 'json',
				success : function(data) {
					sampleEvents=data;
					console.log("Data "+JSON.stringify(sampleEvents));
					
					var now = new Date();
					console.log(now);
					if(data.monthly!="")
						{
						$('#sidebar').append("<b>Upcoming Events :</b> <br/>"); 
						}
						for(var i in data.monthly)
						{
							var check = new Date(data.monthly[i].startdate);
						
							console.log(check);
							if ((check.getFullYear() == now.getFullYear()) &&
									   (check.getMonth() == now.getMonth()) &&
									   (check.getDate() >= now.getDate())) 
							{
						console.log(data.monthly[i]);
						console.log(data.monthly[i].name);
						$('#sidebar').append("Event Name :"+data.monthly[i].name+"<br/> Event Date : "+data.monthly[i].startdate+"<br/><a id='' class='test-ics' href='javascript:;' onclick='eventGenerator(this)'>Add to Calendar</a><input id='title' type='hidden' value='"+data.monthly[i].name+"'> "
						+"<input id='description' type='hidden' value='"+data.monthly[i].name+"'> "
						+"<input id='startdate' type='hidden' value='"+data.monthly[i].startdate+"'> "
						+"<input id='enddate' type='hidden' value='"+data.monthly[i].enddate+"'> " 
						+"</div><br/><br/>");	
						}
						}
					
					$('#mycalendar').monthly({
						mode : 'event',
						dataType : 'json',
						events : sampleEvents
				
					});
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		});
</script>
<div id="sidebar"></div>
