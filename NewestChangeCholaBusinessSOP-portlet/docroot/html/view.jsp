<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.BSopAction"%>
<%@page import="com.chola.bsop.service.bsoppathLocalServiceUtil"%>
<%@page import="com.chola.bsop.model.bsoppath"%>
<%@page import="com.chola.bsop.service.bsopdetailsLocalServiceUtil"%>
<%@page import="com.chola.bsop.model.bsopdetails"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<portlet:renderURL var="addSop">
   <portlet:param name="jspPage" value="/html/businessSOP.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updateSop">
   <portlet:param name="jspPage" value="/html/updatesop.jsp" />
</portlet:renderURL>
<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> BUSINESS <span class="abt_text_headcol">SOP</span></span>
          <div class="row con_main_panel">

<portlet:actionURL name="sendNotification" var="saveURL" />
<%

ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("Business SOP Admin"))
	{
		%>
<a href="<%=addSop%>">Add a SOP</a><br>
<a href="<%=updateSop%>">Update or Delete a SOP</a>

		<%

	List<bsopdetails> busDetails = bsopdetailsLocalServiceUtil.getbsopdetailses(0, bsopdetailsLocalServiceUtil.getbsopdetailsesCount());
	if(!busDetails.isEmpty()){
	for(bsopdetails details : busDetails)
	{
		if(details.getFlag().equalsIgnoreCase("1"))
		{
		%>
		<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBtitle() %></span><br></span><%=details.getBdesc() %>
              
		<%
		List<bsoppath> sopPath = bsoppathLocalServiceUtil.getbsopFileDetail(details.getContent_id());
		for(bsoppath path :sopPath)
		{
		%>
		  <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" target="_blank" target="_blank" href="<%=path.getBdoc() %>"><%=path.getFilename() %></a></span></button><br>
		<%
		}
		%>
		</div>
		 </div>
		<%
		}
	}
	}
	else{
		%>
		<div class="col-md-12 hel_box_panel">
		No Business SOP uploaded
		</div>
		<%
	}
	}
	else{

%>

<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=BSopAction.getContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(!contentIds.isEmpty()){
	

for(Long contentId:contentIds){
	List<bsopdetails> busDetails = bsopdetailsLocalServiceUtil.getbsopDetail(contentId);
	if(!busDetails.isEmpty()){
		i++;
	for(bsopdetails details : busDetails)
	{
		if(details.getFlag().equalsIgnoreCase("1"))
		{
		%>
		<div class="col-md-12 hel_box_panel">
              <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBtitle() %></span><br></span><%=details.getBdesc() %>
          
		<%
		List<bsoppath> sopPath = bsoppathLocalServiceUtil.getbsopFileDetail(details.getContent_id());
		
		for(bsoppath path :sopPath)
		{
		%>
		 <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" target="_blank" target="_blank" href="<%=path.getBdoc() %>"><%=path.getFilename() %></a></span></button><br>
		<%
		}
		%>
		</div>
		 </div>
		<%
		}
	}
	}
}
}
else{
	%>
	<div class="col-md-12 hel_box_panel">
	No Business SOP For you
	</div>
	<%
}
if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Business SOP For you
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