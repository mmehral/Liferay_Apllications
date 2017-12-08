<%@page import="java.util.ArrayList"%>
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
<script>
	function getNotificationList(that) {

		var str = that.id;
		var str1 = str.split("_");
		var str2 = "value_" + str1[1];
		//alert("hiiii"+str2);
		var val1 = document.getElementById(str2).value;
		alert(val1);
		//alert(val1);
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
		alert(that1+"  :  "+that2+"  :  "+that3);
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
				//alert(data);
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
<%
	ArrayList<Object[]> notificationCategoryCountList = new ArrayList();
	notificationCategoryCountList = (ArrayList<Object[]>) renderRequest
			.getAttribute("notificationCategoryCount");
%>
<%
	if (notificationCategoryCountList != null||!notificationCategoryCountList .equals("")) {
%>
<!-- <nav class="navigation"> -->
<ul class="mainmenu">
	<%
		int i = 0;
			for (Object[] obj : notificationCategoryCountList) {
	%>
	<input id="value_<%=i%>" type="hidden" value="<%=obj[0]%>" />
	<li><a href="#" onclick="return getNotificationList(this);"
		id="Notify_<%=i%>"><%=obj[0]%>&nbsp;&nbsp;&nbsp;&nbsp;<%=obj[1]%></a>

		<ul class="dummy">

		</ul> <!-- 	<ul class="submenu">
				<li><a href="">Tops</a></li>
				<li><a href="">Bottoms</a></li>
				<li><a href="">Footwear</a></li>
			</ul> --></li>


	<%
		i++;
			}
	%>
</ul>
<!-- </nav> -->
<%
	}else{%>
		No Notifications for you
	<%}
%>
</body>
</html>