<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.notificationcategorization.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<portlet:defineObjects/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
 <h1><%=myVal %></h1>

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
</body>
</html>