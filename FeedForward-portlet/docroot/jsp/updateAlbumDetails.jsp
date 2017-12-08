<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.chola.feedforward.service.feedforwardgalleryLocalServiceUtil"%>
<%@page import="com.chola.feedforward.service.feedforwardgallerypathLocalServiceUtil"%>
<%@page import="com.chola.feedforward.model.feedforwardgallerypath"%>
<%@page import="com.chola.feedforward.model.feedforwardgallery"%>
<%@page import="java.util.List"%>
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

<portlet:renderURL var="updateImage">
   <portlet:param name="jspPage" value="/jsp/updateImageDetails.jsp" />
</portlet:renderURL>

<%
	long id = ParamUtil.getInteger(request, "id");
	feedforwardgallery ref = null;
		ref = feedforwardgalleryLocalServiceUtil.getfeedforwardgallery(id);
		System.out.println("ID : " + ref);
	String data=ref.getAlbumDesc();
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:error key="error-key" message="Please fill Description" />
<liferay-ui:header title="Show" backLabel="Back" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="updateDetails"></portlet:actionURL>
<aui:form action="${action}" method="post">
	<input type="hidden" name="id" value="<%=ref.getId()%>"><br />
	<aui:input type="text" label="Album Name" name="albumName" value="<%=ref.getAlbumName()%>">
		          <aui:validator name="maxLength">100</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input>
	<%-- <aui:input type="text" label="Album Description" name="albumDesc" value="<%=ref.getAlbumDesc()%>">
		          <aui:validator name="maxLength">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
	</aui:input> --%>
	
	
Album Description :<liferay-ui:input-editor name="albumDesc" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
		<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		</aui:button-row>
</aui:form>

<aui:script>
 function <portlet:namespace/>initEditor(){
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>




