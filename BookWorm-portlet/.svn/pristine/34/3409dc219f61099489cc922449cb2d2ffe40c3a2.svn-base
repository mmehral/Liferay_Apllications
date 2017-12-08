<%@page import="com.chola.book.service.bookdetailsLocalServiceUtil"%>
<%@page import="com.chola.book.model.bookdetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<%
	long id = ParamUtil.getInteger(request, "id");
	System.out.println("Id : " + id);
	bookdetails bookDetails = null;
	if (id >= 01) {
		bookDetails = bookdetailsLocalServiceUtil.getbookdetails(id);
		System.out.println("####" + id);
	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="updateBook"></portlet:actionURL>

	<aui:form action="${action}" method="post">
	<input type="hidden" name="<portlet:namespace/>id" value="<%=bookDetails.getId()%>"><br />
			<aui:input type="textarea" label="Book Title" rows="5" cols="30" name="booktitle" value="<%=bookDetails.getBooktitle()%>">
		          <aui:validator name="maxLength">100</aui:validator>
		          <aui:validator name="required"></aui:validator>     
		    </aui:input>
		   <aui:input type="file" name="uploadedFile" label="Select a file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'pdf'</aui:validator>
			</aui:input>
		       <aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		      </aui:button-row>
	
</aui:form>






