<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<script>
function ValidateForm()
{
	
	var names = document.getElementById("city").value;

	if(names == null || names =="")
	{
		alert ("Please Select City..!!!");
		return false;
		}
}
	
</script>

<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='CityCall1'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
	$("#city").append("<option value=" + data[i].city_id + ">" + data[i].city_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
		});
</script>

<%
		
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/addDetails.jsp");
		
%>
<liferay-ui:header title="Add Branch Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitBranchDetails"></portlet:actionURL>

<aui:form action="${action}"  method="post">
Select City :<select required="required" id="city" name="SelectCity"><option value="">Select City</option></select><br><br>

<aui:input type="text" name="BranchCode" label="Branch Code ">
<aui:validator name="required"></aui:validator>

</aui:input><br><br>

<%-- <aui:input type="text" name="BranchName" label="Branch Name">

<aui:validator name="required"></aui:validator>
</aui:input><br><br> --%>


<aui:input name="BranchAddress" type="textarea" label="Branch Address">

<aui:validator name="required"></aui:validator>
</aui:input>

<%-- <aui:input type="text" name="BranchContact" label="Branch Contact">
<aui:validator name="required"></aui:validator>
<aui:validator name="min">10</aui:validator>
</aui:input><br><br> --%>
<input type="submit" value="Submit"/>
</aui:form>
