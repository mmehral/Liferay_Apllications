<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.chola.learningbites.service.lbdetailsLocalServiceUtil"%>
<%@page import="com.chola.learningbites.model.lbdetails"%>
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
	lbdetails lbDetails = null;
	if (id >= 01) {
		lbDetails = lbdetailsLocalServiceUtil.getlbdetails(id);
		System.out.println("####" + id);
	}
	String data=lbDetails.getLbdescription();
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>

<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateLB"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=lbDetails.getId()%>"><br />
			<aui:input type="textarea" label="Title" rows="5" cols="30" name="lbtitle" value="<%=lbDetails.getLbtitle()%>">
		          <aui:validator name="max">100</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		    
		   <%--  <aui:input type="textarea" label="Description" rows="5" cols="30" name="lbdescription" value="<%=lbDetails.getLbdescription()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input> --%>
		    
		      Description :<liferay-ui:input-editor name="lbdescription" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
		   <aui:input type="file" name="uploadedFile" label="Select a file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'jpg,gif,png,tif'</aui:validator>
			</aui:input>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>

<aui:script>
 function <portlet:namespace/>initEditor(){
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>




