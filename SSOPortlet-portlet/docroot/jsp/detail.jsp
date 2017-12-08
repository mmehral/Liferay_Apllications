<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.List"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="com.chola.sso.SSOLogic"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

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
</head>


<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long userid = themeDisplay.getUserId();
User user = UserLocalServiceUtil.getUser((userid));
String screenname=themeDisplay.getUser().getScreenName(); 

 String empid = "test";
    if(!(screenname.equalsIgnoreCase("test")))
    {
    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
    }

PeoplePowerAPI peoplePower = new PeoplePowerAPI();
JSONArray leaveData =  peoplePower.getLeaveBalance(empid); 
System.out.println("Leave Data : "+leaveData);

SSOLogic sso = new SSOLogic();
String enocodedPeoplePower = sso.encryptPeoplePower(empid);
   
String attndRegular = "https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID="+URLEncoder.encode(enocodedPeoplePower)+"&Empid="+empid.toUpperCase()+"&FunctionalityCode=1000";

%>
<body>
<center>Your Leave Balance Details : </center><br>
<table><tr><th>Leave Name</th><th>Leave Balance</th></tr>
<tr><td>Casual Leave </td><td><a target="_blank" href="<%=attndRegular%>"><div id="cl"></div></a></td></tr>
<tr><td>Paid Leave </td><td><a target="_blank" href="<%=attndRegular%>"><div id="pl"></div></a></td></tr>
<tr><td>Sick Leave </td><td><a target="_blank" href="<%=attndRegular%>"><div id="sl"></div></a></td></tr>
</table>

<hr>
<a target="_blank" href="<%=attndRegular%>"><center>Apply Leave</center></a>

<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>


   
</body>
<script type="text/javascript">

$(document).ready(function() {
	
	var data = <%=leaveData%>;
	console.log(data);
	
	for(var i in data)
	{
	     var id = data[i].Leavebalance;
	     var name = data[i].LeaveName;
	     console.log(id);
	     console.log(name);
	     
		   if(name=='SL')
			   {
			   $('#sl').html(id);
			   }
		   if(name=='PL')
		   {
		   $('#pl').html(id);
		   }
		   if(name=='CL')
		   {
		   $('#cl').html(id);
		   }
	}
	
});
</script>
</html>