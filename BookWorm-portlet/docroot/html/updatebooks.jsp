<%@page import="com.chola.book.service.bookdetailsLocalServiceUtil"%>
<%@page import="com.chola.book.model.bookdetails"%>
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
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
<%
 PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/updatebooks.jsp");
 
 ClassLoader cl = bookdetails.class.getClassLoader();
 DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(bookdetails.class,cl).add(RestrictionsFactoryUtil.eq("flag","1"));
	List<bookdetails> bookDetails = bookdetailsLocalServiceUtil.dynamicQuery(dynamicQuery);
 %>
 
 
<liferay-ui:search-container delta="5" deltaConfigurable="true" total="<%=bookDetails.size()%>" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(bookDetails, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.chola.book.model.bookdetails" keyProperty="bookId" modelVar="book">
        <liferay-ui:search-container-column-text name="Id" value="${book.id}" />
        <liferay-ui:search-container-column-text name="Title" value="${book.booktitle}" />
        <liferay-ui:search-container-column-text name="E-Book" ><a target="_blank" href="/BookWormUpload/admin/<%=book.getBookpath()%>"><%=book.getBookname()%></a></liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-jsp name="Actions" path="/html/editDetails.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

