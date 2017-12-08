<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/jsp/viewdetails.jsp");
%>
<liferay-ui:header title="Add New Hire Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitNewHireDetails"></portlet:actionURL>
<aui:form action="${action}"  method="post">

<aui:input type="text" name="Name" label="Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required" errorMessage="Name is required"/>
<aui:validator name="maxLength" errorMessage="Name should not be greater than 100 Characters">100</aui:validator>
 <%-- <aui:validator name="custom" errorMessage="Only Alphabets are allowed"></aui:validator> --%>
</aui:input><br><br>


<aui:input type="text" name="Designation" label="Designation(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required" errorMessage="Designation is required"/>
<aui:validator name="maxLength" errorMessage="Designation should not be greater than 100 Characters">100</aui:validator>
<%-- <aui:validator name="custom"  errorMessage="Only Alphabets are allowed"></aui:validator> --%>
</aui:input><br><br> 

<aui:input type="file" name="profileimage" label="Please Select Profile Image to upload">
<aui:validator name="required" errorMessage="Profile Image is Required"/>
<aui:validator name="acceptFiles">'jpg,jpeg,png,tif,gif'</aui:validator>
</aui:input>

<aui:input type="file" name="detailedimage" label="Please Select Detail Image to upload">
<aui:validator name="required" errorMessage="Detail Image is Required"/>
<aui:validator name="acceptFiles">'jpg,jpeg,png,tif,gif'</aui:validator>
</aui:input>
<aui:button-row>
<aui:button type="submit" value="Submit" onClick="imageupload"/>
<aui:button type="reset" value="Reset" last="true"/>
</aui:button-row>
</aui:form>

