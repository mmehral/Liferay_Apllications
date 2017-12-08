<%@ include file="init.jsp"%>
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "Aproved Feedback");
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);
%>
<portlet:renderURL var="addFeedBackURL">
<portlet:param name="mvcPath" value="/feedback.jsp"/>
</portlet:renderURL>
<h4>Kaleo workflow for custom Assets</h4>
<a href="<%=addFeedBackURL%>" style="font-weight:bold;font-size:18px;">Add New FeedBack</a><br/><br/>
<liferay-ui:tabs
names="Aproved Feedback,Pending Feedback"
portletURL="<%= portletURL %>"
/>
<c:choose>
<c:when test='<%= tabs1.equals("Pending Feedback") %>'>
<liferay-util:include page="/view_pending_feedback.jsp" servletContext="<%= application %>" />
</c:when>
<c:otherwise>

<liferay-util:include page="/view_approved_feedback.jsp" servletContext="<%= application %>" />
</c:otherwise>
</c:choose>
