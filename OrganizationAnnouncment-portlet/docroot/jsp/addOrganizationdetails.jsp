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
<liferay-ui:header title="Add Organization Announcement Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitOrganizationDetails"></portlet:actionURL>
<aui:form action="${action}"  method="post">

<aui:input type="text" name="title" label="Tite(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required" errorMessage="Title is required"/>

<aui:validator name="maxLength" errorMessage="Title should not be greater than 100 Characters">100</aui:validator>
</aui:input><br><br>


<aui:input type="textarea" name="description" label="Description(Enter Maximum 5000 Characters)" helpMessage="Please Enter Charcaters less than 5000">
<aui:validator name="required" errorMessage="Description is required"/>

<aui:validator name="maxLength" errorMessage="Description should not be greater than 5000 Characters">5000</aui:validator>
</aui:input><br><br> 

<aui:input type="file" name="fileName" label="Please Select file to upload">
<aui:validator name="required" errorMessage="File is required"/>
<aui:validator name="acceptFiles">'pdf,doc'</aui:validator>
</aui:input>

<aui:button-row>
<aui:button type="submit" value="Submit" onClick="imageupload"/>
<aui:button type="reset" value="Reset" last="true"/>
</aui:button-row>
</aui:form>

