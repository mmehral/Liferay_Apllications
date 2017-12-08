<%-- <%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="com.liferay.portal.kernel.search.SearchResultUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.search.Field"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.MathUtil" %>
<%@page import="com.liferay.portal.kernel.search.Document"%>
<%@ include file="/html/portlet/test/init.jsp" %>

  <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
  
  
  <%
 
   String keyword = request.getAttribute("keyword").toString();
  
    PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setParameter("struts_action", "/test/searchPage");
	
	portletURL.setParameter("keywords", keyword);
  %>
  <liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="struts_action" value="/portlet_action/test/search" />
	<portlet:param name="search" value="search"/>
 </liferay-portlet:renderURL>
 
  
  <aui:form action="<%= searchURL %>" method="get" name="fm">
  
  <liferay-ui:header
		backURL="<%= redirect %>"
		title="search"
 />
  
  
  <liferay-ui:search-container
		emptyResultsMessage='No result Found'
		iteratorURL="<%= portletURL %>"
	>
	<%
	Indexer indexer = IndexerRegistryUtil.getIndexer(SampleEntry.class);
	SearchContext searchContext = SearchContextFactory.getInstance(request);

	searchContext.setAttribute("paginationType", "regular");
	searchContext.setEnd(searchContainer.getEnd());
	//searchContext.setIncludeDiscussions(true);
	searchContext.setLike(true);
	searchContext.setKeywords(keyword);
	searchContext.setStart(searchContainer.getStart());
	Hits hits = indexer.search(searchContext);

	searchContainer.setTotal(hits.getLength());
	
	
	PortletURL hitURL = renderResponse.createRenderURL();
	hitURL.setParameter("struts_action", "/test/addView");
	
	%>
	
	
	<liferay-ui:search-container-results results="<%= SearchResultUtil.getSearchResults(hits, LocaleUtil.getDefault())%>"/>
	
	<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.search.SearchResult"
			modelVar="searchResult"
		>
		
		<%
		
			SampleEntry entry  =SampleEntryLocalServiceUtil.getSampleEntry(searchResult.getClassPK());
			

			entry = entry.toEscapedModel();
			Summary summary = searchResult.getSummary();
			
			
			%>
			
			
			<portlet:renderURL var="rowURL">
				<portlet:param name="struts_action" value="/test/view" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="urlTitle" value="This is the Url title" />
			</portlet:renderURL>
			
			<liferay-ui:app-view-search-entry
				cssClass='<%= MathUtil.isEven(index) ? "search" : "search alt" %>'
				description="<%= (summary != null) ? HtmlUtil.escape(summary.getContent()) : entry.getContent() %>"
				queryTerms="<%= hits.getQueryTerms() %>"
				title="<%= (summary != null) ? HtmlUtil.escape(summary.getTitle()) : entry.getTitle() %>"
				 url="<%= rowURL %>" 
			/>
		
		
  </liferay-ui:search-container-row>
		<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="more" />
 </liferay-ui:search-container>	
  </aui:form>
  
   --%>