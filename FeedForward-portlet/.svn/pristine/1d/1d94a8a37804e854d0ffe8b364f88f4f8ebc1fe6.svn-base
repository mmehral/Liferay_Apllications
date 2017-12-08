<%@page import="com.chola.feedforward.service.feedforwardgallerypathLocalServiceUtil"%>
<%@page import="com.chola.feedforward.model.feedforwardgallerypath"%>
<%@page import="com.chola.feedforward.service.feedforwardgalleryLocalServiceUtil"%>
<%@page import="com.chola.feedforward.model.feedforwardgallery"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
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

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> FEED <span class="abt_text_headcol">FORWARD</span></span>
          <div class="row con_main_panel">
  
 <%
String id = request.getParameter("id");
feedforwardgallery img = feedforwardgalleryLocalServiceUtil.fetchfeedforwardgallery(Long.parseLong(id));
 %>
 Album Name : <%=img.getAlbumName() %><br>
 Album Description : <%=img.getAlbumDesc() %><br>
 <%
 %> 
 	
<%
String albumId = request.getParameter("albumId");
List <feedforwardgallerypath> imgagePath = feedforwardgallerypathLocalServiceUtil.getAlbumDetails(albumId);
for(feedforwardgallerypath imageDetails : imgagePath)
{
%>
 <a href="<%=imageDetails.getAlbumImagePath()%>" target="_blank"><%=imageDetails.getImageTitle() %></a>
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
