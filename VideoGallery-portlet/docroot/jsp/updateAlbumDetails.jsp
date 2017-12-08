<%@page import="java.util.List"%>
<%@page import="com.chola.videogallery.service.videogallerypathLocalServiceUtil"%>
<%@page import="com.chola.videogallery.model.videogallerypath"%>
<%@page import="com.chola.videogallery.service.videogalleryLocalServiceUtil"%>
<%@page import="com.chola.videogallery.model.videogallery"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

<%
	long id = ParamUtil.getInteger(request, "id");
	videogallery ref = null;
		ref = videogalleryLocalServiceUtil.getvideogallery(id);
		System.out.println("ID : " + ref);
	String albumId = ref.getAlbumId();
	List <videogallerypath> videoDetails = videogallerypathLocalServiceUtil.getAlbumDetails(albumId);
	
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Show" backLabel="Back" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="updateDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">
	<input type="hidden" name="id" value="<%=ref.getId()%>"><br />
	<aui:input type="text" label="Album Name" name="albumName" value="<%=ref.getAlbumName()%>">
		          <aui:validator name="maxLength">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<aui:input type="text" label="Album Description" name="albumDesc" value="<%=ref.getAlbumDesc()%>">
		          <aui:validator name="maxLength">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	
		<%
		for(videogallerypath path : videoDetails)
		{
		%>
	    <video width="400" controls>
		 <source src="<%=path.getAlbumVideoPath()%>" type="video/mp4">
	 	</video>
		<%
		}	
		%>
		<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		</aui:button-row>
</aui:form>






