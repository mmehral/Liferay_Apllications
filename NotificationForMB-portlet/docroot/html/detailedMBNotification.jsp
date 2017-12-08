<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<portlet:resourceURL var="myMBList" id="myMBList"></portlet:resourceURL>

<portlet:resourceURL var="myMBMarkAsRead" id="myMBMarkAsRead"></portlet:resourceURL>
<script type="text/javascript">
function markAsRead(eventId){
	$.ajax({
		url : '<%=myMBMarkAsRead%>',
		type : 'POST',
		 dataType : 'json', 
		 data: { eventId: eventId} ,
		success : function(data) {
			console.log(data);
	for(var i in data.data ){
		
	}		
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
}

function timeSince(date) {

	  var seconds = Math.floor((new Date() - date) / 1000);

	  var interval = Math.floor(seconds / 31536000);

	  if (interval > 1) {
	    return interval + " years ago";
	  }
	  interval = Math.floor(seconds / 2592000);
	  if (interval > 1) {
	    return interval + " months ago";
	  }
	  interval = Math.floor(seconds / 86400);
	  if (interval > 1) {
	    return interval + " days ago";
	  }
	  interval = Math.floor(seconds / 3600);
	  if (interval > 1) {
	    return interval + " hours ago";
	  }
	  interval = Math.floor(seconds / 60);
	  if (interval > 1) {
	    return interval + " minutes ago";
	  }
	  return Math.floor(seconds) + " seconds ago";
	}
</script>
<script type="text/javascript">
$( document ).ready(function() {
	
 	$.ajax({
		url : '<%=myMBList%>',
		type : 'POST',
		 dataType : 'json', 
		success : function(data) {
			console.log(data);
	for(var i in data.data ){
		var payLoadobj = JSON.parse(data.data[i].event_payload);
		var d = new Date(data.data[i].event_timestamp);
		var agoTime=timeSince(d);
		
		$('#notify').append("<div><a href="+payLoadobj.entryURL+" onclick='markAsRead("+data.data[i].event_id+")' >"+payLoadobj.fullName+" replied to a thread</br>"
		+payLoadobj.entryTitle+"</br>"+agoTime+"</a>"
		+"</div>"); 
	}		
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
});
</script>

<div id="notify"></div>
</body>
</html>