<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.imagegallery.model.imagegallery"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.imagegallery.service.imagegallerypathLocalServiceUtil"%>
<%@page import="com.chola.imagegallery.model.imagegallerypath"%>
<%@page import="com.chola.imagegallery.service.imagegalleryLocalServiceUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>
</head>
<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 

<%-- <!-- <%
String id = request.getParameter("id");
imagegallery img = imagegalleryLocalServiceUtil.fetchimagegallery(Long.parseLong(id));
 %> --> --%>
<%--  Album Name : <%=img.getAlbumName() %><br>
 Album Description : <%=img.getAlbumDesc() %><br> --%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="pht_text">PHOTOS</span>
          <div class="row con_main_panel">
          <%
		  String albumId = request.getParameter("albumId");
			List <imagegallerypath> imgagePath = imagegallerypathLocalServiceUtil.getAlbumDetails(albumId);
			for(imagegallerypath imageDetails : imgagePath)
			{
		   %>
			<portlet:renderURL var="popURL">
			<portlet:param name="id" value="<%=String.valueOf(imageDetails.getId()) %>"/>
			<portlet:param name="mvcPath" value="/jsp/pop.jsp"/>
			</portlet:renderURL> 
			
			  <div class="col-lg-4 col-sm-6 text-center">
			    <span class="con_img_cen">           
               <a href="<%=popURL %>"><img alt="Chola" class="pht_img" src="<%=imageDetails.getAlbumImagePath()%>" /></a>
              </span>
              </div>
        
			<%
			}
			%> 
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>



