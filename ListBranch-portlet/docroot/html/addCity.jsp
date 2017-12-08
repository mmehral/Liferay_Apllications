<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='StateCall'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
		$("#state").append("<option value="+ data[i].state_id + ">" + data[i].state_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
})
</script>
<script>
function ValidateForm()
{
	
	var names = document.getElementById("state").value;
	
	if(names == null && names =="")
	{
		alert ("Please Select State..!!!");
		return false;
		}
	else if(names!= null)
		{
		alert ("Select State..!!!");
		return false;
		}
		
}
</script>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/addDetails.jsp");
%>
<liferay-ui:header title="Add City Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitCity"></portlet:actionURL>

<aui:form action="${action}"  method="post">
<aui:input type="text" name="BranchCity" label="Enter City">
<aui:validator name="required" />
<%-- <aui:validator name="alpha"/> --%>
</aui:input>
<br><br>
Select State :<select required="required" id="state" name="Selectstate">
<option value="">Select State</option>
</select><br><br>
<input type="submit" value="Submit"/>
</aui:form>








