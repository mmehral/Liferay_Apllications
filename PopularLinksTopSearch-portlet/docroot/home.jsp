<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
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
		width: 475,
		height:500
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
<%
 ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
String url=themeDisplay.getURLCurrent();
//out.println(url); 
if(url.equalsIgnoreCase("/") || url.contains("/home") || url.equalsIgnoreCase("/group/cholamandalam-investment-and-finance"))
{
%>
<div class="container gdmor_panel" style="padding-left: 0px;">
<div class="col-md-12" style="padding:0px; overflow:hidden;margin-top: -5px;background: url(/theme/images/custom/yellow_gradient.gif) repeat-x;">
<div class="col-sm-5 yellow_panel_bg wid_panel_01">Birthday / Anniversary</div>

<div class="col-sm-2 yellow_panel_bg wid_panel_02"><a class="text_yl_01" href="/group/cholamandalam-investment-and-finance/industry-news">Industry News</a></div>

<div class="col-sm-2 yellow_panel_bg wid_panel_02"><a class="text_yl_01" href="/group/cholamandalam-investment-and-finance/what-s-today-chola-live-feed">What&rsquo;s Trending</a></div>

<div class="col-sm-3 yellow_panel_bg2 text_yl_01 wid_panel_02" onclick="callPopular()">Recent Activities</div>
</div>
</div>
<%}
else
{
	%>
<div class="container gdmor_panel">
<div class="col-md-12" style="padding:0px">

<div class="col-sm-12 yellow_panel_bg"><a class="text_yl_01" href="/group/cholamandalam-investment-and-finance/home">Notification</a></div>

<div class="col-sm-12 yellow_panel_bg"><a class="text_yl_01" href="/group/cholamandalam-investment-and-finance/industry-news">Industry News</a></div>

<div class="col-sm-12 yellow_panel_bg"><a class="text_yl_01" href="/group/cholamandalam-investment-and-finance/what-s-today-chola-live-feed">What&rsquo;s Trending</a></div>

<div class="col-sm-12 yellow_panel_bg2 text_yl_01" onclick="callPopular()">Recent Activities</div>

</div>
</div>
	<%
}
%>
<script type="text/javascript">  

		$(document).ready(function() {
			$.ajax({
				url : "<portlet:resourceURL id='HitCount'/>",
				type : 'POST',
				dataType : 'json',
				success : function(data) {
					console.log(JSON.stringify(data));
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		});
</script>		
</body>
</html>