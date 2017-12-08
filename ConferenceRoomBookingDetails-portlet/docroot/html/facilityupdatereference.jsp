<%@page import="com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.facilitymaster"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<%

long facilityId = ParamUtil.getInteger(request, "facilityId");
facilitymaster fw=null;
fw=facilitymasterLocalServiceUtil.getfacilitymaster(facilityId);

	
	System.out.println("location Id======" + facilityId);
	
	System.out.println("lt======" + fw.getFacility_id());
	
	
	if (facilityId >= 01) 
	{
		System.out.print("...........location id.........."+facilityId);
		System.out.println("####" + fw);
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editLocation.jsp");
%>
<liferay-ui:header title="Edit Facility Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitFacilityDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">

<input type="hidden" name="facilityId" value="<%=fw.getFacility_id()%>"><br />

<aui:input type="text" name="facilityname" label="Enter Facility Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100" value="<%=fw.getFacility_name()%>">
<aui:validator name="required" errorMessage="Facility Name is required"/>
<aui:validator name="maxLength" errorMessage="Facility Name should not be greater than 100 Characters">100</aui:validator>

</aui:input><br><br>


<aui:input type="text" name="description" label="Enter Facility Description(Enter Maximum 200 Characters)" helpMessage="Please Enter Charcaters less than 200" value="<%=fw.getFacility_description()%>">
<aui:validator name="required" errorMessage="Facility Description is required"/>
<aui:validator name="maxLength" errorMessage="Facility Description should not be greater than 200 Characters">200</aui:validator>

</aui:input><br><br>
<aui:button type="submit" value="Edit Facility" />

</aui:form>







