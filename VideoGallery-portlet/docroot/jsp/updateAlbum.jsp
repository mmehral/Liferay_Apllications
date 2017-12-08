<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.videogallery.service.videogalleryLocalServiceUtil"%>
<%@page import="com.chola.videogallery.model.videogallery"%>
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
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 

<%
		ClassLoader cl = videogallery.class.getClassLoader();
		int count = videogalleryLocalServiceUtil.getvideogalleriesCount();
		//List<videogallery> list = (List<videogallery>) videogalleryLocalServiceUtil.getvideogalleries(0, count);
		DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(
				videogallery.class,cl).add(RestrictionsFactoryUtil.eq("flag","1"));
		List<videogallery> list=videogalleryLocalServiceUtil.dynamicQuery(dynamicQuery);
						
		System.out.println("List : " + list);
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/jsp/updateAlbum.jsp");
	%>
		
	<liferay-ui:search-container delta="3"
	   total="<%=videogalleryLocalServiceUtil.getvideogalleriesCount()%>"
		emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results 
			results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row modelVar="list1" className="videogallery">
	<liferay-ui:search-container-column-text name="Album Name" property="albumName" />
	<liferay-ui:search-container-column-text name="Album Description" property="albumDesc" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/jsp/editMenu.jsp"/>
	</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
</body>
</html>
