
<%@page import="com.chola.businessmis.service.businessmisdetailsLocalServiceUtil"%>
<%@page import="com.chola.businessmis.model.businessmisdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	businessmisdetails misDetails = null;
	if (id >= 01) {
		misDetails = businessmisdetailsLocalServiceUtil.getbusinessmisdetails(id);
		System.out.println("####" + id);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateMIS"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=misDetails.getId()%>"><br />
			<aui:input type="textarea" label="Business MIS Title" rows="5" cols="30" name="title" value="<%=misDetails.getBusinesstitle()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		    <aui:input type="textarea" label="Business MIS Description" rows="5" cols="30" name="desc" value="<%=misDetails.getBusinessDesc()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		    
		   <%--  <aui:input type="textarea" label="Business MIS Link" rows="5" cols="30" name="link" value="<%=misDetails.getBusinessLink()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input> --%>
		   
		   <!--Code for uploading html file  -->
				<aui:input type="file" name="uploadedFile" label="Select a html file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'html'</aui:validator>
			</aui:input>
		   
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>






