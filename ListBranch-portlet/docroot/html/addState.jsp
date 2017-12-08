<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<portlet:actionURL var="action" name="submitState"></portlet:actionURL>

<%
		
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/addDetails.jsp");
		
%>
<liferay-ui:header title="Add State Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<aui:form action="${action}" method="post">
<aui:input type="text" name="BranchState" label="Enter State">
<%-- <aui:validator name="alpha"/> --%>
<aui:validator name="required"></aui:validator>
</aui:input><br><br>
<input type="submit" value="Submit"/>
</aui:form>