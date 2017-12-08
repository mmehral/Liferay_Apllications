<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="javax.sound.sampled.Port"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Popular Links</title>
</head>
<body>
<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/view.jsp"/>
</portlet:renderURL>
<aui:script>
	function callPopular()
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
		popUpWindow.titleNode.html("Recent Activities");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>');
		popUpWindow.io.start();

});
	}
</aui:script>
<div class="col-md-12" style="padding:0px; overflow:hidden;margin-top: -5px;">
<div class="col-sm-3 yellow_panel_bg">Birthday / Anniversary</div>

<div class="col-sm-2 yellow_panel_bg">Calendar</div>

<div class="col-sm-2 yellow_panel_bg">Industry News</div>

<div class="col-sm-2 yellow_panel_bg">What&rsquo;s Trending</div>

<div class="col-sm-3 yellow_panel_bg2" onclick="callPopular()">Recent Activities</div>
</div>
<!-- <input type="button" value="Recent Activities" /> -->
</body>
</html>