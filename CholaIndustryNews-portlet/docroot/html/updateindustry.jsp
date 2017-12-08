<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@page import="com.chola.industrynews.service.LatestIndustryNewsLocalServiceUtil"%>
<%@page import="com.chola.industrynews.model.LatestIndustryNews"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<portlet:actionURL var="industryURL" windowState="normal"
	name="industryAction">
</portlet:actionURL>

<%
	long referenceId = ParamUtil.getInteger(request, "id");
	System.out.println("CompanyId======" + referenceId);
	LatestIndustryNews ref = null;
	if (referenceId >= 01) {
		ref = LatestIndustryNewsLocalServiceUtil.getLatestIndustryNews(referenceId);
		System.out.println("####" + ref);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Show Referal"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitRefferal"></portlet:actionURL>

<aui:form action="<%=industryURL%>">
	<aui:input name="title" value="<%=ref.getTitle() %>"/>
	<liferay-ui:input-editor name="content" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<br>
	<br>

	<aui:button type="submit" />
</aui:form>
<aui:script>
	function <portlet:namespace/>initEditor() {
		return "<%=ref.getContent()%>";
		
	}
</aui:script>






