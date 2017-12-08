<%@page import="com.chola.socho.service.topicsLocalServiceUtil"%>
<%@page import="com.chola.socho.model.topics"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	topics topic = null;
	if (id >= 01) {
		topic = topicsLocalServiceUtil.gettopics(id);
		System.out.println("####" + id);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/jsp/viewTopic.jsp");
%>
<liferay-ui:header title="Show Topics"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateTopic"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=topic.getId()%>"><br />
			<aui:input type="textarea" label="Update Topic" rows="5" cols="30" name="topic" value="<%=topic.getTopicName()%>">
		          <aui:validator name="max">200</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		      </aui:button-row>
	<%-- <table>
		<tr>
			<td>Topics</td>
			<td><input type="text" name="<portlet:namespace/>topic" value="<%=topic.getTopics()%>"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
	</table> --%>
</aui:form>






