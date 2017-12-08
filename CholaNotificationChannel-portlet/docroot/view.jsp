<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.chola.notificationchannel.NotificationCategorizationAction"%>
<%@page import="com.liferay.portal.kernel.model.UserNotificationEvent"%>
<%@page import="java.util.List"%>
<%@page import="org.codehaus.jackson.annotate.JsonAutoDetect.Visibility"%>
<%@page import="org.codehaus.jackson.annotate.JsonMethod"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%
	/**
	 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>
<html lang="en">
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<head></head>
<style>
html, body {
	font-family: Arial, Helvetica, sans-serif;
}

/* define a fixed width for the entire menu */
.navigation {
	width: 300px;
}

/* reset our lists to remove bullet points and padding */
.mainmenu, .submenu {
	list-style: none;
	padding: 0;
	margin: 0;
}

/* make ALL links (main and submenu) have padding and background color */
.mainmenu a {
	display: block;
	background-color: #CCC;
	text-decoration: none;
	padding: 10px;
	color: #000;
}

/* add hover behaviour */
.mainmenu a:hover {
	background-color: #C5C5C5;
}

/* when hovering over a .mainmenu item,
/* when hovering over a .mainmenu item,
  display the submenu inside it.
  we're changing the submenu's max-height from 0 to 200px;
*/
.mainmenu li:hover .submenu {
	display: block;
	max-height: 200px;
}

/*
  we now overwrite the background-color for .submenu links only.
  CSS reads down the page, so code at the bottom will overwrite the code at the top.
*/
.submenu a {
	background-color: #999;
}

/* hover behaviour for links inside .submenu */
.submenu a:hover {
	background-color: #666;
}

/* this is the initial state of all submenus.
  we set it to max-height: 0, and hide the overflowed content.
*/
.submenu {
	overflow: hidden;
	max-height: 0;
	-webkit-transition: all 0.5s ease-out;
}
</style>


<portlet:defineObjects />
<portlet:resourceURL var="ajaxURL"></portlet:resourceURL>



