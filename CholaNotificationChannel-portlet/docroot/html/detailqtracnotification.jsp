<%@page import="java.net.URLEncoder"%>
<%@page import="com.chola.notificationchannel.NotificationCategorizationAction"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
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
</head>
<body>
<%
String myVal = request.getParameter("id");
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
User thisUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
String empId=NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(thisUser.getScreenName());

/* List<Object[]> objectQtracTable=NoticationCategoryCountLocalServiceUtil.getQtracNotificationDetails(empId);

if(objectQtracTable!=null){
	
	for(Object[] singleObjQtracInfo:objectQtracTable){
		
		System.out.println("ID : " + singleObjQtracInfo[0].toString());
		System.out.println("FunctionalityCode: " + singleObjQtracInfo[1].toString());
		System.out.println("ModCnt : " + singleObjQtracInfo[2].toString());
		System.out.println("Targeted_Url: " + singleObjQtracInfo[3].toString());
		System.out.println("Identification_Flag : " + singleObjQtracInfo[4].toString());
		System.out.println("Notification_Text : " + singleObjQtracInfo[5].toString());
		System.out.println("EmpId : " + singleObjQtracInfo[6].toString());
		System.out.println("ApprovalCategory : " + singleObjQtracInfo[7].toString());
		System.out.println("ErrorStatus : " + singleObjQtracInfo[8].toString());
		
		
		int ModCnt = Integer.parseInt(singleObjQtracInfo[2].toString());
	  	String notificationTxt = singleObjQtracInfo[5].toString();
	  	String notificationUrl = singleObjQtracInfo[3].toString();
		String functionalityCode=singleObjQtracInfo[1].toString();
	  	String empppqtrac=singleObjQtracInfo[6].toString();
		
	  	
	  	NotificationCategorizationAction sso = new NotificationCategorizationAction();
		String enocodedPeoplePower = sso.encryptPeoplePower(empppqtrac);
		String encodedADID = URLEncoder.encode(enocodedPeoplePower);
		String enocodedQtrac = sso.encryptPeoplePower(empppqtrac);
		String ssoUrl =  "https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID="+encodedADID+"&Empid="+empppqtrac.toUpperCase();
	 	
		String qtrack = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac;
	  	 */
		%>
	  	<%-- <a href='<%=qtrack%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br> --%>
	  	<%
	/* }
	
	
	
} */


Object obj=PeoplePowerAPI.getQtrackNotificationList(empId);

%>
 
<%
if(obj instanceof JSONArray){
	JSONArray jsonArray = new JSONArray(obj.toString());
	
	for(int i = 0; i < jsonArray.length(); i++)
	{
	      JSONObject objects = jsonArray.getJSONObject(i);
	      int ModCnt = objects.getInt("ModCnt");
	  	String notificationTxt = objects.getString("Notification_Text");
	  	String notificationUrl = objects.getString("Targeted_Url");
	  	int functionalityCode=objects.getInt("FunctionalityCode");
	  	String empppqtrac=objects.getString("EmpId");
	  	
	  	NotificationCategorizationAction sso = new NotificationCategorizationAction();
		String enocodedPeoplePower = sso.encryptPeoplePower(empppqtrac);
		String encodedADID = URLEncoder.encode(enocodedPeoplePower);
		String enocodedQtrac = sso.encryptPeoplePower(empppqtrac);
	  	String qtrack = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac;
	  	%>
	  	<a href='<%=qtrack%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br>
	  	<%
	}
}else{
	JSONObject jsonObject = new JSONObject(obj.toString());
	int ModCnt = jsonObject.getInt("ModCnt");
	String notificationTxt = jsonObject.getString("Notification_Text");
	String notificationUrl = jsonObject.getString("Targeted_Url");
	int functionalityCode=jsonObject.getInt("FunctionalityCode");
  	String empppqtrac=jsonObject.getString("EmpId");
	
	NotificationCategorizationAction sso = new NotificationCategorizationAction();
  	String enocodedPeoplePower = sso.encryptPeoplePower(empppqtrac);
	String encodedADID = URLEncoder.encode(enocodedPeoplePower);
	String enocodedQtrac = sso.encryptPeoplePower(empppqtrac);
	String qtrack = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac;
	%>
	<a href='<%=qtrack%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br>
	<%
}
%> 
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>