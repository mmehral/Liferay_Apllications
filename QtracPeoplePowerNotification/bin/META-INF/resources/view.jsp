
<%@page import="QtracPeoplePowerNotification.portlet.PeoplePowerAPI"%>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="QtracPeoplePowerNotification.caption"/></b>
</p>

<%

System.out.println("View Qtrac : "+PeoplePowerAPI.getQtrackNotificationList("v14110"));
System.out.println("Demo View Qtrac : "+PeoplePowerAPI.getDataDemoQtrac("v14110"));
%>