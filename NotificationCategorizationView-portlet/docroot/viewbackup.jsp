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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<head></head>
    
<portlet:defineObjects />
<portlet:resourceURL var="ajaxURL"></portlet:resourceURL>

<script>
function getNotificationList(that) {
	
	var val1=that.value;
	alert(val1);
	
	
$.ajax({
	url : "<portlet:resourceURL id='Users'/>",
	type : 'POST',
	//dataType : 'json',
	data:{val:val1},
	success : function(data) {
	console.log(JSON.stringify(data));
	alert(JSON.stringify(data));
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});

 
 }
  
  
  </script>
<%ArrayList<Object[]> notificationCategoryCountList=new ArrayList();
notificationCategoryCountList=(ArrayList<Object[]>)renderRequest.getAttribute("notificationCategoryCount");
%>
<%if(notificationCategoryCountList!=null){ %>

<%
for(Object[] obj :notificationCategoryCountList){ %>
<input id="notifyVal" type="button" value="<%=obj[0]%>" onclick="return getNotificationList(this);"/>

<%=obj[1] %>===<%=obj[2]%><br>
<table id="notiList">
</table>

<%} %>
<%}%>