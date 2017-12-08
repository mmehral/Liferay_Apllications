<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.CholaTalkies"%>
<%@page import="com.service.cholatalkiesusersLocalServiceUtil"%>
<%@page import="com.model.cholatalkiesusers"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.cholatalkiespathLocalServiceUtil"%>
<%@page import="com.model.cholatalkiespath"%>
<%@page import="com.service.cholatalkiesLocalServiceUtil"%>
<%@page import="com.model.cholatalkies"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />
<html>
<head>
	
</head>
<body>
<portlet:renderURL var="uploadVideo">
   <portlet:param name="jspPage" value="/html/uploadVideo.jsp" />
</portlet:renderURL>

<portlet:renderURL var="viewGallery">
   <portlet:param name="jspPage" value="/html/viewGallery.jsp" />
</portlet:renderURL>

<portlet:renderURL var="updateAlbum">
   <portlet:param name="jspPage" value="/html/updateAlbum.jsp" />
</portlet:renderURL>

<portlet:renderURL var="removeAlbum">
   <portlet:param name="jspPage" value="/html/removeAlbum.jsp" />
</portlet:renderURL>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> CHOLA <span class="abt_text_headcol">TALKIES</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin"))
	{
%>
<a href="<%=uploadVideo%>">Create Video</a><br>
<a href="<%=updateAlbum%>">Update / Edit Video</a><br>
<a href="<%=removeAlbum%>">Remove Video</a><br><br>

<%
List<cholatalkies> bookDetails = cholatalkiesLocalServiceUtil.getcholatalkieses(0, cholatalkiesLocalServiceUtil.getcholatalkiesesCount());
if(!bookDetails.isEmpty()){

for(cholatalkies details : bookDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getVideoName()%></span></span><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>
	<%
	}
}
}else{
	%>
	No Chola Talkies uploaded
	<%
}
}
	else{
%>
	
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=CholaTalkies.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(!contentIds.isEmpty()){
for(Long contentId:contentIds){
	List<cholatalkies> bookDetails = cholatalkiesLocalServiceUtil.cholaTalkiesVideoDetails(contentId);
	
	
	if(!bookDetails.isEmpty()){
		i++;
	for(cholatalkies details : bookDetails)
	{
		
		if(details.getFlag().equalsIgnoreCase("1"))
		{ 
		%>
 		<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getVideoName()%></span></span><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>
		<%
		}
		}
	}
}
}else{
	%>
	<div class="col-md-12 hel_box_panel">
	No Chola Talkies For you
	</div>
	<%
}

if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Chola Talkies For you
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