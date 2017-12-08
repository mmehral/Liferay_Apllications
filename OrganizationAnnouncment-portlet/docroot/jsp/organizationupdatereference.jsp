<%@page import="com.organizationAnnouncement.service.organizationLocalServiceUtil"%>
<%@page import="com.organizationAnnouncement.model.organization"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<%

long organizationId = ParamUtil.getInteger(request, "organizationId");
organization com=null;

com = organizationLocalServiceUtil.getorganization(organizationId);
	
System.out.println("Organization Id before if..." + com.getOrganization_id());
	
	if (organizationId >= 01) 
	{
		
		System.out.print("...........Organization id.........."+organizationId);
		System.out.println("Organization Id####" + com.getOrganization_id());
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/jsp/editOrganizationdetails.jsp");
%>
<liferay-ui:header title="Edit Organization Announcement Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitOrganizationDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">



<aui:input type="text" name="title" label="Tite(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100" value="<%=com.getOrganization_tite()%>">
<aui:validator name="required"></aui:validator>

<aui:validator name="maxLength" errorMessage="Title should not be greater than 100 Characters">100</aui:validator>
</aui:input><br><br>

<aui:input type="textarea" name="description" label="Description(Enter Maximum 5000 Characters)" helpMessage="Please Enter Charcaters less than 5000" value="<%=com.getOrganization_description()%>">
<aui:validator name="required"></aui:validator>

<aui:validator name="maxLength" errorMessage="Description should not be greater than 5000 Characters">5000</aui:validator>
</aui:input><br><br>

 <aui:input type="file" name="fileName" label="Please Select file to upload" value="<%=com.getOrganization_image_name()%>">

<aui:validator name="acceptFiles">'jpg,jpeg,png,tif,gif'</aui:validator>
</aui:input>
 
<aui:input type="hidden" name="organizationId" value="<%=com.getOrganization_id()%>"></aui:input><br/>

<aui:button-row>
<aui:button type="submit" value="Submit"/>

</aui:button-row>

</aui:form>







