<%@page import="com.service.cholatalkiespathLocalServiceUtil"%>
<%@page import="com.service.cholatalkiesLocalServiceUtil"%>
<%@page import="com.model.cholatalkies"%>
<%@page import="com.model.cholatalkiespath"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

<portlet:renderURL var="updateVideo">
   <portlet:param name="jspPage" value="/jsp/updateVideoDetails.jsp" />
</portlet:renderURL>

<%
	long id = ParamUtil.getInteger(request, "id");
cholatalkies ref = null;
		ref = cholatalkiesLocalServiceUtil.getcholatalkies(id);
		System.out.println("ID : " + ref);
	String albumId = ref.getVideoId();
	List <cholatalkiespath> videoDetails = cholatalkiespathLocalServiceUtil.getCTDetails(String.valueOf(albumId));
	
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Show" backLabel="Back" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="updateDetails"></portlet:actionURL>
<aui:form action="${action}" method="post">
	<input type="hidden" name="id" value="<%=ref.getId()%>"><br />
	<aui:input type="text" label="Video Name" name="albumName" value="<%=ref.getVideoName()%>">
		          <aui:validator name="max">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<aui:input type="text" label="Video Description" name="albumDesc" value="<%=ref.getVideoDesc()%>">
		          <aui:validator name="max">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<table border="2px">
	<tr>
	<td>Image </td>
	<td>Title </td>
	<td>Description </td>
	<td>Action </td>
	</tr>
		<%
		for(cholatalkiespath path : videoDetails)
		{
		%>
		<tr>
	<td>	
    <video width="400" controls>
	 <source src="/videoGalleryUpload/admin/<%=path.getVideoPath()%>" type="video/mp4">
 	</video></td>
 	<td><%=path.getVideoTitle()%></td>
    <td><%=path.getVideoDesc()%></td>
    <td><a href="<%=updateVideo%>&id=<%=path.getId()%>">Update Video Details</a></td>     
	</tr>
		<%
		}	
		%>
		<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		</aui:button-row>
</aui:form>






