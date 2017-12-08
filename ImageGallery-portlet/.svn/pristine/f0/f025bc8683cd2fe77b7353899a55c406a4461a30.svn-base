<%@page import="com.chola.imagegallery.service.imagegallerypathLocalServiceUtil"%>
<%@page import="com.chola.imagegallery.model.imagegallerypath"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.imagegallery.service.imagegalleryLocalServiceUtil"%>
<%@page import="com.chola.imagegallery.model.imagegallery"%>
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

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))
{
%>
<a href="<%=uploadImage%>">Create Album</a><br>
<a href="<%=updateAlbum%>">Update / Edit Album</a><br>
<a href="<%=removeAlbum%>">Remove Album</a><hr>
<%
}
 %>
 <div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="pht_text">PHOTOS</span>
          <div class="row con_main_panel">
            
            <%
            List<imagegallery> img = imagegalleryLocalServiceUtil.getimagegalleries(0, imagegalleryLocalServiceUtil.getimagegalleriesCount());

	for(imagegallery imageGallery : img)
	{
		
	if(imageGallery.getFlag().equalsIgnoreCase("1"))
	{
		%>
		<div class="col-md-12 con_box_panel">
		<%
		List<imagegallerypath> imgpath = imagegallerypathLocalServiceUtil.getAlbumDetails(imageGallery.getAlbumId());
		for(imagegallerypath path : imgpath)
		{
			%>
              <div class="col-md-5 con_paddi"><span class="con_img_cen"><img class="con_img" src="<%=path.getAlbumImagePath()%>" /></span>
              </div>
            <%
        	break;
		}
		%>
		 <div class="col-md-7"> <span class="con_text"><%=imageGallery.getAlbumName() %></span><%=imageGallery.getAlbumDesc() %> <br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery%>&id=<%=imageGallery.getId()%>&albumId=<%=imageGallery.getAlbumId()%>">More +</a></span></button>
              </div>
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