<%-- <%@page import="java.util.List"%>
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

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<%
	String id = request.getParameter("id");
	videogallerypath videoDetails = videogallerypathLocalServiceUtil.fetchvideogallerypath(Long.parseLong(id));
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Show" backLabel="Back" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="updateVideoDetails"></portlet:actionURL>
<aui:form action="${action}" method="post">
	<input type="hidden" name="id" value="<%=videoDetails.getId()%>"><br />
	<aui:input type="text" label="video Title" name="videoTitle" value="<%=videoDetails.getVideoTitle()%>">
		          <aui:validator name="max">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<aui:input type="text" label="video Description" name="videoDesc" value="<%=videoDetails.getVideoDesc()%>">
		          <aui:validator name="max">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	
		<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		</aui:button-row>
</aui:form>






 --%>