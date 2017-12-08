<%@page import="com.chola.videogallery.service.videogallerypathLocalServiceUtil"%>
<%@page import="com.chola.videogallery.model.videogallerypath"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.videogallery.service.videogalleryLocalServiceUtil"%>
<%@page import="com.chola.videogallery.model.videogallery"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<html>
<head>
</head>
<body>
<portlet:renderURL var="uploadVideo">
   <portlet:param name="jspPage" value="/jsp/uploadVideo.jsp" />
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
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator"))
{
%>
<a href="<%=uploadVideo%>">Create Album</a><br>
<a href="<%=updateAlbum%>">Update / Edit Album</a><br>
<a href="<%=removeAlbum%>">Remove Album</a><hr>
<%
}
%>
<div class="col-md-12" style="text-align:justify;">
<div class="BM_panel">
  <div class="right_panel_mid1_01">
    <div class="tabContent" id="about"> <span class="pht_text">VIDEOS</span>
      <div class="row con_main_panel">
  <%      
List<videogallery> img = videogalleryLocalServiceUtil.getvideogalleries(0, videogalleryLocalServiceUtil.getvideogalleriesCount());

for(videogallery videogallery : img)
{
	if(videogallery.getFlag().equalsIgnoreCase("1"))
	{
		%>
		<div class="col-md-12 con_box_panel">
		<%
		List<videogallerypath> imgpath = videogallerypathLocalServiceUtil.getAlbumDetails(videogallery.getAlbumId());
		for(videogallerypath path : imgpath)
		{
			%>
              <div class="col-md-5 con_paddi">
              <span class="con_img_cen">
              <video height="120px">
  				<source class="con_img" type="video/mp4" src="<%=path.getAlbumVideoPath()%>" />
  				</video>
  				</span>
              </div>
            <%
        	break;
		}
		%>
		 <div class="col-md-7"> <span class="con_text"><%=videogallery.getAlbumName() %></span><%=videogallery.getAlbumDesc() %> <br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery%>&id=<%=videogallery.getId()%>&albumId=<%=videogallery.getAlbumId()%>">More +</a></span></button>
              </div>
              
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