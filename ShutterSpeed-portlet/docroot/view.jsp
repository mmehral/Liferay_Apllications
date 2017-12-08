<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.ShutterSpeed"%>
<%@page import="com.chola.shutterspeed.service.shutterspeedgalleryusersLocalServiceUtil"%>
<%@page import="com.chola.shutterspeed.model.shutterspeedgalleryusers"%>
<%@page import="com.chola.shutterspeed.service.shutterspeedgalleryLocalServiceUtil"%>
<%@page import="com.chola.shutterspeed.model.shutterspeedgallery"%>
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
<script type="text/javascript">

</script>
</head>
<body>
<portlet:renderURL var="uploadImage">
<portlet:param name="jspPage" value="/jsp/uploadImage.jsp" />
</portlet:renderURL>

<portlet:renderURL var="viewGallery">
<portlet:param name="jspPage" value="/jsp/viewGallery.jsp" />
</portlet:renderURL>

<portlet:renderURL var="updateAlbum">
<portlet:param name="jspPage" value="/jsp/updateAlbum.jsp" />
</portlet:renderURL>

<portlet:renderURL var="removeAlbum">
<portlet:param name="jspPage" value="/jsp/removeAlbum.jsp" />
</portlet:renderURL>

<div class="col-md-12" style="text-align:justify;">
<div class="BM_panel">
<div class="right_panel_mid1_01">
<div class="tabContent" id="about"> <span class="pht_text">SHUTTER SPEED</span>
<div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))
{
%>
<a href="<%=uploadImage%>">Create Album</a><br>
<a href="<%=updateAlbum%>">Update / Edit Album</a><br>
<a href="<%=removeAlbum%>">Remove Album</a><br><br>

<%
List<shutterspeedgallery> gallDetails = shutterspeedgalleryLocalServiceUtil.getshutterspeedgalleries(0, shutterspeedgalleryLocalServiceUtil.getshutterspeedgalleriesCount());
if(!gallDetails.isEmpty()){
for(shutterspeedgallery details : gallDetails)
{
if(details.getFlag().equalsIgnoreCase("1"))
{
%>
<div class="col-md-12 hel_box_panel">
<div class="col-md-12"> <span class="con_text"><%=details.getAlbumName()%></span><%=details.getAlbumDesc()%> <br>
<button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&albumId=<%=details.getAlbumId()%>&id=<%=details.getId()%>">More +</a></span></button>
</div>
</div>
<%
}
}

}
else{
%>
<div class="col-md-12 con_box_panel">
No SHUTTER SPEED uploaded
</div>
<%
}
}
else{
%>
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=ShutterSpeed.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(contentIds!=null && !contentIds.equals("")){
for(Long contentId:contentIds){
List<shutterspeedgallery> bookDetails = shutterspeedgalleryLocalServiceUtil.getShutterSpeed(contentId);

if(!bookDetails.isEmpty())
{
for(shutterspeedgallery details : bookDetails)
{
if(details.getFlag().equalsIgnoreCase("1"))
{
i++;
%>
<div class="col-md-12 con_box_panel">
<div class="col-md-12"> <span class="con_text"><%=details.getAlbumName()%></span><%=details.getAlbumDesc()%> <br>
<button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&albumId=<%=details.getAlbumId()%>&id=<%=details.getId()%>">More +</a></span></button>
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
<div class="col-md-12 con_box_panel">
No Shutter Speed For you
</div>
<%
}
if(i==0){
%>
<div class="col-md-12 hel_box_panel">
No Shutter Speed For you
</div>
<%
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