<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailnotification.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="simpleDialogForPP"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailppnotification.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="simpleDialogForQtrac"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailqtracnotification.jsp"/>
</portlet:renderURL>
<script type="text/javascript">
$(document).ready(function() {
	
	$.ajax({
		url : "<portlet:resourceURL id='updateTables'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(data);
			
			var totalCount=0;
			for(var i in data.data)
			{
				console.log(data.data[i]);
				var name = (data.data[i].name);
				var count = (data.data[i].count);
				totalCount=+totalCount+ +count;
				console.log(name+" : "+count);
				if(name!="People Power"&& name!="Hobby Club"&& name!="Qtrac"){
					 if(count!=0){
				$('#notifyData').append("<input id='value_"+i+"' type='hidden' value="+count+" />"
			          +"<div class='col-md-12 bd_gradient' style='width: 100%; float: left; padding: 12px 0px 0px;'>"
			           + 	"<div style='margin-top: -5px;' class='col-md-2 col-xs-2'><img src='/theme/images/custom/Approval.png'></div>"
			            + "<div style='margin-top: -5px;' class='col-md-5 col-xs-5'><strong>"+name+"</strong></div>"
			             +     " <div class='col-md-2 col-xs-2'><span class='glyphicon glyphicon-bell' style='font-size: 18px;'><sup style='background: red none repeat scroll 0% 0%; color: rgb(255, 255, 255); border-radius: 4px; padding: 0px 3px 3px; font-size: 10px; margin-left: -8px; top:-14px;'>"+count+"</sup></span></div>"
			              +   '<div class="col-md-3 col-xs-3"><span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 11px;" onclick="sendId(\''+name+'\')">MORE +</span></div>'
			               + "</div>");
					} 
				}else if(name=="Hobby Club"){
					 if(count!=0){
							$('#notifyData').append("<input id='value_"+i+"' type='hidden' value="+count+" />"
						          +"<div class='col-md-12 bd_gradient' style='width: 100%; float: left; padding: 12px 0px 0px;'>"
						           + 	"<div style='margin-top: -5px;' class='col-md-2 col-xs-2'><img src='/theme/images/custom/Approval.png'></div>"
						            + "<div style='margin-top: -5px;' class='col-md-5 col-xs-5'><strong>"+name+"</strong></div>"
						             +     " <div class='col-md-2 col-xs-2'><span class='glyphicon glyphicon-bell' style='font-size: 18px;'><sup style='background: red none repeat scroll 0% 0%; color: rgb(255, 255, 255); border-radius: 4px; padding: 0px 3px 3px; font-size: 10px; margin-left: -8px; top:-14px;'>"+count+"</sup></span></div>"
						              +   '<div class="col-md-3 col-xs-3"><span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 11px;" onclick="seeNotification(1)">MORE +</span></div>'
						               + "</div>");
								} 
				}
				else if(name=="Qtrac"){
					 if(count!=0){
							$('#notifyData').append("<input id='value_"+i+"' type='hidden' value="+count+" />"
						          +"<div class='col-md-12 bd_gradient' style='width: 100%; float: left; padding: 12px 0px 0px;'>"
						           + 	"<div style='margin-top: -5px;' class='col-md-2 col-xs-2'><img src='/theme/images/custom/Approval.png'></div>"
						            + "<div style='margin-top: -5px;' class='col-md-5 col-xs-5'><strong>"+name+"</strong></div>"
						             +     " <div class='col-md-2 col-xs-2'><span class='glyphicon glyphicon-bell' style='font-size: 18px;'><sup style='background: red none repeat scroll 0% 0%; color: rgb(255, 255, 255); border-radius: 4px; padding: 0px 3px 3px; font-size: 10px; margin-left: -8px; top:-14px;'>"+count+"</sup></span></div>"
						              +   '<div class="col-md-3 col-xs-3"><span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 11px;" onclick="sendIdQtrac(\''+name+'\')">MORE +</span></div>'
						               + "</div>");
								} 
				}else{
					if(count!=0){
					
					$('#notifyData').append("<input id='value_"+i+"' type='hidden' value="+count+" />"
					          +"<div class='col-md-12 bd_gradient' style='width: 100%; float: left; padding: 12px 0px 0px;'>"
					           + 	"<div style='margin-top: -5px;' class='col-md-2 col-xs-2'><img src='/theme/images/custom/Approval.png'></div>"
					            + "<div style='margin-top: -5px;' class='col-md-5 col-xs-5'><strong>"+name+"</strong></div>"
					             +     " <div class='col-md-2 col-xs-2'><span class='glyphicon glyphicon-bell' style='font-size: 18px;'><sup style='background: red none repeat scroll 0% 0%; color: rgb(255, 255, 255); border-radius: 4px; padding: 0px 3px 3px; font-size: 10px; margin-left: -8px; top:-14px;'>"+count+"</sup></span></div>"
					              +   '<div class="col-md-3 col-xs-3"><span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 11px;" onclick="sendIdPeoplePower(\''+name+'\')">MORE +</span></div>'
					               + "</div>");
					}
				}
			}
			$('#showcount').append("<strong>("+totalCount+")</strong>");
			if(totalCount==0){
				$('#notifyData').hide();
				$('#notifynonData').show();
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
});
</script>
<aui:script>
	function sendId(id)
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
		width: 475,
		height:400
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Notifications");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+id);
		popUpWindow.io.start();

});
	}
</aui:script>

<aui:script>
function sendIdPeoplePower(id)
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
	width: 475,
	height:400
	}
	}
	).plug(
	A.Plugin.IO,
	{
	autoLoad: false
	}).render();
	popUpWindow.show();
	popUpWindow.titleNode.html("Notifications");
	popUpWindow.io.set('uri','<%=simpleDialogForPP%>&id='+id);
	popUpWindow.io.start();

});
}
</aui:script>

