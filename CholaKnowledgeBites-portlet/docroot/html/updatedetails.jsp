
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.chola.knowledgebites.service.kbdetailsLocalServiceUtil"%>
<%@page import="com.chola.knowledgebites.model.kbdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<liferay-ui:error key="error-key" message="Please fill Description" />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	kbdetails kbDetails = null;
	
	if (id >= 01) {
		kbDetails = kbdetailsLocalServiceUtil.getkbdetails(id);
		System.out.println("####" + id);
	
	}
	String data=kbDetails.getKbdesc();
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateKB"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=kbDetails.getId()%>"><br />
			<aui:input type="textarea" label="Title" rows="5" cols="30" name="title" value="<%=kbDetails.getKbtitle()%>">
		          <aui:validator name="max">100</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		    
		   <%--  <aui:input type="textarea" label="Description" rows="5" cols="30" name="description" value="<%=kbDetails.getKbdesc()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input> --%>
		    
		    Description :<liferay-ui:input-editor name="description" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
		    
		  
		    
<%-- 		   <aui:input type="file" name="uploadedFile" label="Select a file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'jpg,gif,png,tif,mp4'</aui:validator>
			</aui:input> --%>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>
<aui:script>
 function <portlet:namespace/>initEditor(){
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>





