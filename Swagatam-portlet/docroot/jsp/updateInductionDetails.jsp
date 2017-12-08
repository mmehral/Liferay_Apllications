<%@page import="com.chola.swagatam.service.swagatampathLocalServiceUtil"%>
<%@page import="com.chola.swagatam.service.swagatamLocalServiceUtil"%>
<%@page import="com.chola.swagatam.model.swagatam"%>
<%@page import="com.chola.swagatam.model.swagatampath"%>
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
	swagatam ref = null;
		ref = swagatamLocalServiceUtil.getswagatam(id);
		System.out.println("ID : " + ref);
	String albumId = ref.getInductionid();
	List <swagatampath> videoDetails = swagatampathLocalServiceUtil.getVideoDetails(albumId);
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Show" backLabel="Back" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="updateDetails"></portlet:actionURL>
<aui:form action="${action}" method="post">
	<input type="hidden" name="id" value="<%=ref.getId()%>"><br />
	<aui:input type="text" label="Title" name="title" value="<%=ref.getTitle()%>">
		          <aui:validator name="maxLength">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<aui:input type="text" label="Description" name="desc" value="<%=ref.getDesc()%>">
		          <aui:validator name="maxLength">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<%-- <table border="2px">
	<tr>
	<td>Image </td>
	<td>Title </td>
	<td>Description </td>
	<td>Action </td>
	</tr>
		<%
		for(swagatampath path : videoDetails)
		{
		%>
		<tr>
	<td>	
    <video width="400" controls>
	 <source src="/SwagatamUpload/admin/<%=path.getVideoPath()%>" type="video/mp4">
 	</video></td>
 	<td><%=path.getVideoTitle()%></td>
    <td><%=path.getVideoDesc()%></td>
    <td><a href="<%=updateVideo%>&id=<%=path.getId()%>">Update Video Details</a></td>     
	</tr>
		<%
		}	
		%>
		</table> --%>
		<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		</aui:button-row>
</aui:form>






