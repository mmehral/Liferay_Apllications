<%@page import="java.net.URLEncoder"%>
<%@page import="com.chola.notificationchannel.NotificationCategorizationAction"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
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
System.out.println("Employee Id from RHDSPeoplePower Mapping Table"+empId);


/* List<Object[]> objectPeoplePowerTable=NoticationCategoryCountLocalServiceUtil.getPeoplePowerNotificationDetails(empId);


if(objectPeoplePowerTable!=null){
	
	JSONObject objPeoplePower = new JSONObject();
	for(Object[] singleObjPPInfo:objectPeoplePowerTable){
		
		System.out.println("ID : " + singleObjPPInfo[0].toString());
		System.out.println("FunctionalityCode: " + singleObjPPInfo[1].toString());
		System.out.println("ModCnt : " + singleObjPPInfo[2].toString());
		System.out.println("Targeted_Url: " + singleObjPPInfo[3].toString());
		System.out.println("Identification_Flag : " + singleObjPPInfo[4].toString());
		System.out.println("Notification_Text : " + singleObjPPInfo[5].toString());
		System.out.println("EmpId : " + singleObjPPInfo[6].toString());
		System.out.println("ApprovalCategory : " + singleObjPPInfo[7].toString());
		System.out.println("ErrorStatus : " + singleObjPPInfo[8].toString());
		
		
		 int ModCnt = Integer.parseInt(singleObjPPInfo[2].toString());
		  	String notificationTxt = singleObjPPInfo[5].toString();
		  	String notificationUrl = singleObjPPInfo[3].toString();
		  	String functionalityCode=singleObjPPInfo[1].toString();
		  	//String empppId=singleObjPPInfo[6].toString();
		  	String empppId="V481";
		  	
		  	
		  	NotificationCategorizationAction sso = new NotificationCategorizationAction();
			String enocodedPeoplePower = sso.encryptPeoplePower(empppId);
			String encodedADID = URLEncoder.encode(enocodedPeoplePower);
			String enocodedQtrac = sso.encryptPeoplePower(empppId);
			String ssoUrl =  "https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID="+encodedADID+"&Empid="+empppId.toUpperCase();
		 	
			String qtrack = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac; */
		%>
		
		
		<%-- <a href='https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID=<%=encodedADID%>&Empid=<%=empppId.toUpperCase()%>&FunctionalityCode=<%=functionalityCode%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br> --%>
		
		<%
	/* 	
	}
	
	
	
}  */

Object obj=PeoplePowerAPI.getNotificationList(empId);

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
	  	String functionalityCode=objects.getString("FunctionalityCode");
	  	String empppId=objects.getString("EmpId");
	  	
	  	NotificationCategorizationAction sso = new NotificationCategorizationAction();
	  	String enocodedPeoplePower = sso.encryptPeoplePower(empppId);
		String encodedADID = URLEncoder.encode(enocodedPeoplePower);
		String enocodedQtrac = sso.encryptPeoplePower(empppId);
	  	%>
	  	 <a href='https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID=<%=encodedADID%>&Empid=<%=empppId.toUpperCase()%>&FunctionalityCode=<%=functionalityCode%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br>
	  	<%
	}
}else{
	JSONObject jsonObject = new JSONObject(obj.toString());
	int ModCnt = jsonObject.getInt("ModCnt");
	String notificationTxt = jsonObject.getString("Notification_Text");
	String notificationUrl = jsonObject.getString("Targeted_Url");
	int functionalityCode=jsonObject.getInt("FunctionalityCode");
  	String empppId=jsonObject.getString("EmpId");
  	
  	NotificationCategorizationAction sso = new NotificationCategorizationAction();
  	String enocodedPeoplePower = sso.encryptPeoplePower(empppId);
	String encodedADID = URLEncoder.encode(enocodedPeoplePower);
	String enocodedQtrac = sso.encryptPeoplePower(empppId);
	%>
	 <a href='https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID=<%=encodedADID%>&Empid=<%=empppId.toUpperCase()%>&FunctionalityCode=<%=functionalityCode%>' target='_blank'><%=notificationTxt %></a><strong style="float:right;"><%=ModCnt %></strong><br>
	<%
}
%>
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>