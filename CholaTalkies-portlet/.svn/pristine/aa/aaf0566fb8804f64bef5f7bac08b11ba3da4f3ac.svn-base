<%@page import="com.service.cholatalkiesLocalServiceUtil"%>
<%@page import="com.model.cholatalkies"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>

</head>
<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/html/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 

<%
		ClassLoader cl = cholatalkies.class.getClassLoader();
		int count = cholatalkiesLocalServiceUtil.getcholatalkiesesCount();
		//List<videogallery> list = (List<videogallery>) videogalleryLocalServiceUtil.getvideogalleries(0, count);
		DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(
				cholatalkies.class,cl).add(RestrictionsFactoryUtil.eq("flag","1"));
		List<cholatalkies> list=cholatalkiesLocalServiceUtil.dynamicQuery(dynamicQuery);
						
		System.out.println("List : " + list);
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/edit.jsp");
	%>
		
	<liferay-ui:search-container delta="3"
	   total="<%=cholatalkiesLocalServiceUtil.getcholatalkiesesCount()%>"
		emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results 
			results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row modelVar="list1" className="cholatalkies">
	<liferay-ui:search-container-column-text name="Video Name" property="videoName" />
	<liferay-ui:search-container-column-text name="Video Description" property="videoDesc" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editMenu.jsp"/>
	</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
</body>
</html>
