<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/addDetails.jsp");
%>

<liferay-ui:header title="Add Facility Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />


<portlet:actionURL var="action" name="submitFacilityDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">

<aui:input type="text" name="facilityname" label="Enter Facility Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required"  errorMessage="Facility Name is required"/>
<aui:validator name="maxLength" errorMessage="Facility Name should not be greater than 100 Characters">100</aui:validator>
<aui:validator name="alpha"/>
</aui:input><br><br>

<aui:input type="text" name="description" label="Enter Facility Description(Enter Maximum 200 Characters)" helpMessage="Please Enter Charcaters less than 200">
<aui:validator name="required" errorMessage="Facility Description is required"/>
<aui:validator name="maxLength" errorMessage="Facility Description should not be greater than 200 Characters">200</aui:validator>
<aui:validator name="alpha"/>
</aui:input><br><br>

<aui:button type="submit" value="Add Facility" />


</aui:form>