
<%@page import="com.chola.listbranch.model.branchdetails"%>
<%@page import="com.chola.listbranch.service.branchdetailsLocalServiceUtil"%>
<%@page import="com.chola.listbranch.service.productLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.state"%>
<%@page import="com.chola.listbranch.service.stateLocalServiceUtil"%>
<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.city"%>
<%@page import="com.chola.listbranch.model.product"%>
<%@page import="com.chola.listbranch.model.mapping"%>
<%@page import="com.chola.listbranch.service.mappingLocalServiceUtil"%>
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
		List<mapping> list = (List<mapping>) mappingLocalServiceUtil.getmappings(0, mappingLocalServiceUtil.getmappingsCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editbranchmapping.jsp");
%>
<liferay-ui:header title="Show Branch Mapping" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	
<liferay-ui:search-container delta="3" total="<%=mappingLocalServiceUtil.getmappingsCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
						
	
	<liferay-ui:search-container-row  modelVar="list1" className="mapping">
	<%
	
	city ct = cityLocalServiceUtil.getcity(list1.getCity_id());
	
	state st = stateLocalServiceUtil.getstate(list1.getState_id());
	
	product p=productLocalServiceUtil.getproduct(list1.getProduct_id());
	
	branchdetails bd=branchdetailsLocalServiceUtil.getbranchdetails(list1.getBranch_id());
	
	%>
	<liferay-ui:search-container-column-text name="Product Name" value="<%=p.getProduct_name()%>"/>
	<liferay-ui:search-container-column-text name="State Name" value="<%=st.getState_name()%>" />
	<liferay-ui:search-container-column-text name="City Name" value="<%=ct.getCity_name()%>" />
	<liferay-ui:search-container-column-text name="Branch Code" value="<%=bd.getBranch_code()%>" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editbranchMappingMenu.jsp"/>
	</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	