<%@page import="com.chola.quarterly.service.quarterlyreportsLocalServiceUtil"%>
<%@page import="com.chola.quarterly.model.quarterlyreports"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />
<html>
<head>
<title>Insert title here</title>
</head>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<portlet:actionURL var="updateQuaterlyFinancials" windowState="normal"
	name="updateQuaterlyFinancials">
</portlet:actionURL>

<body>
<liferay-ui:header title="Back" backLabel="Back" backURL="<%=backURL.toString()%>" />
<%
quarterlyreports pr = quarterlyreportsLocalServiceUtil.fetchquarterlyreports(1);
String data=pr.getDetails();
%>
<aui:form action="<%=updateQuaterlyFinancials%>">
	<%-- <aui:input type="textarea" style="height: 500px;" max="20000" name="details" value="<%=pr.getDetails()%>" label="Quarterly Financials">
		<aui:validator name="required"/>  
	</aui:input> --%>
	Quarterly Financials :<liferay-ui:input-editor name="content" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
	
	<aui:button type="submit" />
</aui:form>
<aui:script>
 function <portlet:namespace/>initEditor(){
	
	 /* return "<%= UnicodeFormatter.toString(data)%>"; */
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>
</body>
</html>