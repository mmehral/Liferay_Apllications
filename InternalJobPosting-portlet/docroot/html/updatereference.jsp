<%@page import="com.chola.InternalJobRef.service.InternalReferenceLocalServiceUtil"%>
<%@page import="com.chola.InternalJobRef.model.InternalReference"%>
<%@page import="javax.portlet.PortletURL"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<portlet:defineObjects />

<%
	long referenceId = ParamUtil.getInteger(request, "referenceId");
	System.out.println("CompanyId======" + referenceId);
	InternalReference ref = null;
	if (referenceId >= 01) {
		ref = InternalReferenceLocalServiceUtil.getInternalReference(referenceId);
		System.out.println("####" + ref);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Show InternalRefferal"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitRefferal"></portlet:actionURL>

<aui:form action="${action}" method="post">
<aui:input name="referenceId" type="hidden" value="<%=ref.getRefId()%>"/>

<aui:input name="Title" type="text"  helpMessage="Please Enter Job Title" value="<%=ref.getTitle()%>" >
<aui:validator name="required" errorMessage="Please Enter Job Title"></aui:validator>
<aui:validator name="max">100</aui:validator>
</aui:input>
<%-- <aui:input name="From" type="text"  helpMessage="Please Enter Sender mail id" value="<%=ref.getFrom()%>" >
<aui:validator name="required" errorMessage="Please Enter Sender mail id"></aui:validator>
<aui:validator name="max">100</aui:validator>
<aui:validator name="email"></aui:validator>
</aui:input> --%>
<aui:input name="To" type="text"  helpMessage="Please Enter Receive mail id"  value="<%=ref.getTo()%>">
<aui:validator name="required" errorMessage="Please Enter Receive mail id"></aui:validator>
<aui:validator name="max">100</aui:validator>
<aui:validator name="email"></aui:validator>
</aui:input>
<aui:input name="Body" type="textarea" rows="4" id="maxLength"  cols="50"  helpMessage="Please Enter Body Content" value="<%=ref.getBody()%>" >
<aui:validator name="required" errorMessage="Please Enter Receive Body Content"></aui:validator>
<aui:validator name="max">400</aui:validator>
</aui:input>
<aui:button-row>
<aui:button type="submit" value="Submit"></aui:button>
<aui:button type="reset" value="Reset" last="true"></aui:button>
</aui:button-row>

</aui:form>



