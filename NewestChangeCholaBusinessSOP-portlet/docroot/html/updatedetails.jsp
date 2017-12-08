
<%@page import="com.chola.bsop.service.bsopdetailsLocalServiceUtil"%>
<%@page import="com.chola.bsop.model.bsopdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	bsopdetails sopDetails = null;
	if (id >= 01) {
		sopDetails = bsopdetailsLocalServiceUtil.getbsopdetails(id);
		System.out.println("####" + id);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/view.jsp");
%>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateSop"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=sopDetails.getId()%>"><br />
			<aui:input type="textarea" label="Business SOP Title" rows="5" cols="30" name="title" value="<%=sopDetails.getBtitle()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>
		           
		    </aui:input>
		    <aui:input type="textarea" label="Business SOP Description" rows="5" cols="30" name="desc" value="<%=sopDetails.getBdesc()%>">
		          <aui:validator name="max">500</aui:validator>
		          <aui:validator name="required"></aui:validator>
		              
		    </aui:input>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>






