<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.chola.socho.service.topicsLocalServiceUtil"%>
<%@page import="com.chola.socho.model.topics"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@page import="com.chola.socho.model.idea"%>
<%@page import="com.chola.socho.service.ideaLocalServiceUtil"%>

<portlet:defineObjects/>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
<%
 PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/jsp/viewTopic.jsp");
 //List<topics> topicsList = topicsLocalServiceUtil.gettopicses(0, topicsLocalServiceUtil.gettopicsesCount());
 
 ClassLoader cl = topics.class.getClassLoader();
 DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(
			topics.class,cl).add(RestrictionsFactoryUtil.eq("flag",Long.parseLong("1")));
	List<topics> topicsList=topicsLocalServiceUtil.dynamicQuery(dynamicQuery);
 %>
 
 
<liferay-ui:search-container delta="5" deltaConfigurable="true" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(topicsList, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.chola.socho.model.topics" keyProperty="bookId" modelVar="book">
        <liferay-ui:search-container-column-text name="id" value="${book.id}" />
        <liferay-ui:search-container-column-text name="Topic" value="${book.topicName}" />
        <liferay-ui:search-container-column-jsp name="Actions" path="/jsp/editTopic.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