<aui:script>
function sendIdQtrac(id)
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
	width: 475,
	height:400
	}
	}
	).plug(
	A.Plugin.IO,
	{
	autoLoad: false
	}).render();
	popUpWindow.show();
	popUpWindow.titleNode.html("Notifications");
	popUpWindow.io.set('uri','<%=simpleDialogForQtrac%>&id='+id);
	popUpWindow.io.start();

});
}
</aui:script>
<script>
	function getNotificationList(that) {

		var str = that.id;
		var str1 = str.split("_");
		var str2 = "value_" + str1[1];
		var val1 = document.getElementById(str2).value;
		
		$
				.ajax({
					url : "<portlet:resourceURL id='NotificationList'/>",
					type : 'POST',
					dataType : 'json',
					data : {
						val : val1,
					},
					success : function(data) {
						var obj = data;
						console.log(obj);
						alert(JSON.stringify(data));
						console.log(data);
						
						$('.dummy').empty();
						for ( var j in obj) {
							console.log(obj[j].content_id);
							$(that)
									.next()
									.append(
											$('<li><input id="event_'+obj[j].id+'" type="hidden" value='+obj[j].id+' >'
													+'<input id="event_'+obj[j].user_id+'" type="hidden" value='+obj[j].user_id+' >'
													+'<input id="event_'+obj[j].content_id+'" type="hidden" value='+obj[j].content_id+' >'
													+'<a onclick="return updateReadStatus('+obj[j].id+','+obj[j].user_id+',\''+String(obj[j].content_id)+'\')" href='
													+ obj[j].url
													+ '>'
													+ obj[j].notification_text
													+ '</a></li>'));
						}

					},
					error : function() {
						console.log("There was an error. Try again please!");
					}
				});
		return false;
	}
 
	function updateReadStatus(that1,that2,that3) {
		$.ajax({
			url : "<portlet:resourceURL id='EventId'/>",
			type : 'POST',
			//dataType : 'json',
			data : {
				val1 : that1,
				val2 : that2,
				val3 : that3.toString(),
				
			},
			success : function(data) {
				console.log(data);
				return true;
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		//return false;
	}
</script>

<body>
<%-- <%
Object obj=PeoplePowerAPI.getNotificationList("v481");

JSONObject jsonObject = new JSONObject(obj.toString());
int ModCnt = jsonObject.getInt("ModCnt");
System.out.println(ModCnt);

%> --%>
<div class="col-md-12" style="padding:0px;">
	<div id="showcount" class="col-md-12 yellow_panel_bg" style="text-align:center;">
           Notification Center
            </div>
             <div  id="notifyData" class="col-md-12" style="padding: 0px;
    margin-top: 5px;
    height: 299px;
    /* background: linear-gradient(#eee, #d1d1d1); */
    overflow: auto;
    background: #ebedec url(/theme/images/custom/gradient.gif) repeat-x;
             ">
          
</div>

             <div  id="notifynonData" class="col-md-12" style="padding: 0px;
    margin-top: 5px;
    height: 299px;
    /* background: linear-gradient(#eee, #d1d1d1); */
    overflow: auto;
    background: #ebedec url(/theme/images/custom/gradient.gif) repeat-x;
display: none;">
            <div style="text-align: center;"><Strong>No notifications for you</Strong></div>
</div>


<!-- Code For Hobby Club Notification Start here -->
<%-- <%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
List<UserNotificationEvent> mbList= NotificationCategorizationAction.getDeliveredMessageBoard(themeDisplay.getUserId());
if(mbList.size()!=0){
	%>
	<script type="text/javascript">
	$(document).ready(function() {
	$('#notifynonData').hide();
	});
	</script>
	<div  id="notifyData" class="col-md-12" style="padding: 0px;margin-top: 5px;
    height: 299px;
    /* background: linear-gradient(#eee, #d1d1d1); */
    overflow: auto;
    background: #ebedec url(/theme/images/custom/gradient.gif) repeat-x;
             ">
             
             <div class='col-md-12 bd_gradient' style='width: 100%; float: left; padding: 12px 0px 0px;'>
<div style='margin-top: -5px;' class='col-md-2 col-xs-2'><img src='/theme/images/custom/Approval.png'></div>
<div style='margin-top: -5px;' class='col-md-5 col-xs-5'><strong>Hobby Club</strong></div>
<div class='col-md-2 col-xs-2'><span class='glyphicon glyphicon-bell' style='font-size: 18px;'><sup style='background: red none repeat scroll 0% 0%; color: rgb(255, 255, 255); border-radius: 4px; padding: 0px 3px 3px; font-size: 10px; margin-left: -8px; top:-14px;'><%=mbList.size() %></sup></span></div>
<div class="col-md-3 col-xs-3"><span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 11px;" onclick="seeNotification(1)">MORE +</span></div>
</div>
          
</div>
	
	<%
}
%>
 --%>
<portlet:renderURL var="seeNotificationJspURL"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailedMBNotification.jsp"/>
	</portlet:renderURL>

<aui:script>
	function seeNotification(id)
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
		popUpWindow.titleNode.html("Notification");
		popUpWindow.io.set('uri','<%=seeNotificationJspURL%>');
		popUpWindow.io.start();

});
	}
</aui:script>

<!-- Code For Hobby Club Notification ends here -->

</div>
</body>
</html> 