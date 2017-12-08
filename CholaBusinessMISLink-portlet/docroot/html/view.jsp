
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.action.BusinessMisAction"%>
<%@page import="com.chola.businessmis.service.businessmisusersLocalServiceUtil"%>
<%@page import="com.chola.businessmis.model.businessmisusers"%>
<%@page import="com.chola.businessmis.service.businessmisdetailsLocalServiceUtil"%>
<%@page import="com.chola.businessmis.model.businessmisdetails"%>
<%@page import="java.util.List"%>

<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />


<portlet:renderURL var="ViewHTML"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailedhtmlview.jsp"/>
</portlet:renderURL>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<aui:script>
function sendId(id)
{
	console.log(id);
	
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
	width: 1200,
	height:700
	}
	}
	).plug(
	A.Plugin.IO,
	{
	autoLoad: false
	}).render();
	popUpWindow.show();
	popUpWindow.titleNode.html("");
	popUpWindow.io.set('uri','<%=ViewHTML%>&id='+id);
	popUpWindow.io.start();

});
}
</aui:script>
</head>
<body>
<portlet:renderURL var="addSop">
   <portlet:param name="jspPage" value="/html/businessMIS.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updateSop">
   <portlet:param name="jspPage" value="/html/updatemis.jsp" />
</portlet:renderURL>





<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> BUSINESS <span class="abt_text_headcol">MIS</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("Business MIS Admin"))
	{
%>
<a href="<%=addSop%>">Add Business MIS</a><br>
<a href="<%=updateSop%>">Update Business MIS</a><br>

<%

List<businessmisdetails> busDetails = businessmisdetailsLocalServiceUtil.getbusinessmisdetailses(0, businessmisdetailsLocalServiceUtil.getbusinessmisdetailsesCount());
if(!busDetails.isEmpty()){

for(businessmisdetails details : busDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBusinesstitle() %></span><br></span><%=details.getBusinessDesc() %>
	<button class="con_btn_styl"><span class="con_more"><a class="all_text_link" onclick="sendId(<%=details.getId() %>)">More</a></span></button><br>
              </div></div>
	<%

	}
}
}else{
	%>
	No Business MIS uploaded
	<%
}

	}
	
	else{
		
	
%>
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=BusinessMisAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(contentIds!=null && !contentIds.equals("")){
	

for(Long contentId:contentIds){

	List<businessmisdetails> busDetails = businessmisdetailsLocalServiceUtil.getbmisDetail(contentId);
if(!busDetails.isEmpty()){
	i++;
	for(businessmisdetails details : busDetails)
	{
		%>
	<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBusinesstitle() %></span><br></span><%=details.getBusinessDesc() %>
	<button class="con_btn_styl"><span class="con_more"><a class="all_text_link" onclick="sendId(<%=details.getId() %>)">More</a></span></button><br>
              </div></div>
		<%
	}	
		
	}

}
}else{
	%>
	<div class="col-md-12 hel_box_panel">
	No Business MIS For you
	</div>
	<%
}

if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Business MIS For you
	</div>
	<%
}
}
}
%>


</div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>