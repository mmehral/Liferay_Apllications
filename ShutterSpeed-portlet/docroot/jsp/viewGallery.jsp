<%@page import="com.chola.shutterspeed.service.shutterspeedgallerypathLocalServiceUtil"%>
<%@page import="com.chola.shutterspeed.model.shutterspeedgallerypath"%>
<%@page import="com.chola.shutterspeed.service.shutterspeedgalleryLocalServiceUtil"%>
<%@page import="com.chola.shutterspeed.model.shutterspeedgallery"%>
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

<%-- <%
String id = request.getParameter("id");
shutterspeedgallery img = shutterspeedgalleryLocalServiceUtil.fetchshutterspeedgallery(Long.parseLong(id));
 %> --%>
<%--  Album Name : <%=img.getAlbumName() %><br>
 Album Description : <%=img.getAlbumDesc() %><br> --%>
<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="pht_text">SHUTTER SPEED</span>
        <liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
          <div class="row con_main_panel">
<%
String albumId = request.getParameter("albumId");
List <shutterspeedgallerypath> imgagePath = shutterspeedgallerypathLocalServiceUtil.getAlbumDetails(albumId);
for(shutterspeedgallerypath imageDetails : imgagePath)
{
%>
 <img alt="Chola" class="pht_img" src="<%=imageDetails.getAlbumImagePath()%>" />
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
