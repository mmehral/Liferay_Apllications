<%@page import="com.chola.contest.service.cholacontestLocalServiceUtil"%>
<%@page import="com.chola.contest.model.cholacontest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>	
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	long contestId = ParamUtil.getInteger(request, "id");
	System.out.println("Contest Id==========" + contestId);
	cholacontest ref = null;
	if (contestId >= 01) {
		ref = cholacontestLocalServiceUtil.getcholacontest(contestId);
		System.out.println("####" + ref);
	}
%>

<portlet:renderURL var="textdialog"
windowState="<%=LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="id" value="<%=String.valueOf(ref.getId()) %>"/>
<portlet:param name="mvcPath" value="/html/textpop.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="uploaddialog"
windowState="<%=LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="id" value="<%=String.valueOf(ref.getId()) %>"/>
<portlet:param name="mvcPath" value="/html/uploadpop.jsp"/>
</portlet:renderURL>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>



<liferay-ui:header title="Show Contest"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
</body>
<table width="100%">
<tr>
<td colspan="2">Chola Contest Description</td>
</tr>
<tr>
<td colspan="2"><%=ref.getContent() %>
</td>
</tr>
<tr>
<td>
<button type="button" id="<portlet:namespace/>OpenPopUPText">Text</button>
</td>
<td>
<button type="button" id="<portlet:namespace/>OpenPopUPUpload">Upload</button>
</td>
</tr>


</table>

<script>
window.<portlet:namespace/>LiferayDialogWindowPopUP = null;
AUI().use('aui-base','aui-io-plugin-deprecated','liferay-util-window',function(A) {
A.one('#<portlet:namespace/>OpenPopUPText').on('click',function(){
<portlet:namespace />LiferayDialogWindowPopUP=Liferay.Util.Window.getWindow(
{
dialog: {
centered: true,
constrain2view: true,
cssClass: 'my-liferay-popup',
modal: true,
resizable: false,
//destroyOnClose:true,
destroyOnHide:true,
width:700, 
height:700,
after: {
destroy: function(event) {
console.log("function which  will call after close the dialog");
},
},
}
}
).plug(
A.Plugin.IO,
{
autoLoad: false
}).render();
window.<portlet:namespace />LiferayDialogWindowPopUP.show();
window.<portlet:namespace />LiferayDialogWindowPopUP.titleNode.html("Text Dialogue");
window.<portlet:namespace />LiferayDialogWindowPopUP.io.set('uri','<%=textdialog%>');
window.<portlet:namespace />LiferayDialogWindowPopUP.io.start();
});
});
</script>

<script>
window.<portlet:namespace/>LiferayDialogWindowPopUP = null;
AUI().use('aui-base','aui-io-plugin-deprecated','liferay-util-window',function(A) {
A.one('#<portlet:namespace/>OpenPopUPUpload').on('click',function(){
<portlet:namespace />LiferayDialogWindowPopUP=Liferay.Util.Window.getWindow(
{
dialog: {
centered: true,
constrain2view: true,
cssClass: 'my-liferay-popup',
modal: true,
resizable: false,
//destroyOnClose:true,
destroyOnHide:true,
width:700, 
height:700,
after: {
destroy: function(event) {
console.log("function which  will call after close the dialog");
},
},
}
}
).plug(
A.Plugin.IO,
{
autoLoad: false
}).render();
window.<portlet:namespace />LiferayDialogWindowPopUP.show();
window.<portlet:namespace />LiferayDialogWindowPopUP.titleNode.html("Upload Dialogue");
window.<portlet:namespace />LiferayDialogWindowPopUP.io.set('uri','<%=uploaddialog%>');
window.<portlet:namespace />LiferayDialogWindowPopUP.io.start();
});
});
</script>
</html>