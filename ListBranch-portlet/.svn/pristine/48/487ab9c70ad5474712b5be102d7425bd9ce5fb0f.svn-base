<%@page import="com.chola.listbranch.service.branchdetailsLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.branchdetails"%>
<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.city"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects/>
<%
		List<branchdetails> list = (List<branchdetails>) branchdetailsLocalServiceUtil.getbranchdetailses(0, branchdetailsLocalServiceUtil.getbranchdetailsesCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editbranchdetails.jsp");
%>
<liferay-ui:header title="Show Branch Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	
<liferay-ui:search-container delta="3" total="<%=branchdetailsLocalServiceUtil.getbranchdetailsesCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
						
	
	<liferay-ui:search-container-row  modelVar="list1" className="branchdetails">
	<%
	city ct = cityLocalServiceUtil.getcity(list1.getCity_id());
	%>
	<liferay-ui:search-container-column-text name="City Name" value="<%=ct.getCity_name()%>" />
	<liferay-ui:search-container-column-text name="Branch Code" property="branch_code" />
	<liferay-ui:search-container-column-text name="Branch Address" property="branch_address" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editbranchdetailsMenu.jsp"/>
	</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	