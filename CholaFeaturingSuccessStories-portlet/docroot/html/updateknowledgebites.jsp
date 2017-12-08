

<%@page import="com.chola.successstories.service.ssdetailsLocalServiceUtil"%>
<%@page import="com.chola.successstories.model.ssdetails"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>

<portlet:defineObjects/>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/html/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
<%
 PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/updateknowledgebites.jsp");
 
 ClassLoader cl = ssdetails.class.getClassLoader();
 DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(ssdetails.class,cl).add(RestrictionsFactoryUtil.eq("flag","1"));
	List<ssdetails> lbDetails = ssdetailsLocalServiceUtil.dynamicQuery(dynamicQuery);
 %>
 
 
<liferay-ui:search-container delta="5" deltaConfigurable="true" total="<%=lbDetails.size()%>" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(lbDetails, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.chola.successstories.model.ssdetails" keyProperty="lbId" modelVar="lb">
        <liferay-ui:search-container-column-text name="Id" value="${lb.id}" />
        <liferay-ui:search-container-column-text name="Title" value="${lb.sstitle}" />
         <liferay-ui:search-container-column-text name="Description" value="${lb.ssdesc}" />
        <liferay-ui:search-container-column-jsp name="Actions" path="/html/editDetails.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

