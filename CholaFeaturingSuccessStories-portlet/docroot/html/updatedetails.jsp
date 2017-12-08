
<%@page import="com.chola.successstories.service.ssdetailsLocalServiceUtil"%>
<%@page import="com.chola.successstories.model.ssdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	ssdetails kbDetails = null;
	if (id >= 01) {
		kbDetails = ssdetailsLocalServiceUtil.getssdetails(id);
		System.out.println("####" + id);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateSS"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=kbDetails.getId()%>"><br />
			<aui:input type="textarea" label="Title" rows="5" cols="30" name="title" value="<%=kbDetails.getSstitle()%>">
		          <aui:validator name="max">100</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		    
		    <aui:input type="textarea" label="Description" rows="5" cols="30" name="description" value="<%=kbDetails.getSsdesc()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
<%-- 		   <aui:input type="file" name="uploadedFile" label="Select a file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'jpg,gif,png,tif,mp4'</aui:validator>
			</aui:input> --%>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>






