<%@page import="com.liferay.portal.kernel.theme.PortletDisplay"%>
<%@page import="com.chola.appcorner.service.repliedLocalServiceUtil"%>
<%@page import="com.chola.appcorner.model.replied"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.appcorner.service.postLocalServiceUtil"%>
<%@page import="com.chola.appcorner.model.post"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://liferay.com/tld/aui"  prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<html>
<head>
<portlet:defineObjects />
<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/jsp/postReply.jsp"/>
</portlet:renderURL>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<aui:script>
function reply(id,appby)
{
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
		popUpWindow.titleNode.html("Reply Message");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+id+'&appby='+appby);
		popUpWindow.io.start();

		});

			}
</aui:script>
</head>

<portlet:actionURL name="save" var="saveURL" />
<body>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();
	String portletId= portletDisplay.getId();
	System.out.println("portletId : "+portletId);
	//String appTo = themeDisplay.getURLCurrent().substring(themeDisplay.getURLCurrent().lastIndexOf("/") + 1).trim();
	System.out.println(themeDisplay.getCDNBaseURL());
	System.out.println(themeDisplay.getURLCurrent());
	//System.out.println("Wall of : "+appTo);
	String appTo = "test";
	User userTo = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), appTo);
%>
	<aui:form action="<%=saveURL %>" method="post" name="fm">
		<input type="hidden" value="<%=appTo%>" name="appTo"/>
		<aui:input type="textarea" label="Appreciation Message"
                rows="5" cols="30" name="appMessage" >
          <aui:validator name="max">5000</aui:validator>
          <aui:validator name="required"></aui:validator>     
         </aui:input>
       <aui:button-row>
          <aui:button type="submit" value="Submit"/>
      </aui:button-row>
	</aui:form>
<%
	List<post> message = postLocalServiceUtil.getAppToData(themeDisplay.getUserId());
	if(!message.isEmpty() || message!=null)
	{
		%>
		<b>Appreciation Posts :</b>
		<%
	}
	for(post postData : message)
	{
		User user = UserLocalServiceUtil.getUserById(themeDisplay.getCompanyId(), postData.getAppBy());
		%>
		<div style="font-size: small;"><%=postData.getAppMessage()%> &nbsp;&nbsp;&nbsp;- <%=user.getFirstName()%> <%=user.getLastName()%></div><br>
		
		<%
		List<replied> repliedMsg = repliedLocalServiceUtil.getRepliedData(postData.getId());
		for(replied repliedData : repliedMsg)
		{
			user = UserLocalServiceUtil.getUserById(themeDisplay.getCompanyId(), repliedData.getRepliedBy());
			%>
			<div style="font-size: small; padding-left: 82px;"><%=repliedData.getRepliedMessage()%> &nbsp;&nbsp;&nbsp;- <%=user.getFirstName()%> <%=user.getLastName()%><br></div>
			<%
		}
		if(themeDisplay.getUserId()==userTo.getUserId())
		{
		%>
		<div style="font-size: 12px;" onClick="reply(<%=postData.getId()%>,<%=postData.getAppBy()%>)">Reply</div>
		<%
		}
		%>
		<hr>
		<%
	}
}
else
{
%>
Please Sign In 
<%
}
%>	
</body>
</html>