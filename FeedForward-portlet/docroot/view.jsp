<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.FeedForward"%>
<%@page import="com.chola.feedforward.service.feedforwardgalleryusersLocalServiceUtil"%>
<%@page import="com.chola.feedforward.model.feedforwardgalleryusers"%>
<%@page import="com.chola.feedforward.service.feedforwardgalleryLocalServiceUtil"%>
<%@page import="com.chola.feedforward.model.feedforwardgallery"%>
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
        <div class="tabContent" id="about"> <span class="abt_text_head"> FEED <span class="abt_text_headcol">FORWARD</span></span>
          <div class="row con_main_panel">

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if((themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))||themeDisplay.isSignedIn() && request.isUserInRole("L&D Admin"))
{
%>
<a href="<%=uploadImage%>">Create Album</a><br>
<a href="<%=updateAlbum%>">Update / Edit Album</a><br>
<a href="<%=removeAlbum%>">Remove Album</a><br><br>
<%
List<feedforwardgallery> gallDetails = feedforwardgalleryLocalServiceUtil.getfeedforwardgalleries(0, feedforwardgalleryLocalServiceUtil.getfeedforwardgalleriesCount());
if(!gallDetails.isEmpty())
{
for(feedforwardgallery details : gallDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getAlbumName()%></span></span><%=details.getAlbumDesc() %><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&albumId=<%=details.getAlbumId()%>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>
	<%
	}
	
}
}
else{
	%>
	<div class="col-md-12 hel_box_panel">
	No Feed Forward uploaded
	</div>
	<%
	
}
}else{

	User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=FeedForward.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(!contentIds.isEmpty()){
for(Long contentId:contentIds){
List<feedforwardgallery> bookDetails = feedforwardgalleryLocalServiceUtil.getFeedForwards(contentId);

if(!bookDetails.isEmpty()){
	
	for(feedforwardgallery details : bookDetails)
	{
		if(details.getFlag().equalsIgnoreCase("1"))
		{
			i++;
		%>
		<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getAlbumName()%></span></span><%=details.getAlbumDesc() %><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&albumId=<%=details.getAlbumId()%>&id=<%=details.getId()%>">More +</a></span></button>
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
	No Feed Forward For you
	</div>
	<%
	
}

if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Feed Forward For you
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