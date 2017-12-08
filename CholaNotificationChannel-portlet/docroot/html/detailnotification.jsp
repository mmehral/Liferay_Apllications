<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<portlet:defineObjects/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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
.top_header_border{border-top: 2px solid #ca3646;;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function updateReadStatus(that1,that2,that3) {
	//alert(that1+"  :  "+that2+"  :  "+that3);
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
</head>
<body>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
String myVal = request.getParameter("id");
System.out.print(myVal);

System.out.println("User Id : : : " + themeDisplay.getUserId());

 List<Object[]> lt = NoticationCategoryCountLocalServiceUtil
		.getNotficationCategoryList(themeDisplay.getUserId(), myVal);
System.out.println("List Payload : " + lt);  

%>
<%--  <h1><%=myVal %></h1> --%>

<%
if(!lt.isEmpty()){
	%>
	<ul>
	<%
	
	for (Object[] obje : lt) {
		%>
		<li>
		<input id="event_'+<%=obje[0] %>+'" type="hidden" value='<%=obje[0] %>' >
		<input id="event_'<%=obje[1] %>'" type="hidden" value='<%=obje[1] %>' >
		<input id="event_'<%=obje[2] %>'" type="hidden" value='<%=obje[2] %>' >
		<a onclick="return updateReadStatus('<%=obje[0] %>','<%=obje[1] %>','<%=obje[2]%>')"
		href='<%=obje[5] %>'>
		<%=obje[4] %>
		</a></li>
		<%}
	%>
	</ul>
	<%
	}else{
		%>
		No Notification
		<%
}

 %>
</ul>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>