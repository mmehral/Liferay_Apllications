<%@page import="com.chola.annual.service.annualreportsLocalServiceUtil"%>
<%@page import="com.chola.annual.model.annualreports"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />
<html>
<head>
<title>Insert title here</title>
</head>
<!-- <script>

$(document).ready(function() {

	$.ajax({

	   $("#set"+content).html(response);
       
   
       CKEDITOR.replace('bodyload_'+content);
	
/* url : "<portlet:resourceURL id='DataCall'/>",
type : 'POST',
dataType : 'json',
success : function(data) 
{
console.log(JSON.stringify(data));
for(var i in data)
{
$("#set").append("<option value=" + data[i].id_ + ">" + data[i].details + "</option>");
}
},
error : function() {
console.log("There was an error. Try again please!");
} */
});
});

</script>
 -->
 
 
 <liferay-ui:error key="error-key1" message="Please fill content" />
 <%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<portlet:actionURL var="updateAnnualReports" windowState="normal"
	name="updateAnnualReports">
</portlet:actionURL>

<body>
<liferay-ui:header title="Back" backLabel="Back" backURL="<%=backURL.toString()%>" />
<%
annualreports  pr = annualreportsLocalServiceUtil.fetchannualreports(1);
String data=pr.getDetails();

%>
<aui:form action="<%=updateAnnualReports%>">
	<%-- <aui:input type="textarea" style="height: 500px;" max="20000" name="details" value="<%=pr.getDetails()%>" label="Press Releases">
		<aui:validator name="required"/>  
	</aui:input> --%>
	
	Annual Reports :<liferay-ui:input-editor name="content" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
	<aui:button type="submit" />
</aui:form>

<aui:script>
 function <portlet:namespace/>initEditor(){
	
	 /* return "<%= UnicodeFormatter.toString(data)%>"; */
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>

</body>
</html>