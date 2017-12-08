<%@page import="com.chola.conferenceroombooking.service.locationLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.location"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<script type="text/javascript"
src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='StateCalls'/>",
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

<%
String stateName=null;
long locationId = ParamUtil.getInteger(request, "locationId");
location lt=null;
lt = locationLocalServiceUtil.getlocation(locationId);
	
	System.out.println("location Id======" + locationId);
	
	System.out.println("lt======" + lt.getState_id());
	
	
	stateName=locationLocalServiceUtil.getStatename(lt.getState_id());
	
	
	
	//stateName=locationLocalServiceUtil.getStatename(1);
	System.out.println("State Id.."+stateName);
	//EmployeeRefrence ref = null;
	 
	if (locationId >= 01) 
	{
		System.out.print("...........location id.........."+locationId);
		System.out.println("####" + lt);
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editLocation.jsp");
%>
<liferay-ui:header title="Edit Location Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitLocation"></portlet:actionURL>

<aui:form action="${action}" method="post">

<input type="hidden" name="locationId" value="<%=lt.getLocation_id()%>"><br />

<aui:input type="text" name="location" label="Enter Location Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100" value="<%=lt.getLocation_name()%>">
<aui:validator name="required" errorMessage="Location Name is required"/>
<aui:validator name="maxLength" errorMessage="Location Name should not be greater than 100 Characters">100</aui:validator>

</aui:input><br><br>

Select State :<select id="state" name="Selectstate"><option value="<%=lt.getState_id()%>"><%=stateName%></option></select><br><br>
<aui:button type="submit" value="Edit Location" />

</aui:form>







