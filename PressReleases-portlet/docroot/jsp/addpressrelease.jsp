<%@page import="com.chola.pressrelease.service.pressreleaseLocalServiceUtil"%>
<%@page import="com.chola.pressrelease.model.pressrelease"%>
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
<portlet:actionURL var="updatePressRelease" windowState="normal"
	name="updatePressRelease">
</portlet:actionURL>

<body>
<liferay-ui:header title="Back" backLabel="Back" backURL="<%=backURL.toString()%>" />
<%
pressrelease pr = pressreleaseLocalServiceUtil.fetchpressrelease(1);
String data=pr.getDetails();
%>
<aui:form action="<%=updatePressRelease%>">
	<%-- <aui:input type="textarea" style="height: 500px;" max="20000" name="details" value="<%=pr.getDetails()%>" label="Press Releases">
		<aui:validator name="required"/>  
	</aui:input>
 --%>	
<liferay-ui:input-editor name="content" initMethod="initEditor"
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