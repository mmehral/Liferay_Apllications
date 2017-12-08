
<%@page import="com.chola.listbranch.model.state"%>
<%@page import="com.chola.listbranch.service.stateLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<%
	long stateId = ParamUtil.getInteger(request, "stateId");
	System.out.println("State Id======" + stateId);
	//EmployeeRefrence ref = null;
	state st=null;
	if (stateId >= 01) 
	{
		st = stateLocalServiceUtil.getstate(stateId);
		System.out.println("####" + st);
		System.out.println("state id "+stateId);
		
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editDetails.jsp");
%>
<liferay-ui:header title="Edit State Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitState"></portlet:actionURL>

<aui:form action="${action}" method="post">
<aui:input type="hidden" name="stateId" value="<%=st.getState_id()%>">
<aui:validator name="required"></aui:validator>
</aui:input><br><br>
<aui:input type="text" name="BranchState" label="Enter State" value="<%=st.getState_name()%>">
<aui:validator name="alpha"/>
<aui:validator name="required"></aui:validator>
</aui:input><br><br>
<input type="submit" value="Submit"/>
</</aui:form>